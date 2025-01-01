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

import javax.annotation.Generated;
import javax.el.ValueExpression;
import javax.faces.convert.Converter;
import java.util.ArrayList;
import java.util.List;

/**
 * Adds placeholder capability to HTML input and textarea elements. A placeholder typically appears as light gray text within an
 * input or textarea element whenever the element is empty and does not have focus. This provides a hint to the user as to what
 * the input or textarea element is used for, or the type of input that is required.
 **/
@Generated({"RichFaces CDK", "4.5.0-SNAPSHOT"})
public class UIPlaceholder extends AbstractPlaceholder
        implements StyleClassProps {

    public static final String COMPONENT_TYPE = "org.richfaces.Placeholder";

    public static final String COMPONENT_FAMILY = "org.richfaces.Placeholder";
    private static final String ATTRIBUTES_THAT_ARE_SET_KEY = "javax.faces.component.UIComponentBase.attributesThatAreSet";

    public UIPlaceholder() {
        super();
        setRendererType("org.richfaces.PlaceholderRenderer");
    }

    @Override
    public String getFamily() {
        return COMPONENT_FAMILY;
    }

    public Converter getConverter() {
        Converter value = (Converter) getStateHelper().eval(Properties.converter);
        return value;
    }

    public void setConverter(Converter converter) {
        getStateHelper().put(Properties.converter, converter);
    }


    public String getSelector() {
        String value = (String) getStateHelper().eval(Properties.selector);
        return value;
    }

    public void setSelector(String selector) {
        getStateHelper().put(Properties.selector, selector);
    }


    public String getStyleClass() {
        String value = (String) getStateHelper().eval(Properties.styleClass);
        return value;
    }

    public void setStyleClass(String styleClass) {
        getStateHelper().put(Properties.styleClass, styleClass);
        handleAttribute("styleClass", styleClass);
    }


    public Object getValue() {
        Object value = (Object) getStateHelper().eval(Properties.value);
        return value;
    }

    public void setValue(Object value) {
        getStateHelper().put(Properties.value, value);
    }

    private void handleAttribute(String name, Object value) {
        List<String> setAttributes = (List<String>) this.getAttributes().get(ATTRIBUTES_THAT_ARE_SET_KEY);
        if (setAttributes == null) {
            setAttributes = new ArrayList<String>(1);
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
        converter,
        selector,
        styleClass,
        value

    }


}
