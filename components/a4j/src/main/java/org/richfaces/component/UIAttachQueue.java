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
import javax.faces.event.ComponentSystemEventListener;

/**
 * <p>
 * The &lt;a4j:attachQueue&gt; behavior is used together with a &lt;a4j:queue&gt; component to further customize queuing for
 * particular components and behaviors. The &lt;a4j:attachQueue&gt; behavior can override the scope-wide queue settings for
 * an individual component, or attach specific requests to a queue.
 * </p>
 *
 * @author Nick Belaevski
 **/
@Generated({"RichFaces CDK", "4.5.0-SNAPSHOT"})
public class UIAttachQueue extends AbstractAttachQueue
        implements ComponentSystemEventListener {

    public static final String COMPONENT_TYPE = "org.richfaces.AttachQueue";

    public static final String COMPONENT_FAMILY = "org.richfaces.AttachQueue";

    public UIAttachQueue() {
        super();
        setRendererType("org.richfaces.AttachQueueRenderer");
    }

    @Override
    public String getFamily() {
        return COMPONENT_FAMILY;
    }

    public boolean isIgnoreDupResponses() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.ignoreDupResponses, false);
        return value;
    }

    public void setIgnoreDupResponses(boolean ignoreDupResponses) {
        getStateHelper().put(Properties.ignoreDupResponses, ignoreDupResponses);
    }

    public String getName() {
        String value = (String) getStateHelper().eval(Properties.name);
        return value;
    }

    public void setName(String name) {
        getStateHelper().put(Properties.name, name);
    }

    public String getOnrequestdequeue() {
        String value = (String) getStateHelper().eval(Properties.onrequestdequeue);
        return value;
    }

    public void setOnrequestdequeue(String onrequestdequeue) {
        getStateHelper().put(Properties.onrequestdequeue, onrequestdequeue);
    }

    public String getOnrequestqueue() {
        String value = (String) getStateHelper().eval(Properties.onrequestqueue);
        return value;
    }

    public void setOnrequestqueue(String onrequestqueue) {
        getStateHelper().put(Properties.onrequestqueue, onrequestqueue);
    }

    public int getRequestDelay() {
        Integer value = (Integer) getStateHelper().eval(Properties.requestDelay, Integer.MIN_VALUE);
        return value;
    }

    public void setRequestDelay(int requestDelay) {
        getStateHelper().put(Properties.requestDelay, requestDelay);
    }

    public String getRequestGroupingId() {
        String value = (String) getStateHelper().eval(Properties.requestGroupingId);
        return value;
    }

    public void setRequestGroupingId(String requestGroupingId) {
        getStateHelper().put(Properties.requestGroupingId, requestGroupingId);
    }

    protected enum Properties {
        ignoreDupResponses,
        name,
        onrequestdequeue,
        onrequestqueue,
        requestDelay,
        requestGroupingId

    }


}
