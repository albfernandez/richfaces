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

import org.richfaces.component.AbstractInputNumberSlider;
import org.richfaces.component.InputNumberSliderHandleType;
import org.richfaces.component.InputNumberSliderInputPosition;
import org.richfaces.component.attribute.AccesskeyProps;
import org.richfaces.component.attribute.CoreProps;
import org.richfaces.component.attribute.EventsKeyProps;
import org.richfaces.component.attribute.EventsMouseProps;
import org.richfaces.component.attribute.FocusProps;
import org.richfaces.component.attribute.I18nProps;
import org.richfaces.component.attribute.InputProps;

import javax.annotation.Generated;
import javax.el.ValueExpression;
import javax.faces.component.behavior.ClientBehaviorHolder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * <p> The &amp;lt;r:inputNumberSlider&amp;gt; component provides a slider for changing numerical values.
 * Optional features include control arrows to step through the values,
 * a tool-tip to display the value while sliding,
 * and a text field for typing the numerical value which can then be validated against the slider's range.
 * </p>
 **/
@Generated({"RichFaces CDK", "4.5.0-SNAPSHOT"})
public class HtmlInputNumberSlider extends AbstractInputNumberSlider
        implements ClientBehaviorHolder, AccesskeyProps, CoreProps, EventsKeyProps, EventsMouseProps, FocusProps, I18nProps, InputProps {

    public static final String COMPONENT_TYPE = "org.richfaces.InputNumberSlider";

    public static final String COMPONENT_FAMILY = "javax.faces.Input";
    private static final Collection<String> EVENT_NAMES = Collections.unmodifiableCollection(Arrays.asList(
            "click",
            "select",
            "focus",
            "mouseover",
            "blur",
            "mouseup",
            "keyup",
            "mousemove",
            "keydown",
            "keypress",
            "dblclick",
            "mouseout",
            "change",
            "mousedown"
    ));
    private static final String ATTRIBUTES_THAT_ARE_SET_KEY = "javax.faces.component.UIComponentBase.attributesThatAreSet";

    public HtmlInputNumberSlider() {
        super();
        setRendererType("org.richfaces.InputNumberSliderRenderer");
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


    public String getDecreaseClass() {
        String value = (String) getStateHelper().eval(Properties.decreaseClass);
        return value;
    }

    public void setDecreaseClass(String decreaseClass) {
        getStateHelper().put(Properties.decreaseClass, decreaseClass);
        handleAttribute("decreaseClass", decreaseClass);
    }


    public String getDecreaseSelectedClass() {
        String value = (String) getStateHelper().eval(Properties.decreaseSelectedClass);
        return value;
    }

    public void setDecreaseSelectedClass(String decreaseSelectedClass) {
        getStateHelper().put(Properties.decreaseSelectedClass, decreaseSelectedClass);
        handleAttribute("decreaseSelectedClass", decreaseSelectedClass);
    }


    public int getDelay() {
        Integer value = (Integer) getStateHelper().eval(Properties.delay, 200);
        return value;
    }

    public void setDelay(int delay) {
        getStateHelper().put(Properties.delay, delay);
        handleAttribute("delay", delay);
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


    public String getHandleClass() {
        String value = (String) getStateHelper().eval(Properties.handleClass);
        return value;
    }

    public void setHandleClass(String handleClass) {
        getStateHelper().put(Properties.handleClass, handleClass);
        handleAttribute("handleClass", handleClass);
    }


    public String getHandleSelectedClass() {
        String value = (String) getStateHelper().eval(Properties.handleSelectedClass);
        return value;
    }

    public void setHandleSelectedClass(String handleSelectedClass) {
        getStateHelper().put(Properties.handleSelectedClass, handleSelectedClass);
        handleAttribute("handleSelectedClass", handleSelectedClass);
    }


    public InputNumberSliderHandleType getHandleType() {
        InputNumberSliderHandleType value = (InputNumberSliderHandleType) getStateHelper().eval(Properties.handleType, InputNumberSliderHandleType.DEFAULT);
        return value;
    }

    public void setHandleType(InputNumberSliderHandleType handleType) {
        getStateHelper().put(Properties.handleType, handleType);
        handleAttribute("handleType", handleType);
    }


    public String getIncreaseClass() {
        String value = (String) getStateHelper().eval(Properties.increaseClass);
        return value;
    }

    public void setIncreaseClass(String increaseClass) {
        getStateHelper().put(Properties.increaseClass, increaseClass);
        handleAttribute("increaseClass", increaseClass);
    }


    public String getIncreaseSelectedClass() {
        String value = (String) getStateHelper().eval(Properties.increaseSelectedClass);
        return value;
    }

    public void setIncreaseSelectedClass(String increaseSelectedClass) {
        getStateHelper().put(Properties.increaseSelectedClass, increaseSelectedClass);
        handleAttribute("increaseSelectedClass", increaseSelectedClass);
    }


    public String getInputClass() {
        String value = (String) getStateHelper().eval(Properties.inputClass);
        return value;
    }

    public void setInputClass(String inputClass) {
        getStateHelper().put(Properties.inputClass, inputClass);
        handleAttribute("inputClass", inputClass);
    }


    public InputNumberSliderInputPosition getInputPosition() {
        InputNumberSliderInputPosition value = (InputNumberSliderInputPosition) getStateHelper().eval(Properties.inputPosition, InputNumberSliderInputPosition.DEFAULT);
        return value;
    }

    public void setInputPosition(InputNumberSliderInputPosition inputPosition) {
        getStateHelper().put(Properties.inputPosition, inputPosition);
    }


    public int getInputSize() {
        Integer value = (Integer) getStateHelper().eval(Properties.inputSize, 3);
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


    public Integer getMaxlength() {
        Integer value = (Integer) getStateHelper().eval(Properties.maxlength, Integer.MIN_VALUE);
        return value;
    }

    public void setMaxlength(Integer maxlength) {
        getStateHelper().put(Properties.maxlength, maxlength);
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


    public String getOnfocus() {
        String value = (String) getStateHelper().eval(Properties.onfocus);
        return value;
    }

    public void setOnfocus(String onfocus) {
        getStateHelper().put(Properties.onfocus, onfocus);
        handleAttribute("onfocus", onfocus);
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


    public boolean isReadonly() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.readonly, false);
        return value;
    }

    public void setReadonly(boolean readonly) {
        getStateHelper().put(Properties.readonly, readonly);
    }


    public boolean isShowArrows() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.showArrows, false);
        return value;
    }

    public void setShowArrows(boolean showArrows) {
        getStateHelper().put(Properties.showArrows, showArrows);
    }


    public boolean isShowBoundaryValues() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.showBoundaryValues, true);
        return value;
    }

    public void setShowBoundaryValues(boolean showBoundaryValues) {
        getStateHelper().put(Properties.showBoundaryValues, showBoundaryValues);
    }


    public boolean isShowInput() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.showInput, true);
        return value;
    }

    public void setShowInput(boolean showInput) {
        getStateHelper().put(Properties.showInput, showInput);
    }


    public boolean isShowTooltip() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.showTooltip, true);
        return value;
    }

    public void setShowTooltip(boolean showTooltip) {
        getStateHelper().put(Properties.showTooltip, showTooltip);
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


    public String getTooltipClass() {
        String value = (String) getStateHelper().eval(Properties.tooltipClass);
        return value;
    }

    public void setTooltipClass(String tooltipClass) {
        getStateHelper().put(Properties.tooltipClass, tooltipClass);
        handleAttribute("tooltipClass", tooltipClass);
    }


    public String getTrackClass() {
        String value = (String) getStateHelper().eval(Properties.trackClass);
        return value;
    }

    public void setTrackClass(String trackClass) {
        getStateHelper().put(Properties.trackClass, trackClass);
        handleAttribute("trackClass", trackClass);
    }

    private void handleAttribute(String name, Object value) {
        List<String> setAttributes = (List<String>) this.getAttributes().get(ATTRIBUTES_THAT_ARE_SET_KEY);
        if (setAttributes == null) {
            setAttributes = new ArrayList<String>(30);
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
        decreaseClass,
        decreaseSelectedClass,
        delay,
        dir,
        disabled,
        enableManualInput,
        handleClass,
        handleSelectedClass,
        handleType,
        increaseClass,
        increaseSelectedClass,
        inputClass,
        inputPosition,
        inputSize,
        label,
        lang,
        maxValue,
        maxlength,
        minValue,
        onblur,
        onchange,
        onclick,
        ondblclick,
        onfocus,
        onkeydown,
        onkeypress,
        onkeyup,
        onmousedown,
        onmousemove,
        onmouseout,
        onmouseover,
        onmouseup,
        onselect,
        readonly,
        showArrows,
        showBoundaryValues,
        showInput,
        showTooltip,
        step,
        style,
        styleClass,
        tabindex,
        title,
        tooltipClass,
        trackClass

    }


}
