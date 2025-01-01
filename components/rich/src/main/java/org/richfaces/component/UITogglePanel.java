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
import org.richfaces.component.attribute.EventsMouseProps;
import org.richfaces.component.attribute.I18nProps;
import org.richfaces.event.ItemChangeSource;

import javax.annotation.Generated;
import javax.el.MethodExpression;
import javax.el.ValueExpression;
import javax.faces.component.behavior.ClientBehaviorHolder;
import javax.faces.convert.Converter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * <p>The &lt;rich:togglePanel&gt; component is used as a base for the other switchable components, the
 * &lt;rich:accordion&gt; component and the &lt;rich:tabPanel&gt; component. It provides an abstract switchable
 * component without any associated markup. As such, the &lt;rich:togglePanel&gt; component could be customized to
 * provide a switchable component when neither an accordion component or a tab panel component is appropriate.</p>
 *
 * @author akolonitsky
 * @author <a href="http://community.jboss.org/people/bleathem">Brian Leathem</a>
 **/
@Generated({"RichFaces CDK", "4.5.0-SNAPSHOT"})
public class UITogglePanel extends AbstractTogglePanel
        implements ClientBehaviorHolder, AbstractDivPanel, MetaComponentEncoder, MetaComponentResolver, CoreProps, EventsMouseProps, I18nProps, ItemChangeSource {

    public static final String COMPONENT_TYPE = "org.richfaces.TogglePanel";

    public static final String COMPONENT_FAMILY = "org.richfaces.TogglePanel";
    private static final Collection<String> EVENT_NAMES = Collections.unmodifiableCollection(Arrays.asList(
            "dblclick",
            "click",
            "beforeitemchange",
            "itemchange",
            "mouseout",
            "mouseover",
            "mouseup",
            "mousemove",
            "mousedown"
    ));
    private static final String ATTRIBUTES_THAT_ARE_SET_KEY = "javax.faces.component.UIComponentBase.attributesThatAreSet";

    public UITogglePanel() {
        super();
        setRendererType("org.richfaces.TogglePanelRenderer");
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

    public Converter getConverter() {
        Converter value = (Converter) getStateHelper().eval(Properties.converter);
        return value;
    }

    public void setConverter(Converter converter) {
        getStateHelper().put(Properties.converter, converter);
    }


    public boolean isCycledSwitching() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.cycledSwitching, false);
        return value;
    }

    public void setCycledSwitching(boolean cycledSwitching) {
        getStateHelper().put(Properties.cycledSwitching, cycledSwitching);
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


    public Object getExecute() {
        Object value = (Object) getStateHelper().eval(Properties.execute);
        return value;
    }

    public void setExecute(Object execute) {
        getStateHelper().put(Properties.execute, execute);
    }


    public MethodExpression getItemChangeListener() {
        MethodExpression value = (MethodExpression) getStateHelper().get(Properties.itemChangeListener);
        return value;
    }

    public void setItemChangeListener(MethodExpression itemChangeListener) {
        getStateHelper().put(Properties.itemChangeListener, itemChangeListener);
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


    public String getOnbeforeitemchange() {
        String value = (String) getStateHelper().eval(Properties.onbeforeitemchange);
        return value;
    }

    public void setOnbeforeitemchange(String onbeforeitemchange) {
        getStateHelper().put(Properties.onbeforeitemchange, onbeforeitemchange);
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


    public String getOnitemchange() {
        String value = (String) getStateHelper().eval(Properties.onitemchange);
        return value;
    }

    public void setOnitemchange(String onitemchange) {
        getStateHelper().put(Properties.onitemchange, onitemchange);
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
        converter,
        cycledSwitching,
        data,
        dir,
        execute,
        itemChangeListener,
        lang,
        limitRender,
        onbeforeitemchange,
        onclick,
        ondblclick,
        onitemchange,
        onmousedown,
        onmousemove,
        onmouseout,
        onmouseover,
        onmouseup,
        render,
        status,
        style,
        styleClass,
        title

    }


}
