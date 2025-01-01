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
import org.richfaces.component.attribute.ImmediateProps;

import javax.annotation.Generated;
import javax.el.MethodExpression;
import javax.faces.component.behavior.ClientBehaviorHolder;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * <p>
 * The &lt;rich:dropTarget&gt; component can be added to a component so that the component can accept dragged items.
 * The dragged items must be defined with a compatible drop type for the &lt;rich:dragSource&gt; component.
 * </p>
 *
 * @author abelevich
 **/
@Generated({"RichFaces CDK", "4.5.0-SNAPSHOT"})
public class UIDropTarget extends AbstractDropTarget
        implements ClientBehaviorHolder, AjaxProps, BypassProps, ImmediateProps {

    public static final String COMPONENT_TYPE = "org.richfaces.DropTarget";

    public static final String COMPONENT_FAMILY = "org.richfaces.DropTarget";
    private static final Collection<String> EVENT_NAMES = Collections.unmodifiableCollection(Arrays.asList(
            "beforedomupdate",
            "begin",
            "complete"
    ));

    public UIDropTarget() {
        super();
        setRendererType("org.richfaces.DropTargetRenderer");
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

    public Object getAcceptedTypes() {
        Object value = (Object) getStateHelper().eval(Properties.acceptedTypes);
        return value;
    }

    public void setAcceptedTypes(Object acceptedTypes) {
        getStateHelper().put(Properties.acceptedTypes, acceptedTypes);
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

    public MethodExpression getDropListener() {
        MethodExpression value = (MethodExpression) getStateHelper().get(Properties.dropListener);
        return value;
    }

    public void setDropListener(MethodExpression dropListener) {
        getStateHelper().put(Properties.dropListener, dropListener);
    }

    public Object getDropValue() {
        Object value = (Object) getStateHelper().eval(Properties.dropValue);
        return value;
    }

    public void setDropValue(Object dropValue) {
        getStateHelper().put(Properties.dropValue, dropValue);
    }

    public Object getExecute() {
        Object value = (Object) getStateHelper().eval(Properties.execute);
        return value;
    }

    public void setExecute(Object execute) {
        getStateHelper().put(Properties.execute, execute);
    }

    public boolean isImmediate() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.immediate, false);
        return value;
    }

    public void setImmediate(boolean immediate) {
        getStateHelper().put(Properties.immediate, immediate);
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

    public String getOncomplete() {
        String value = (String) getStateHelper().eval(Properties.oncomplete);
        return value;
    }

    public void setOncomplete(String oncomplete) {
        getStateHelper().put(Properties.oncomplete, oncomplete);
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

    protected enum Properties {
        acceptedTypes,
        bypassUpdates,
        data,
        dropListener,
        dropValue,
        execute,
        immediate,
        limitRender,
        onbeforedomupdate,
        onbegin,
        oncomplete,
        render,
        status

    }


}
