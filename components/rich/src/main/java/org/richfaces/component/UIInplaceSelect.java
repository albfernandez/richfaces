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
import org.richfaces.component.attribute.SelectProps;

import javax.annotation.Generated;
import jakarta.el.ValueExpression;
import jakarta.faces.component.behavior.ClientBehaviorHolder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * <p> The &lt;rich:inplaceSelect&gt; component is similar to the &lt;rich:inplaceInput&gt; component, except that the
 * &lt;rich:inplaceSelect&gt; component uses a drop-down selection box to enter text instead of a regular text field.
 * Changes can be rendered either in-line or for the whole block, and inputs can be focused with keyboard navigation.
 * The component is based on the JSF UISelectOne component, so all the standard rules for value definition, processing,
 * conversion, and validation apply. </p>
 *
 * @author Anton Belevich
 **/
@Generated({"RichFaces CDK", "4.5.0-SNAPSHOT"})
public class UIInplaceSelect extends AbstractInplaceSelect
        implements ClientBehaviorHolder, InplaceComponent, CoreProps, DisabledProps, EventsKeyProps, EventsMouseProps, FocusProps, SelectProps {

    public static final String COMPONENT_TYPE = "org.richfaces.InplaceSelect";

    public static final String COMPONENT_FAMILY = "org.richfaces.Select";
    private static final Collection<String> EVENT_NAMES = Collections.unmodifiableCollection(Arrays.asList(
            "listhide",
            "click",
            "inputmousemove",
            "inputclick",
            "inputkeyup",
            "inputmouseover",
            "mouseup",
            "keyup",
            "keydown",
            "listkeypress",
            "listkeydown",
            "listmousemove",
            "listkeyup",
            "change",
            "inputmousedown",
            "listmouseout",
            "listmouseover",
            "mousedown",
            "listdblclick",
            "inputmouseout",
            "focus",
            "mouseover",
            "blur",
            "inputkeydown",
            "listmousedown",
            "mousemove",
            "inputkeypress",
            "inputselect",
            "keypress",
            "dblclick",
            "mouseout",
            "listclick",
            "listmouseup",
            "listshow",
            "selectitem",
            "inputmouseup",
            "inputdblclick"
    ));
    private static final String ATTRIBUTES_THAT_ARE_SET_KEY = "javax.faces.component.UIComponentBase.attributesThatAreSet";

    public UIInplaceSelect() {
        super();
        setRendererType("org.richfaces.InplaceSelectRenderer");
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


    public String getItemClass() {
        String value = (String) getStateHelper().eval(Properties.itemClass);
        return value;
    }

    public void setItemClass(String itemClass) {
        getStateHelper().put(Properties.itemClass, itemClass);
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


    public String getOnlisthide() {
        String value = (String) getStateHelper().eval(Properties.onlisthide);
        return value;
    }

    public void setOnlisthide(String onlisthide) {
        getStateHelper().put(Properties.onlisthide, onlisthide);
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


    public String getOnlistshow() {
        String value = (String) getStateHelper().eval(Properties.onlistshow);
        return value;
    }

    public void setOnlistshow(String onlistshow) {
        getStateHelper().put(Properties.onlistshow, onlistshow);
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


    public String getOnselectitem() {
        String value = (String) getStateHelper().eval(Properties.onselectitem);
        return value;
    }

    public void setOnselectitem(String onselectitem) {
        getStateHelper().put(Properties.onselectitem, onselectitem);
    }


    public boolean isOpenOnEdit() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.openOnEdit, true);
        return value;
    }

    public void setOpenOnEdit(boolean openOnEdit) {
        getStateHelper().put(Properties.openOnEdit, openOnEdit);
    }


    public boolean isSaveOnBlur() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.saveOnBlur, true);
        return value;
    }

    public void setSaveOnBlur(boolean saveOnBlur) {
        getStateHelper().put(Properties.saveOnBlur, saveOnBlur);
    }


    public boolean isSaveOnSelect() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.saveOnSelect, true);
        return value;
    }

    public void setSaveOnSelect(boolean saveOnSelect) {
        getStateHelper().put(Properties.saveOnSelect, saveOnSelect);
    }


    public String getSelectItemClass() {
        String value = (String) getStateHelper().eval(Properties.selectItemClass);
        return value;
    }

    public void setSelectItemClass(String selectItemClass) {
        getStateHelper().put(Properties.selectItemClass, selectItemClass);
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
        itemClass,
        listClass,
        listHeight,
        listWidth,
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
        onlistclick,
        onlistdblclick,
        onlisthide,
        onlistkeydown,
        onlistkeypress,
        onlistkeyup,
        onlistmousedown,
        onlistmousemove,
        onlistmouseout,
        onlistmouseover,
        onlistmouseup,
        onlistshow,
        onmousedown,
        onmousemove,
        onmouseout,
        onmouseover,
        onmouseup,
        onselectitem,
        openOnEdit,
        saveOnBlur,
        saveOnSelect,
        selectItemClass,
        showControls,
        state,
        style,
        styleClass,
        tabindex,
        title

    }


}
