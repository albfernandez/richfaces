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

import org.richfaces.component.attribute.StyleClassProps;
import org.richfaces.component.attribute.StyleProps;

import javax.annotation.Generated;
import jakarta.el.ValueExpression;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * The &lt;a4j:log&gt; component generates JavaScript that opens a debug window, logging application information such as
 * requests, responses, and DOM changes.
 * </p>
 *
 * @author Nick Belaevski
 **/
@Generated({"RichFaces CDK", "4.5.0-SNAPSHOT"})
public class UIAjaxLog extends AbstractAjaxLog
        implements StyleClassProps, StyleProps {

    public static final String COMPONENT_TYPE = "org.richfaces.AjaxLog";

    public static final String COMPONENT_FAMILY = "org.richfaces.AjaxLog";
    private static final String ATTRIBUTES_THAT_ARE_SET_KEY = "javax.faces.component.UIComponentBase.attributesThatAreSet";

    public UIAjaxLog() {
        super();
        setRendererType("org.richfaces.AjaxLogRenderer");
    }

    @Override
    public String getFamily() {
        return COMPONENT_FAMILY;
    }

    public String getHotkey() {
        String value = (String) getStateHelper().eval(Properties.hotkey);
        return value;
    }

    public void setHotkey(String hotkey) {
        getStateHelper().put(Properties.hotkey, hotkey);
    }


    public String getLevel() {
        String value = (String) getStateHelper().eval(Properties.level);
        return value;
    }

    public void setLevel(String level) {
        getStateHelper().put(Properties.level, level);
    }


    public LogMode getMode() {
        LogMode value = (LogMode) getStateHelper().eval(Properties.mode);
        return value;
    }

    public void setMode(LogMode mode) {
        getStateHelper().put(Properties.mode, mode);
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
        handleAttribute("styleClass", styleClass);
    }

    private void handleAttribute(String name, Object value) {
        List<String> setAttributes = (List<String>) this.getAttributes().get(ATTRIBUTES_THAT_ARE_SET_KEY);
        if (setAttributes == null) {
            setAttributes = new ArrayList<String>(2);
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
        hotkey,
        level,
        mode,
        style,
        styleClass

    }


}
