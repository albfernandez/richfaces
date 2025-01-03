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
import org.richfaces.component.attribute.AjaxProps;
import org.richfaces.component.attribute.BypassProps;
import org.richfaces.component.attribute.EventsMouseProps;
import org.richfaces.component.attribute.StyleClassProps;
import org.richfaces.component.attribute.StyleProps;

import javax.annotation.Generated;
import jakarta.el.ValueExpression;
import jakarta.faces.component.behavior.ClientBehaviorHolder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * <p>
 * The &lt;rich:panelMenuGroup&gt; component defines a group of &lt;rich:panelMenuItem&gt; components inside a
 * &lt;rich:panelMenu&gt;.
 * </p>
 *
 * @author akolonitsky
 **/
@Generated({"RichFaces CDK", "4.5.0-SNAPSHOT"})
public class UIPanelMenuGroup extends AbstractPanelMenuGroup
        implements ClientBehaviorHolder, AjaxProps, BypassProps, EventsMouseProps, StyleClassProps, StyleProps {

    public static final String COMPONENT_TYPE = "org.richfaces.PanelMenuGroup";

    public static final String COMPONENT_FAMILY = "org.richfaces.PanelMenuGroup";
    private static final Collection<String> EVENT_NAMES = Collections.unmodifiableCollection(Arrays.asList(
            "click",
            "select",
            "mouseover",
            "mouseup",
            "switch",
            "mousemove",
            "beforeswitch",
            "dblclick",
            "expand",
            "mouseout",
            "beforeexpand",
            "beforecollapse",
            "beforedomupdate",
            "begin",
            "mousedown",
            "complete",
            "beforeselect",
            "collapse"
    ));
    private static final String ATTRIBUTES_THAT_ARE_SET_KEY = "javax.faces.component.UIComponentBase.attributesThatAreSet";

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

    public boolean isBypassUpdates() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.bypassUpdates, false);
        return value;
    }

    public void setBypassUpdates(boolean bypassUpdates) {
        getStateHelper().put(Properties.bypassUpdates, bypassUpdates);
    }


    public String getCollapseEvent() {
        String value = (String) getStateHelper().eval(Properties.collapseEvent);
        return value;
    }

    public void setCollapseEvent(String collapseEvent) {
        getStateHelper().put(Properties.collapseEvent, collapseEvent);
    }


    public Object getData() {
        Object value = (Object) getStateHelper().eval(Properties.data);
        return value;
    }

    public void setData(Object data) {
        getStateHelper().put(Properties.data, data);
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


    public String getLabel() {
        String value = (String) getStateHelper().eval(Properties.label);
        return value;
    }

    public void setLabel(String label) {
        getStateHelper().put(Properties.label, label);
    }


    public String getLeftIcon() {
        String value = (String) getStateHelper().eval(Properties.leftIcon);
        return value;
    }

    public void setLeftIcon(String leftIcon) {
        getStateHelper().put(Properties.leftIcon, leftIcon);
    }


    public String getLeftIconClass() {
        String value = (String) getStateHelper().eval(Properties.leftIconClass);
        return value;
    }

    public void setLeftIconClass(String leftIconClass) {
        getStateHelper().put(Properties.leftIconClass, leftIconClass);
    }


    public boolean isLimitRender() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.limitRender, false);
        return value;
    }

    public void setLimitRender(boolean limitRender) {
        getStateHelper().put(Properties.limitRender, limitRender);
    }


    public PanelMenuMode getMode() {
        PanelMenuMode value = (PanelMenuMode) getStateHelper().eval(Properties.mode, getPanelMenu().getGroupMode());
        return value;
    }

    public void setMode(PanelMenuMode mode) {
        getStateHelper().put(Properties.mode, mode);
    }


    public String getOnbeforecollapse() {
        String value = (String) getStateHelper().eval(Properties.onbeforecollapse);
        return value;
    }

    public void setOnbeforecollapse(String onbeforecollapse) {
        getStateHelper().put(Properties.onbeforecollapse, onbeforecollapse);
    }


    public String getOnbeforedomupdate() {
        String value = (String) getStateHelper().eval(Properties.onbeforedomupdate);
        return value;
    }

    public void setOnbeforedomupdate(String onbeforedomupdate) {
        getStateHelper().put(Properties.onbeforedomupdate, onbeforedomupdate);
    }


    public String getOnbeforeexpand() {
        String value = (String) getStateHelper().eval(Properties.onbeforeexpand);
        return value;
    }

    public void setOnbeforeexpand(String onbeforeexpand) {
        getStateHelper().put(Properties.onbeforeexpand, onbeforeexpand);
    }


    public String getOnbeforeselect() {
        String value = (String) getStateHelper().eval(Properties.onbeforeselect);
        return value;
    }

    public void setOnbeforeselect(String onbeforeselect) {
        getStateHelper().put(Properties.onbeforeselect, onbeforeselect);
    }


    public String getOnbeforeswitch() {
        String value = (String) getStateHelper().eval(Properties.onbeforeswitch);
        return value;
    }

    public void setOnbeforeswitch(String onbeforeswitch) {
        getStateHelper().put(Properties.onbeforeswitch, onbeforeswitch);
    }


    public String getOnbegin() {
        String value = (String) getStateHelper().eval(Properties.onbegin);
        return value;
    }

    public void setOnbegin(String onbegin) {
        getStateHelper().put(Properties.onbegin, onbegin);
    }


    public String getOnclick() {
        String value = (String) getStateHelper().eval(Properties.onclick);
        return value;
    }

    public void setOnclick(String onclick) {
        getStateHelper().put(Properties.onclick, onclick);
        handleAttribute("onclick", onclick);
    }


    public String getOncollapse() {
        String value = (String) getStateHelper().eval(Properties.oncollapse);
        return value;
    }

    public void setOncollapse(String oncollapse) {
        getStateHelper().put(Properties.oncollapse, oncollapse);
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


    public String getOnexpand() {
        String value = (String) getStateHelper().eval(Properties.onexpand);
        return value;
    }

    public void setOnexpand(String onexpand) {
        getStateHelper().put(Properties.onexpand, onexpand);
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


    public String getOnselect() {
        String value = (String) getStateHelper().eval(Properties.onselect);
        return value;
    }

    public void setOnselect(String onselect) {
        getStateHelper().put(Properties.onselect, onselect);
    }


    public String getOnswitch() {
        String value = (String) getStateHelper().eval(Properties.onswitch);
        return value;
    }

    public void setOnswitch(String onswitch) {
        getStateHelper().put(Properties.onswitch, onswitch);
    }


    public Object getRender() {
        Object value = (Object) getStateHelper().eval(Properties.render);
        return value;
    }

    public void setRender(Object render) {
        getStateHelper().put(Properties.render, render);
    }


    public String getRightIcon() {
        String value = (String) getStateHelper().eval(Properties.rightIcon);
        return value;
    }

    public void setRightIcon(String rightIcon) {
        getStateHelper().put(Properties.rightIcon, rightIcon);
    }


    public String getRightIconClass() {
        String value = (String) getStateHelper().eval(Properties.rightIconClass);
        return value;
    }

    public void setRightIconClass(String rightIconClass) {
        getStateHelper().put(Properties.rightIconClass, rightIconClass);
    }


    public Boolean getSelectable() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.selectable, Boolean.FALSE);
        return value;
    }

    public void setSelectable(Boolean selectable) {
        getStateHelper().put(Properties.selectable, selectable);
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


    public Boolean getUnselectable() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.unselectable, Boolean.FALSE);
        return value;
    }

    public void setUnselectable(Boolean unselectable) {
        getStateHelper().put(Properties.unselectable, unselectable);
    }

    private void handleAttribute(String name, Object value) {
        List<String> setAttributes = (List<String>) this.getAttributes().get(ATTRIBUTES_THAT_ARE_SET_KEY);
        if (setAttributes == null) {
            setAttributes = new ArrayList<String>(8);
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
        bypassUpdates,
        collapseEvent,
        data,
        disabled,
        expandEvent,
        label,
        leftIcon,
        leftIconClass,
        limitRender,
        mode,
        onbeforecollapse,
        onbeforedomupdate,
        onbeforeexpand,
        onbeforeselect,
        onbeforeswitch,
        onbegin,
        onclick,
        oncollapse,
        oncomplete,
        ondblclick,
        onexpand,
        onmousedown,
        onmousemove,
        onmouseout,
        onmouseover,
        onmouseup,
        onselect,
        onswitch,
        render,
        rightIcon,
        rightIconClass,
        selectable,
        status,
        style,
        unselectable

    }


}
