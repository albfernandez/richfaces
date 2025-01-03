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

import org.richfaces.TooltipLayout;
import org.richfaces.TooltipMode;
import org.richfaces.component.attribute.AjaxProps;
import org.richfaces.component.attribute.CoreProps;
import org.richfaces.component.attribute.EventsMouseProps;
import org.richfaces.component.attribute.EventsPopupsBeforeProps;
import org.richfaces.component.attribute.EventsPopupsProps;
import org.richfaces.component.attribute.I18nProps;
import org.richfaces.component.attribute.PopupsProps;
import org.richfaces.component.attribute.PositionProps;

import javax.annotation.Generated;
import jakarta.el.ValueExpression;
import jakarta.faces.component.behavior.ClientBehaviorHolder;
import jakarta.faces.convert.Converter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * <p>The &lt;rich:tooltip&gt; component provides an informational tool-tip. The tool-tip can be attached to any control
 * and is displayed when hovering the mouse cursor over the control.</p>
 *
 * @author amarkhel
 **/
@Generated({"RichFaces CDK", "4.5.0-SNAPSHOT"})
public class UITooltip extends AbstractTooltip
        implements ClientBehaviorHolder, AbstractDivPanel, MetaComponentEncoder, MetaComponentResolver, AjaxProps, CoreProps, EventsMouseProps, EventsPopupsBeforeProps, EventsPopupsProps, I18nProps, PopupsProps, PositionProps {

    public static final String COMPONENT_TYPE = "org.richfaces.Tooltip";

    public static final String COMPONENT_FAMILY = "org.richfaces.Tooltip";
    private static final Collection<String> EVENT_NAMES = Collections.unmodifiableCollection(Arrays.asList(
            "click",
            "mouseover",
            "mouseup",
            "show",
            "mousemove",
            "beforeshow",
            "dblclick",
            "beforehide",
            "hide",
            "mouseout",
            "beforedomupdate",
            "begin",
            "mousedown",
            "complete"
    ));
    private static final String ATTRIBUTES_THAT_ARE_SET_KEY = "javax.faces.component.UIComponentBase.attributesThatAreSet";

    public UITooltip() {
        super();
        setRendererType("org.richfaces.TooltipRenderer");
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

    public boolean isAttached() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.attached, true);
        return value;
    }

    public void setAttached(boolean attached) {
        getStateHelper().put(Properties.attached, attached);
    }


    public Converter getConverter() {
        Converter value = (Converter) getStateHelper().eval(Properties.converter);
        return value;
    }

    public void setConverter(Converter converter) {
        getStateHelper().put(Properties.converter, converter);
    }


    public Object getData() {
        Object value = (Object) getStateHelper().eval(Properties.data);
        return value;
    }

    public void setData(Object data) {
        getStateHelper().put(Properties.data, data);
    }


    public String getDir() {
        String value = (String) getStateHelper().eval(Properties.dir);
        return value;
    }

    public void setDir(String dir) {
        getStateHelper().put(Properties.dir, dir);
        handleAttribute("dir", dir);
    }


    public Positioning getDirection() {
        Positioning value = (Positioning) getStateHelper().eval(Properties.direction, Positioning.DEFAULT);
        return value;
    }

    public void setDirection(Positioning direction) {
        getStateHelper().put(Properties.direction, direction);
    }


    public Object getExecute() {
        Object value = (Object) getStateHelper().eval(Properties.execute);
        return value;
    }

    public void setExecute(Object execute) {
        getStateHelper().put(Properties.execute, execute);
    }


    public boolean isFollowMouse() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.followMouse, true);
        return value;
    }

    public void setFollowMouse(boolean followMouse) {
        getStateHelper().put(Properties.followMouse, followMouse);
    }


    public int getHideDelay() {
        Integer value = (Integer) getStateHelper().eval(Properties.hideDelay, 0);
        return value;
    }

    public void setHideDelay(int hideDelay) {
        getStateHelper().put(Properties.hideDelay, hideDelay);
    }


    public String getHideEvent() {
        String value = (String) getStateHelper().eval(Properties.hideEvent, "mouseleave");
        return value;
    }

    public void setHideEvent(String hideEvent) {
        getStateHelper().put(Properties.hideEvent, hideEvent);
    }


    public int getHorizontalOffset() {
        Integer value = (Integer) getStateHelper().eval(Properties.horizontalOffset, 10);
        return value;
    }

    public void setHorizontalOffset(int horizontalOffset) {
        getStateHelper().put(Properties.horizontalOffset, horizontalOffset);
    }


    public Positioning getJointPoint() {
        Positioning value = (Positioning) getStateHelper().eval(Properties.jointPoint, Positioning.DEFAULT);
        return value;
    }

    public void setJointPoint(Positioning jointPoint) {
        getStateHelper().put(Properties.jointPoint, jointPoint);
    }


    public String getLang() {
        String value = (String) getStateHelper().eval(Properties.lang);
        return value;
    }

    public void setLang(String lang) {
        getStateHelper().put(Properties.lang, lang);
        handleAttribute("lang", lang);
    }


    public TooltipLayout getLayout() {
        TooltipLayout value = (TooltipLayout) getStateHelper().eval(Properties.layout, TooltipLayout.DEFAULT);
        return value;
    }

    public void setLayout(TooltipLayout layout) {
        getStateHelper().put(Properties.layout, layout);
    }


    public boolean isLimitRender() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.limitRender, false);
        return value;
    }

    public void setLimitRender(boolean limitRender) {
        getStateHelper().put(Properties.limitRender, limitRender);
    }


    public TooltipMode getMode() {
        TooltipMode value = (TooltipMode) getStateHelper().eval(Properties.mode, TooltipMode.DEFAULT);
        return value;
    }

    public void setMode(TooltipMode mode) {
        getStateHelper().put(Properties.mode, mode);
    }


    public String getOnbeforedomupdate() {
        String value = (String) getStateHelper().eval(Properties.onbeforedomupdate);
        return value;
    }

    public void setOnbeforedomupdate(String onbeforedomupdate) {
        getStateHelper().put(Properties.onbeforedomupdate, onbeforedomupdate);
    }


    public String getOnbeforehide() {
        String value = (String) getStateHelper().eval(Properties.onbeforehide);
        return value;
    }

    public void setOnbeforehide(String onbeforehide) {
        getStateHelper().put(Properties.onbeforehide, onbeforehide);
    }


    public String getOnbeforeshow() {
        String value = (String) getStateHelper().eval(Properties.onbeforeshow);
        return value;
    }

    public void setOnbeforeshow(String onbeforeshow) {
        getStateHelper().put(Properties.onbeforeshow, onbeforeshow);
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


    public String getOnhide() {
        String value = (String) getStateHelper().eval(Properties.onhide);
        return value;
    }

    public void setOnhide(String onhide) {
        getStateHelper().put(Properties.onhide, onhide);
        handleAttribute("onhide", onhide);
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


    public String getOnshow() {
        String value = (String) getStateHelper().eval(Properties.onshow);
        return value;
    }

    public void setOnshow(String onshow) {
        getStateHelper().put(Properties.onshow, onshow);
        handleAttribute("onshow", onshow);
    }


    public Object getRender() {
        Object value = (Object) getStateHelper().eval(Properties.render);
        return value;
    }

    public void setRender(Object render) {
        getStateHelper().put(Properties.render, render);
    }


    public int getShowDelay() {
        Integer value = (Integer) getStateHelper().eval(Properties.showDelay, 0);
        return value;
    }

    public void setShowDelay(int showDelay) {
        getStateHelper().put(Properties.showDelay, showDelay);
    }


    public String getShowEvent() {
        String value = (String) getStateHelper().eval(Properties.showEvent, "mouseenter");
        return value;
    }

    public void setShowEvent(String showEvent) {
        getStateHelper().put(Properties.showEvent, showEvent);
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
    }


    public String getTitle() {
        String value = (String) getStateHelper().eval(Properties.title);
        return value;
    }

    public void setTitle(String title) {
        getStateHelper().put(Properties.title, title);
        handleAttribute("title", title);
    }


    public int getVerticalOffset() {
        Integer value = (Integer) getStateHelper().eval(Properties.verticalOffset, 10);
        return value;
    }

    public void setVerticalOffset(int verticalOffset) {
        getStateHelper().put(Properties.verticalOffset, verticalOffset);
    }


    public int getZindex() {
        Integer value = (Integer) getStateHelper().eval(Properties.zindex, 1000);
        return value;
    }

    public void setZindex(int zindex) {
        getStateHelper().put(Properties.zindex, zindex);
    }

    private void handleAttribute(String name, Object value) {
        List<String> setAttributes = (List<String>) this.getAttributes().get(ATTRIBUTES_THAT_ARE_SET_KEY);
        if (setAttributes == null) {
            setAttributes = new ArrayList<String>(13);
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
        attached,
        converter,
        data,
        dir,
        direction,
        execute,
        followMouse,
        hideDelay,
        hideEvent,
        horizontalOffset,
        jointPoint,
        lang,
        layout,
        limitRender,
        mode,
        onbeforedomupdate,
        onbeforehide,
        onbeforeshow,
        onbegin,
        onclick,
        oncomplete,
        ondblclick,
        onhide,
        onmousedown,
        onmousemove,
        onmouseout,
        onmouseover,
        onmouseup,
        onshow,
        render,
        showDelay,
        showEvent,
        status,
        style,
        styleClass,
        title,
        verticalOffset,
        zindex

    }


}
