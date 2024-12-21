/*
 * JBoss, Home of Professional Open Source
 * Copyright 2013, Red Hat, Inc. and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.richfaces.resource.optimizer.resource.writer.impl;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.StandardOpenOption;
import java.text.MessageFormat;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

import jakarta.faces.application.Resource;

import org.richfaces.log.Logger;
import org.richfaces.resource.ResourceKey;
import org.richfaces.resource.ResourceSkinUtils;
import org.richfaces.resource.optimizer.ResourceWriter;
import org.richfaces.resource.optimizer.resource.util.ResourceConstants;
import org.richfaces.resource.optimizer.resource.util.ResourceUtil;
import org.richfaces.resource.optimizer.resource.writer.ResourceProcessor;
import org.richfaces.resource.optimizer.strings.Constants;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.io.ByteSource;
import com.google.common.io.FileWriteMode;
import com.google.common.io.Files;

/**
 * @author Nick Belaevski
 */
public class ResourceWriterImpl implements ResourceWriter {
    private static final class ResourceInputStreamSupplier extends ByteSource {
        private Resource resource;

        public ResourceInputStreamSupplier(Resource resource) {
            super();
            this.resource = resource;
        }

        @Override
        public InputStream openStream() throws IOException {
            return resource.getInputStream();
        }
    }

    /*
     * packed output stream by extension
     */
    private final Map<String, OutputStream> PACKED = new LinkedHashMap<>();

    private File resourceContentsDir;
    private Map<String, String> processedResources = Maps.newConcurrentMap();
    private Iterable<ResourceProcessor> resourceProcessors;
    private Logger log;
    private long currentTime;
    private Set<ResourceKey> resourcesWithKnownOrder;
    private Set<ResourceKey> packedResources = Sets.newHashSet();

    public ResourceWriterImpl(File resourceContentsDir, Iterable<ResourceProcessor> resourceProcessors, Logger log,
                              Set<ResourceKey> resourcesWithKnownOrder) {
        this.resourceContentsDir = resourceContentsDir;
        this.resourceProcessors = Iterables.concat(resourceProcessors,
                Collections.singleton(ThroughputResourceProcessor.INSTANCE));
        this.log = log;
        this.resourcesWithKnownOrder = resourcesWithKnownOrder;

        resourceContentsDir.mkdirs();

        currentTime = System.currentTimeMillis();
    }

    private synchronized File createOutputFile(String path) throws IOException {
        File outFile = new File(resourceContentsDir, path);
        outFile.getParentFile().mkdirs();

        if (outFile.exists()) {
            if (outFile.lastModified() > currentTime) {
                log.debug(MessageFormat.format("File {0} already exists and will be overwritten", outFile.getPath()));
            }
            outFile.delete();
        }

        if (!outFile.createNewFile()) {
            log.warn(MessageFormat.format("Could not create {0} file", outFile.getPath()));
        }

        return outFile;
    }

    public void writeResource(String skinName, Resource resource) throws IOException {
        final String requestPath = resource.getRequestPath();
        final String requestPathWithSkin = skinName == null ? requestPath : ResourceSkinUtils.evaluateSkinInPath(requestPath,
                skinName);

        ResourceProcessor matchingProcessor = getMatchingResourceProcessor(requestPath);
        File outFile = createOutputFile(requestPathWithSkin);

        log.debug("Opening output stream for " + outFile);
        try (InputStream is = new ResourceInputStreamSupplier(resource).openStream(); OutputStream os = Files.asByteSink(outFile).openStream()) {
            matchingProcessor.process(requestPathWithSkin, is, os, true);
            processedResources.put(ResourceUtil.getResourceQualifier(resource), requestPath);
        }
    }

    public void writePackedResource(String packName, String skinName, Resource resource) throws IOException {

        final String requestPath = resource.getRequestPath();
        String extension = getExtension(requestPath);
        String packFileName = packName + "." + extension;
        ResourceKey resourceKey = new ResourceKey(resource.getResourceName(), resource.getLibraryName());

        if (!"js".equals(extension) && !"css".equals(extension)) {
            writeResource(skinName, resource);
            return;
        }

        if (!resourcesWithKnownOrder.contains(resourceKey)) {
            writeResource(skinName, resource);
            return;
        }

        String requestPathWithSkinVariable = "packed/" + packFileName;
        if (skinName != null && skinName.length() > 0) {
            requestPathWithSkinVariable = ResourceSkinUtils.prefixPathWithSkinPlaceholder(requestPathWithSkinVariable);
        }
        String requestPathWithSkin = Constants.SLASH_JOINER.join(skinName, "packed", packFileName);
        ResourceProcessor matchingProcessor = getMatchingResourceProcessor(requestPathWithSkin);

        OutputStream outputStream;
        synchronized (PACKED) {
            String packagingCacheKey = extension + ":" + skinName;
            if (!PACKED.containsKey(packagingCacheKey)) {
                File outFile = createOutputFile(requestPathWithSkin);
                log.debug("Opening shared output stream for " + outFile);
                outputStream = Files.asByteSink(outFile, FileWriteMode.APPEND).openStream();
                PACKED.put(packagingCacheKey, outputStream);
            }
            outputStream = PACKED.get(packagingCacheKey);
        }

        synchronized (outputStream) {
            try (InputStream is = resource.getInputStream()) {
                matchingProcessor.process(requestPathWithSkin, is, outputStream, false);
            }
        }

        processedResources.put(ResourceUtil.getResourceQualifier(resource), requestPathWithSkinVariable);
        packedResources.add(resourceKey);

        // when packaging JSF's JavaScript, make sure both compressed and uncompressed are written to static mappings
        if (ResourceUtil.isSameResource(resource, ResourceConstants.JSF_UNCOMPRESSED)
                || ResourceUtil.isSameResource(resource, ResourceConstants.JSF_COMPRESSED)) {
            processedResources.put(ResourceUtil.getResourceQualifier(ResourceConstants.JSF_COMPRESSED),
                    requestPathWithSkinVariable);
            processedResources.put(ResourceUtil.getResourceQualifier(ResourceConstants.JSF_UNCOMPRESSED),
                    requestPathWithSkinVariable);
        }
    }

    private ResourceProcessor getMatchingResourceProcessor(final String requestPath) {
        return Iterables.get(Iterables.filter(resourceProcessors, new Predicate<ResourceProcessor>() {
            @Override
            public boolean apply(ResourceProcessor input) {
                return input.isSupportedFile(requestPath);
            }
        }), 0);
    }

    private String getExtension(String requestPath) {
        int extensionIndex = Math.max(requestPath.lastIndexOf('.'), requestPath.lastIndexOf('/'));
        return requestPath.substring(extensionIndex + 1);
    }

    @Override
    public void writeProcessedResourceMappings(File staticResourceMappingFile, String staticResourcePrefix) throws IOException {
        // TODO separate mappings file location

        if (!staticResourceMappingFile.exists()) {
            staticResourceMappingFile.getParentFile().mkdirs();
            staticResourceMappingFile.createNewFile();
        }

        try (OutputStream fos = new BufferedOutputStream(
                java.nio.file.Files.newOutputStream(staticResourceMappingFile.toPath(), StandardOpenOption.CREATE, StandardOpenOption.APPEND))) {

            Properties properties = new Properties();
            for (Entry<String, String> entry : processedResources.entrySet()) {
                properties.put(entry.getKey(), staticResourcePrefix + entry.getValue());
            }

            properties.store(fos, null);
        }
    }

    public void close() {
        for (OutputStream out : PACKED.values()) {
            try {
                out.close();
            } catch (IOException e) {
                // Swallow
            }
        }
    }
}
