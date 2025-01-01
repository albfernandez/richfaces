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
 * The &lt;rich:dragIndicator&gt; component defines a graphical element to display under the mouse cursor during a
 * drag-and-drop operation.
 * </p>
 *
 * @author abelevich
 **/
@Generated({"RichFaces CDK", "4.5.0-SNAPSHOT"})
public class UIDragIndicator extends AbstractDragIndicator {

    public static final String COMPONENT_TYPE = "org.richfaces.DragIndicator";

    public static final String COMPONENT_FAMILY = "org.richfaces.DragIndicator";

    public UIDragIndicator() {
        super();
        setRendererType("org.richfaces.DragIndicatorRenderer");
    }

    @Override
    public String getFamily() {
        return COMPONENT_FAMILY;
    }

    public String getAcceptClass() {
        String value = (String) getStateHelper().eval(Properties.acceptClass);
        return value;
    }

    public void setAcceptClass(String acceptClass) {
        getStateHelper().put(Properties.acceptClass, acceptClass);
    }

    public String getDraggingClass() {
        String value = (String) getStateHelper().eval(Properties.draggingClass);
        return value;
    }

    public void setDraggingClass(String draggingClass) {
        getStateHelper().put(Properties.draggingClass, draggingClass);
    }

    public String getRejectClass() {
        String value = (String) getStateHelper().eval(Properties.rejectClass);
        return value;
    }

    public void setRejectClass(String rejectClass) {
        getStateHelper().put(Properties.rejectClass, rejectClass);
    }

    protected enum Properties {
        acceptClass,
        draggingClass,
        rejectClass

    }


}
