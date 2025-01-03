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
import org.richfaces.component.attribute.EventsPopupsProps;
import org.richfaces.component.attribute.PopupsProps;
import org.richfaces.component.attribute.PositionProps;
import org.richfaces.component.attribute.StyleClassProps;
import org.richfaces.component.attribute.StyleProps;
import org.richfaces.model.CalendarDataModel;

import javax.annotation.Generated;
import jakarta.el.ValueExpression;
import jakarta.faces.component.behavior.ClientBehaviorHolder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TimeZone;

/**
 * <p> The &lt;rich:calendar&gt; component allows the user to enter a date and time through an in-line or pop-up
 * calendar. The pop-up calendar can navigate through months and years, and its look and feel can be highly customized.
 * </p>
 *
 * @author amarkhel
 **/
@Generated({"RichFaces CDK", "4.5.0-SNAPSHOT"})
public class UICalendar extends AbstractCalendar
        implements ClientBehaviorHolder, MetaComponentEncoder, MetaComponentResolver, CoreProps, EventsPopupsProps, PopupsProps, PositionProps, StyleClassProps, StyleProps {

    public static final String COMPONENT_TYPE = "org.richfaces.Calendar";

    public static final String COMPONENT_FAMILY = "org.richfaces.Calendar";
    private static final Collection<String> EVENT_NAMES = Collections.unmodifiableCollection(Arrays.asList(
            "inputmousemove",
            "inputchange",
            "inputclick",
            "inputkeyup",
            "inputmouseover",
            "clean",
            "hide",
            "inputblur",
            "change",
            "inputmousedown",
            "complete",
            "beforetimeselect",
            "inputmouseout",
            "beforecurrentdateselect",
            "datemouseout",
            "timeselect",
            "inputkeydown",
            "show",
            "inputfocus",
            "inputkeypress",
            "inputselect",
            "beforedateselect",
            "datemouseover",
            "dateselect",
            "currentdateselect",
            "inputmouseup",
            "inputdblclick"
    ));
    private static final String ATTRIBUTES_THAT_ARE_SET_KEY = "javax.faces.component.UIComponentBase.attributesThatAreSet";

    public UICalendar() {
        super();
        setRendererType("org.richfaces.CalendarRenderer");
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

    public String getBoundaryDatesMode() {
        String value = (String) getStateHelper().eval(Properties.boundaryDatesMode);
        return value;
    }

    public void setBoundaryDatesMode(String boundaryDatesMode) {
        getStateHelper().put(Properties.boundaryDatesMode, boundaryDatesMode);
    }


    public String getButtonClass() {
        String value = (String) getStateHelper().eval(Properties.buttonClass);
        return value;
    }

    public void setButtonClass(String buttonClass) {
        getStateHelper().put(Properties.buttonClass, buttonClass);
    }


    public String getButtonDisabledIcon() {
        String value = (String) getStateHelper().eval(Properties.buttonDisabledIcon);
        return value;
    }

    public void setButtonDisabledIcon(String buttonDisabledIcon) {
        getStateHelper().put(Properties.buttonDisabledIcon, buttonDisabledIcon);
    }


    public String getButtonIcon() {
        String value = (String) getStateHelper().eval(Properties.buttonIcon);
        return value;
    }

    public void setButtonIcon(String buttonIcon) {
        getStateHelper().put(Properties.buttonIcon, buttonIcon);
    }


    public String getButtonLabel() {
        String value = (String) getStateHelper().eval(Properties.buttonLabel);
        return value;
    }

    public void setButtonLabel(String buttonLabel) {
        getStateHelper().put(Properties.buttonLabel, buttonLabel);
    }


    public Object getCurrentDate() {
        Object value = (Object) getStateHelper().eval(Properties.currentDate);
        return value;
    }

    public void setCurrentDate(Object currentDate) {
        getStateHelper().put(Properties.currentDate, currentDate);
    }


    public CalendarDataModel getDataModel() {
        CalendarDataModel value = (CalendarDataModel) getStateHelper().eval(Properties.dataModel);
        return value;
    }

    public void setDataModel(CalendarDataModel dataModel) {
        getStateHelper().put(Properties.dataModel, dataModel);
    }


    public String getDatePattern() {
        String value = (String) getStateHelper().eval(Properties.datePattern);
        return value;
    }

    public void setDatePattern(String datePattern) {
        getStateHelper().put(Properties.datePattern, datePattern);
    }


    public String getDayClassFunction() {
        String value = (String) getStateHelper().eval(Properties.dayClassFunction);
        return value;
    }

    public void setDayClassFunction(String dayClassFunction) {
        getStateHelper().put(Properties.dayClassFunction, dayClassFunction);
    }


    public String getDayDisableFunction() {
        String value = (String) getStateHelper().eval(Properties.dayDisableFunction);
        return value;
    }

    public void setDayDisableFunction(String dayDisableFunction) {
        getStateHelper().put(Properties.dayDisableFunction, dayDisableFunction);
    }


    public String getDefaultLabel() {
        String value = (String) getStateHelper().eval(Properties.defaultLabel);
        return value;
    }

    public void setDefaultLabel(String defaultLabel) {
        getStateHelper().put(Properties.defaultLabel, defaultLabel);
    }


    public Object getDefaultTime() {
        Object value = (Object) getStateHelper().eval(Properties.defaultTime);
        return value;
    }

    public void setDefaultTime(Object defaultTime) {
        getStateHelper().put(Properties.defaultTime, defaultTime);
    }


    public Positioning getDirection() {
        Positioning value = (Positioning) getStateHelper().eval(Properties.direction, Positioning.auto);
        return value;
    }

    public void setDirection(Positioning direction) {
        getStateHelper().put(Properties.direction, direction);
    }


    public boolean isDisabled() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.disabled, false);
        return value;
    }

    public void setDisabled(boolean disabled) {
        getStateHelper().put(Properties.disabled, disabled);
    }


    public boolean isEnableManualInput() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.enableManualInput, false);
        return value;
    }

    public void setEnableManualInput(boolean enableManualInput) {
        getStateHelper().put(Properties.enableManualInput, enableManualInput);
    }


    public int getFirstWeekDay() {
        Integer value = (Integer) getStateHelper().eval(Properties.firstWeekDay, Integer.MIN_VALUE);
        return value;
    }

    public void setFirstWeekDay(int firstWeekDay) {
        getStateHelper().put(Properties.firstWeekDay, firstWeekDay);
    }


    public int getHorizontalOffset() {
        Integer value = (Integer) getStateHelper().eval(Properties.horizontalOffset, 0);
        return value;
    }

    public void setHorizontalOffset(int horizontalOffset) {
        getStateHelper().put(Properties.horizontalOffset, horizontalOffset);
    }


    public String getInputClass() {
        String value = (String) getStateHelper().eval(Properties.inputClass);
        return value;
    }

    public void setInputClass(String inputClass) {
        getStateHelper().put(Properties.inputClass, inputClass);
    }


    public String getInputSize() {
        String value = (String) getStateHelper().eval(Properties.inputSize);
        return value;
    }

    public void setInputSize(String inputSize) {
        getStateHelper().put(Properties.inputSize, inputSize);
    }


    public String getInputStyle() {
        String value = (String) getStateHelper().eval(Properties.inputStyle);
        return value;
    }

    public void setInputStyle(String inputStyle) {
        getStateHelper().put(Properties.inputStyle, inputStyle);
    }


    public Positioning getJointPoint() {
        Positioning value = (Positioning) getStateHelper().eval(Properties.jointPoint, Positioning.auto);
        return value;
    }

    public void setJointPoint(Positioning jointPoint) {
        getStateHelper().put(Properties.jointPoint, jointPoint);
    }


    public int getMinDaysInFirstWeek() {
        Integer value = (Integer) getStateHelper().eval(Properties.minDaysInFirstWeek, Integer.MIN_VALUE);
        return value;
    }

    public void setMinDaysInFirstWeek(int minDaysInFirstWeek) {
        getStateHelper().put(Properties.minDaysInFirstWeek, minDaysInFirstWeek);
    }


    public Mode getMode() {
        Mode value = (Mode) getStateHelper().eval(Properties.mode);
        return value;
    }

    public void setMode(Mode mode) {
        getStateHelper().put(Properties.mode, mode);
    }


    public Object getMonthLabels() {
        Object value = (Object) getStateHelper().eval(Properties.monthLabels);
        return value;
    }

    public void setMonthLabels(Object monthLabels) {
        getStateHelper().put(Properties.monthLabels, monthLabels);
    }


    public Object getMonthLabelsShort() {
        Object value = (Object) getStateHelper().eval(Properties.monthLabelsShort);
        return value;
    }

    public void setMonthLabelsShort(Object monthLabelsShort) {
        getStateHelper().put(Properties.monthLabelsShort, monthLabelsShort);
    }


    public String getOnbeforecurrentdateselect() {
        String value = (String) getStateHelper().eval(Properties.onbeforecurrentdateselect);
        return value;
    }

    public void setOnbeforecurrentdateselect(String onbeforecurrentdateselect) {
        getStateHelper().put(Properties.onbeforecurrentdateselect, onbeforecurrentdateselect);
    }


    public String getOnbeforedateselect() {
        String value = (String) getStateHelper().eval(Properties.onbeforedateselect);
        return value;
    }

    public void setOnbeforedateselect(String onbeforedateselect) {
        getStateHelper().put(Properties.onbeforedateselect, onbeforedateselect);
    }


    public String getOnbeforetimeselect() {
        String value = (String) getStateHelper().eval(Properties.onbeforetimeselect);
        return value;
    }

    public void setOnbeforetimeselect(String onbeforetimeselect) {
        getStateHelper().put(Properties.onbeforetimeselect, onbeforetimeselect);
    }


    public String getOnchange() {
        String value = (String) getStateHelper().eval(Properties.onchange);
        return value;
    }

    public void setOnchange(String onchange) {
        getStateHelper().put(Properties.onchange, onchange);
    }


    public String getOnclean() {
        String value = (String) getStateHelper().eval(Properties.onclean);
        return value;
    }

    public void setOnclean(String onclean) {
        getStateHelper().put(Properties.onclean, onclean);
    }


    public String getOncomplete() {
        String value = (String) getStateHelper().eval(Properties.oncomplete);
        return value;
    }

    public void setOncomplete(String oncomplete) {
        getStateHelper().put(Properties.oncomplete, oncomplete);
    }


    public String getOncurrentdateselect() {
        String value = (String) getStateHelper().eval(Properties.oncurrentdateselect);
        return value;
    }

    public void setOncurrentdateselect(String oncurrentdateselect) {
        getStateHelper().put(Properties.oncurrentdateselect, oncurrentdateselect);
    }


    public String getOndatemouseout() {
        String value = (String) getStateHelper().eval(Properties.ondatemouseout);
        return value;
    }

    public void setOndatemouseout(String ondatemouseout) {
        getStateHelper().put(Properties.ondatemouseout, ondatemouseout);
    }


    public String getOndatemouseover() {
        String value = (String) getStateHelper().eval(Properties.ondatemouseover);
        return value;
    }

    public void setOndatemouseover(String ondatemouseover) {
        getStateHelper().put(Properties.ondatemouseover, ondatemouseover);
    }


    public String getOndateselect() {
        String value = (String) getStateHelper().eval(Properties.ondateselect);
        return value;
    }

    public void setOndateselect(String ondateselect) {
        getStateHelper().put(Properties.ondateselect, ondateselect);
    }


    public String getOnhide() {
        String value = (String) getStateHelper().eval(Properties.onhide);
        return value;
    }

    public void setOnhide(String onhide) {
        getStateHelper().put(Properties.onhide, onhide);
        handleAttribute("onhide", onhide);
    }


    public String getOninputblur() {
        String value = (String) getStateHelper().eval(Properties.oninputblur);
        return value;
    }

    public void setOninputblur(String oninputblur) {
        getStateHelper().put(Properties.oninputblur, oninputblur);
    }


    public String getOninputchange() {
        String value = (String) getStateHelper().eval(Properties.oninputchange);
        return value;
    }

    public void setOninputchange(String oninputchange) {
        getStateHelper().put(Properties.oninputchange, oninputchange);
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


    public String getOninputfocus() {
        String value = (String) getStateHelper().eval(Properties.oninputfocus);
        return value;
    }

    public void setOninputfocus(String oninputfocus) {
        getStateHelper().put(Properties.oninputfocus, oninputfocus);
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


    public String getOnshow() {
        String value = (String) getStateHelper().eval(Properties.onshow);
        return value;
    }

    public void setOnshow(String onshow) {
        getStateHelper().put(Properties.onshow, onshow);
        handleAttribute("onshow", onshow);
    }


    public String getOntimeselect() {
        String value = (String) getStateHelper().eval(Properties.ontimeselect);
        return value;
    }

    public void setOntimeselect(String ontimeselect) {
        getStateHelper().put(Properties.ontimeselect, ontimeselect);
    }


    public boolean isPopup() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.popup, true);
        return value;
    }

    public void setPopup(boolean popup) {
        getStateHelper().put(Properties.popup, popup);
    }


    public String getPopupClass() {
        String value = (String) getStateHelper().eval(Properties.popupClass);
        return value;
    }

    public void setPopupClass(String popupClass) {
        getStateHelper().put(Properties.popupClass, popupClass);
    }


    public String getPopupStyle() {
        String value = (String) getStateHelper().eval(Properties.popupStyle);
        return value;
    }

    public void setPopupStyle(String popupStyle) {
        getStateHelper().put(Properties.popupStyle, popupStyle);
    }


    public Object getPreloadDateRangeBegin() {
        Object value = (Object) getStateHelper().eval(Properties.preloadDateRangeBegin);
        return value;
    }

    public void setPreloadDateRangeBegin(Object preloadDateRangeBegin) {
        getStateHelper().put(Properties.preloadDateRangeBegin, preloadDateRangeBegin);
    }


    public Object getPreloadDateRangeEnd() {
        Object value = (Object) getStateHelper().eval(Properties.preloadDateRangeEnd);
        return value;
    }

    public void setPreloadDateRangeEnd(Object preloadDateRangeEnd) {
        getStateHelper().put(Properties.preloadDateRangeEnd, preloadDateRangeEnd);
    }


    public boolean isReadonly() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.readonly, false);
        return value;
    }

    public void setReadonly(boolean readonly) {
        getStateHelper().put(Properties.readonly, readonly);
    }


    public boolean isResetTimeOnDateSelect() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.resetTimeOnDateSelect, false);
        return value;
    }

    public void setResetTimeOnDateSelect(boolean resetTimeOnDateSelect) {
        getStateHelper().put(Properties.resetTimeOnDateSelect, resetTimeOnDateSelect);
    }


    public boolean isShowApplyButton() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.showApplyButton, false);
        return value;
    }

    public void setShowApplyButton(boolean showApplyButton) {
        getStateHelper().put(Properties.showApplyButton, showApplyButton);
    }


    public boolean isShowFooter() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.showFooter, true);
        return value;
    }

    public void setShowFooter(boolean showFooter) {
        getStateHelper().put(Properties.showFooter, showFooter);
    }


    public boolean isShowHeader() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.showHeader, true);
        return value;
    }

    public void setShowHeader(boolean showHeader) {
        getStateHelper().put(Properties.showHeader, showHeader);
    }


    public boolean isShowInput() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.showInput, true);
        return value;
    }

    public void setShowInput(boolean showInput) {
        getStateHelper().put(Properties.showInput, showInput);
    }


    public boolean isShowWeekDaysBar() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.showWeekDaysBar, true);
        return value;
    }

    public void setShowWeekDaysBar(boolean showWeekDaysBar) {
        getStateHelper().put(Properties.showWeekDaysBar, showWeekDaysBar);
    }


    public boolean isShowWeeksBar() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.showWeeksBar, true);
        return value;
    }

    public void setShowWeeksBar(boolean showWeeksBar) {
        getStateHelper().put(Properties.showWeeksBar, showWeeksBar);
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


    public String getTabindex() {
        String value = (String) getStateHelper().eval(Properties.tabindex);
        return value;
    }

    public void setTabindex(String tabindex) {
        getStateHelper().put(Properties.tabindex, tabindex);
    }


    public TimeZone getTimeZone() {
        TimeZone value = (TimeZone) getStateHelper().eval(Properties.timeZone);
        return value;
    }

    public void setTimeZone(TimeZone timeZone) {
        getStateHelper().put(Properties.timeZone, timeZone);
    }


    public String getTitle() {
        String value = (String) getStateHelper().eval(Properties.title);
        return value;
    }

    public void setTitle(String title) {
        getStateHelper().put(Properties.title, title);
        handleAttribute("title", title);
    }


    public String getTodayControlMode() {
        String value = (String) getStateHelper().eval(Properties.todayControlMode);
        return value;
    }

    public void setTodayControlMode(String todayControlMode) {
        getStateHelper().put(Properties.todayControlMode, todayControlMode);
    }


    public int getVerticalOffset() {
        Integer value = (Integer) getStateHelper().eval(Properties.verticalOffset, 0);
        return value;
    }

    public void setVerticalOffset(int verticalOffset) {
        getStateHelper().put(Properties.verticalOffset, verticalOffset);
    }


    public Object getWeekDayLabelsShort() {
        Object value = (Object) getStateHelper().eval(Properties.weekDayLabelsShort);
        return value;
    }

    public void setWeekDayLabelsShort(Object weekDayLabelsShort) {
        getStateHelper().put(Properties.weekDayLabelsShort, weekDayLabelsShort);
    }


    public int getZindex() {
        Integer value = (Integer) getStateHelper().eval(Properties.zindex, 3);
        return value;
    }

    public void setZindex(int zindex) {
        getStateHelper().put(Properties.zindex, zindex);
    }

    private void handleAttribute(String name, Object value) {
        List<String> setAttributes = (List<String>) this.getAttributes().get(ATTRIBUTES_THAT_ARE_SET_KEY);
        if (setAttributes == null) {
            setAttributes = new ArrayList<String>(5);
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
        boundaryDatesMode,
        buttonClass,
        buttonDisabledIcon,
        buttonIcon,
        buttonLabel,
        currentDate,
        dataModel,
        datePattern,
        dayClassFunction,
        dayDisableFunction,
        defaultLabel,
        defaultTime,
        direction,
        disabled,
        enableManualInput,
        firstWeekDay,
        horizontalOffset,
        inputClass,
        inputSize,
        inputStyle,
        jointPoint,
        minDaysInFirstWeek,
        mode,
        monthLabels,
        monthLabelsShort,
        onbeforecurrentdateselect,
        onbeforedateselect,
        onbeforetimeselect,
        onchange,
        onclean,
        oncomplete,
        oncurrentdateselect,
        ondatemouseout,
        ondatemouseover,
        ondateselect,
        onhide,
        oninputblur,
        oninputchange,
        oninputclick,
        oninputdblclick,
        oninputfocus,
        oninputkeydown,
        oninputkeypress,
        oninputkeyup,
        oninputmousedown,
        oninputmousemove,
        oninputmouseout,
        oninputmouseover,
        oninputmouseup,
        oninputselect,
        onshow,
        ontimeselect,
        popup,
        popupClass,
        popupStyle,
        preloadDateRangeBegin,
        preloadDateRangeEnd,
        readonly,
        resetTimeOnDateSelect,
        showApplyButton,
        showFooter,
        showHeader,
        showInput,
        showWeekDaysBar,
        showWeeksBar,
        style,
        styleClass,
        tabindex,
        timeZone,
        title,
        todayControlMode,
        verticalOffset,
        weekDayLabelsShort,
        zindex

    }


}
