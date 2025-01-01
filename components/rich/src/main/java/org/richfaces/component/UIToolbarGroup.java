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
import javax.faces.component.behavior.ClientBehaviorHolder;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * <p>The &lt;rich:toolbarGroup&gt; component is a child component of the &lt;rich:toolbar&gt; component. The
 * &lt;rich:toolbarGroup&gt; component is used to group a number of items together on a toolbar.</p>
 **/
@Generated({"RichFaces CDK", "4.5.0-SNAPSHOT"})
public class UIToolbarGroup extends AbstractToolbarGroup
        implements ClientBehaviorHolder {

    public static final String COMPONENT_TYPE = "org.richfaces.ToolbarGroup";

    public static final String COMPONENT_FAMILY = "org.richfaces.Toolbar";
    private static final Collection<String> EVENT_NAMES = Collections.unmodifiableCollection(Arrays.asList(
            "itemmouseup",
            "itemclick",
            "itemkeypress",
            "itemmouseout",
            "itemkeyup",
            "itemmousedown",
            "itemdblclick",
            "itemmousemove",
            "itemkeydown",
            "itemmouseover"
    ));

    public UIToolbarGroup() {
        super();
        setRendererType("org.richfaces.ToolbarGroupRenderer");
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

    public String getItemClass() {
        String value = (String) getStateHelper().eval(Properties.itemClass);
        return value;
    }

    public void setItemClass(String itemClass) {
        getStateHelper().put(Properties.itemClass, itemClass);
    }

    public String getItemSeparator() {
        String value = (String) getStateHelper().eval(Properties.itemSeparator);
        return value;
    }

    public void setItemSeparator(String itemSeparator) {
        getStateHelper().put(Properties.itemSeparator, itemSeparator);
    }

    public String getItemStyle() {
        String value = (String) getStateHelper().eval(Properties.itemStyle);
        return value;
    }

    public void setItemStyle(String itemStyle) {
        getStateHelper().put(Properties.itemStyle, itemStyle);
    }

    public String getLocation() {
        String value = (String) getStateHelper().eval(Properties.location);
        return value;
    }

    public void setLocation(String location) {
        getStateHelper().put(Properties.location, location);
    }

    public String getOnitemclick() {
        String value = (String) getStateHelper().eval(Properties.onitemclick);
        return value;
    }

    public void setOnitemclick(String onitemclick) {
        getStateHelper().put(Properties.onitemclick, onitemclick);
    }

    public String getOnitemdblclick() {
        String value = (String) getStateHelper().eval(Properties.onitemdblclick);
        return value;
    }

    public void setOnitemdblclick(String onitemdblclick) {
        getStateHelper().put(Properties.onitemdblclick, onitemdblclick);
    }

    public String getOnitemkeydown() {
        String value = (String) getStateHelper().eval(Properties.onitemkeydown);
        return value;
    }

    public void setOnitemkeydown(String onitemkeydown) {
        getStateHelper().put(Properties.onitemkeydown, onitemkeydown);
    }

    public String getOnitemkeypress() {
        String value = (String) getStateHelper().eval(Properties.onitemkeypress);
        return value;
    }

    public void setOnitemkeypress(String onitemkeypress) {
        getStateHelper().put(Properties.onitemkeypress, onitemkeypress);
    }

    public String getOnitemkeyup() {
        String value = (String) getStateHelper().eval(Properties.onitemkeyup);
        return value;
    }

    public void setOnitemkeyup(String onitemkeyup) {
        getStateHelper().put(Properties.onitemkeyup, onitemkeyup);
    }

    public String getOnitemmousedown() {
        String value = (String) getStateHelper().eval(Properties.onitemmousedown);
        return value;
    }

    public void setOnitemmousedown(String onitemmousedown) {
        getStateHelper().put(Properties.onitemmousedown, onitemmousedown);
    }

    public String getOnitemmousemove() {
        String value = (String) getStateHelper().eval(Properties.onitemmousemove);
        return value;
    }

    public void setOnitemmousemove(String onitemmousemove) {
        getStateHelper().put(Properties.onitemmousemove, onitemmousemove);
    }

    public String getOnitemmouseout() {
        String value = (String) getStateHelper().eval(Properties.onitemmouseout);
        return value;
    }

    public void setOnitemmouseout(String onitemmouseout) {
        getStateHelper().put(Properties.onitemmouseout, onitemmouseout);
    }

    public String getOnitemmouseover() {
        String value = (String) getStateHelper().eval(Properties.onitemmouseover);
        return value;
    }

    public void setOnitemmouseover(String onitemmouseover) {
        getStateHelper().put(Properties.onitemmouseover, onitemmouseover);
    }

    public String getOnitemmouseup() {
        String value = (String) getStateHelper().eval(Properties.onitemmouseup);
        return value;
    }

    public void setOnitemmouseup(String onitemmouseup) {
        getStateHelper().put(Properties.onitemmouseup, onitemmouseup);
    }

    protected enum Properties {
        itemClass,
        itemSeparator,
        itemStyle,
        location,
        onitemclick,
        onitemdblclick,
        onitemkeydown,
        onitemkeypress,
        onitemkeyup,
        onitemmousedown,
        onitemmousemove,
        onitemmouseout,
        onitemmouseover,
        onitemmouseup

    }


}
