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

import org.richfaces.component.attribute.AccesskeyProps;
import org.richfaces.component.attribute.CoreProps;
import org.richfaces.component.attribute.FocusProps;
import org.richfaces.component.attribute.I18nProps;
import org.richfaces.component.attribute.LinkProps;

import javax.annotation.Generated;
import javax.el.MethodExpression;
import javax.el.ValueExpression;
import javax.faces.component.behavior.ClientBehaviorHolder;
import javax.faces.convert.Converter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * <p>
 * The &lt;a4j:mediaOutput&gt; component is used for generating images, video, sounds, and other resources defined on the fly.
 * </p>
 *
 * @author shura
 **/
@Generated({"RichFaces CDK", "4.5.0-SNAPSHOT"})
public class UIMediaOutput extends AbstractMediaOutput
        implements ClientBehaviorHolder, AccesskeyProps, CoreProps, FocusProps, I18nProps, LinkProps {

    public static final String COMPONENT_TYPE = "org.richfaces.MediaOutput";

    public static final String COMPONENT_FAMILY = "org.richfaces.MediaOutput";
    private static final Collection<String> EVENT_NAMES = Collections.unmodifiableCollection(Arrays.asList(
            "click",
            "focus",
            "mouseover",
            "blur",
            "mouseup",
            "keyup",
            "mousemove",
            "keydown",
            "keypress",
            "dblclick",
            "mouseout",
            "action",
            "mousedown"
    ));
    private static final String ATTRIBUTES_THAT_ARE_SET_KEY = "javax.faces.component.UIComponentBase.attributesThatAreSet";

    public UIMediaOutput() {
        super();
        setRendererType("org.richfaces.MediaOutputRenderer");
    }

    @Override
    public String getFamily() {
        return COMPONENT_FAMILY;
    }

    public Collection<String> getEventNames() {
        return EVENT_NAMES;
    }

    public String getDefaultEventName() {
        return "click";
    }

    public String getAccesskey() {
        String value = (String) getStateHelper().eval(Properties.accesskey);
        return value;
    }

    public void setAccesskey(String accesskey) {
        getStateHelper().put(Properties.accesskey, accesskey);
        handleAttribute("accesskey", accesskey);
    }


    public String getAlign() {
        String value = (String) getStateHelper().eval(Properties.align);
        return value;
    }

    public void setAlign(String align) {
        getStateHelper().put(Properties.align, align);
    }


    public String getArchive() {
        String value = (String) getStateHelper().eval(Properties.archive);
        return value;
    }

    public void setArchive(String archive) {
        getStateHelper().put(Properties.archive, archive);
    }


    public String getBorder() {
        String value = (String) getStateHelper().eval(Properties.border);
        return value;
    }

    public void setBorder(String border) {
        getStateHelper().put(Properties.border, border);
    }


    public boolean isCacheable() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.cacheable, false);
        return value;
    }

    public void setCacheable(boolean cacheable) {
        getStateHelper().put(Properties.cacheable, cacheable);
    }


    public String getCharset() {
        String value = (String) getStateHelper().eval(Properties.charset);
        return value;
    }

    public void setCharset(String charset) {
        getStateHelper().put(Properties.charset, charset);
        handleAttribute("charset", charset);
    }


    public String getClassid() {
        String value = (String) getStateHelper().eval(Properties.classid);
        return value;
    }

    public void setClassid(String classid) {
        getStateHelper().put(Properties.classid, classid);
    }


    public String getCodebase() {
        String value = (String) getStateHelper().eval(Properties.codebase);
        return value;
    }

    public void setCodebase(String codebase) {
        getStateHelper().put(Properties.codebase, codebase);
    }


    public String getCodetype() {
        String value = (String) getStateHelper().eval(Properties.codetype);
        return value;
    }

    public void setCodetype(String codetype) {
        getStateHelper().put(Properties.codetype, codetype);
    }


    public Converter getConverter() {
        Converter value = (Converter) getStateHelper().eval(Properties.converter);
        return value;
    }

    public void setConverter(Converter converter) {
        getStateHelper().put(Properties.converter, converter);
    }


    public String getCoords() {
        String value = (String) getStateHelper().eval(Properties.coords);
        return value;
    }

    public void setCoords(String coords) {
        getStateHelper().put(Properties.coords, coords);
        handleAttribute("coords", coords);
    }


    public MethodExpression getCreateContent() {
        MethodExpression value = (MethodExpression) getStateHelper().get(Properties.createContent);
        return value;
    }

    public void setCreateContent(MethodExpression createContent) {
        getStateHelper().put(Properties.createContent, createContent);
    }


    public String getDeclare() {
        String value = (String) getStateHelper().eval(Properties.declare);
        return value;
    }

    public void setDeclare(String declare) {
        getStateHelper().put(Properties.declare, declare);
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


    public String getElement() {
        String value = (String) getStateHelper().eval(Properties.element);
        return value;
    }

    public void setElement(String element) {
        getStateHelper().put(Properties.element, element);
    }


    public Date getExpires() {
        Date value = (Date) getStateHelper().eval(Properties.expires);
        return value;
    }

    public void setExpires(Date expires) {
        getStateHelper().put(Properties.expires, expires);
    }


    public String getFileName() {
        String value = (String) getStateHelper().eval(Properties.fileName);
        return value;
    }

    public void setFileName(String fileName) {
        getStateHelper().put(Properties.fileName, fileName);
    }


    public String getHreflang() {
        String value = (String) getStateHelper().eval(Properties.hreflang);
        return value;
    }

    public void setHreflang(String hreflang) {
        getStateHelper().put(Properties.hreflang, hreflang);
        handleAttribute("hreflang", hreflang);
    }


    public String getHspace() {
        String value = (String) getStateHelper().eval(Properties.hspace);
        return value;
    }

    public void setHspace(String hspace) {
        getStateHelper().put(Properties.hspace, hspace);
    }


    public boolean isIsmap() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.ismap, false);
        return value;
    }

    public void setIsmap(boolean ismap) {
        getStateHelper().put(Properties.ismap, ismap);
    }


    public String getLang() {
        String value = (String) getStateHelper().eval(Properties.lang);
        return value;
    }

    public void setLang(String lang) {
        getStateHelper().put(Properties.lang, lang);
        handleAttribute("lang", lang);
    }


    public Date getLastModified() {
        Date value = (Date) getStateHelper().eval(Properties.lastModified);
        return value;
    }

    public void setLastModified(Date lastModified) {
        getStateHelper().put(Properties.lastModified, lastModified);
    }


    public String getMimeType() {
        String value = (String) getStateHelper().eval(Properties.mimeType);
        return value;
    }

    public void setMimeType(String mimeType) {
        getStateHelper().put(Properties.mimeType, mimeType);
    }


    public String getOnblur() {
        String value = (String) getStateHelper().eval(Properties.onblur);
        return value;
    }

    public void setOnblur(String onblur) {
        getStateHelper().put(Properties.onblur, onblur);
        handleAttribute("onblur", onblur);
    }


    public String getOnclick() {
        String value = (String) getStateHelper().eval(Properties.onclick);
        return value;
    }

    public void setOnclick(String onclick) {
        getStateHelper().put(Properties.onclick, onclick);
    }


    public String getOndblclick() {
        String value = (String) getStateHelper().eval(Properties.ondblclick);
        return value;
    }

    public void setOndblclick(String ondblclick) {
        getStateHelper().put(Properties.ondblclick, ondblclick);
        handleAttribute("ondblclick", ondblclick);
    }


    public String getOnfocus() {
        String value = (String) getStateHelper().eval(Properties.onfocus);
        return value;
    }

    public void setOnfocus(String onfocus) {
        getStateHelper().put(Properties.onfocus, onfocus);
        handleAttribute("onfocus", onfocus);
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


    public String getRel() {
        String value = (String) getStateHelper().eval(Properties.rel);
        return value;
    }

    public void setRel(String rel) {
        getStateHelper().put(Properties.rel, rel);
        handleAttribute("rel", rel);
    }


    public String getRev() {
        String value = (String) getStateHelper().eval(Properties.rev);
        return value;
    }

    public void setRev(String rev) {
        getStateHelper().put(Properties.rev, rev);
        handleAttribute("rev", rev);
    }


    public String getShape() {
        String value = (String) getStateHelper().eval(Properties.shape);
        return value;
    }

    public void setShape(String shape) {
        getStateHelper().put(Properties.shape, shape);
        handleAttribute("shape", shape);
    }


    public String getStandby() {
        String value = (String) getStateHelper().eval(Properties.standby);
        return value;
    }

    public void setStandby(String standby) {
        getStateHelper().put(Properties.standby, standby);
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


    public String getTabindex() {
        String value = (String) getStateHelper().eval(Properties.tabindex);
        return value;
    }

    public void setTabindex(String tabindex) {
        getStateHelper().put(Properties.tabindex, tabindex);
        handleAttribute("tabindex", tabindex);
    }


    public String getTarget() {
        String value = (String) getStateHelper().eval(Properties.target);
        return value;
    }

    public void setTarget(String target) {
        getStateHelper().put(Properties.target, target);
    }


    public String getTitle() {
        String value = (String) getStateHelper().eval(Properties.title);
        return value;
    }

    public void setTitle(String title) {
        getStateHelper().put(Properties.title, title);
        handleAttribute("title", title);
    }


    public String getType() {
        String value = (String) getStateHelper().eval(Properties.type);
        return value;
    }

    public void setType(String type) {
        getStateHelper().put(Properties.type, type);
        handleAttribute("type", type);
    }


    public String getUriAttribute() {
        String value = (String) getStateHelper().eval(Properties.uriAttribute);
        return value;
    }

    public void setUriAttribute(String uriAttribute) {
        getStateHelper().put(Properties.uriAttribute, uriAttribute);
    }


    public String getUsemap() {
        String value = (String) getStateHelper().eval(Properties.usemap);
        return value;
    }

    public void setUsemap(String usemap) {
        getStateHelper().put(Properties.usemap, usemap);
    }


    public Object getValue() {
        Object value = (Object) getStateHelper().eval(Properties.value);
        return value;
    }

    public void setValue(Object value) {
        getStateHelper().put(Properties.value, value);
    }


    public String getVspace() {
        String value = (String) getStateHelper().eval(Properties.vspace);
        return value;
    }

    public void setVspace(String vspace) {
        getStateHelper().put(Properties.vspace, vspace);
    }

    private void handleAttribute(String name, Object value) {
        List<String> setAttributes = (List<String>) this.getAttributes().get(ATTRIBUTES_THAT_ARE_SET_KEY);
        if (setAttributes == null) {
            setAttributes = new ArrayList<String>(24);
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
        accesskey,
        align,
        archive,
        border,
        cacheable,
        charset,
        classid,
        codebase,
        codetype,
        converter,
        coords,
        createContent,
        declare,
        dir,
        disabled,
        element,
        expires,
        fileName,
        hreflang,
        hspace,
        ismap,
        lang,
        lastModified,
        mimeType,
        onblur,
        onclick,
        ondblclick,
        onfocus,
        onkeydown,
        onkeypress,
        onkeyup,
        onmousedown,
        onmousemove,
        onmouseout,
        onmouseover,
        onmouseup,
        rel,
        rev,
        shape,
        standby,
        style,
        styleClass,
        tabindex,
        target,
        title,
        type,
        uriAttribute,
        usemap,
        value,
        vspace

    }


}
