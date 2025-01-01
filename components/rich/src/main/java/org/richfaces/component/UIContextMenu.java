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
import org.richfaces.component.attribute.EventsKeyProps;
import org.richfaces.component.attribute.EventsMouseProps;
import org.richfaces.component.attribute.I18nProps;
import org.richfaces.component.attribute.PositionProps;

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
 * The &lt;rich:contextMenu&gt; component is used for creating a hierarchical context menu that are activated on
 * events like onmouseover, onclick etc. The component can be applied to any element on the page.
 * </p>
 *
 * @author <a href="http://community.jboss.org/people/bleathem">Brian Leathem</a>
 **/
@Generated({"RichFaces CDK", "4.5.0-SNAPSHOT"})
public class UIContextMenu extends AbstractContextMenu
        implements ClientBehaviorHolder, CoreProps, EventsKeyProps, EventsMouseProps, I18nProps, PositionProps {

    public static final String COMPONENT_TYPE = "org.richfaces.ContextMenu";

    public static final String COMPONENT_FAMILY = "org.richfaces.ContextMenu";
    private static final Collection<String> EVENT_NAMES = Collections.unmodifiableCollection(Arrays.asList(
            "itemclick",
            "click",
            "grouphide",
            "mouseover",
            "mouseup",
            "show",
            "keyup",
            "mousemove",
            "keydown",
            "keypress",
            "dblclick",
            "hide",
            "groupshow",
            "mouseout",
            "mousedown"
    ));
    private static final String ATTRIBUTES_THAT_ARE_SET_KEY = "javax.faces.component.UIComponentBase.attributesThatAreSet";

    public UIContextMenu() {
        super();
        setRendererType("org.richfaces.ContextMenuRenderer");
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


    public String getDir() {
        String value = (String) getStateHelper().eval(Properties.dir);
        return value;
    }

    public void setDir(String dir) {
        getStateHelper().put(Properties.dir, dir);
        handleAttribute("dir", dir);
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


    public int getHideDelay() {
        Integer value = (Integer) getStateHelper().eval(Properties.hideDelay, Integer.MIN_VALUE);
        return value;
    }

    public void setHideDelay(int hideDelay) {
        getStateHelper().put(Properties.hideDelay, hideDelay);
    }


    public int getHorizontalOffset() {
        Integer value = (Integer) getStateHelper().eval(Properties.horizontalOffset, 0);
        return value;
    }

    public void setHorizontalOffset(int horizontalOffset) {
        getStateHelper().put(Properties.horizontalOffset, horizontalOffset);
    }


    public Positioning getJointPoint() {
        Positioning value = (Positioning) getStateHelper().eval(Properties.jointPoint, Positioning.auto);
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


    public Mode getMode() {
        Mode value = (Mode) getStateHelper().eval(Properties.mode);
        return value;
    }

    public void setMode(Mode mode) {
        getStateHelper().put(Properties.mode, mode);
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


    public String getOngrouphide() {
        String value = (String) getStateHelper().eval(Properties.ongrouphide);
        return value;
    }

    public void setOngrouphide(String ongrouphide) {
        getStateHelper().put(Properties.ongrouphide, ongrouphide);
    }


    public String getOngroupshow() {
        String value = (String) getStateHelper().eval(Properties.ongroupshow);
        return value;
    }

    public void setOngroupshow(String ongroupshow) {
        getStateHelper().put(Properties.ongroupshow, ongroupshow);
    }


    public String getOnhide() {
        String value = (String) getStateHelper().eval(Properties.onhide);
        return value;
    }

    public void setOnhide(String onhide) {
        getStateHelper().put(Properties.onhide, onhide);
        handleAttribute("onhide", onhide);
    }


    public String getOnitemclick() {
        String value = (String) getStateHelper().eval(Properties.onitemclick);
        return value;
    }

    public void setOnitemclick(String onitemclick) {
        getStateHelper().put(Properties.onitemclick, onitemclick);
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


    public String getOnshow() {
        String value = (String) getStateHelper().eval(Properties.onshow);
        return value;
    }

    public void setOnshow(String onshow) {
        getStateHelper().put(Properties.onshow, onshow);
        handleAttribute("onshow", onshow);
    }


    public int getPopupWidth() {
        Integer value = (Integer) getStateHelper().eval(Properties.popupWidth, Integer.MIN_VALUE);
        return value;
    }

    public void setPopupWidth(int popupWidth) {
        getStateHelper().put(Properties.popupWidth, popupWidth);
    }


    public int getShowDelay() {
        Integer value = (Integer) getStateHelper().eval(Properties.showDelay, Integer.MIN_VALUE);
        return value;
    }

    public void setShowDelay(int showDelay) {
        getStateHelper().put(Properties.showDelay, showDelay);
    }


    public String getShowEvent() {
        String value = (String) getStateHelper().eval(Properties.showEvent);
        return value;
    }

    public void setShowEvent(String showEvent) {
        getStateHelper().put(Properties.showEvent, showEvent);
    }


    public boolean isSticky() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.sticky, false);
        return value;
    }

    public void setSticky(boolean sticky) {
        getStateHelper().put(Properties.sticky, sticky);
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


    public String getTarget() {
        String value = (String) getStateHelper().eval(Properties.target);
        return value;
    }

    public void setTarget(String target) {
        getStateHelper().put(Properties.target, target);
    }


    public String getTargetSelector() {
        String value = (String) getStateHelper().eval(Properties.targetSelector);
        return value;
    }

    public void setTargetSelector(String targetSelector) {
        getStateHelper().put(Properties.targetSelector, targetSelector);
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
        Integer value = (Integer) getStateHelper().eval(Properties.verticalOffset, 0);
        return value;
    }

    public void setVerticalOffset(int verticalOffset) {
        getStateHelper().put(Properties.verticalOffset, verticalOffset);
    }

    private void handleAttribute(String name, Object value) {
        List<String> setAttributes = (List<String>) this.getAttributes().get(ATTRIBUTES_THAT_ARE_SET_KEY);
        if (setAttributes == null) {
            setAttributes = new ArrayList<String>(16);
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
        dir,
        direction,
        disabled,
        hideDelay,
        horizontalOffset,
        jointPoint,
        lang,
        mode,
        onclick,
        ondblclick,
        ongrouphide,
        ongroupshow,
        onhide,
        onitemclick,
        onkeydown,
        onkeypress,
        onkeyup,
        onmousedown,
        onmousemove,
        onmouseout,
        onmouseover,
        onmouseup,
        onshow,
        popupWidth,
        showDelay,
        showEvent,
        sticky,
        style,
        styleClass,
        target,
        targetSelector,
        title,
        verticalOffset

    }


}
