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

import org.richfaces.component.attribute.EventsKeyProps;
import org.richfaces.component.attribute.EventsMouseProps;
import org.richfaces.component.attribute.MultiSelectProps;
import org.richfaces.component.attribute.SelectItemsProps;
import org.richfaces.component.util.SelectItemsInterface;

import javax.annotation.Generated;
import javax.el.ValueExpression;
import javax.faces.component.behavior.ClientBehaviorHolder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * <p>The &lt;rich:orderingList&gt; is a component for ordering items in a list (client-side).</p>
 *
 * @author <a href="http://community.jboss.org/people/bleathem">Brian Leathem</a>
 **/
@Generated({"RichFaces CDK", "4.5.0-SNAPSHOT"})
public class UIOrderingList extends AbstractOrderingList
        implements ClientBehaviorHolder, EventsKeyProps, EventsMouseProps, MultiSelectProps, SelectItemsProps, SelectItemsInterface {

    public static final String COMPONENT_TYPE = "org.richfaces.OrderingList";

    public static final String COMPONENT_FAMILY = "org.richfaces.SelectMany";
    private static final Collection<String> EVENT_NAMES = Collections.unmodifiableCollection(Arrays.asList(
            "click",
            "focus",
            "mouseover",
            "blur",
            "mouseup",
            "listmousedown",
            "keyup",
            "mousemove",
            "keydown",
            "listkeypress",
            "keypress",
            "listkeydown",
            "dblclick",
            "listmousemove",
            "mouseout",
            "listclick",
            "listkeyup",
            "change",
            "listmouseout",
            "listmouseup",
            "listmouseover",
            "mousedown",
            "listdblclick"
    ));
    private static final String ATTRIBUTES_THAT_ARE_SET_KEY = "javax.faces.component.UIComponentBase.attributesThatAreSet";

    public UIOrderingList() {
        super();
        setRendererType("org.richfaces.OrderingListRenderer");
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


    public String getCaption() {
        String value = (String) getStateHelper().eval(Properties.caption);
        return value;
    }

    public void setCaption(String caption) {
        getStateHelper().put(Properties.caption, caption);
    }


    public String getChangedClass() {
        String value = (String) getStateHelper().eval(Properties.changedClass);
        return value;
    }

    public void setChangedClass(String changedClass) {
        getStateHelper().put(Properties.changedClass, changedClass);
    }


    public Object getCollectionType() {
        Object value = (Object) getStateHelper().eval(Properties.collectionType);
        return value;
    }

    public void setCollectionType(Object collectionType) {
        getStateHelper().put(Properties.collectionType, collectionType);
    }


    public String getColumnClasses() {
        String value = (String) getStateHelper().eval(Properties.columnClasses);
        return value;
    }

    public void setColumnClasses(String columnClasses) {
        getStateHelper().put(Properties.columnClasses, columnClasses);
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


    public String getDownBottomText() {
        String value = (String) getStateHelper().eval(Properties.downBottomText, "\u21D3 Last");
        return value;
    }

    public void setDownBottomText(String downBottomText) {
        getStateHelper().put(Properties.downBottomText, downBottomText);
    }


    public String getDownText() {
        String value = (String) getStateHelper().eval(Properties.downText, "\u2193 Down");
        return value;
    }

    public void setDownText(String downText) {
        getStateHelper().put(Properties.downText, downText);
    }


    public String getHeaderClass() {
        String value = (String) getStateHelper().eval(Properties.headerClass);
        return value;
    }

    public void setHeaderClass(String headerClass) {
        getStateHelper().put(Properties.headerClass, headerClass);
    }


    public String getItemClass() {
        String value = (String) getStateHelper().eval(Properties.itemClass);
        return value;
    }

    public void setItemClass(String itemClass) {
        getStateHelper().put(Properties.itemClass, itemClass);
    }


    public Object getItemLabel() {
        Object value = (Object) getStateHelper().eval(Properties.itemLabel);
        return value;
    }

    public void setItemLabel(Object itemLabel) {
        getStateHelper().put(Properties.itemLabel, itemLabel);
    }


    public Object getItemValue() {
        Object value = (Object) getStateHelper().eval(Properties.itemValue);
        return value;
    }

    public void setItemValue(Object itemValue) {
        getStateHelper().put(Properties.itemValue, itemValue);
    }


    public String getListClass() {
        String value = (String) getStateHelper().eval(Properties.listClass);
        return value;
    }

    public void setListClass(String listClass) {
        getStateHelper().put(Properties.listClass, listClass);
    }


    public String getListHeight() {
        String value = (String) getStateHelper().eval(Properties.listHeight);
        return value;
    }

    public void setListHeight(String listHeight) {
        getStateHelper().put(Properties.listHeight, listHeight);
    }


    public String getListWidth() {
        String value = (String) getStateHelper().eval(Properties.listWidth);
        return value;
    }

    public void setListWidth(String listWidth) {
        getStateHelper().put(Properties.listWidth, listWidth);
    }


    public String getMaxListHeight() {
        String value = (String) getStateHelper().eval(Properties.maxListHeight);
        return value;
    }

    public void setMaxListHeight(String maxListHeight) {
        getStateHelper().put(Properties.maxListHeight, maxListHeight);
    }


    public String getMinListHeight() {
        String value = (String) getStateHelper().eval(Properties.minListHeight);
        return value;
    }

    public void setMinListHeight(String minListHeight) {
        getStateHelper().put(Properties.minListHeight, minListHeight);
    }


    public String getOnblur() {
        String value = (String) getStateHelper().eval(Properties.onblur);
        return value;
    }

    public void setOnblur(String onblur) {
        getStateHelper().put(Properties.onblur, onblur);
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


    public String getOnlistclick() {
        String value = (String) getStateHelper().eval(Properties.onlistclick);
        return value;
    }

    public void setOnlistclick(String onlistclick) {
        getStateHelper().put(Properties.onlistclick, onlistclick);
    }


    public String getOnlistdblclick() {
        String value = (String) getStateHelper().eval(Properties.onlistdblclick);
        return value;
    }

    public void setOnlistdblclick(String onlistdblclick) {
        getStateHelper().put(Properties.onlistdblclick, onlistdblclick);
    }


    public String getOnlistkeydown() {
        String value = (String) getStateHelper().eval(Properties.onlistkeydown);
        return value;
    }

    public void setOnlistkeydown(String onlistkeydown) {
        getStateHelper().put(Properties.onlistkeydown, onlistkeydown);
    }


    public String getOnlistkeypress() {
        String value = (String) getStateHelper().eval(Properties.onlistkeypress);
        return value;
    }

    public void setOnlistkeypress(String onlistkeypress) {
        getStateHelper().put(Properties.onlistkeypress, onlistkeypress);
    }


    public String getOnlistkeyup() {
        String value = (String) getStateHelper().eval(Properties.onlistkeyup);
        return value;
    }

    public void setOnlistkeyup(String onlistkeyup) {
        getStateHelper().put(Properties.onlistkeyup, onlistkeyup);
    }


    public String getOnlistmousedown() {
        String value = (String) getStateHelper().eval(Properties.onlistmousedown);
        return value;
    }

    public void setOnlistmousedown(String onlistmousedown) {
        getStateHelper().put(Properties.onlistmousedown, onlistmousedown);
    }


    public String getOnlistmousemove() {
        String value = (String) getStateHelper().eval(Properties.onlistmousemove);
        return value;
    }

    public void setOnlistmousemove(String onlistmousemove) {
        getStateHelper().put(Properties.onlistmousemove, onlistmousemove);
    }


    public String getOnlistmouseout() {
        String value = (String) getStateHelper().eval(Properties.onlistmouseout);
        return value;
    }

    public void setOnlistmouseout(String onlistmouseout) {
        getStateHelper().put(Properties.onlistmouseout, onlistmouseout);
    }


    public String getOnlistmouseover() {
        String value = (String) getStateHelper().eval(Properties.onlistmouseover);
        return value;
    }

    public void setOnlistmouseover(String onlistmouseover) {
        getStateHelper().put(Properties.onlistmouseover, onlistmouseover);
    }


    public String getOnlistmouseup() {
        String value = (String) getStateHelper().eval(Properties.onlistmouseup);
        return value;
    }

    public void setOnlistmouseup(String onlistmouseup) {
        getStateHelper().put(Properties.onlistmouseup, onlistmouseup);
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


    public String getSelectItemClass() {
        String value = (String) getStateHelper().eval(Properties.selectItemClass);
        return value;
    }

    public void setSelectItemClass(String selectItemClass) {
        getStateHelper().put(Properties.selectItemClass, selectItemClass);
    }


    public boolean isShowButton() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.showButton, true);
        return value;
    }

    public void setShowButton(boolean showButton) {
        getStateHelper().put(Properties.showButton, showButton);
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


    public String getUpText() {
        String value = (String) getStateHelper().eval(Properties.upText, "\u2191 Up");
        return value;
    }

    public void setUpText(String upText) {
        getStateHelper().put(Properties.upText, upText);
    }


    public String getUpTopText() {
        String value = (String) getStateHelper().eval(Properties.upTopText, "\u21D1 First");
        return value;
    }

    public void setUpTopText(String upTopText) {
        getStateHelper().put(Properties.upTopText, upTopText);
    }


    public String getVar() {
        String value = (String) getStateHelper().eval(Properties.var);
        return value;
    }

    public void setVar(String var) {
        getStateHelper().put(Properties.var, var);
    }

    private void handleAttribute(String name, Object value) {
        List<String> setAttributes = (List<String>) this.getAttributes().get(ATTRIBUTES_THAT_ARE_SET_KEY);
        if (setAttributes == null) {
            setAttributes = new ArrayList<String>(12);
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
        caption,
        changedClass,
        collectionType,
        columnClasses,
        defaultLabel,
        disabled,
        disabledClass,
        downBottomText,
        downText,
        headerClass,
        itemClass,
        itemLabel,
        itemValue,
        listClass,
        listHeight,
        listWidth,
        maxListHeight,
        minListHeight,
        onblur,
        onchange,
        onclick,
        ondblclick,
        onfocus,
        onkeydown,
        onkeypress,
        onkeyup,
        onlistclick,
        onlistdblclick,
        onlistkeydown,
        onlistkeypress,
        onlistkeyup,
        onlistmousedown,
        onlistmousemove,
        onlistmouseout,
        onlistmouseover,
        onlistmouseup,
        onmousedown,
        onmousemove,
        onmouseout,
        onmouseover,
        onmouseup,
        selectItemClass,
        showButton,
        style,
        styleClass,
        upText,
        upTopText,
        var

    }


}
