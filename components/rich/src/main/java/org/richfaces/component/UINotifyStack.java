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
 * <p>Notifications emited by &lt;rich:notify&gt;, &lt;rich:notifyMessage&gt; and &lt;rich:notifyMessages&gt; are
 * displayed in top-right corner of the screen by default.</p> <p> It is &lt;rich:notifyStack&gt; which defines where
 * messages will appear and handles their stacking. </p><p> Stack also provides way how to remove messages from screen -
 * when stack is re-rendered, current notifications are destroyed, freeing place for new notifications.</p>
 *
 * @author Bernard Labno
 * @author <a href="http://community.jboss.org/people/lfryc">Lukas Fryc</a>
 **/
@Generated({"RichFaces CDK", "4.5.0-SNAPSHOT"})
public class UINotifyStack extends AbstractNotifyStack {

    public static final String COMPONENT_TYPE = "org.richfaces.NotifyStack";

    public static final String COMPONENT_FAMILY = "org.richfaces.NotifyStack";

    public UINotifyStack() {
        super();
        setRendererType("org.richfaces.NotifyStackRenderer");
    }

    @Override
    public String getFamily() {
        return COMPONENT_FAMILY;
    }

    public StackingDirection getDirection() {
        StackingDirection value = (StackingDirection) getStateHelper().eval(Properties.direction);
        return value;
    }

    public void setDirection(StackingDirection direction) {
        getStateHelper().put(Properties.direction, direction);
    }

    public StackingMethod getMethod() {
        StackingMethod value = (StackingMethod) getStateHelper().eval(Properties.method);
        return value;
    }

    public void setMethod(StackingMethod method) {
        getStateHelper().put(Properties.method, method);
    }

    public CornerPosition getPosition() {
        CornerPosition value = (CornerPosition) getStateHelper().eval(Properties.position);
        return value;
    }

    public void setPosition(CornerPosition position) {
        getStateHelper().put(Properties.position, position);
    }

    protected enum Properties {
        direction,
        method,
        position

    }


}
