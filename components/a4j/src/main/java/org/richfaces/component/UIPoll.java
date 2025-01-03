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

import org.richfaces.component.attribute.AjaxCommandProps;
import org.richfaces.component.attribute.BypassProps;

import javax.annotation.Generated;
import jakarta.faces.component.behavior.ClientBehaviorHolder;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * <p>
 * The &lt;a4j:poll&gt; component allows periodical sending of Ajax requests to the server. It is used for repeatedly
 * updating a page at specific time intervals.
 * </p>
 *
 * @author shura
 **/
@Generated({"RichFaces CDK", "4.5.0-SNAPSHOT"})
public class UIPoll extends AbstractPoll
        implements ClientBehaviorHolder, AjaxCommandProps, BypassProps {

    public static final String COMPONENT_TYPE = "org.richfaces.Poll";

    public static final String COMPONENT_FAMILY = "org.richfaces.Poll";
    private static final Collection<String> EVENT_NAMES = Collections.unmodifiableCollection(Arrays.asList(
            "timer",
            "error",
            "beforedomupdate",
            "begin",
            "complete"
    ));

    public UIPoll() {
        super();
        setRendererType("org.richfaces.PollRenderer");
    }

    @Override
    public String getFamily() {
        return COMPONENT_FAMILY;
    }

    public Collection<String> getEventNames() {
        return EVENT_NAMES;
    }


    public String getDefaultEventName() {
        return "timer";
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

    public boolean isEnabled() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.enabled, true);
        return value;
    }

    public void setEnabled(boolean enabled) {
        getStateHelper().put(Properties.enabled, enabled);
    }

    public int getInterval() {
        Integer value = (Integer) getStateHelper().eval(Properties.interval, Integer.MIN_VALUE);
        return value;
    }

    public void setInterval(int interval) {
        getStateHelper().put(Properties.interval, interval);
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

    public String getOnerror() {
        String value = (String) getStateHelper().eval(Properties.onerror);
        return value;
    }

    public void setOnerror(String onerror) {
        getStateHelper().put(Properties.onerror, onerror);
    }

    public String getOntimer() {
        String value = (String) getStateHelper().eval(Properties.ontimer);
        return value;
    }

    public void setOntimer(String ontimer) {
        getStateHelper().put(Properties.ontimer, ontimer);
    }

    public boolean isResetValues() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.resetValues, false);
        return value;
    }

    public void setResetValues(boolean resetValues) {
        getStateHelper().put(Properties.resetValues, resetValues);
    }

    public String getStatus() {
        String value = (String) getStateHelper().eval(Properties.status);
        return value;
    }

    public void setStatus(String status) {
        getStateHelper().put(Properties.status, status);
    }

    protected enum Properties {
        bypassUpdates,
        data,
        enabled,
        interval,
        limitRender,
        onbeforedomupdate,
        onbegin,
        oncomplete,
        onerror,
        ontimer,
        resetValues,
        status

    }


}
