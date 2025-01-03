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

import org.richfaces.component.attribute.EventsPopupsBeforeProps;
import org.richfaces.component.attribute.EventsPopupsProps;
import org.richfaces.component.attribute.PopupsProps;
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
 * <p>The &lt;rich:popupPanel&gt; component provides a pop-up panel or window that appears in front of the rest of the
 * application. The &lt;rich:popupPanel&gt; component functions either as a modal window which blocks interaction with
 * the rest of the application while active, or as a non-modal window. It can be positioned on the screen, dragged to a
 * new position by the user, and re-sized.</p>
 **/
@Generated({"RichFaces CDK", "4.5.0-SNAPSHOT"})
public class UIPopupPanel extends AbstractPopupPanel
        implements ClientBehaviorHolder, EventsPopupsBeforeProps, EventsPopupsProps, PopupsProps, StyleClassProps, StyleProps {

    public static final String COMPONENT_TYPE = "org.richfaces.PopupPanel";

    public static final String COMPONENT_FAMILY = "org.richfaces.PopupPanel";
    private static final Collection<String> EVENT_NAMES = Collections.unmodifiableCollection(Arrays.asList(
            "move",
            "maskclick",
            "maskdblclick",
            "show",
            "maskmouseover",
            "beforeshow",
            "maskmousemove",
            "beforehide",
            "hide",
            "maskmouseup",
            "maskmouseout",
            "maskmousedown",
            "maskcontextmenu",
            "resize"
    ));
    private static final String ATTRIBUTES_THAT_ARE_SET_KEY = "javax.faces.component.UIComponentBase.attributesThatAreSet";

    public UIPopupPanel() {
        super();
        setRendererType("org.richfaces.PopupPanelRenderer");
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

    public boolean isAutosized() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.autosized, false);
        return value;
    }

    public void setAutosized(boolean autosized) {
        getStateHelper().put(Properties.autosized, autosized);
    }


    public String getControlsClass() {
        String value = (String) getStateHelper().eval(Properties.controlsClass);
        return value;
    }

    public void setControlsClass(String controlsClass) {
        getStateHelper().put(Properties.controlsClass, controlsClass);
    }


    public String getDomElementAttachment() {
        String value = (String) getStateHelper().eval(Properties.domElementAttachment);
        return value;
    }

    public void setDomElementAttachment(String domElementAttachment) {
        getStateHelper().put(Properties.domElementAttachment, domElementAttachment);
    }


    public boolean isFollowByScroll() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.followByScroll, true);
        return value;
    }

    public void setFollowByScroll(boolean followByScroll) {
        getStateHelper().put(Properties.followByScroll, followByScroll);
    }


    public String getHeader() {
        String value = (String) getStateHelper().eval(Properties.header);
        return value;
    }

    public void setHeader(String header) {
        getStateHelper().put(Properties.header, header);
    }


    public String getHeaderClass() {
        String value = (String) getStateHelper().eval(Properties.headerClass);
        return value;
    }

    public void setHeaderClass(String headerClass) {
        getStateHelper().put(Properties.headerClass, headerClass);
    }


    public int getHeight() {
        Integer value = (Integer) getStateHelper().eval(Properties.height, -1);
        return value;
    }

    public void setHeight(int height) {
        getStateHelper().put(Properties.height, height);
    }


    public boolean isKeepVisualState() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.keepVisualState, false);
        return value;
    }

    public void setKeepVisualState(boolean keepVisualState) {
        getStateHelper().put(Properties.keepVisualState, keepVisualState);
    }


    public String getLeft() {
        String value = (String) getStateHelper().eval(Properties.left);
        return value;
    }

    public void setLeft(String left) {
        getStateHelper().put(Properties.left, left);
    }


    public int getMaxHeight() {
        Integer value = (Integer) getStateHelper().eval(Properties.maxHeight, Integer.MIN_VALUE);
        return value;
    }

    public void setMaxHeight(int maxHeight) {
        getStateHelper().put(Properties.maxHeight, maxHeight);
    }


    public int getMaxWidth() {
        Integer value = (Integer) getStateHelper().eval(Properties.maxWidth, Integer.MIN_VALUE);
        return value;
    }

    public void setMaxWidth(int maxWidth) {
        getStateHelper().put(Properties.maxWidth, maxWidth);
    }


    public int getMinHeight() {
        Integer value = (Integer) getStateHelper().eval(Properties.minHeight, -1);
        return value;
    }

    public void setMinHeight(int minHeight) {
        getStateHelper().put(Properties.minHeight, minHeight);
    }


    public int getMinWidth() {
        Integer value = (Integer) getStateHelper().eval(Properties.minWidth, -1);
        return value;
    }

    public void setMinWidth(int minWidth) {
        getStateHelper().put(Properties.minWidth, minWidth);
    }


    public boolean isModal() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.modal, true);
        return value;
    }

    public void setModal(boolean modal) {
        getStateHelper().put(Properties.modal, modal);
    }


    public boolean isMoveable() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.moveable, true);
        return value;
    }

    public void setMoveable(boolean moveable) {
        getStateHelper().put(Properties.moveable, moveable);
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


    public String getOnhide() {
        String value = (String) getStateHelper().eval(Properties.onhide);
        return value;
    }

    public void setOnhide(String onhide) {
        getStateHelper().put(Properties.onhide, onhide);
        handleAttribute("onhide", onhide);
    }


    public String getOnmaskclick() {
        String value = (String) getStateHelper().eval(Properties.onmaskclick);
        return value;
    }

    public void setOnmaskclick(String onmaskclick) {
        getStateHelper().put(Properties.onmaskclick, onmaskclick);
    }


    public String getOnmaskcontextmenu() {
        String value = (String) getStateHelper().eval(Properties.onmaskcontextmenu);
        return value;
    }

    public void setOnmaskcontextmenu(String onmaskcontextmenu) {
        getStateHelper().put(Properties.onmaskcontextmenu, onmaskcontextmenu);
    }


    public String getOnmaskdblclick() {
        String value = (String) getStateHelper().eval(Properties.onmaskdblclick);
        return value;
    }

    public void setOnmaskdblclick(String onmaskdblclick) {
        getStateHelper().put(Properties.onmaskdblclick, onmaskdblclick);
    }


    public String getOnmaskmousedown() {
        String value = (String) getStateHelper().eval(Properties.onmaskmousedown);
        return value;
    }

    public void setOnmaskmousedown(String onmaskmousedown) {
        getStateHelper().put(Properties.onmaskmousedown, onmaskmousedown);
    }


    public String getOnmaskmousemove() {
        String value = (String) getStateHelper().eval(Properties.onmaskmousemove);
        return value;
    }

    public void setOnmaskmousemove(String onmaskmousemove) {
        getStateHelper().put(Properties.onmaskmousemove, onmaskmousemove);
    }


    public String getOnmaskmouseout() {
        String value = (String) getStateHelper().eval(Properties.onmaskmouseout);
        return value;
    }

    public void setOnmaskmouseout(String onmaskmouseout) {
        getStateHelper().put(Properties.onmaskmouseout, onmaskmouseout);
    }


    public String getOnmaskmouseover() {
        String value = (String) getStateHelper().eval(Properties.onmaskmouseover);
        return value;
    }

    public void setOnmaskmouseover(String onmaskmouseover) {
        getStateHelper().put(Properties.onmaskmouseover, onmaskmouseover);
    }


    public String getOnmaskmouseup() {
        String value = (String) getStateHelper().eval(Properties.onmaskmouseup);
        return value;
    }

    public void setOnmaskmouseup(String onmaskmouseup) {
        getStateHelper().put(Properties.onmaskmouseup, onmaskmouseup);
    }


    public String getOnmove() {
        String value = (String) getStateHelper().eval(Properties.onmove);
        return value;
    }

    public void setOnmove(String onmove) {
        getStateHelper().put(Properties.onmove, onmove);
    }


    public String getOnresize() {
        String value = (String) getStateHelper().eval(Properties.onresize);
        return value;
    }

    public void setOnresize(String onresize) {
        getStateHelper().put(Properties.onresize, onresize);
    }


    public String getOnshow() {
        String value = (String) getStateHelper().eval(Properties.onshow);
        return value;
    }

    public void setOnshow(String onshow) {
        getStateHelper().put(Properties.onshow, onshow);
        handleAttribute("onshow", onshow);
    }


    public boolean isOverlapEmbedObjects() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.overlapEmbedObjects, false);
        return value;
    }

    public void setOverlapEmbedObjects(boolean overlapEmbedObjects) {
        getStateHelper().put(Properties.overlapEmbedObjects, overlapEmbedObjects);
    }


    public boolean isResizeable() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.resizeable, false);
        return value;
    }

    public void setResizeable(boolean resizeable) {
        getStateHelper().put(Properties.resizeable, resizeable);
    }


    public String getShadowDepth() {
        String value = (String) getStateHelper().eval(Properties.shadowDepth);
        return value;
    }

    public void setShadowDepth(String shadowDepth) {
        getStateHelper().put(Properties.shadowDepth, shadowDepth);
    }


    public String getShadowOpacity() {
        String value = (String) getStateHelper().eval(Properties.shadowOpacity);
        return value;
    }

    public void setShadowOpacity(String shadowOpacity) {
        getStateHelper().put(Properties.shadowOpacity, shadowOpacity);
    }


    public boolean isShow() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.show, false);
        return value;
    }

    public void setShow(boolean show) {
        getStateHelper().put(Properties.show, show);
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


    public String getTop() {
        String value = (String) getStateHelper().eval(Properties.top);
        return value;
    }

    public void setTop(String top) {
        getStateHelper().put(Properties.top, top);
    }


    public boolean isTrimOverlayedElements() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.trimOverlayedElements, false);
        return value;
    }

    public void setTrimOverlayedElements(boolean trimOverlayedElements) {
        getStateHelper().put(Properties.trimOverlayedElements, trimOverlayedElements);
    }


    public String getVisualOptions() {
        String value = (String) getStateHelper().eval(Properties.visualOptions);
        return value;
    }

    public void setVisualOptions(String visualOptions) {
        getStateHelper().put(Properties.visualOptions, visualOptions);
    }


    public int getWidth() {
        Integer value = (Integer) getStateHelper().eval(Properties.width, -1);
        return value;
    }

    public void setWidth(int width) {
        getStateHelper().put(Properties.width, width);
    }


    public int getZindex() {
        Integer value = (Integer) getStateHelper().eval(Properties.zindex, 100);
        return value;
    }

    public void setZindex(int zindex) {
        getStateHelper().put(Properties.zindex, zindex);
    }

    private void handleAttribute(String name, Object value) {
        List<String> setAttributes = (List<String>) this.getAttributes().get(ATTRIBUTES_THAT_ARE_SET_KEY);
        if (setAttributes == null) {
            setAttributes = new ArrayList<String>(4);
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
        autosized,
        controlsClass,
        domElementAttachment,
        followByScroll,
        header,
        headerClass,
        height,
        keepVisualState,
        left,
        maxHeight,
        maxWidth,
        minHeight,
        minWidth,
        modal,
        moveable,
        onbeforehide,
        onbeforeshow,
        onhide,
        onmaskclick,
        onmaskcontextmenu,
        onmaskdblclick,
        onmaskmousedown,
        onmaskmousemove,
        onmaskmouseout,
        onmaskmouseover,
        onmaskmouseup,
        onmove,
        onresize,
        onshow,
        overlapEmbedObjects,
        resizeable,
        shadowDepth,
        shadowOpacity,
        show,
        style,
        styleClass,
        top,
        trimOverlayedElements,
        visualOptions,
        width,
        zindex

    }


}
