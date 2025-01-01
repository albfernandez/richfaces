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

import javax.annotation.Generated;
import javax.el.ValueExpression;
import javax.faces.component.behavior.ClientBehaviorHolder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * <p>The &lt;rich:toolbar&gt; component is a horizontal toolbar. Any JavaServer Faces (JSF) component can be added to the
 * toolbar.</p>
 **/
@Generated({"RichFaces CDK", "4.5.0-SNAPSHOT"})
public class UIToolbar extends AbstractToolbar
        implements ClientBehaviorHolder, CoreProps {

    public static final String COMPONENT_TYPE = "org.richfaces.Toolbar";

    public static final String COMPONENT_FAMILY = "org.richfaces.Toolbar";
    private static final Collection<String> EVENT_NAMES = Collections.unmodifiableCollection(Arrays.asList(
            "itemmouseup",
            "itemclick",
            "itemkeypress",
            "itemmouseout",
            "itemkeyup",
            "itemmousedown",
            "itemdblclick",
            "itemmousemove",
            "itemkeydown",
            "itemmouseover"
    ));
    private static final String ATTRIBUTES_THAT_ARE_SET_KEY = "javax.faces.component.UIComponentBase.attributesThatAreSet";

    public UIToolbar() {
        super();
        setRendererType("org.richfaces.ToolbarRenderer");
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

    public String getHeight() {
        String value = (String) getStateHelper().eval(Properties.height);
        return value;
    }

    public void setHeight(String height) {
        getStateHelper().put(Properties.height, height);
    }


    public String getItemClass() {
        String value = (String) getStateHelper().eval(Properties.itemClass);
        return value;
    }

    public void setItemClass(String itemClass) {
        getStateHelper().put(Properties.itemClass, itemClass);
    }


    public String getItemSeparator() {
        String value = (String) getStateHelper().eval(Properties.itemSeparator);
        return value;
    }

    public void setItemSeparator(String itemSeparator) {
        getStateHelper().put(Properties.itemSeparator, itemSeparator);
    }


    public String getItemStyle() {
        String value = (String) getStateHelper().eval(Properties.itemStyle);
        return value;
    }

    public void setItemStyle(String itemStyle) {
        getStateHelper().put(Properties.itemStyle, itemStyle);
    }


    public String getOnitemclick() {
        String value = (String) getStateHelper().eval(Properties.onitemclick);
        return value;
    }

    public void setOnitemclick(String onitemclick) {
        getStateHelper().put(Properties.onitemclick, onitemclick);
    }


    public String getOnitemdblclick() {
        String value = (String) getStateHelper().eval(Properties.onitemdblclick);
        return value;
    }

    public void setOnitemdblclick(String onitemdblclick) {
        getStateHelper().put(Properties.onitemdblclick, onitemdblclick);
    }


    public String getOnitemkeydown() {
        String value = (String) getStateHelper().eval(Properties.onitemkeydown);
        return value;
    }

    public void setOnitemkeydown(String onitemkeydown) {
        getStateHelper().put(Properties.onitemkeydown, onitemkeydown);
    }


    public String getOnitemkeypress() {
        String value = (String) getStateHelper().eval(Properties.onitemkeypress);
        return value;
    }

    public void setOnitemkeypress(String onitemkeypress) {
        getStateHelper().put(Properties.onitemkeypress, onitemkeypress);
    }


    public String getOnitemkeyup() {
        String value = (String) getStateHelper().eval(Properties.onitemkeyup);
        return value;
    }

    public void setOnitemkeyup(String onitemkeyup) {
        getStateHelper().put(Properties.onitemkeyup, onitemkeyup);
    }


    public String getOnitemmousedown() {
        String value = (String) getStateHelper().eval(Properties.onitemmousedown);
        return value;
    }

    public void setOnitemmousedown(String onitemmousedown) {
        getStateHelper().put(Properties.onitemmousedown, onitemmousedown);
    }


    public String getOnitemmousemove() {
        String value = (String) getStateHelper().eval(Properties.onitemmousemove);
        return value;
    }

    public void setOnitemmousemove(String onitemmousemove) {
        getStateHelper().put(Properties.onitemmousemove, onitemmousemove);
    }


    public String getOnitemmouseout() {
        String value = (String) getStateHelper().eval(Properties.onitemmouseout);
        return value;
    }

    public void setOnitemmouseout(String onitemmouseout) {
        getStateHelper().put(Properties.onitemmouseout, onitemmouseout);
    }


    public String getOnitemmouseover() {
        String value = (String) getStateHelper().eval(Properties.onitemmouseover);
        return value;
    }

    public void setOnitemmouseover(String onitemmouseover) {
        getStateHelper().put(Properties.onitemmouseover, onitemmouseover);
    }


    public String getOnitemmouseup() {
        String value = (String) getStateHelper().eval(Properties.onitemmouseup);
        return value;
    }

    public void setOnitemmouseup(String onitemmouseup) {
        getStateHelper().put(Properties.onitemmouseup, onitemmouseup);
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


    public String getWidth() {
        String value = (String) getStateHelper().eval(Properties.width);
        return value;
    }

    public void setWidth(String width) {
        getStateHelper().put(Properties.width, width);
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
        height,
        itemClass,
        itemSeparator,
        itemStyle,
        onitemclick,
        onitemdblclick,
        onitemkeydown,
        onitemkeypress,
        onitemkeyup,
        onitemmousedown,
        onitemmousemove,
        onitemmouseout,
        onitemmouseover,
        onitemmouseup,
        style,
        styleClass,
        title,
        width

    }


}
