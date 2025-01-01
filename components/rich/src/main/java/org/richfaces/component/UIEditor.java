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

import org.richfaces.component.attribute.CoreProps;
import org.richfaces.component.attribute.FocusProps;

import javax.annotation.Generated;
import javax.el.ValueExpression;
import javax.faces.component.UIComponent;
import javax.faces.component.behavior.ClientBehaviorHolder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * <p> The &lt;rich:editor&gt; component is used for creating a WYSIWYG editor on a page. </p>
 *
 * @author <a href="http://community.jboss.org/people/lfryc">Lukas Fryc</a>
 **/
@Generated({"RichFaces CDK", "4.5.0-SNAPSHOT"})
public class UIEditor extends AbstractEditor
        implements ClientBehaviorHolder, CoreProps, FocusProps {

    public static final String COMPONENT_TYPE = "org.richfaces.Editor";

    public static final String COMPONENT_FAMILY = "org.richfaces.Editor";
    private static final Collection<String> EVENT_NAMES = Collections.unmodifiableCollection(Arrays.asList(
            "dirty",
            "focus",
            "blur",
            "change",
            "init"
    ));
    private static final String ATTRIBUTES_THAT_ARE_SET_KEY = "javax.faces.component.UIComponentBase.attributesThatAreSet";

    public UIEditor() {
        super();
        setRendererType("org.richfaces.EditorRenderer");
    }

    @Override
    public String getFamily() {
        return COMPONENT_FAMILY;
    }

    public Collection<String> getEventNames() {
        return EVENT_NAMES;
    }

    public String getDefaultEventName() {
        return "change";
    }

    public UIComponent getConfig() {
        UIComponent value = (UIComponent) getStateHelper().eval(Properties.config);
        return value;
    }

    public void setConfig(UIComponent config) {
        getStateHelper().put(Properties.config, config);
    }


    public String getHeight() {
        String value = (String) getStateHelper().eval(Properties.height, "200px");
        return value;
    }

    public void setHeight(String height) {
        getStateHelper().put(Properties.height, height);
    }


    public String getLang() {
        String value = (String) getStateHelper().eval(Properties.lang);
        return value;
    }

    public void setLang(String lang) {
        getStateHelper().put(Properties.lang, lang);
    }


    public String getOnblur() {
        String value = (String) getStateHelper().eval(Properties.onblur);
        return value;
    }

    public void setOnblur(String onblur) {
        getStateHelper().put(Properties.onblur, onblur);
        handleAttribute("onblur", onblur);
    }


    public String getOnchange() {
        String value = (String) getStateHelper().eval(Properties.onchange);
        return value;
    }

    public void setOnchange(String onchange) {
        getStateHelper().put(Properties.onchange, onchange);
    }


    public String getOndirty() {
        String value = (String) getStateHelper().eval(Properties.ondirty);
        return value;
    }

    public void setOndirty(String ondirty) {
        getStateHelper().put(Properties.ondirty, ondirty);
    }


    public String getOnfocus() {
        String value = (String) getStateHelper().eval(Properties.onfocus);
        return value;
    }

    public void setOnfocus(String onfocus) {
        getStateHelper().put(Properties.onfocus, onfocus);
        handleAttribute("onfocus", onfocus);
    }


    public String getOninit() {
        String value = (String) getStateHelper().eval(Properties.oninit);
        return value;
    }

    public void setOninit(String oninit) {
        getStateHelper().put(Properties.oninit, oninit);
    }


    public boolean isReadonly() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.readonly, false);
        return value;
    }

    public void setReadonly(boolean readonly) {
        getStateHelper().put(Properties.readonly, readonly);
    }


    public String getSkin() {
        String value = (String) getStateHelper().eval(Properties.skin, "moono");
        return value;
    }

    public void setSkin(String skin) {
        getStateHelper().put(Properties.skin, skin);
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


    public String getTitle() {
        String value = (String) getStateHelper().eval(Properties.title);
        return value;
    }

    public void setTitle(String title) {
        getStateHelper().put(Properties.title, title);
        handleAttribute("title", title);
    }


    public String getToolbar() {
        String value = (String) getStateHelper().eval(Properties.toolbar, "Basic");
        return value;
    }

    public void setToolbar(String toolbar) {
        getStateHelper().put(Properties.toolbar, toolbar);
    }


    public String getWidth() {
        String value = (String) getStateHelper().eval(Properties.width, "100%");
        return value;
    }

    public void setWidth(String width) {
        getStateHelper().put(Properties.width, width);
    }

    private void handleAttribute(String name, Object value) {
        List<String> setAttributes = (List<String>) this.getAttributes().get(ATTRIBUTES_THAT_ARE_SET_KEY);
        if (setAttributes == null) {
            setAttributes = new ArrayList<String>(5);
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
        config,
        height,
        lang,
        onblur,
        onchange,
        ondirty,
        onfocus,
        oninit,
        readonly,
        skin,
        style,
        styleClass,
        tabindex,
        title,
        toolbar,
        width

    }


}
