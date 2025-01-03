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
import org.richfaces.component.attribute.DisabledProps;
import org.richfaces.component.attribute.EventsKeyProps;
import org.richfaces.component.attribute.EventsMouseProps;
import org.richfaces.component.attribute.FocusProps;

import javax.annotation.Generated;
import jakarta.el.ValueExpression;
import jakarta.faces.component.behavior.ClientBehaviorHolder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * <p> The &lt;rich:inplaceInput&gt; component allows information to be entered in-line in blocks of text, improving
 * readability of the text. Multiple input regions can be navigated with keyboard navigation. The component has three
 * functional states: the view state, where the component displays its initial setting, such as &quot;click to
 * edit&quot;; the edit state, where the user can input text; and the &quot;changed&quot; state, where the new value for
 * the component has been confirmed but can be edited again if required. </p>
 *
 * @author Anton Belevich
 **/
@Generated({"RichFaces CDK", "4.5.0-SNAPSHOT"})
public class UIInplaceInput extends AbstractInplaceInput
        implements ClientBehaviorHolder, InplaceComponent, CoreProps, DisabledProps, EventsKeyProps, EventsMouseProps, FocusProps {

    public static final String COMPONENT_TYPE = "org.richfaces.InplaceInput";

    public static final String COMPONENT_FAMILY = "org.richfaces.InplaceInput";
    private static final Collection<String> EVENT_NAMES = Collections.unmodifiableCollection(Arrays.asList(
            "inputmouseout",
            "click",
            "inputmousemove",
            "focus",
            "inputclick",
            "inputkeyup",
            "inputmouseover",
            "mouseover",
            "blur",
            "inputkeydown",
            "mouseup",
            "keyup",
            "mousemove",
            "inputkeypress",
            "keydown",
            "inputselect",
            "keypress",
            "dblclick",
            "mouseout",
            "change",
            "inputmousedown",
            "inputmouseup",
            "mousedown",
            "inputdblclick"
    ));
    private static final String ATTRIBUTES_THAT_ARE_SET_KEY = "javax.faces.component.UIComponentBase.attributesThatAreSet";

    public UIInplaceInput() {
        super();
        setRendererType("org.richfaces.InplaceInputRenderer");
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

    public String getActiveClass() {
        String value = (String) getStateHelper().eval(Properties.activeClass);
        return value;
    }

    public void setActiveClass(String activeClass) {
        getStateHelper().put(Properties.activeClass, activeClass);
    }


    public String getChangedClass() {
        String value = (String) getStateHelper().eval(Properties.changedClass);
        return value;
    }

    public void setChangedClass(String changedClass) {
        getStateHelper().put(Properties.changedClass, changedClass);
    }


    public String getDefaultLabel() {
        String value = (String) getStateHelper().eval(Properties.defaultLabel);
        return value;
    }

    public void setDefaultLabel(String defaultLabel) {
        getStateHelper().put(Properties.defaultLabel, defaultLabel);
    }


    public boolean isDisabled() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.disabled, false);
        return value;
    }

    public void setDisabled(boolean disabled) {
        getStateHelper().put(Properties.disabled, disabled);
    }


    public String getDisabledClass() {
        String value = (String) getStateHelper().eval(Properties.disabledClass);
        return value;
    }

    public void setDisabledClass(String disabledClass) {
        getStateHelper().put(Properties.disabledClass, disabledClass);
    }


    public String getEditEvent() {
        String value = (String) getStateHelper().eval(Properties.editEvent);
        return value;
    }

    public void setEditEvent(String editEvent) {
        getStateHelper().put(Properties.editEvent, editEvent);
    }


    public String getInputWidth() {
        String value = (String) getStateHelper().eval(Properties.inputWidth);
        return value;
    }

    public void setInputWidth(String inputWidth) {
        getStateHelper().put(Properties.inputWidth, inputWidth);
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


    public String getOnfocus() {
        String value = (String) getStateHelper().eval(Properties.onfocus);
        return value;
    }

    public void setOnfocus(String onfocus) {
        getStateHelper().put(Properties.onfocus, onfocus);
        handleAttribute("onfocus", onfocus);
    }


    public String getOninputclick() {
        String value = (String) getStateHelper().eval(Properties.oninputclick);
        return value;
    }

    public void setOninputclick(String oninputclick) {
        getStateHelper().put(Properties.oninputclick, oninputclick);
    }


    public String getOninputdblclick() {
        String value = (String) getStateHelper().eval(Properties.oninputdblclick);
        return value;
    }

    public void setOninputdblclick(String oninputdblclick) {
        getStateHelper().put(Properties.oninputdblclick, oninputdblclick);
    }


    public String getOninputkeydown() {
        String value = (String) getStateHelper().eval(Properties.oninputkeydown);
        return value;
    }

    public void setOninputkeydown(String oninputkeydown) {
        getStateHelper().put(Properties.oninputkeydown, oninputkeydown);
    }


    public String getOninputkeypress() {
        String value = (String) getStateHelper().eval(Properties.oninputkeypress);
        return value;
    }

    public void setOninputkeypress(String oninputkeypress) {
        getStateHelper().put(Properties.oninputkeypress, oninputkeypress);
    }


    public String getOninputkeyup() {
        String value = (String) getStateHelper().eval(Properties.oninputkeyup);
        return value;
    }

    public void setOninputkeyup(String oninputkeyup) {
        getStateHelper().put(Properties.oninputkeyup, oninputkeyup);
    }


    public String getOninputmousedown() {
        String value = (String) getStateHelper().eval(Properties.oninputmousedown);
        return value;
    }

    public void setOninputmousedown(String oninputmousedown) {
        getStateHelper().put(Properties.oninputmousedown, oninputmousedown);
    }


    public String getOninputmousemove() {
        String value = (String) getStateHelper().eval(Properties.oninputmousemove);
        return value;
    }

    public void setOninputmousemove(String oninputmousemove) {
        getStateHelper().put(Properties.oninputmousemove, oninputmousemove);
    }


    public String getOninputmouseout() {
        String value = (String) getStateHelper().eval(Properties.oninputmouseout);
        return value;
    }

    public void setOninputmouseout(String oninputmouseout) {
        getStateHelper().put(Properties.oninputmouseout, oninputmouseout);
    }


    public String getOninputmouseover() {
        String value = (String) getStateHelper().eval(Properties.oninputmouseover);
        return value;
    }

    public void setOninputmouseover(String oninputmouseover) {
        getStateHelper().put(Properties.oninputmouseover, oninputmouseover);
    }


    public String getOninputmouseup() {
        String value = (String) getStateHelper().eval(Properties.oninputmouseup);
        return value;
    }

    public void setOninputmouseup(String oninputmouseup) {
        getStateHelper().put(Properties.oninputmouseup, oninputmouseup);
    }


    public String getOninputselect() {
        String value = (String) getStateHelper().eval(Properties.oninputselect);
        return value;
    }

    public void setOninputselect(String oninputselect) {
        getStateHelper().put(Properties.oninputselect, oninputselect);
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


    public boolean isSaveOnBlur() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.saveOnBlur, true);
        return value;
    }

    public void setSaveOnBlur(boolean saveOnBlur) {
        getStateHelper().put(Properties.saveOnBlur, saveOnBlur);
    }


    public boolean isShowControls() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.showControls, false);
        return value;
    }

    public void setShowControls(boolean showControls) {
        getStateHelper().put(Properties.showControls, showControls);
    }


    public InplaceState getState() {
        InplaceState value = (InplaceState) getStateHelper().eval(Properties.state);
        return value;
    }

    public void setState(InplaceState state) {
        getStateHelper().put(Properties.state, state);
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

    private void handleAttribute(String name, Object value) {
        List<String> setAttributes = (List<String>) this.getAttributes().get(ATTRIBUTES_THAT_ARE_SET_KEY);
        if (setAttributes == null) {
            setAttributes = new ArrayList<String>(15);
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
        activeClass,
        changedClass,
        defaultLabel,
        disabled,
        disabledClass,
        editEvent,
        inputWidth,
        onblur,
        onchange,
        onclick,
        ondblclick,
        onfocus,
        oninputclick,
        oninputdblclick,
        oninputkeydown,
        oninputkeypress,
        oninputkeyup,
        oninputmousedown,
        oninputmousemove,
        oninputmouseout,
        oninputmouseover,
        oninputmouseup,
        oninputselect,
        onkeydown,
        onkeypress,
        onkeyup,
        onmousedown,
        onmousemove,
        onmouseout,
        onmouseover,
        onmouseup,
        saveOnBlur,
        showControls,
        state,
        style,
        styleClass,
        tabindex,
        title

    }


}
