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

import org.richfaces.component.attribute.AutocompleteProps;
import org.richfaces.component.attribute.CoreProps;
import org.richfaces.component.attribute.DisabledProps;
import org.richfaces.component.attribute.EventsKeyProps;
import org.richfaces.component.attribute.EventsMouseProps;
import org.richfaces.component.attribute.SelectItemsProps;
import org.richfaces.component.attribute.SelectProps;
import org.richfaces.component.util.SelectItemsInterface;

import javax.annotation.Generated;
import jakarta.el.MethodExpression;
import jakarta.el.ValueExpression;
import jakarta.faces.component.behavior.ClientBehaviorHolder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * <p>
 * The &lt;rich:select&gt; component provides a drop-down list box for selecting a single value from multiple options. The
 * &lt;rich:select&gt; component can be configured as a combo-box, where it will accept typed input. The component also supports
 * keyboard navigation. The &lt;rich:select&gt; component functions similarly to the JSF UISelectOne component.
 * </p>
 * <p>
 * The &lt;rich:select&gt; can optionally be used in an auto-completing mode, where the values in the drop-down list are provided
 * dynamically using either the autocompleteMethod or autocompleteList attributes.  If these attributes are omitted, the component
 * operates in the traditional non-auto-completing mode.  Refer to the individual attribute documentation to see which attributes are
 * applicable only with an auto-completing select list.
 * </p>
 *
 * @author abelevich
 * @author <a href="http://community.jboss.org/people/bleathem">Brian Leathem</a>
 **/
@Generated({"RichFaces CDK", "4.5.0-SNAPSHOT"})
public class UISelect extends AbstractSelect
        implements ClientBehaviorHolder, MetaComponentEncoder, MetaComponentResolver, AutocompleteProps, CoreProps, DisabledProps, EventsKeyProps, EventsMouseProps, SelectItemsProps, SelectProps, SelectItemsInterface {

    public static final String COMPONENT_TYPE = "org.richfaces.Select";

    public static final String COMPONENT_FAMILY = "org.richfaces.Select";
    private static final Collection<String> EVENT_NAMES = Collections.unmodifiableCollection(Arrays.asList(
            "listhide",
            "click",
            "mouseup",
            "keyup",
            "keydown",
            "listkeypress",
            "listkeydown",
            "listmousemove",
            "listkeyup",
            "change",
            "listmouseout",
            "begin",
            "listmouseover",
            "mousedown",
            "complete",
            "listdblclick",
            "focus",
            "mouseover",
            "blur",
            "listmousedown",
            "mousemove",
            "keypress",
            "dblclick",
            "mouseout",
            "listclick",
            "listmouseup",
            "listshow",
            "beforedomupdate",
            "selectitem"
    ));
    private static final String ATTRIBUTES_THAT_ARE_SET_KEY = "javax.faces.component.UIComponentBase.attributesThatAreSet";

    public UISelect() {
        super();
        setRendererType("org.richfaces.SelectRenderer");
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


    public Object getAutocompleteList() {
        Object value = (Object) getStateHelper().eval(Properties.autocompleteList);
        return value;
    }

    public void setAutocompleteList(Object autocompleteList) {
        getStateHelper().put(Properties.autocompleteList, autocompleteList);
    }


    public MethodExpression getAutocompleteMethod() {
        MethodExpression value = (MethodExpression) getStateHelper().get(Properties.autocompleteMethod);
        return value;
    }

    public void setAutocompleteMethod(MethodExpression autocompleteMethod) {
        getStateHelper().put(Properties.autocompleteMethod, autocompleteMethod);
    }


    public MethodExpression getAutocompleteMethodWithOneParameter() {
        MethodExpression value = (MethodExpression) getStateHelper().get(Properties.autocompleteMethodWithOneParameter);
        return value;
    }

    public void setAutocompleteMethodWithOneParameter(MethodExpression autocompleteMethodWithOneParameter) {
        getStateHelper().put(Properties.autocompleteMethodWithOneParameter, autocompleteMethodWithOneParameter);
    }


    public String getChangedClass() {
        String value = (String) getStateHelper().eval(Properties.changedClass);
        return value;
    }

    public void setChangedClass(String changedClass) {
        getStateHelper().put(Properties.changedClass, changedClass);
    }


    public String getClientFilterFunction() {
        String value = (String) getStateHelper().eval(Properties.clientFilterFunction);
        return value;
    }

    public void setClientFilterFunction(String clientFilterFunction) {
        getStateHelper().put(Properties.clientFilterFunction, clientFilterFunction);
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


    public boolean isEnableManualInput() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.enableManualInput, false);
        return value;
    }

    public void setEnableManualInput(boolean enableManualInput) {
        getStateHelper().put(Properties.enableManualInput, enableManualInput);
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


    public int getMinChars() {
        Integer value = (Integer) getStateHelper().eval(Properties.minChars, Integer.MIN_VALUE);
        return value;
    }

    public void setMinChars(int minChars) {
        getStateHelper().put(Properties.minChars, minChars);
    }


    public String getMinListHeight() {
        String value = (String) getStateHelper().eval(Properties.minListHeight);
        return value;
    }

    public void setMinListHeight(String minListHeight) {
        getStateHelper().put(Properties.minListHeight, minListHeight);
    }


    public AutocompleteMode getMode() {
        AutocompleteMode value = (AutocompleteMode) getStateHelper().eval(Properties.mode);
        return value;
    }

    public void setMode(AutocompleteMode mode) {
        getStateHelper().put(Properties.mode, mode);
    }


    public String getOnbeforedomupdate() {
        String value = (String) getStateHelper().eval(Properties.onbeforedomupdate);
        return value;
    }

    public void setOnbeforedomupdate(String onbeforedomupdate) {
        getStateHelper().put(Properties.onbeforedomupdate, onbeforedomupdate);
    }


    public String getOnbegin() {
        String value = (String) getStateHelper().eval(Properties.onbegin);
        return value;
    }

    public void setOnbegin(String onbegin) {
        getStateHelper().put(Properties.onbegin, onbegin);
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


    public boolean isSelectFirst() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.selectFirst, true);
        return value;
    }

    public void setSelectFirst(boolean selectFirst) {
        getStateHelper().put(Properties.selectFirst, selectFirst);
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


    public String getVar() {
        String value = (String) getStateHelper().get(Properties.var);
        return value;
    }

    public void setVar(String var) {
        getStateHelper().put(Properties.var, var);
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
        autocompleteList,
        autocompleteMethod,
        autocompleteMethodWithOneParameter,
        changedClass,
        clientFilterFunction,
        defaultLabel,
        disabled,
        disabledClass,
        enableManualInput,
        itemClass,
        itemLabel,
        itemValue,
        listClass,
        listHeight,
        listWidth,
        maxListHeight,
        minChars,
        minListHeight,
        mode,
        onbeforedomupdate,
        onbegin,
        onblur,
        onchange,
        onclick,
        oncomplete,
        ondblclick,
        onfocus,
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
        selectFirst,
        selectItemClass,
        showButton,
        status,
        style,
        styleClass,
        tabindex,
        title,
        var

    }


}
