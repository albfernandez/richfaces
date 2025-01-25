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
package org.richfaces.resource.optimizer.resource.scan.impl.reflections;

import java.util.List;
import java.util.Map.Entry;

import org.reflections.scanners.Scanner;
import org.reflections.vfs.Vfs.File;

import com.google.common.collect.Multimap;

import javassist.bytecode.ClassFile;

/**
 * @author Nick Belaevski
 *
 */
public class MarkerResourcesScanner implements Scanner {
    static final String STORE_KEY = "org.richfaces.cdk.dynamicResourceNames";
    private static final String RESOURCE_PROPERTIES_EXT = ".resource.properties";
    private static final String META_INF = "META-INF/";
    
    private Multimap<String, String> store;

    //MZ @Override
    public void scan(Object cls) {
        throw new UnsupportedOperationException();
    }

    @Override
	public List<Entry<String, String>> scan(ClassFile file) {
        String relativePath = file.getSourceFile();
        if (relativePath.startsWith(META_INF) && relativePath.endsWith(RESOURCE_PROPERTIES_EXT)) {
            Multimap<String, String> store = getStore();

            String className = relativePath.substring(META_INF.length(),
                    relativePath.length() - RESOURCE_PROPERTIES_EXT.length());
            store.put(STORE_KEY, className);
        }
        
        return null;
        
    }

    @Override
    public boolean acceptsInput(String file) {
        return true;
    }
    
    
    
    private Multimap<String, String> getStore() {
        return store;
    }

    private void setStore(final Multimap<String, String> store) {
        this.store = store;
    }
    
}
