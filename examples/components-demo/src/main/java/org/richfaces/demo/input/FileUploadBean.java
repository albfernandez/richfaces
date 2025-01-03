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
package org.richfaces.demo.input;

import org.richfaces.event.FileUploadEvent;
import org.richfaces.model.UploadedFile;

import jakarta.faces.bean.ManagedBean;
import jakarta.faces.bean.SessionScoped;
import jakarta.faces.component.UIComponent;
import jakarta.faces.event.AbortProcessingException;
import jakarta.faces.event.AjaxBehaviorEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Konstantin Mishin
 */
@ManagedBean
@SessionScoped
public class FileUploadBean {
    private String acceptedTypes = "png";
    private boolean disabled = false;
    private boolean noDuplicate = false;
    private UploadedFile file;
    private List<UploadedFile> files = new ArrayList<UploadedFile>();
    private String clearedFile;
    private String ontyperejected = "alert('typerejected')";
    private Integer maxFilesQuantity = 2;
    private boolean immediateUpload = false;

    public UploadedFile getFile() {
        return file;
    }

    public List<UploadedFile> getFiles() {
        return files;
    }

    public void setFiles(List<UploadedFile> files) {
        this.files = files;
    }

    public String getClearedFile() {
        return clearedFile;
    }

    public void setClearedFile(String clearedFile) {
        this.clearedFile = clearedFile;
    }

    public void clearFile() {
        System.out.println("Files to clear: " + this.clearedFile);
        Iterator<UploadedFile> i = files.iterator();
        while (i.hasNext()) {
            UploadedFile file = i.next();
            if (file.getName().equals(this.clearedFile)) {
                i.remove();
                break;
            }
        }
    }

    public void listener(FileUploadEvent event) throws Exception {
        file = event.getUploadedFile();
        files.add(file);
    }

    public boolean isDisabled() {
        return disabled;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }

    public boolean isNoDuplicate() {
        return noDuplicate;
    }

    public void setNoDuplicate(boolean noDuplicate) {
        this.noDuplicate = noDuplicate;
    }

    public String getAcceptedTypes() {
        return acceptedTypes;
    }

    public void setAcceptedTypes(String acceptedTypes) {
        this.acceptedTypes = acceptedTypes;
    }

    public String getOntyperejected() {
        return ontyperejected;
    }

    public void setOntyperejected(String ontyperejected) {
        this.ontyperejected = ontyperejected;
    }

    public Integer getMaxFilesQuantity() {
        return maxFilesQuantity;
    }

    public void setMaxFilesQuantity(Integer maxFilesQuantity) {
        this.maxFilesQuantity = maxFilesQuantity;
    }

    public boolean isImmediateUpload() {
        return immediateUpload;
    }

    public void setImmediateUpload(boolean immediateUpload) {
        this.immediateUpload = immediateUpload;
    }

    public void updateAttribute(AjaxBehaviorEvent event) throws AbortProcessingException {
        UIComponent component = (UIComponent) event.getSource();
        String attributeName = (String) component.findComponent("name").getAttributes().get("value");
        Object attributeValue = component.findComponent("value").getAttributes().get("value");
        component.findComponent("fu").getAttributes().put(attributeName, attributeValue);
    }
}
