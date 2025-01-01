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

import org.richfaces.component.attribute.OutputFormatProps;
import org.richfaces.component.attribute.StyleClassProps;

import javax.annotation.Generated;
import javax.el.ValueExpression;
import javax.faces.component.behavior.ClientBehaviorHolder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * <p>
 * The &lt;rich:notify&gt; component serves for advanced user interaction, using notification boxes to give the user instant
 * feedback on what's happening within the application. Each time this component is rendered, a floating notification box is
 * displayed in the selected corner of the browser screen.
 * </p>
 *
 * @author <a href="http://community.jboss.org/people/lfryc">Lukas Fryc</a>
 * @author <a href="http://community.jboss.org/people/bleathem">Brian Leathem</a>
 **/
@Generated({"RichFaces CDK", "4.5.0-SNAPSHOT"})
public class UINotify extends AbstractNotify
        implements ClientBehaviorHolder, NotifyAttributes, OutputFormatProps, StyleClassProps {

    public static final String COMPONENT_TYPE = "org.richfaces.Notify";

    public static final String COMPONENT_FAMILY = "org.richfaces.Notify";
    private static final Collection<String> EVENT_NAMES = Collections.unmodifiableCollection(Arrays.asList(
            "dblclick",
            "click",
            "mouseout",
            "mouseover",
            "mouseup",
            "keyup",
            "mousemove",
            "keydown",
            "mousedown",
            "keypress"
    ));
    private static final String ATTRIBUTES_THAT_ARE_SET_KEY = "javax.faces.component.UIComponentBase.attributesThatAreSet";

    public UINotify() {
        super();
        setRendererType("org.richfaces.NotifyRenderer");
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

    public String getDetail() {
        String value = (String) getStateHelper().eval(Properties.detail);
        return value;
    }

    public void setDetail(String detail) {
        getStateHelper().put(Properties.detail, detail);
    }


    public boolean isDisabled() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.disabled, false);
        return value;
    }

    public void setDisabled(boolean disabled) {
        getStateHelper().put(Properties.disabled, disabled);
    }


    public boolean isEscape() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.escape, true);
        return value;
    }

    public void setEscape(boolean escape) {
        getStateHelper().put(Properties.escape, escape);
    }


    public boolean isNonblocking() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.nonblocking, false);
        return value;
    }

    public void setNonblocking(boolean nonblocking) {
        getStateHelper().put(Properties.nonblocking, nonblocking);
    }


    public Double getNonblockingOpacity() {
        Double value = (Double) getStateHelper().eval(Properties.nonblockingOpacity);
        return value;
    }

    public void setNonblockingOpacity(Double nonblockingOpacity) {
        getStateHelper().put(Properties.nonblockingOpacity, nonblockingOpacity);
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


    public boolean isShowCloseButton() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.showCloseButton, true);
        return value;
    }

    public void setShowCloseButton(boolean showCloseButton) {
        getStateHelper().put(Properties.showCloseButton, showCloseButton);
    }


    public boolean isShowShadow() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.showShadow, false);
        return value;
    }

    public void setShowShadow(boolean showShadow) {
        getStateHelper().put(Properties.showShadow, showShadow);
    }


    public String getStack() {
        String value = (String) getStateHelper().eval(Properties.stack);
        return value;
    }

    public void setStack(String stack) {
        getStateHelper().put(Properties.stack, stack);
    }


    public Integer getStayTime() {
        Integer value = (Integer) getStateHelper().eval(Properties.stayTime);
        return value;
    }

    public void setStayTime(Integer stayTime) {
        getStateHelper().put(Properties.stayTime, stayTime);
    }


    public boolean isSticky() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.sticky, false);
        return value;
    }

    public void setSticky(boolean sticky) {
        getStateHelper().put(Properties.sticky, sticky);
    }


    public String getStyleClass() {
        String value = (String) getStateHelper().eval(Properties.styleClass);
        return value;
    }

    public void setStyleClass(String styleClass) {
        getStateHelper().put(Properties.styleClass, styleClass);
        handleAttribute("styleClass", styleClass);
    }


    public String getSummary() {
        String value = (String) getStateHelper().eval(Properties.summary);
        return value;
    }

    public void setSummary(String summary) {
        getStateHelper().put(Properties.summary, summary);
    }

    private void handleAttribute(String name, Object value) {
        List<String> setAttributes = (List<String>) this.getAttributes().get(ATTRIBUTES_THAT_ARE_SET_KEY);
        if (setAttributes == null) {
            setAttributes = new ArrayList<String>(11);
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
        detail,
        disabled,
        escape,
        nonblocking,
        nonblockingOpacity,
        onclick,
        ondblclick,
        onkeydown,
        onkeypress,
        onkeyup,
        onmousedown,
        onmousemove,
        onmouseout,
        onmouseover,
        onmouseup,
        showCloseButton,
        showShadow,
        stack,
        stayTime,
        sticky,
        styleClass,
        summary

    }


}
