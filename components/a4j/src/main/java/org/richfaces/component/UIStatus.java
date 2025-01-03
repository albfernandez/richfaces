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
import jakarta.faces.component.behavior.ClientBehaviorHolder;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * <p>
 * The &lt;a4j:status&gt; component displays the status of current Ajax requests. The status can be either in progress,
 * complete, or an error is shown after a failed request.
 * </p>
 *
 * @author Nick Belaevski
 **/
@Generated({"RichFaces CDK", "4.5.0-SNAPSHOT"})
public class UIStatus extends AbstractAjaxStatus
        implements ClientBehaviorHolder, ErrorProps {

    public static final String COMPONENT_TYPE = "org.richfaces.Status";

    public static final String COMPONENT_FAMILY = "org.richfaces.Status";
    private static final Collection<String> EVENT_NAMES = Collections.unmodifiableCollection(Arrays.asList(
            "error",
            "stop",
            "success",
            "start"
    ));

    public UIStatus() {
        super();
        setRendererType("org.richfaces.StatusRenderer");
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

    public String getErrorStyle() {
        String value = (String) getStateHelper().eval(Properties.errorStyle);
        return value;
    }

    public void setErrorStyle(String errorStyle) {
        getStateHelper().put(Properties.errorStyle, errorStyle);
    }

    public String getErrorStyleClass() {
        String value = (String) getStateHelper().eval(Properties.errorStyleClass);
        return value;
    }

    public void setErrorStyleClass(String errorStyleClass) {
        getStateHelper().put(Properties.errorStyleClass, errorStyleClass);
    }

    public String getErrorText() {
        String value = (String) getStateHelper().eval(Properties.errorText);
        return value;
    }

    public void setErrorText(String errorText) {
        getStateHelper().put(Properties.errorText, errorText);
    }

    public String getName() {
        String value = (String) getStateHelper().eval(Properties.name);
        return value;
    }

    public void setName(String name) {
        getStateHelper().put(Properties.name, name);
    }

    public String getOnerror() {
        String value = (String) getStateHelper().eval(Properties.onerror);
        return value;
    }

    public void setOnerror(String onerror) {
        getStateHelper().put(Properties.onerror, onerror);
    }

    public String getOnstart() {
        String value = (String) getStateHelper().eval(Properties.onstart);
        return value;
    }

    public void setOnstart(String onstart) {
        getStateHelper().put(Properties.onstart, onstart);
    }

    public String getOnstop() {
        String value = (String) getStateHelper().eval(Properties.onstop);
        return value;
    }

    public void setOnstop(String onstop) {
        getStateHelper().put(Properties.onstop, onstop);
    }

    public String getOnsuccess() {
        String value = (String) getStateHelper().eval(Properties.onsuccess);
        return value;
    }

    public void setOnsuccess(String onsuccess) {
        getStateHelper().put(Properties.onsuccess, onsuccess);
    }

    public String getStartStyle() {
        String value = (String) getStateHelper().eval(Properties.startStyle);
        return value;
    }

    public void setStartStyle(String startStyle) {
        getStateHelper().put(Properties.startStyle, startStyle);
    }

    public String getStartStyleClass() {
        String value = (String) getStateHelper().eval(Properties.startStyleClass);
        return value;
    }

    public void setStartStyleClass(String startStyleClass) {
        getStateHelper().put(Properties.startStyleClass, startStyleClass);
    }

    public String getStartText() {
        String value = (String) getStateHelper().eval(Properties.startText);
        return value;
    }

    public void setStartText(String startText) {
        getStateHelper().put(Properties.startText, startText);
    }

    public String getStopStyle() {
        String value = (String) getStateHelper().eval(Properties.stopStyle);
        return value;
    }

    public void setStopStyle(String stopStyle) {
        getStateHelper().put(Properties.stopStyle, stopStyle);
    }

    public String getStopStyleClass() {
        String value = (String) getStateHelper().eval(Properties.stopStyleClass);
        return value;
    }

    public void setStopStyleClass(String stopStyleClass) {
        getStateHelper().put(Properties.stopStyleClass, stopStyleClass);
    }

    public String getStopText() {
        String value = (String) getStateHelper().eval(Properties.stopText);
        return value;
    }

    public void setStopText(String stopText) {
        getStateHelper().put(Properties.stopText, stopText);
    }

    protected enum Properties {
        errorStyle,
        errorStyleClass,
        errorText,
        name,
        onerror,
        onstart,
        onstop,
        onsuccess,
        startStyle,
        startStyleClass,
        startText,
        stopStyle,
        stopStyleClass,
        stopText

    }


}
