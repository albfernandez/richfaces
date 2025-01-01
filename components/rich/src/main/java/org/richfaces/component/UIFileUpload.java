/*
 * JBoss, Home of Professional Open Source
 * Copyright , Red Hat, Inc. and individual contributors
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
package org.richfaces.component;

import org.richfaces.component.attribute.AjaxProps;
import org.richfaces.component.attribute.CoreProps;
import org.richfaces.component.attribute.DisabledProps;
import org.richfaces.component.attribute.ErrorProps;
import org.richfaces.component.attribute.EventsKeyProps;
import org.richfaces.component.attribute.EventsMouseProps;
import org.richfaces.component.attribute.I18nProps;

import javax.annotation.Generated;
import javax.el.MethodExpression;
import javax.el.ValueExpression;
import javax.faces.component.behavior.ClientBehaviorHolder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * <p>
 * The &lt;rich:fileUpload&gt; component allows the user to upload files to a server. It features multiple uploads, progress
 * bars, restrictions on file types, and restrictions on sizes of the files to be uploaded.
 * </p>
 *
 * @author Konstantin Mishin
 * @author Lukas Fryc
 * @author Simone Cinti
 **/
@Generated({"RichFaces CDK", "4.5.0-SNAPSHOT"})
public class UIFileUpload extends AbstractFileUpload
        implements ClientBehaviorHolder, AjaxProps, CoreProps, DisabledProps, ErrorProps, EventsKeyProps, EventsMouseProps, I18nProps {

    public static final String COMPONENT_TYPE = "org.richfaces.FileUpload";

    public static final String COMPONENT_FAMILY = "org.richfaces.FileUpload";
    private static final Collection<String> EVENT_NAMES = Collections.unmodifiableCollection(Arrays.asList(
            "click",
            "error",
            "typerejected",
            "uploadcomplete",
            "mouseover",
            "mouseup",
            "clear",
            "keyup",
            "mousemove",
            "sizerejected",
            "keydown",
            "keypress",
            "dblclick",
            "filesubmit",
            "mouseout",
            "beforedomupdate",
            "begin",
            "mousedown",
            "complete",
            "fileselect"
    ));
    private static final String ATTRIBUTES_THAT_ARE_SET_KEY = "javax.faces.component.UIComponentBase.attributesThatAreSet";

    public UIFileUpload() {
        super();
        setRendererType("org.richfaces.FileUploadRenderer");
    }

    @Override
    public String getFamily() {
        return COMPONENT_FAMILY;
    }

    public Collection<String> getEventNames() {
        return EVENT_NAMES;
    }

    public String getDefaultEventName() {
        return null;
    }

    public String getAcceptedTypes() {
        String value = (String) getStateHelper().eval(Properties.acceptedTypes);
        return value;
    }

    public void setAcceptedTypes(String acceptedTypes) {
        getStateHelper().put(Properties.acceptedTypes, acceptedTypes);
    }


    public String getAddLabel() {
        String value = (String) getStateHelper().eval(Properties.addLabel);
        return value;
    }

    public void setAddLabel(String addLabel) {
        getStateHelper().put(Properties.addLabel, addLabel);
    }


    public String getClearAllLabel() {
        String value = (String) getStateHelper().eval(Properties.clearAllLabel);
        return value;
    }

    public void setClearAllLabel(String clearAllLabel) {
        getStateHelper().put(Properties.clearAllLabel, clearAllLabel);
    }


    public String getClearLabel() {
        String value = (String) getStateHelper().eval(Properties.clearLabel);
        return value;
    }

    public void setClearLabel(String clearLabel) {
        getStateHelper().put(Properties.clearLabel, clearLabel);
    }


    public Object getData() {
        Object value = (Object) getStateHelper().eval(Properties.data);
        return value;
    }

    public void setData(Object data) {
        getStateHelper().put(Properties.data, data);
    }


    public String getDeleteLabel() {
        String value = (String) getStateHelper().eval(Properties.deleteLabel);
        return value;
    }

    public void setDeleteLabel(String deleteLabel) {
        getStateHelper().put(Properties.deleteLabel, deleteLabel);
    }


    public String getDir() {
        String value = (String) getStateHelper().eval(Properties.dir);
        return value;
    }

    public void setDir(String dir) {
        getStateHelper().put(Properties.dir, dir);
        handleAttribute("dir", dir);
    }


    public boolean isDisabled() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.disabled, false);
        return value;
    }

    public void setDisabled(boolean disabled) {
        getStateHelper().put(Properties.disabled, disabled);
    }


    public String getDoneLabel() {
        String value = (String) getStateHelper().eval(Properties.doneLabel);
        return value;
    }

    public void setDoneLabel(String doneLabel) {
        getStateHelper().put(Properties.doneLabel, doneLabel);
    }


    public Object getExecute() {
        Object value = (Object) getStateHelper().eval(Properties.execute);
        return value;
    }

    public void setExecute(Object execute) {
        getStateHelper().put(Properties.execute, execute);
    }


    public MethodExpression getFileUploadListener() {
        MethodExpression value = (MethodExpression) getStateHelper().get(Properties.fileUploadListener);
        return value;
    }

    public void setFileUploadListener(MethodExpression fileUploadListener) {
        getStateHelper().put(Properties.fileUploadListener, fileUploadListener);
    }


    public boolean isImmediateUpload() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.immediateUpload, false);
        return value;
    }

    public void setImmediateUpload(boolean immediateUpload) {
        getStateHelper().put(Properties.immediateUpload, immediateUpload);
    }


    public String getLang() {
        String value = (String) getStateHelper().eval(Properties.lang);
        return value;
    }

    public void setLang(String lang) {
        getStateHelper().put(Properties.lang, lang);
        handleAttribute("lang", lang);
    }


    public boolean isLimitRender() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.limitRender, false);
        return value;
    }

    public void setLimitRender(boolean limitRender) {
        getStateHelper().put(Properties.limitRender, limitRender);
    }


    public String getListHeight() {
        String value = (String) getStateHelper().eval(Properties.listHeight, "210px");
        return value;
    }

    public void setListHeight(String listHeight) {
        getStateHelper().put(Properties.listHeight, listHeight);
    }


    public Integer getMaxFilesQuantity() {
        Integer value = (Integer) getStateHelper().eval(Properties.maxFilesQuantity, -1);
        return value;
    }

    public void setMaxFilesQuantity(Integer maxFilesQuantity) {
        getStateHelper().put(Properties.maxFilesQuantity, maxFilesQuantity);
    }


    public boolean isNoDuplicate() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.noDuplicate, false);
        return value;
    }

    public void setNoDuplicate(boolean noDuplicate) {
        getStateHelper().put(Properties.noDuplicate, noDuplicate);
    }


    public String getOnbeforedomupdate() {
        String value = (String) getStateHelper().eval(Properties.onbeforedomupdate);
        return value;
    }

    public void setOnbeforedomupdate(String onbeforedomupdate) {
        getStateHelper().put(Properties.onbeforedomupdate, onbeforedomupdate);
    }


    public String getOnbegin() {
        String value = (String) getStateHelper().eval(Properties.onbegin);
        return value;
    }

    public void setOnbegin(String onbegin) {
        getStateHelper().put(Properties.onbegin, onbegin);
    }


    public String getOnclear() {
        String value = (String) getStateHelper().eval(Properties.onclear);
        return value;
    }

    public void setOnclear(String onclear) {
        getStateHelper().put(Properties.onclear, onclear);
    }


    public String getOnclick() {
        String value = (String) getStateHelper().eval(Properties.onclick);
        return value;
    }

    public void setOnclick(String onclick) {
        getStateHelper().put(Properties.onclick, onclick);
        handleAttribute("onclick", onclick);
    }


    public String getOncomplete() {
        String value = (String) getStateHelper().eval(Properties.oncomplete);
        return value;
    }

    public void setOncomplete(String oncomplete) {
        getStateHelper().put(Properties.oncomplete, oncomplete);
    }


    public String getOndblclick() {
        String value = (String) getStateHelper().eval(Properties.ondblclick);
        return value;
    }

    public void setOndblclick(String ondblclick) {
        getStateHelper().put(Properties.ondblclick, ondblclick);
        handleAttribute("ondblclick", ondblclick);
    }


    public String getOnerror() {
        String value = (String) getStateHelper().eval(Properties.onerror);
        return value;
    }

    public void setOnerror(String onerror) {
        getStateHelper().put(Properties.onerror, onerror);
    }


    public String getOnfileselect() {
        String value = (String) getStateHelper().eval(Properties.onfileselect);
        return value;
    }

    public void setOnfileselect(String onfileselect) {
        getStateHelper().put(Properties.onfileselect, onfileselect);
    }


    public String getOnfilesubmit() {
        String value = (String) getStateHelper().eval(Properties.onfilesubmit);
        return value;
    }

    public void setOnfilesubmit(String onfilesubmit) {
        getStateHelper().put(Properties.onfilesubmit, onfilesubmit);
    }


    public String getOnkeydown() {
        String value = (String) getStateHelper().eval(Properties.onkeydown);
        return value;
    }

    public void setOnkeydown(String onkeydown) {
        getStateHelper().put(Properties.onkeydown, onkeydown);
        handleAttribute("onkeydown", onkeydown);
    }


    public String getOnkeypress() {
        String value = (String) getStateHelper().eval(Properties.onkeypress);
        return value;
    }

    public void setOnkeypress(String onkeypress) {
        getStateHelper().put(Properties.onkeypress, onkeypress);
        handleAttribute("onkeypress", onkeypress);
    }


    public String getOnkeyup() {
        String value = (String) getStateHelper().eval(Properties.onkeyup);
        return value;
    }

    public void setOnkeyup(String onkeyup) {
        getStateHelper().put(Properties.onkeyup, onkeyup);
        handleAttribute("onkeyup", onkeyup);
    }


    public String getOnmousedown() {
        String value = (String) getStateHelper().eval(Properties.onmousedown);
        return value;
    }

    public void setOnmousedown(String onmousedown) {
        getStateHelper().put(Properties.onmousedown, onmousedown);
        handleAttribute("onmousedown", onmousedown);
    }


    public String getOnmousemove() {
        String value = (String) getStateHelper().eval(Properties.onmousemove);
        return value;
    }

    public void setOnmousemove(String onmousemove) {
        getStateHelper().put(Properties.onmousemove, onmousemove);
        handleAttribute("onmousemove", onmousemove);
    }


    public String getOnmouseout() {
        String value = (String) getStateHelper().eval(Properties.onmouseout);
        return value;
    }

    public void setOnmouseout(String onmouseout) {
        getStateHelper().put(Properties.onmouseout, onmouseout);
        handleAttribute("onmouseout", onmouseout);
    }


    public String getOnmouseover() {
        String value = (String) getStateHelper().eval(Properties.onmouseover);
        return value;
    }

    public void setOnmouseover(String onmouseover) {
        getStateHelper().put(Properties.onmouseover, onmouseover);
        handleAttribute("onmouseover", onmouseover);
    }


    public String getOnmouseup() {
        String value = (String) getStateHelper().eval(Properties.onmouseup);
        return value;
    }

    public void setOnmouseup(String onmouseup) {
        getStateHelper().put(Properties.onmouseup, onmouseup);
        handleAttribute("onmouseup", onmouseup);
    }


    public String getOnsizerejected() {
        String value = (String) getStateHelper().eval(Properties.onsizerejected);
        return value;
    }

    public void setOnsizerejected(String onsizerejected) {
        getStateHelper().put(Properties.onsizerejected, onsizerejected);
    }


    public String getOntyperejected() {
        String value = (String) getStateHelper().eval(Properties.ontyperejected);
        return value;
    }

    public void setOntyperejected(String ontyperejected) {
        getStateHelper().put(Properties.ontyperejected, ontyperejected);
    }


    public String getOnuploadcomplete() {
        String value = (String) getStateHelper().eval(Properties.onuploadcomplete);
        return value;
    }

    public void setOnuploadcomplete(String onuploadcomplete) {
        getStateHelper().put(Properties.onuploadcomplete, onuploadcomplete);
    }


    public Object getRender() {
        Object value = (Object) getStateHelper().eval(Properties.render);
        return value;
    }

    public void setRender(Object render) {
        getStateHelper().put(Properties.render, render);
    }


    public String getServerErrorLabel() {
        String value = (String) getStateHelper().eval(Properties.serverErrorLabel);
        return value;
    }

    public void setServerErrorLabel(String serverErrorLabel) {
        getStateHelper().put(Properties.serverErrorLabel, serverErrorLabel);
    }


    public String getSizeExceededLabel() {
        String value = (String) getStateHelper().eval(Properties.sizeExceededLabel);
        return value;
    }

    public void setSizeExceededLabel(String sizeExceededLabel) {
        getStateHelper().put(Properties.sizeExceededLabel, sizeExceededLabel);
    }


    public String getStatus() {
        String value = (String) getStateHelper().eval(Properties.status);
        return value;
    }

    public void setStatus(String status) {
        getStateHelper().put(Properties.status, status);
    }


    public String getStyle() {
        String value = (String) getStateHelper().eval(Properties.style);
        return value;
    }

    public void setStyle(String style) {
        getStateHelper().put(Properties.style, style);
        handleAttribute("style", style);
    }


    public String getStyleClass() {
        String value = (String) getStateHelper().eval(Properties.styleClass);
        return value;
    }

    public void setStyleClass(String styleClass) {
        getStateHelper().put(Properties.styleClass, styleClass);
    }


    public String getTitle() {
        String value = (String) getStateHelper().eval(Properties.title);
        return value;
    }

    public void setTitle(String title) {
        getStateHelper().put(Properties.title, title);
        handleAttribute("title", title);
    }


    public String getUploadLabel() {
        String value = (String) getStateHelper().eval(Properties.uploadLabel);
        return value;
    }

    public void setUploadLabel(String uploadLabel) {
        getStateHelper().put(Properties.uploadLabel, uploadLabel);
    }

    private void handleAttribute(String name, Object value) {
        List<String> setAttributes = (List<String>) this.getAttributes().get(ATTRIBUTES_THAT_ARE_SET_KEY);
        if (setAttributes == null) {
            setAttributes = new ArrayList<String>(14);
            this.getAttributes().put(ATTRIBUTES_THAT_ARE_SET_KEY, setAttributes);
        }
        if (value == null) {
            ValueExpression ve = getValueExpression(name);
            if (ve == null) {
                setAttributes.remove(name);
            }
        } else if (!setAttributes.contains(name)) {
            setAttributes.add(name);
        }
    }

    protected enum Properties {
        acceptedTypes,
        addLabel,
        clearAllLabel,
        clearLabel,
        data,
        deleteLabel,
        dir,
        disabled,
        doneLabel,
        execute,
        fileUploadListener,
        immediateUpload,
        lang,
        limitRender,
        listHeight,
        maxFilesQuantity,
        noDuplicate,
        onbeforedomupdate,
        onbegin,
        onclear,
        onclick,
        oncomplete,
        ondblclick,
        onerror,
        onfileselect,
        onfilesubmit,
        onkeydown,
        onkeypress,
        onkeyup,
        onmousedown,
        onmousemove,
        onmouseout,
        onmouseover,
        onmouseup,
        onsizerejected,
        ontyperejected,
        onuploadcomplete,
        render,
        serverErrorLabel,
        sizeExceededLabel,
        status,
        style,
        styleClass,
        title,
        uploadLabel

    }


}
