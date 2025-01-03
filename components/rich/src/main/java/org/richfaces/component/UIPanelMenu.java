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

import org.richfaces.PanelMenuMode;
import org.richfaces.component.attribute.DisabledProps;
import org.richfaces.component.attribute.EventsMouseProps;
import org.richfaces.component.attribute.ImmediateProps;
import org.richfaces.component.attribute.StyleClassProps;
import org.richfaces.component.attribute.StyleProps;
import org.richfaces.event.ItemChangeSource;

import javax.annotation.Generated;
import jakarta.el.MethodExpression;
import jakarta.el.ValueExpression;
import jakarta.faces.component.behavior.ClientBehaviorHolder;
import jakarta.faces.convert.Converter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * <p>The &lt;rich:panelMenu&gt; component is used in conjunction with &lt;rich:panelMenuItem&gt; and
 * &lt;rich:panelMenuGroup&gt; to create an expanding, hierarchical menu. The &lt;rich:panelMenu&gt; component's
 * appearance can be highly customized, and the hierarchy can stretch to any number of sub-levels.</p>
 *
 * @author akolonitsky
 **/
@Generated({"RichFaces CDK", "4.5.0-SNAPSHOT"})
public class UIPanelMenu extends AbstractPanelMenu
        implements ClientBehaviorHolder, DisabledProps, EventsMouseProps, ImmediateProps, StyleClassProps, StyleProps, ItemChangeSource {

    public static final String COMPONENT_TYPE = "org.richfaces.PanelMenu";

    public static final String COMPONENT_FAMILY = "org.richfaces.PanelMenu";
    private static final Collection<String> EVENT_NAMES = Collections.unmodifiableCollection(Arrays.asList(
            "dblclick",
            "click",
            "mouseout",
            "mouseover",
            "mouseup",
            "mousemove",
            "mousedown"
    ));
    private static final String ATTRIBUTES_THAT_ARE_SET_KEY = "javax.faces.component.UIComponentBase.attributesThatAreSet";

    public UIPanelMenu() {
        super();
        setRendererType("org.richfaces.PanelMenuRenderer");
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

    public boolean isBubbleSelection() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.bubbleSelection, true);
        return value;
    }

    public void setBubbleSelection(boolean bubbleSelection) {
        getStateHelper().put(Properties.bubbleSelection, bubbleSelection);
    }


    public String getCollapseEvent() {
        String value = (String) getStateHelper().eval(Properties.collapseEvent);
        return value;
    }

    public void setCollapseEvent(String collapseEvent) {
        getStateHelper().put(Properties.collapseEvent, collapseEvent);
    }


    public Converter getConverter() {
        Converter value = (Converter) getStateHelper().eval(Properties.converter);
        return value;
    }

    public void setConverter(Converter converter) {
        getStateHelper().put(Properties.converter, converter);
    }


    public boolean isDisabled() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.disabled, false);
        return value;
    }

    public void setDisabled(boolean disabled) {
        getStateHelper().put(Properties.disabled, disabled);
    }


    public String getExpandEvent() {
        String value = (String) getStateHelper().eval(Properties.expandEvent);
        return value;
    }

    public void setExpandEvent(String expandEvent) {
        getStateHelper().put(Properties.expandEvent, expandEvent);
    }


    public boolean isExpandSingle() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.expandSingle, true);
        return value;
    }

    public void setExpandSingle(boolean expandSingle) {
        getStateHelper().put(Properties.expandSingle, expandSingle);
    }


    public String getGroupClass() {
        String value = (String) getStateHelper().eval(Properties.groupClass);
        return value;
    }

    public void setGroupClass(String groupClass) {
        getStateHelper().put(Properties.groupClass, groupClass);
    }


    public String getGroupDisabledClass() {
        String value = (String) getStateHelper().eval(Properties.groupDisabledClass);
        return value;
    }

    public void setGroupDisabledClass(String groupDisabledClass) {
        getStateHelper().put(Properties.groupDisabledClass, groupDisabledClass);
    }


    public PanelMenuMode getGroupMode() {
        PanelMenuMode value = (PanelMenuMode) getStateHelper().eval(Properties.groupMode, PanelMenuMode.client);
        return value;
    }

    public void setGroupMode(PanelMenuMode groupMode) {
        getStateHelper().put(Properties.groupMode, groupMode);
    }


    public MethodExpression getItemChangeListener() {
        MethodExpression value = (MethodExpression) getStateHelper().get(Properties.itemChangeListener);
        return value;
    }

    public void setItemChangeListener(MethodExpression itemChangeListener) {
        getStateHelper().put(Properties.itemChangeListener, itemChangeListener);
    }


    public String getItemClass() {
        String value = (String) getStateHelper().eval(Properties.itemClass);
        return value;
    }

    public void setItemClass(String itemClass) {
        getStateHelper().put(Properties.itemClass, itemClass);
    }


    public String getItemDisabledClass() {
        String value = (String) getStateHelper().eval(Properties.itemDisabledClass);
        return value;
    }

    public void setItemDisabledClass(String itemDisabledClass) {
        getStateHelper().put(Properties.itemDisabledClass, itemDisabledClass);
    }


    public PanelMenuMode getItemMode() {
        PanelMenuMode value = (PanelMenuMode) getStateHelper().eval(Properties.itemMode, PanelMenuMode.DEFAULT);
        return value;
    }

    public void setItemMode(PanelMenuMode itemMode) {
        getStateHelper().put(Properties.itemMode, itemMode);
    }


    public String getOnclick() {
        String value = (String) getStateHelper().eval(Properties.onclick);
        return value;
    }

    public void setOnclick(String onclick) {
        getStateHelper().put(Properties.onclick, onclick);
        handleAttribute("onclick", onclick);
    }


    public String getOndblclick() {
        String value = (String) getStateHelper().eval(Properties.ondblclick);
        return value;
    }

    public void setOndblclick(String ondblclick) {
        getStateHelper().put(Properties.ondblclick, ondblclick);
        handleAttribute("ondblclick", ondblclick);
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
            setAttributes = new ArrayList<String>(9);
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
        bubbleSelection,
        collapseEvent,
        converter,
        disabled,
        expandEvent,
        expandSingle,
        groupClass,
        groupDisabledClass,
        groupMode,
        itemChangeListener,
        itemClass,
        itemDisabledClass,
        itemMode,
        onclick,
        ondblclick,
        onmousedown,
        onmousemove,
        onmouseout,
        onmouseover,
        onmouseup,
        style,
        styleClass,
        width

    }


}
