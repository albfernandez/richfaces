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
 * The &lt;a4j:queue&gt; component manages the JSF queue of Ajax requests. It provides additional options for a finer
 * control of request processing.
 * </p>
 *
 * @author Nick Belaevski
 **/
@Generated({"RichFaces CDK", "4.5.0-SNAPSHOT"})
public class UIQueue extends AbstractQueue
        implements ClientBehaviorHolder, ErrorProps {

    public static final String COMPONENT_TYPE = "org.richfaces.Queue";

    public static final String COMPONENT_FAMILY = "org.richfaces.Queue";
    private static final Collection<String> EVENT_NAMES = Collections.unmodifiableCollection(Arrays.asList(
            "error"
    ));

    public UIQueue() {
        super();
        setRendererType("org.richfaces.QueueRenderer");
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

    public String getOnbeforedomupdate() {
        String value = (String) getStateHelper().eval(Properties.onbeforedomupdate);
        return value;
    }

    public void setOnbeforedomupdate(String onbeforedomupdate) {
        getStateHelper().put(Properties.onbeforedomupdate, onbeforedomupdate);
    }

    public String getOncomplete() {
        String value = (String) getStateHelper().eval(Properties.oncomplete);
        return value;
    }

    public void setOncomplete(String oncomplete) {
        getStateHelper().put(Properties.oncomplete, oncomplete);
    }

    public String getOnerror() {
        String value = (String) getStateHelper().eval(Properties.onerror);
        return value;
    }

    public void setOnerror(String onerror) {
        getStateHelper().put(Properties.onerror, onerror);
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

    public String getOnsubmit() {
        String value = (String) getStateHelper().eval(Properties.onsubmit);
        return value;
    }

    public void setOnsubmit(String onsubmit) {
        getStateHelper().put(Properties.onsubmit, onsubmit);
    }

    public int getRequestDelay() {
        Integer value = (Integer) getStateHelper().eval(Properties.requestDelay, Integer.MIN_VALUE);
        return value;
    }

    public void setRequestDelay(int requestDelay) {
        getStateHelper().put(Properties.requestDelay, requestDelay);
    }

    public String getStatus() {
        String value = (String) getStateHelper().eval(Properties.status);
        return value;
    }

    public void setStatus(String status) {
        getStateHelper().put(Properties.status, status);
    }

    protected enum Properties {
        ignoreDupResponses,
        name,
        onbeforedomupdate,
        oncomplete,
        onerror,
        onrequestdequeue,
        onrequestqueue,
        onsubmit,
        requestDelay,
        status

    }


}
