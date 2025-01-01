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

import org.richfaces.component.attribute.ErrorProps;

import javax.annotation.Generated;
import javax.faces.component.behavior.ClientBehaviorHolder;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * <p>
 * The &lt;a4j:push&gt; component performs real-time updates on the client side from events triggered at the server side. The
 * events are pushed out to the client through the RichFaces messaging queue (which is bound to Java Messaging Service - JMS).
 * When the &lt;a4j:push&gt; component is triggered by a server event, it can in turn cause Ajax updates and changes.
 * </p>
 *
 * @author Nick Belaevski
 * @author Lukas Fryc
 **/
@Generated({"RichFaces CDK", "4.5.0-SNAPSHOT"})
public class UIPush extends AbstractPush
        implements ClientBehaviorHolder, ErrorProps {

    public static final String COMPONENT_TYPE = "org.richfaces.Push";

    public static final String COMPONENT_FAMILY = "org.richfaces.Push";
    private static final Collection<String> EVENT_NAMES = Collections.unmodifiableCollection(Arrays.asList(
            "subscribed",
            "error",
            "dataavailable"
    ));

    public UIPush() {
        super();
        setRendererType("org.richfaces.PushRenderer");
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

    public String getAddress() {
        String value = (String) getStateHelper().eval(Properties.address);
        return value;
    }

    public void setAddress(String address) {
        getStateHelper().put(Properties.address, address);
    }

    public String getOndataavailable() {
        String value = (String) getStateHelper().eval(Properties.ondataavailable);
        return value;
    }

    public void setOndataavailable(String ondataavailable) {
        getStateHelper().put(Properties.ondataavailable, ondataavailable);
    }

    public String getOnerror() {
        String value = (String) getStateHelper().eval(Properties.onerror);
        return value;
    }

    public void setOnerror(String onerror) {
        getStateHelper().put(Properties.onerror, onerror);
    }

    public String getOnsubscribed() {
        String value = (String) getStateHelper().eval(Properties.onsubscribed);
        return value;
    }

    public void setOnsubscribed(String onsubscribed) {
        getStateHelper().put(Properties.onsubscribed, onsubscribed);
    }

    protected enum Properties {
        address,
        ondataavailable,
        onerror,
        onsubscribed

    }


}
