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
 * <p> The &lt;rich:collapsibleSubTableToggler&gt; component provides a toggle control for the user to expand and
 * collapse sub-tables. </p>
 *
 * @author Anton Belevich
 **/
@Generated({"RichFaces CDK", "4.5.0-SNAPSHOT"})
public class UICollapsibleSubTableToggleControl extends AbstractCollapsibleSubTableToggler {

    public static final String COMPONENT_TYPE = "org.richfaces.CollapsibleSubTableToggler";

    public static final String COMPONENT_FAMILY = "org.richfaces.CollapsibleSubTableToggler";

    public UICollapsibleSubTableToggleControl() {
        super();
        setRendererType("org.richfaces.CollapsibleSubTableTogglerRenderer");
    }

    @Override
    public String getFamily() {
        return COMPONENT_FAMILY;
    }

    public String getCollapsedIcon() {
        String value = (String) getStateHelper().eval(Properties.collapsedIcon);
        return value;
    }

    public void setCollapsedIcon(String collapsedIcon) {
        getStateHelper().put(Properties.collapsedIcon, collapsedIcon);
    }

    public String getCollapsedLabel() {
        String value = (String) getStateHelper().eval(Properties.collapsedLabel);
        return value;
    }

    public void setCollapsedLabel(String collapsedLabel) {
        getStateHelper().put(Properties.collapsedLabel, collapsedLabel);
    }

    public String getEvent() {
        String value = (String) getStateHelper().eval(Properties.event);
        return value;
    }

    public void setEvent(String event) {
        getStateHelper().put(Properties.event, event);
    }

    public String getExpandedIcon() {
        String value = (String) getStateHelper().eval(Properties.expandedIcon);
        return value;
    }

    public void setExpandedIcon(String expandedIcon) {
        getStateHelper().put(Properties.expandedIcon, expandedIcon);
    }

    public String getExpandedLabel() {
        String value = (String) getStateHelper().eval(Properties.expandedLabel);
        return value;
    }

    public void setExpandedLabel(String expandedLabel) {
        getStateHelper().put(Properties.expandedLabel, expandedLabel);
    }

    protected enum Properties {
        collapsedIcon,
        collapsedLabel,
        event,
        expandedIcon,
        expandedLabel

    }


}
