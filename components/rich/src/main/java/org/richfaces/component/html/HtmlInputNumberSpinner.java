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
package org.richfaces.component.html;

import org.richfaces.component.AbstractInputNumberSpinner;
import org.richfaces.component.attribute.AccesskeyProps;
import org.richfaces.component.attribute.CoreProps;
import org.richfaces.component.attribute.EventsKeyProps;
import org.richfaces.component.attribute.EventsMouseProps;
import org.richfaces.component.attribute.FocusProps;
import org.richfaces.component.attribute.I18nProps;
import org.richfaces.component.attribute.InputProps;

import javax.annotation.Generated;
import jakarta.el.ValueExpression;
import jakarta.faces.component.behavior.ClientBehaviorHolder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * <p> The &amp;lt;r:inputNumberSpinner&amp;gt; component is a single-line input field with buttons to increase and decrease a numerical value.
 * The value can be changed using the corresponding directional keys on a keyboard, or by typing into the field.
 * </p>
 **/
@Generated({"RichFaces CDK", "4.5.0-SNAPSHOT"})
public class HtmlInputNumberSpinner extends AbstractInputNumberSpinner
        implements ClientBehaviorHolder, AccesskeyProps, CoreProps, EventsKeyProps, EventsMouseProps, FocusProps, I18nProps, InputProps {

    public static final String COMPONENT_TYPE = "org.richfaces.InputNumberSpinner";

    public static final String COMPONENT_FAMILY = "javax.faces.Input";
    private static final Collection<String> EVENT_NAMES = Collections.unmodifiableCollection(Arrays.asList(
            "click",
            "inputmousemove",
            "inputclick",
            "inputkeyup",
            "inputmouseover",
            "mouseup",
            "keyup",
            "keydown",
            "upclick",
            "change",
            "inputmousedown",
            "mousedown",
            "inputmouseout",
            "select",
            "focus",
            "mouseover",
            "blur",
            "inputkeydown",
            "mousemove",
            "inputkeypress",
            "keypress",
            "dblclick",
            "mouseout",
            "downclick",
            "inputmouseup",
            "inputdblclick"
    ));
    private static final String ATTRIBUTES_THAT_ARE_SET_KEY = "javax.faces.component.UIComponentBase.attributesThatAreSet";

    public HtmlInputNumberSpinner() {
        super();
        setRendererType("org.richfaces.InputNumberSpinnerRenderer");
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

    public String getAccesskey() {
        String value = (String) getStateHelper().eval(Properties.accesskey);
        return value;
    }

    public void setAccesskey(String accesskey) {
        getStateHelper().put(Properties.accesskey, accesskey);
        handleAttribute("accesskey", accesskey);
    }


    public boolean isCycled() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.cycled, true);
        return value;
    }

    public void setCycled(boolean cycled) {
        getStateHelper().put(Properties.cycled, cycled);
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


    public boolean isEnableManualInput() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.enableManualInput, true);
        return value;
    }

    public void setEnableManualInput(boolean enableManualInput) {
        getStateHelper().put(Properties.enableManualInput, enableManualInput);
    }


    public String getInputClass() {
        String value = (String) getStateHelper().eval(Properties.inputClass);
        return value;
    }

    public void setInputClass(String inputClass) {
        getStateHelper().put(Properties.inputClass, inputClass);
        handleAttribute("inputClass", inputClass);
    }


    public int getInputSize() {
        Integer value = (Integer) getStateHelper().eval(Properties.inputSize, 10);
        return value;
    }

    public void setInputSize(int inputSize) {
        getStateHelper().put(Properties.inputSize, inputSize);
    }


    public String getLabel() {
        String value = (String) getStateHelper().eval(Properties.label);
        return value;
    }

    public void setLabel(String label) {
        getStateHelper().put(Properties.label, label);
    }


    public String getLang() {
        String value = (String) getStateHelper().eval(Properties.lang);
        return value;
    }

    public void setLang(String lang) {
        getStateHelper().put(Properties.lang, lang);
        handleAttribute("lang", lang);
    }


    public String getMaxValue() {
        String value = (String) getStateHelper().eval(Properties.maxValue, "100");
        return value;
    }

    public void setMaxValue(String maxValue) {
        getStateHelper().put(Properties.maxValue, maxValue);
    }


    public String getMinValue() {
        String value = (String) getStateHelper().eval(Properties.minValue, "0");
        return value;
    }

    public void setMinValue(String minValue) {
        getStateHelper().put(Properties.minValue, minValue);
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


    public String getOndownclick() {
        String value = (String) getStateHelper().eval(Properties.ondownclick);
        return value;
    }

    public void setOndownclick(String ondownclick) {
        getStateHelper().put(Properties.ondownclick, ondownclick);
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


    public String getOnselect() {
        String value = (String) getStateHelper().eval(Properties.onselect);
        return value;
    }

    public void setOnselect(String onselect) {
        getStateHelper().put(Properties.onselect, onselect);
        handleAttribute("onselect", onselect);
    }


    public String getOnupclick() {
        String value = (String) getStateHelper().eval(Properties.onupclick);
        return value;
    }

    public void setOnupclick(String onupclick) {
        getStateHelper().put(Properties.onupclick, onupclick);
    }


    public boolean isReadonly() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.readonly, false);
        return value;
    }

    public void setReadonly(boolean readonly) {
        getStateHelper().put(Properties.readonly, readonly);
    }


    public String getStep() {
        String value = (String) getStateHelper().eval(Properties.step, "1");
        return value;
    }

    public void setStep(String step) {
        getStateHelper().put(Properties.step, step);
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
            setAttributes = new ArrayList<String>(20);
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
        cycled,
        dir,
        disabled,
        enableManualInput,
        inputClass,
        inputSize,
        label,
        lang,
        maxValue,
        minValue,
        onblur,
        onchange,
        onclick,
        ondblclick,
        ondownclick,
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
        onkeydown,
        onkeypress,
        onkeyup,
        onmousedown,
        onmousemove,
        onmouseout,
        onmouseover,
        onmouseup,
        onselect,
        onupclick,
        readonly,
        step,
        style,
        styleClass,
        tabindex,
        title

    }


}
