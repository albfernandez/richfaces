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

import javax.annotation.Generated;
import javax.el.ValueExpression;
import javax.faces.component.behavior.ClientBehaviorHolder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * <p> The &lt;rich:pickList&gt; is a component for selecting items from a list. Additionally, it allows for the selected
 * items to be ordered (client-side). From the client side perspective, items are added/removed from the source list,
 * and removed/added to the target list. </p>
 *
 * @author <a href="http://community.jboss.org/people/bleathem">Brian Leathem</a>
 **/
@Generated({"RichFaces CDK", "4.5.0-SNAPSHOT"})
public class UIPickList extends AbstractPickList
        implements ClientBehaviorHolder, EventsKeyProps, EventsMouseProps, MultiSelectProps {

    public static final String COMPONENT_TYPE = "org.richfaces.PickList";

    public static final String COMPONENT_FAMILY = "org.richfaces.SelectMany";
    private static final Collection<String> EVENT_NAMES = Collections.unmodifiableCollection(Arrays.asList(
            "click",
            "mouseup",
            "keyup",
            "keydown",
            "listkeypress",
            "listkeydown",
            "targetblur",
            "listmousemove",
            "removeitems",
            "listkeyup",
            "change",
            "listmouseout",
            "mousedown",
            "listmouseover",
            "listdblclick",
            "focus",
            "sourceblur",
            "targetfocus",
            "mouseover",
            "blur",
            "sourcefocus",
            "listmousedown",
            "mousemove",
            "keypress",
            "dblclick",
            "mouseout",
            "listclick",
            "listmouseup",
            "additems"
    ));
    private static final String ATTRIBUTES_THAT_ARE_SET_KEY = "javax.faces.component.UIComponentBase.attributesThatAreSet";

    public UIPickList() {
        super();
        setRendererType("org.richfaces.PickListRenderer");
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


    public String getAddAllText() {
        String value = (String) getStateHelper().eval(Properties.addAllText, "\u21D2 Add all");
        return value;
    }

    public void setAddAllText(String addAllText) {
        getStateHelper().put(Properties.addAllText, addAllText);
    }


    public String getAddText() {
        String value = (String) getStateHelper().eval(Properties.addText, "\u2192 Add");
        return value;
    }

    public void setAddText(String addText) {
        getStateHelper().put(Properties.addText, addText);
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


    public boolean isKeepSourceOrder() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.keepSourceOrder, false);
        return value;
    }

    public void setKeepSourceOrder(boolean keepSourceOrder) {
        getStateHelper().put(Properties.keepSourceOrder, keepSourceOrder);
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


    public String getOnadditems() {
        String value = (String) getStateHelper().eval(Properties.onadditems);
        return value;
    }

    public void setOnadditems(String onadditems) {
        getStateHelper().put(Properties.onadditems, onadditems);
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


    public String getOnremoveitems() {
        String value = (String) getStateHelper().eval(Properties.onremoveitems);
        return value;
    }

    public void setOnremoveitems(String onremoveitems) {
        getStateHelper().put(Properties.onremoveitems, onremoveitems);
    }


    public String getOnsourceblur() {
        String value = (String) getStateHelper().eval(Properties.onsourceblur);
        return value;
    }

    public void setOnsourceblur(String onsourceblur) {
        getStateHelper().put(Properties.onsourceblur, onsourceblur);
    }


    public String getOnsourceclick() {
        String value = (String) getStateHelper().eval(Properties.onsourceclick);
        return value;
    }

    public void setOnsourceclick(String onsourceclick) {
        getStateHelper().put(Properties.onsourceclick, onsourceclick);
    }


    public String getOnsourcedblclick() {
        String value = (String) getStateHelper().eval(Properties.onsourcedblclick);
        return value;
    }

    public void setOnsourcedblclick(String onsourcedblclick) {
        getStateHelper().put(Properties.onsourcedblclick, onsourcedblclick);
    }


    public String getOnsourcefocus() {
        String value = (String) getStateHelper().eval(Properties.onsourcefocus);
        return value;
    }

    public void setOnsourcefocus(String onsourcefocus) {
        getStateHelper().put(Properties.onsourcefocus, onsourcefocus);
    }


    public String getOnsourcekeydown() {
        String value = (String) getStateHelper().eval(Properties.onsourcekeydown);
        return value;
    }

    public void setOnsourcekeydown(String onsourcekeydown) {
        getStateHelper().put(Properties.onsourcekeydown, onsourcekeydown);
    }


    public String getOnsourcekeypress() {
        String value = (String) getStateHelper().eval(Properties.onsourcekeypress);
        return value;
    }

    public void setOnsourcekeypress(String onsourcekeypress) {
        getStateHelper().put(Properties.onsourcekeypress, onsourcekeypress);
    }


    public String getOnsourcekeyup() {
        String value = (String) getStateHelper().eval(Properties.onsourcekeyup);
        return value;
    }

    public void setOnsourcekeyup(String onsourcekeyup) {
        getStateHelper().put(Properties.onsourcekeyup, onsourcekeyup);
    }


    public String getOnsourcemousedown() {
        String value = (String) getStateHelper().eval(Properties.onsourcemousedown);
        return value;
    }

    public void setOnsourcemousedown(String onsourcemousedown) {
        getStateHelper().put(Properties.onsourcemousedown, onsourcemousedown);
    }


    public String getOnsourcemousemove() {
        String value = (String) getStateHelper().eval(Properties.onsourcemousemove);
        return value;
    }

    public void setOnsourcemousemove(String onsourcemousemove) {
        getStateHelper().put(Properties.onsourcemousemove, onsourcemousemove);
    }


    public String getOnsourcemouseout() {
        String value = (String) getStateHelper().eval(Properties.onsourcemouseout);
        return value;
    }

    public void setOnsourcemouseout(String onsourcemouseout) {
        getStateHelper().put(Properties.onsourcemouseout, onsourcemouseout);
    }


    public String getOnsourcemouseover() {
        String value = (String) getStateHelper().eval(Properties.onsourcemouseover);
        return value;
    }

    public void setOnsourcemouseover(String onsourcemouseover) {
        getStateHelper().put(Properties.onsourcemouseover, onsourcemouseover);
    }


    public String getOnsourcemouseup() {
        String value = (String) getStateHelper().eval(Properties.onsourcemouseup);
        return value;
    }

    public void setOnsourcemouseup(String onsourcemouseup) {
        getStateHelper().put(Properties.onsourcemouseup, onsourcemouseup);
    }


    public String getOntargetblur() {
        String value = (String) getStateHelper().eval(Properties.ontargetblur);
        return value;
    }

    public void setOntargetblur(String ontargetblur) {
        getStateHelper().put(Properties.ontargetblur, ontargetblur);
    }


    public String getOntargetclick() {
        String value = (String) getStateHelper().eval(Properties.ontargetclick);
        return value;
    }

    public void setOntargetclick(String ontargetclick) {
        getStateHelper().put(Properties.ontargetclick, ontargetclick);
    }


    public String getOntargetdblclick() {
        String value = (String) getStateHelper().eval(Properties.ontargetdblclick);
        return value;
    }

    public void setOntargetdblclick(String ontargetdblclick) {
        getStateHelper().put(Properties.ontargetdblclick, ontargetdblclick);
    }


    public String getOntargetfocus() {
        String value = (String) getStateHelper().eval(Properties.ontargetfocus);
        return value;
    }

    public void setOntargetfocus(String ontargetfocus) {
        getStateHelper().put(Properties.ontargetfocus, ontargetfocus);
    }


    public String getOntargetkeydown() {
        String value = (String) getStateHelper().eval(Properties.ontargetkeydown);
        return value;
    }

    public void setOntargetkeydown(String ontargetkeydown) {
        getStateHelper().put(Properties.ontargetkeydown, ontargetkeydown);
    }


    public String getOntargetkeypress() {
        String value = (String) getStateHelper().eval(Properties.ontargetkeypress);
        return value;
    }

    public void setOntargetkeypress(String ontargetkeypress) {
        getStateHelper().put(Properties.ontargetkeypress, ontargetkeypress);
    }


    public String getOntargetkeyup() {
        String value = (String) getStateHelper().eval(Properties.ontargetkeyup);
        return value;
    }

    public void setOntargetkeyup(String ontargetkeyup) {
        getStateHelper().put(Properties.ontargetkeyup, ontargetkeyup);
    }


    public String getOntargetmousedown() {
        String value = (String) getStateHelper().eval(Properties.ontargetmousedown);
        return value;
    }

    public void setOntargetmousedown(String ontargetmousedown) {
        getStateHelper().put(Properties.ontargetmousedown, ontargetmousedown);
    }


    public String getOntargetmousemove() {
        String value = (String) getStateHelper().eval(Properties.ontargetmousemove);
        return value;
    }

    public void setOntargetmousemove(String ontargetmousemove) {
        getStateHelper().put(Properties.ontargetmousemove, ontargetmousemove);
    }


    public String getOntargetmouseout() {
        String value = (String) getStateHelper().eval(Properties.ontargetmouseout);
        return value;
    }

    public void setOntargetmouseout(String ontargetmouseout) {
        getStateHelper().put(Properties.ontargetmouseout, ontargetmouseout);
    }


    public String getOntargetmouseover() {
        String value = (String) getStateHelper().eval(Properties.ontargetmouseover);
        return value;
    }

    public void setOntargetmouseover(String ontargetmouseover) {
        getStateHelper().put(Properties.ontargetmouseover, ontargetmouseover);
    }


    public String getOntargetmouseup() {
        String value = (String) getStateHelper().eval(Properties.ontargetmouseup);
        return value;
    }

    public void setOntargetmouseup(String ontargetmouseup) {
        getStateHelper().put(Properties.ontargetmouseup, ontargetmouseup);
    }


    public boolean isOrderable() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.orderable, false);
        return value;
    }

    public void setOrderable(boolean orderable) {
        getStateHelper().put(Properties.orderable, orderable);
    }


    public String getRemoveAllText() {
        String value = (String) getStateHelper().eval(Properties.removeAllText, "\u21D0 Remove all");
        return value;
    }

    public void setRemoveAllText(String removeAllText) {
        getStateHelper().put(Properties.removeAllText, removeAllText);
    }


    public String getRemoveText() {
        String value = (String) getStateHelper().eval(Properties.removeText, "\u2190 Remove");
        return value;
    }

    public void setRemoveText(String removeText) {
        getStateHelper().put(Properties.removeText, removeText);
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


    public String getSourceCaption() {
        String value = (String) getStateHelper().eval(Properties.sourceCaption);
        return value;
    }

    public void setSourceCaption(String sourceCaption) {
        getStateHelper().put(Properties.sourceCaption, sourceCaption);
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


    public boolean isSwitchByClick() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.switchByClick, false);
        return value;
    }

    public void setSwitchByClick(boolean switchByClick) {
        getStateHelper().put(Properties.switchByClick, switchByClick);
    }


    public boolean isSwitchByDblClick() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.switchByDblClick, true);
        return value;
    }

    public void setSwitchByDblClick(boolean switchByDblClick) {
        getStateHelper().put(Properties.switchByDblClick, switchByDblClick);
    }


    public String getTargetCaption() {
        String value = (String) getStateHelper().eval(Properties.targetCaption);
        return value;
    }

    public void setTargetCaption(String targetCaption) {
        getStateHelper().put(Properties.targetCaption, targetCaption);
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
        addAllText,
        addText,
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
        keepSourceOrder,
        listClass,
        listHeight,
        listWidth,
        maxListHeight,
        minListHeight,
        onadditems,
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
        onremoveitems,
        onsourceblur,
        onsourceclick,
        onsourcedblclick,
        onsourcefocus,
        onsourcekeydown,
        onsourcekeypress,
        onsourcekeyup,
        onsourcemousedown,
        onsourcemousemove,
        onsourcemouseout,
        onsourcemouseover,
        onsourcemouseup,
        ontargetblur,
        ontargetclick,
        ontargetdblclick,
        ontargetfocus,
        ontargetkeydown,
        ontargetkeypress,
        ontargetkeyup,
        ontargetmousedown,
        ontargetmousemove,
        ontargetmouseout,
        ontargetmouseover,
        ontargetmouseup,
        orderable,
        removeAllText,
        removeText,
        selectItemClass,
        showButton,
        sourceCaption,
        style,
        styleClass,
        switchByClick,
        switchByDblClick,
        targetCaption,
        upText,
        upTopText,
        var

    }


}
