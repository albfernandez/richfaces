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

import org.richfaces.component.attribute.AccesskeyProps;
import org.richfaces.component.attribute.AjaxCommandProps;
import org.richfaces.component.attribute.BypassProps;
import org.richfaces.component.attribute.CoreProps;
import org.richfaces.component.attribute.LinkProps;

import javax.annotation.Generated;
import javax.el.ValueExpression;
import javax.faces.component.behavior.ClientBehaviorHolder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * <p>
 * The &lt;a4j:commandLink&gt; component is similar to the JavaServer Faces (JSF) &lt;h:commandLink&gt; component, except that it
 * includes plugged-in Ajax behavior.
 * </p>
 *
 * @author Nick Belaevski
 **/
@Generated({"RichFaces CDK", "4.5.0-SNAPSHOT"})
public class UICommandLink extends AbstractCommandLink
        implements ClientBehaviorHolder, MetaComponentResolver, AccesskeyProps, AjaxCommandProps, BypassProps, CoreProps, LinkProps {

    public static final String COMPONENT_TYPE = "org.richfaces.CommandLink";

    public static final String COMPONENT_FAMILY = "javax.faces.Command";
    private static final Collection<String> EVENT_NAMES = Collections.unmodifiableCollection(Arrays.asList(
            "click",
            "error",
            "mouseover",
            "mouseup",
            "keyup",
            "mousemove",
            "keydown",
            "keypress",
            "dblclick",
            "mouseout",
            "beforedomupdate",
            "action",
            "begin",
            "mousedown",
            "complete"
    ));
    private static final String ATTRIBUTES_THAT_ARE_SET_KEY = "javax.faces.component.UIComponentBase.attributesThatAreSet";

    public UICommandLink() {
        super();
        setRendererType("org.richfaces.CommandLinkRenderer");
    }

    @Override
    public String getFamily() {
        return COMPONENT_FAMILY;
    }

    public Collection<String> getEventNames() {
        return EVENT_NAMES;
    }

    public String getDefaultEventName() {
        return "click";
    }

    public String getAccesskey() {
        String value = (String) getStateHelper().eval(Properties.accesskey);
        return value;
    }

    public void setAccesskey(String accesskey) {
        getStateHelper().put(Properties.accesskey, accesskey);
        handleAttribute("accesskey", accesskey);
    }


    public boolean isBypassUpdates() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.bypassUpdates, false);
        return value;
    }

    public void setBypassUpdates(boolean bypassUpdates) {
        getStateHelper().put(Properties.bypassUpdates, bypassUpdates);
    }


    public String getCharset() {
        String value = (String) getStateHelper().eval(Properties.charset);
        return value;
    }

    public void setCharset(String charset) {
        getStateHelper().put(Properties.charset, charset);
        handleAttribute("charset", charset);
    }


    public String getCoords() {
        String value = (String) getStateHelper().eval(Properties.coords);
        return value;
    }

    public void setCoords(String coords) {
        getStateHelper().put(Properties.coords, coords);
        handleAttribute("coords", coords);
    }


    public Object getData() {
        Object value = (Object) getStateHelper().eval(Properties.data);
        return value;
    }

    public void setData(Object data) {
        getStateHelper().put(Properties.data, data);
    }


    public boolean isDisabled() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.disabled, false);
        return value;
    }

    public void setDisabled(boolean disabled) {
        getStateHelper().put(Properties.disabled, disabled);
    }


    public String getHreflang() {
        String value = (String) getStateHelper().eval(Properties.hreflang);
        return value;
    }

    public void setHreflang(String hreflang) {
        getStateHelper().put(Properties.hreflang, hreflang);
        handleAttribute("hreflang", hreflang);
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


    public String getOnerror() {
        String value = (String) getStateHelper().eval(Properties.onerror);
        return value;
    }

    public void setOnerror(String onerror) {
        getStateHelper().put(Properties.onerror, onerror);
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


    public String getRel() {
        String value = (String) getStateHelper().eval(Properties.rel);
        return value;
    }

    public void setRel(String rel) {
        getStateHelper().put(Properties.rel, rel);
        handleAttribute("rel", rel);
    }


    public boolean isResetValues() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.resetValues, false);
        return value;
    }

    public void setResetValues(boolean resetValues) {
        getStateHelper().put(Properties.resetValues, resetValues);
    }


    public String getRev() {
        String value = (String) getStateHelper().eval(Properties.rev);
        return value;
    }

    public void setRev(String rev) {
        getStateHelper().put(Properties.rev, rev);
        handleAttribute("rev", rev);
    }


    public String getShape() {
        String value = (String) getStateHelper().eval(Properties.shape);
        return value;
    }

    public void setShape(String shape) {
        getStateHelper().put(Properties.shape, shape);
        handleAttribute("shape", shape);
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
    }


    public String getTarget() {
        String value = (String) getStateHelper().eval(Properties.target);
        return value;
    }

    public void setTarget(String target) {
        getStateHelper().put(Properties.target, target);
    }


    public String getTitle() {
        String value = (String) getStateHelper().eval(Properties.title);
        return value;
    }

    public void setTitle(String title) {
        getStateHelper().put(Properties.title, title);
        handleAttribute("title", title);
    }


    public String getType() {
        String value = (String) getStateHelper().eval(Properties.type);
        return value;
    }

    public void setType(String type) {
        getStateHelper().put(Properties.type, type);
        handleAttribute("type", type);
    }

    private void handleAttribute(String name, Object value) {
        List<String> setAttributes = (List<String>) this.getAttributes().get(ATTRIBUTES_THAT_ARE_SET_KEY);
        if (setAttributes == null) {
            setAttributes = new ArrayList<String>(19);
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
        accesskey,
        bypassUpdates,
        charset,
        coords,
        data,
        disabled,
        hreflang,
        limitRender,
        onbeforedomupdate,
        onbegin,
        onclick,
        oncomplete,
        ondblclick,
        onerror,
        onkeydown,
        onkeypress,
        onkeyup,
        onmousedown,
        onmousemove,
        onmouseout,
        onmouseover,
        onmouseup,
        rel,
        resetValues,
        rev,
        shape,
        status,
        style,
        styleClass,
        tabindex,
        target,
        title,
        type

    }


}
