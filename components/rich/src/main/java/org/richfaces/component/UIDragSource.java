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

import javax.annotation.Generated;

/**
 * <p>
 * The &lt;rich:dragSource&gt; component can be added to a component to indicate it is capable of being dragged by the user.
 * The dragged item can then be dropped into a compatible drop area, designated using the &lt;rich:dropTarget&gt; component.
 * </p>
 *
 * @author abelevich
 **/
@Generated({"RichFaces CDK", "4.5.0-SNAPSHOT"})
public class UIDragSource extends AbstractDragSource {

    public static final String COMPONENT_TYPE = "org.richfaces.DragSource";

    public static final String COMPONENT_FAMILY = "org.richfaces.DragSource";

    public UIDragSource() {
        super();
        setRendererType("org.richfaces.DragSourceRenderer");
    }

    @Override
    public String getFamily() {
        return COMPONENT_FAMILY;
    }

    public String getDragIndicator() {
        String value = (String) getStateHelper().eval(Properties.dragIndicator);
        return value;
    }

    public void setDragIndicator(String dragIndicator) {
        getStateHelper().put(Properties.dragIndicator, dragIndicator);
    }

    public String getDragOptions() {
        String value = (String) getStateHelper().eval(Properties.dragOptions);
        return value;
    }

    public void setDragOptions(String dragOptions) {
        getStateHelper().put(Properties.dragOptions, dragOptions);
    }

    public Object getDragValue() {
        Object value = (Object) getStateHelper().eval(Properties.dragValue);
        return value;
    }

    public void setDragValue(Object dragValue) {
        getStateHelper().put(Properties.dragValue, dragValue);
    }

    public String getType() {
        String value = (String) getStateHelper().eval(Properties.type);
        return value;
    }

    public void setType(String type) {
        getStateHelper().put(Properties.type, type);
    }

    protected enum Properties {
        dragIndicator,
        dragOptions,
        dragValue,
        type

    }


}
