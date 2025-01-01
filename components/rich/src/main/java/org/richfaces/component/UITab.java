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

import org.richfaces.component.attribute.AjaxProps;
import org.richfaces.component.attribute.BypassProps;
import org.richfaces.component.attribute.CoreProps;
import org.richfaces.component.attribute.EventsMouseProps;
import org.richfaces.component.attribute.I18nProps;

import javax.annotation.Generated;
import javax.el.ValueExpression;
import javax.faces.component.behavior.ClientBehaviorHolder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * <p>The &lt;rich:tab&gt; component represents an individual tab inside a &lt;rich:tabPanel&gt; component, including
 * the tab's content. Clicking on the tab header will bring its corresponding content to the front of other tabs.</p>
 *
 * @author akolonitsky
 **/
@Generated({"RichFaces CDK", "4.5.0-SNAPSHOT"})
public class UITab extends AbstractTab
        implements ClientBehaviorHolder, AbstractTogglePanelTitledItem, AjaxProps, BypassProps, CoreProps, EventsMouseProps, I18nProps {

    public static final String COMPONENT_TYPE = "org.richfaces.Tab";

    public static final String COMPONENT_FAMILY = "org.richfaces.Tab";
    private static final Collection<String> EVENT_NAMES = Collections.unmodifiableCollection(Arrays.asList(
            "click",
            "mouseover",
            "mouseup",
            "headerdblclick",
            "mousemove",
            "headermousedown",
            "dblclick",
            "headerclick",
            "headermousemove",
            "enter",
            "headermouseup",
            "mouseout",
            "leave",
            "beforedomupdate",
            "begin",
            "mousedown",
            "complete"
    ));
    private static final String ATTRIBUTES_THAT_ARE_SET_KEY = "javax.faces.component.UIComponentBase.attributesThatAreSet";

    public UITab() {
        super();
        setRendererType("org.richfaces.TabRenderer");
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

    public boolean isBypassUpdates() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.bypassUpdates, false);
        return value;
    }

    public void setBypassUpdates(boolean bypassUpdates) {
        getStateHelper().put(Properties.bypassUpdates, bypassUpdates);
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


    public boolean isDisabled() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.disabled, false);
        return value;
    }

    public void setDisabled(boolean disabled) {
        getStateHelper().put(Properties.disabled, disabled);
    }


    public String getHeaderStyle() {
        String value = (String) getStateHelper().eval(Properties.headerStyle);
        return value;
    }

    public void setHeaderStyle(String headerStyle) {
        getStateHelper().put(Properties.headerStyle, headerStyle);
    }


    public String getLang() {
        String value = (String) getStateHelper().eval(Properties.lang);
        return value;
    }

    public void setLang(String lang) {
        getStateHelper().put(Properties.lang, lang);
        handleAttribute("lang", lang);
    }


    public boolean isLimitRender() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.limitRender, false);
        return value;
    }

    public void setLimitRender(boolean limitRender) {
        getStateHelper().put(Properties.limitRender, limitRender);
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


    public String getOnenter() {
        String value = (String) getStateHelper().eval(Properties.onenter);
        return value;
    }

    public void setOnenter(String onenter) {
        getStateHelper().put(Properties.onenter, onenter);
    }


    public String getOnheaderclick() {
        String value = (String) getStateHelper().eval(Properties.onheaderclick);
        return value;
    }

    public void setOnheaderclick(String onheaderclick) {
        getStateHelper().put(Properties.onheaderclick, onheaderclick);
    }


    public String getOnheaderdblclick() {
        String value = (String) getStateHelper().eval(Properties.onheaderdblclick);
        return value;
    }

    public void setOnheaderdblclick(String onheaderdblclick) {
        getStateHelper().put(Properties.onheaderdblclick, onheaderdblclick);
    }


    public String getOnheadermousedown() {
        String value = (String) getStateHelper().eval(Properties.onheadermousedown);
        return value;
    }

    public void setOnheadermousedown(String onheadermousedown) {
        getStateHelper().put(Properties.onheadermousedown, onheadermousedown);
    }


    public String getOnheadermousemove() {
        String value = (String) getStateHelper().eval(Properties.onheadermousemove);
        return value;
    }

    public void setOnheadermousemove(String onheadermousemove) {
        getStateHelper().put(Properties.onheadermousemove, onheadermousemove);
    }


    public String getOnheadermouseup() {
        String value = (String) getStateHelper().eval(Properties.onheadermouseup);
        return value;
    }

    public void setOnheadermouseup(String onheadermouseup) {
        getStateHelper().put(Properties.onheadermouseup, onheadermouseup);
    }


    public String getOnleave() {
        String value = (String) getStateHelper().eval(Properties.onleave);
        return value;
    }

    public void setOnleave(String onleave) {
        getStateHelper().put(Properties.onleave, onleave);
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


    public Object getRender() {
        Object value = (Object) getStateHelper().eval(Properties.render);
        return value;
    }

    public void setRender(Object render) {
        getStateHelper().put(Properties.render, render);
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


    public Object getValue() {
        Object value = (Object) getStateHelper().eval(Properties.value);
        return value;
    }

    public void setValue(Object value) {
        getStateHelper().put(Properties.value, value);
    }

    private void handleAttribute(String name, Object value) {
        List<String> setAttributes = (List<String>) this.getAttributes().get(ATTRIBUTES_THAT_ARE_SET_KEY);
        if (setAttributes == null) {
            setAttributes = new ArrayList<String>(11);
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
        bypassUpdates,
        data,
        dir,
        disabled,
        headerStyle,
        lang,
        limitRender,
        onbeforedomupdate,
        onbegin,
        onclick,
        oncomplete,
        ondblclick,
        onenter,
        onheaderclick,
        onheaderdblclick,
        onheadermousedown,
        onheadermousemove,
        onheadermouseup,
        onleave,
        onmousedown,
        onmousemove,
        onmouseout,
        onmouseover,
        onmouseup,
        render,
        status,
        style,
        styleClass,
        title,
        value

    }


}
