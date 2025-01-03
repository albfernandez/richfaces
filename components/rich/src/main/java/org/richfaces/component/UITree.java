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
import org.richfaces.component.attribute.CoreProps;
import org.richfaces.component.attribute.EventsKeyProps;
import org.richfaces.component.attribute.EventsMouseProps;
import org.richfaces.component.attribute.I18nProps;
import org.richfaces.component.attribute.ImmediateProps;
import org.richfaces.component.attribute.SequenceProps;
import org.richfaces.component.attribute.TreeCommonProps;
import org.richfaces.component.attribute.TreeProps;
import org.richfaces.event.TreeSelectionChangeSource;
import org.richfaces.event.TreeToggleSource;

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
 * <p>The &lt;rich:tree&gt; component provides a hierarchical tree control. Each &lt;rich:tree&gt; component typically
 * consists of &lt;rich:treeNode&gt; child components. The appearance and behavior of the tree and its nodes can be
 * fully customized.</p>
 *
 * @author Nick Belaevski
 **/
@Generated({"RichFaces CDK", "4.5.0-SNAPSHOT"})
public class UITree extends AbstractTree
        implements ClientBehaviorHolder, MetaComponentEncoder, MetaComponentResolver, AjaxProps, CoreProps, EventsKeyProps, EventsMouseProps, I18nProps, ImmediateProps, SequenceProps, TreeCommonProps, TreeProps, TreeSelectionChangeSource, TreeToggleSource {

    public static final String COMPONENT_TYPE = "org.richfaces.Tree";

    public static final String COMPONENT_FAMILY = "org.richfaces.Tree";
    private static final Collection<String> EVENT_NAMES = Collections.unmodifiableCollection(Arrays.asList(
            "beforeselectionchange",
            "click",
            "beforenodetoggle",
            "selectionchange",
            "mouseover",
            "mouseup",
            "keyup",
            "mousemove",
            "keydown",
            "keypress",
            "dblclick",
            "nodetoggle",
            "mouseout",
            "beforedomupdate",
            "begin",
            "mousedown",
            "complete"
    ));
    private static final String ATTRIBUTES_THAT_ARE_SET_KEY = "javax.faces.component.UIComponentBase.attributesThatAreSet";

    public UITree() {
        super();
        setRendererType("org.richfaces.TreeRenderer");
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


    public String getHandleClass() {
        String value = (String) getStateHelper().eval(Properties.handleClass);
        return value;
    }

    public void setHandleClass(String handleClass) {
        getStateHelper().put(Properties.handleClass, handleClass);
    }


    public String getIconClass() {
        String value = (String) getStateHelper().eval(Properties.iconClass);
        return value;
    }

    public void setIconClass(String iconClass) {
        getStateHelper().put(Properties.iconClass, iconClass);
    }


    public String getIconCollapsed() {
        String value = (String) getStateHelper().eval(Properties.iconCollapsed);
        return value;
    }

    public void setIconCollapsed(String iconCollapsed) {
        getStateHelper().put(Properties.iconCollapsed, iconCollapsed);
    }


    public String getIconExpanded() {
        String value = (String) getStateHelper().eval(Properties.iconExpanded);
        return value;
    }

    public void setIconExpanded(String iconExpanded) {
        getStateHelper().put(Properties.iconExpanded, iconExpanded);
    }


    public String getIconLeaf() {
        String value = (String) getStateHelper().eval(Properties.iconLeaf);
        return value;
    }

    public void setIconLeaf(String iconLeaf) {
        getStateHelper().put(Properties.iconLeaf, iconLeaf);
    }


    public boolean isImmediate() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.immediate, false);
        return value;
    }

    public void setImmediate(boolean immediate) {
        getStateHelper().put(Properties.immediate, immediate);
    }


    public String getLabelClass() {
        String value = (String) getStateHelper().eval(Properties.labelClass);
        return value;
    }

    public void setLabelClass(String labelClass) {
        getStateHelper().put(Properties.labelClass, labelClass);
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


    public String getNodeClass() {
        String value = (String) getStateHelper().eval(Properties.nodeClass);
        return value;
    }

    public void setNodeClass(String nodeClass) {
        getStateHelper().put(Properties.nodeClass, nodeClass);
    }


    public String getNodeType() {
        String value = (String) getStateHelper().eval(Properties.nodeType);
        return value;
    }

    public void setNodeType(String nodeType) {
        getStateHelper().put(Properties.nodeType, nodeType);
    }


    public String getOnbeforedomupdate() {
        String value = (String) getStateHelper().eval(Properties.onbeforedomupdate);
        return value;
    }

    public void setOnbeforedomupdate(String onbeforedomupdate) {
        getStateHelper().put(Properties.onbeforedomupdate, onbeforedomupdate);
    }


    public String getOnbeforenodetoggle() {
        String value = (String) getStateHelper().eval(Properties.onbeforenodetoggle);
        return value;
    }

    public void setOnbeforenodetoggle(String onbeforenodetoggle) {
        getStateHelper().put(Properties.onbeforenodetoggle, onbeforenodetoggle);
    }


    public String getOnbeforeselectionchange() {
        String value = (String) getStateHelper().eval(Properties.onbeforeselectionchange);
        return value;
    }

    public void setOnbeforeselectionchange(String onbeforeselectionchange) {
        getStateHelper().put(Properties.onbeforeselectionchange, onbeforeselectionchange);
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


    public String getOnnodetoggle() {
        String value = (String) getStateHelper().eval(Properties.onnodetoggle);
        return value;
    }

    public void setOnnodetoggle(String onnodetoggle) {
        getStateHelper().put(Properties.onnodetoggle, onnodetoggle);
    }


    public String getOnselectionchange() {
        String value = (String) getStateHelper().eval(Properties.onselectionchange);
        return value;
    }

    public void setOnselectionchange(String onselectionchange) {
        getStateHelper().put(Properties.onselectionchange, onselectionchange);
    }


    public Object getRender() {
        Object value = (Object) getStateHelper().eval(Properties.render);
        return value;
    }

    public void setRender(Object render) {
        getStateHelper().put(Properties.render, render);
    }


    public MethodExpression getSelectionChangeListener() {
        MethodExpression value = (MethodExpression) getStateHelper().get(Properties.selectionChangeListener);
        return value;
    }

    public void setSelectionChangeListener(MethodExpression selectionChangeListener) {
        getStateHelper().put(Properties.selectionChangeListener, selectionChangeListener);
    }


    public SwitchType getSelectionType() {
        SwitchType value = (SwitchType) getStateHelper().eval(Properties.selectionType);
        return value;
    }

    public void setSelectionType(SwitchType selectionType) {
        getStateHelper().put(Properties.selectionType, selectionType);
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


    public MethodExpression getToggleListener() {
        MethodExpression value = (MethodExpression) getStateHelper().get(Properties.toggleListener);
        return value;
    }

    public void setToggleListener(MethodExpression toggleListener) {
        getStateHelper().put(Properties.toggleListener, toggleListener);
    }


    public String getToggleNodeEvent() {
        String value = (String) getStateHelper().eval(Properties.toggleNodeEvent);
        return value;
    }

    public void setToggleNodeEvent(String toggleNodeEvent) {
        getStateHelper().put(Properties.toggleNodeEvent, toggleNodeEvent);
    }


    public SwitchType getToggleType() {
        SwitchType value = (SwitchType) getStateHelper().eval(Properties.toggleType);
        return value;
    }

    public void setToggleType(SwitchType toggleType) {
        getStateHelper().put(Properties.toggleType, toggleType);
    }


    public boolean isUseDefaultNode() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.useDefaultNode, false);
        return value;
    }

    public void setUseDefaultNode(boolean useDefaultNode) {
        getStateHelper().put(Properties.useDefaultNode, useDefaultNode);
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
            setAttributes = new ArrayList<String>(14);
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
        data,
        dir,
        execute,
        handleClass,
        iconClass,
        iconCollapsed,
        iconExpanded,
        iconLeaf,
        immediate,
        labelClass,
        lang,
        limitRender,
        nodeClass,
        nodeType,
        onbeforedomupdate,
        onbeforenodetoggle,
        onbeforeselectionchange,
        onbegin,
        onclick,
        oncomplete,
        ondblclick,
        onkeydown,
        onkeypress,
        onkeyup,
        onmousedown,
        onmousemove,
        onmouseout,
        onmouseover,
        onmouseup,
        onnodetoggle,
        onselectionchange,
        render,
        selectionChangeListener,
        selectionType,
        status,
        style,
        styleClass,
        title,
        toggleListener,
        toggleNodeEvent,
        toggleType,
        useDefaultNode,
        value

    }


}
