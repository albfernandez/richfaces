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
 * <p> The &lt;rich:progressBar&gt; component displays a progress bar to indicate the status of a process to the user.
 * It can update either through Ajax or on the client side, and the look and feel can be fully customized. </p>
 *
 * @author "Andrey Markavtsov"
 **/
@Generated({"RichFaces CDK", "4.5.0-SNAPSHOT"})
public class UIProgressBar extends AbstractProgressBar
        implements ClientBehaviorHolder, MetaComponentEncoder, MetaComponentResolver, AjaxProps, EventsMouseProps, StyleClassProps, StyleProps {

    public static final String COMPONENT_TYPE = "org.richfaces.ProgressBar";

    public static final String COMPONENT_FAMILY = "org.richfaces.ProgressBar";
    private static final Collection<String> EVENT_NAMES = Collections.unmodifiableCollection(Arrays.asList(
            "dblclick",
            "click",
            "mouseout",
            "mouseover",
            "mouseup",
            "beforedomupdate",
            "finish",
            "mousemove",
            "begin",
            "mousedown",
            "complete"
    ));
    private static final String ATTRIBUTES_THAT_ARE_SET_KEY = "javax.faces.component.UIComponentBase.attributesThatAreSet";

    public UIProgressBar() {
        super();
        setRendererType("org.richfaces.ProgressBarRenderer");
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

    public Object getData() {
        Object value = (Object) getStateHelper().eval(Properties.data);
        return value;
    }

    public void setData(Object data) {
        getStateHelper().put(Properties.data, data);
    }


    public boolean isEnabled() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.enabled, false);
        return value;
    }

    public void setEnabled(boolean enabled) {
        getStateHelper().put(Properties.enabled, enabled);
    }


    public Object getExecute() {
        Object value = (Object) getStateHelper().eval(Properties.execute);
        return value;
    }

    public void setExecute(Object execute) {
        getStateHelper().put(Properties.execute, execute);
    }


    public String getFinishClass() {
        String value = (String) getStateHelper().eval(Properties.finishClass);
        return value;
    }

    public void setFinishClass(String finishClass) {
        getStateHelper().put(Properties.finishClass, finishClass);
    }


    public String getInitialClass() {
        String value = (String) getStateHelper().eval(Properties.initialClass);
        return value;
    }

    public void setInitialClass(String initialClass) {
        getStateHelper().put(Properties.initialClass, initialClass);
    }


    public int getInterval() {
        Integer value = (Integer) getStateHelper().eval(Properties.interval, Integer.MIN_VALUE);
        return value;
    }

    public void setInterval(int interval) {
        getStateHelper().put(Properties.interval, interval);
    }


    public String getLabel() {
        String value = (String) getStateHelper().eval(Properties.label);
        return value;
    }

    public void setLabel(String label) {
        getStateHelper().put(Properties.label, label);
    }


    public boolean isLimitRender() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.limitRender, false);
        return value;
    }

    public void setLimitRender(boolean limitRender) {
        getStateHelper().put(Properties.limitRender, limitRender);
    }


    public Object getMaxValue() {
        Object value = (Object) getStateHelper().eval(Properties.maxValue);
        return value;
    }

    public void setMaxValue(Object maxValue) {
        getStateHelper().put(Properties.maxValue, maxValue);
    }


    public Object getMinValue() {
        Object value = (Object) getStateHelper().eval(Properties.minValue);
        return value;
    }

    public void setMinValue(Object minValue) {
        getStateHelper().put(Properties.minValue, minValue);
    }


    public SwitchType getMode() {
        SwitchType value = (SwitchType) getStateHelper().eval(Properties.mode);
        return value;
    }

    public void setMode(SwitchType mode) {
        getStateHelper().put(Properties.mode, mode);
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


    public String getOnfinish() {
        String value = (String) getStateHelper().eval(Properties.onfinish);
        return value;
    }

    public void setOnfinish(String onfinish) {
        getStateHelper().put(Properties.onfinish, onfinish);
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


    public String getProgressClass() {
        String value = (String) getStateHelper().eval(Properties.progressClass);
        return value;
    }

    public void setProgressClass(String progressClass) {
        getStateHelper().put(Properties.progressClass, progressClass);
    }


    public String getRemainingClass() {
        String value = (String) getStateHelper().eval(Properties.remainingClass);
        return value;
    }

    public void setRemainingClass(String remainingClass) {
        getStateHelper().put(Properties.remainingClass, remainingClass);
    }


    public Object getRender() {
        Object value = (Object) getStateHelper().eval(Properties.render);
        return value;
    }

    public void setRender(Object render) {
        getStateHelper().put(Properties.render, render);
    }


    public String getResource() {
        String value = (String) getStateHelper().eval(Properties.resource);
        return value;
    }

    public void setResource(String resource) {
        getStateHelper().put(Properties.resource, resource);
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
        data,
        enabled,
        execute,
        finishClass,
        initialClass,
        interval,
        label,
        limitRender,
        maxValue,
        minValue,
        mode,
        onbeforedomupdate,
        onbegin,
        onclick,
        oncomplete,
        ondblclick,
        onfinish,
        onmousedown,
        onmousemove,
        onmouseout,
        onmouseover,
        onmouseup,
        progressClass,
        remainingClass,
        render,
        resource,
        status,
        style,
        styleClass,
        value

    }


}
