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

import org.ajax4jsf.component.IterationStateHolder;
import org.richfaces.component.attribute.CoreProps;
import org.richfaces.component.attribute.EventsKeyProps;
import org.richfaces.component.attribute.EventsMouseProps;
import org.richfaces.component.attribute.I18nProps;
import org.richfaces.component.attribute.ImmediateProps;
import org.richfaces.component.attribute.TreeCommonProps;
import org.richfaces.event.TreeToggleSource;

import javax.annotation.Generated;
import javax.el.MethodExpression;
import javax.el.ValueExpression;
import javax.faces.component.behavior.ClientBehaviorHolder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * <p> The <rich:treeNode> component is a child component of the <rich:tree> component. It represents nodes in the
 * parent tree. The appearance and functionality of each tree node can be customized. </p>
 *
 * @author Nick Belaevski
 **/
@Generated({"RichFaces CDK", "4.5.0-SNAPSHOT"})
public class UITreeNode extends AbstractTreeNode
        implements ClientBehaviorHolder, IterationStateHolder, MetaComponentEncoder, MetaComponentResolver, CoreProps, EventsKeyProps, EventsMouseProps, I18nProps, ImmediateProps, TreeCommonProps, TreeToggleSource {

    public static final String COMPONENT_TYPE = "org.richfaces.TreeNode";

    public static final String COMPONENT_FAMILY = "org.richfaces.TreeNode";
    private static final Collection<String> EVENT_NAMES = Collections.unmodifiableCollection(Arrays.asList(
            "dblclick",
            "click",
            "mouseout",
            "beforetoggle",
            "mouseover",
            "mouseup",
            "keyup",
            "mousemove",
            "keydown",
            "mousedown",
            "toggle",
            "keypress"
    ));
    private static final String ATTRIBUTES_THAT_ARE_SET_KEY = "javax.faces.component.UIComponentBase.attributesThatAreSet";

    public UITreeNode() {
        super();
        setRendererType("org.richfaces.TreeNodeRenderer");
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


    public String getOnbeforetoggle() {
        String value = (String) getStateHelper().eval(Properties.onbeforetoggle);
        return value;
    }

    public void setOnbeforetoggle(String onbeforetoggle) {
        getStateHelper().put(Properties.onbeforetoggle, onbeforetoggle);
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


    public String getOntoggle() {
        String value = (String) getStateHelper().eval(Properties.ontoggle);
        return value;
    }

    public void setOntoggle(String ontoggle) {
        getStateHelper().put(Properties.ontoggle, ontoggle);
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


    public String getType() {
        String value = (String) getStateHelper().eval(Properties.type);
        return value;
    }

    public void setType(String type) {
        getStateHelper().put(Properties.type, type);
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
        dir,
        handleClass,
        iconClass,
        iconCollapsed,
        iconExpanded,
        iconLeaf,
        immediate,
        labelClass,
        lang,
        onbeforetoggle,
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
        ontoggle,
        style,
        styleClass,
        title,
        toggleListener,
        type

    }


}
