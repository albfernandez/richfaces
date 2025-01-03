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
import org.richfaces.component.attribute.EventsRowProps;
import org.richfaces.component.attribute.I18nProps;
import org.richfaces.component.attribute.IterationProps;
import org.richfaces.component.attribute.RowsProps;
import org.richfaces.component.attribute.SequenceProps;

import javax.annotation.Generated;
import jakarta.el.ValueExpression;
import jakarta.faces.component.behavior.ClientBehaviorHolder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * <p>The &lt;rich:list&gt; component renders a list of items. The list can be an numerically ordered list, an
 * un-ordered bullet-point list, or a data definition list. The component uses a data model for managing the list items,
 * which can be updated dynamically.</p>
 **/
@Generated({"RichFaces CDK", "4.5.0-SNAPSHOT"})
public class UIList extends AbstractList
        implements ClientBehaviorHolder, CoreProps, EventsKeyProps, EventsMouseProps, EventsRowProps, I18nProps, IterationProps, RowsProps, SequenceProps {

    public static final String COMPONENT_TYPE = "org.richfaces.List";

    public static final String COMPONENT_FAMILY = "org.richfaces.List";
    private static final Collection<String> EVENT_NAMES = Collections.unmodifiableCollection(Arrays.asList(
            "rowmouseup",
            "click",
            "rowkeyup",
            "mouseover",
            "mouseup",
            "keyup",
            "mousemove",
            "keydown",
            "keypress",
            "rowmousedown",
            "dblclick",
            "rowkeypress",
            "mouseout",
            "rowmouseover",
            "rowdblclick",
            "mousedown",
            "rowmousemove",
            "rowmouseout",
            "rowclick",
            "rowkeydown"
    ));
    private static final String ATTRIBUTES_THAT_ARE_SET_KEY = "javax.faces.component.UIComponentBase.attributesThatAreSet";

    public UIList() {
        super();
        setRendererType("org.richfaces.ListRenderer");
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

    public String getDir() {
        String value = (String) getStateHelper().eval(Properties.dir);
        return value;
    }

    public void setDir(String dir) {
        getStateHelper().put(Properties.dir, dir);
        handleAttribute("dir", dir);
    }


    public String getLang() {
        String value = (String) getStateHelper().eval(Properties.lang);
        return value;
    }

    public void setLang(String lang) {
        getStateHelper().put(Properties.lang, lang);
        handleAttribute("lang", lang);
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


    public String getOnrowclick() {
        String value = (String) getStateHelper().eval(Properties.onrowclick);
        return value;
    }

    public void setOnrowclick(String onrowclick) {
        getStateHelper().put(Properties.onrowclick, onrowclick);
        handleAttribute("onrowclick", onrowclick);
    }


    public String getOnrowdblclick() {
        String value = (String) getStateHelper().eval(Properties.onrowdblclick);
        return value;
    }

    public void setOnrowdblclick(String onrowdblclick) {
        getStateHelper().put(Properties.onrowdblclick, onrowdblclick);
        handleAttribute("onrowdblclick", onrowdblclick);
    }


    public String getOnrowkeydown() {
        String value = (String) getStateHelper().eval(Properties.onrowkeydown);
        return value;
    }

    public void setOnrowkeydown(String onrowkeydown) {
        getStateHelper().put(Properties.onrowkeydown, onrowkeydown);
        handleAttribute("onrowkeydown", onrowkeydown);
    }


    public String getOnrowkeypress() {
        String value = (String) getStateHelper().eval(Properties.onrowkeypress);
        return value;
    }

    public void setOnrowkeypress(String onrowkeypress) {
        getStateHelper().put(Properties.onrowkeypress, onrowkeypress);
        handleAttribute("onrowkeypress", onrowkeypress);
    }


    public String getOnrowkeyup() {
        String value = (String) getStateHelper().eval(Properties.onrowkeyup);
        return value;
    }

    public void setOnrowkeyup(String onrowkeyup) {
        getStateHelper().put(Properties.onrowkeyup, onrowkeyup);
        handleAttribute("onrowkeyup", onrowkeyup);
    }


    public String getOnrowmousedown() {
        String value = (String) getStateHelper().eval(Properties.onrowmousedown);
        return value;
    }

    public void setOnrowmousedown(String onrowmousedown) {
        getStateHelper().put(Properties.onrowmousedown, onrowmousedown);
        handleAttribute("onrowmousedown", onrowmousedown);
    }


    public String getOnrowmousemove() {
        String value = (String) getStateHelper().eval(Properties.onrowmousemove);
        return value;
    }

    public void setOnrowmousemove(String onrowmousemove) {
        getStateHelper().put(Properties.onrowmousemove, onrowmousemove);
        handleAttribute("onrowmousemove", onrowmousemove);
    }


    public String getOnrowmouseout() {
        String value = (String) getStateHelper().eval(Properties.onrowmouseout);
        return value;
    }

    public void setOnrowmouseout(String onrowmouseout) {
        getStateHelper().put(Properties.onrowmouseout, onrowmouseout);
        handleAttribute("onrowmouseout", onrowmouseout);
    }


    public String getOnrowmouseover() {
        String value = (String) getStateHelper().eval(Properties.onrowmouseover);
        return value;
    }

    public void setOnrowmouseover(String onrowmouseover) {
        getStateHelper().put(Properties.onrowmouseover, onrowmouseover);
        handleAttribute("onrowmouseover", onrowmouseover);
    }


    public String getOnrowmouseup() {
        String value = (String) getStateHelper().eval(Properties.onrowmouseup);
        return value;
    }

    public void setOnrowmouseup(String onrowmouseup) {
        getStateHelper().put(Properties.onrowmouseup, onrowmouseup);
        handleAttribute("onrowmouseup", onrowmouseup);
    }


    public String getRowClass() {
        String value = (String) getStateHelper().eval(Properties.rowClass);
        return value;
    }

    public void setRowClass(String rowClass) {
        getStateHelper().put(Properties.rowClass, rowClass);
    }


    public String getRowClasses() {
        String value = (String) getStateHelper().eval(Properties.rowClasses);
        return value;
    }

    public void setRowClasses(String rowClasses) {
        getStateHelper().put(Properties.rowClasses, rowClasses);
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


    public ListType getType() {
        ListType value = (ListType) getStateHelper().eval(Properties.type, ListType.unordered);
        return value;
    }

    public void setType(ListType type) {
        getStateHelper().put(Properties.type, type);
    }

    private void handleAttribute(String name, Object value) {
        List<String> setAttributes = (List<String>) this.getAttributes().get(ATTRIBUTES_THAT_ARE_SET_KEY);
        if (setAttributes == null) {
            setAttributes = new ArrayList<String>(24);
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
        dir,
        lang,
        onclick,
        ondblclick,
        onkeydown,
        onkeypress,
        onkeyup,
        onmousedown,
        onmousemove,
        onmouseout,
        onmouseover,
        onmouseup,
        onrowclick,
        onrowdblclick,
        onrowkeydown,
        onrowkeypress,
        onrowkeyup,
        onrowmousedown,
        onrowmousemove,
        onrowmouseout,
        onrowmouseover,
        onrowmouseup,
        rowClass,
        rowClasses,
        style,
        styleClass,
        title,
        type

    }


}
