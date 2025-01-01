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
 * <p>The &lt;rich:hotKey&gt; component allows registering hot keys on the page or particular elements and defining
 * client side processing functions for these keys.</p>
 *
 * @author ilya_shaikovsky
 * @author Lukas Fryc
 **/
@Generated({"RichFaces CDK", "4.5.0-SNAPSHOT"})
public class UIHotKey extends AbstractHotKey
        implements ClientBehaviorHolder {

    public static final String COMPONENT_TYPE = "org.richfaces.HotKey";

    public static final String COMPONENT_FAMILY = "org.richfaces.HotKey";
    private static final Collection<String> EVENT_NAMES = Collections.unmodifiableCollection(Arrays.asList(
            "keyup",
            "keydown"
    ));

    public UIHotKey() {
        super();
        setRendererType("org.richfaces.HotKeyRenderer");
    }

    @Override
    public String getFamily() {
        return COMPONENT_FAMILY;
    }

    public Collection<String> getEventNames() {
        return EVENT_NAMES;
    }


    public String getDefaultEventName() {
        return "keydown";
    }

    public boolean isEnabledInInput() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.enabledInInput, false);
        return value;
    }

    public void setEnabledInInput(boolean enabledInInput) {
        getStateHelper().put(Properties.enabledInInput, enabledInInput);
    }

    public String getKey() {
        String value = (String) getStateHelper().eval(Properties.key);
        return value;
    }

    public void setKey(String key) {
        getStateHelper().put(Properties.key, key);
    }

    public String getOnkeydown() {
        String value = (String) getStateHelper().eval(Properties.onkeydown);
        return value;
    }

    public void setOnkeydown(String onkeydown) {
        getStateHelper().put(Properties.onkeydown, onkeydown);
    }

    public String getOnkeyup() {
        String value = (String) getStateHelper().eval(Properties.onkeyup);
        return value;
    }

    public void setOnkeyup(String onkeyup) {
        getStateHelper().put(Properties.onkeyup, onkeyup);
    }

    public boolean isPreventDefault() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.preventDefault, true);
        return value;
    }

    public void setPreventDefault(boolean preventDefault) {
        getStateHelper().put(Properties.preventDefault, preventDefault);
    }

    public String getSelector() {
        String value = (String) getStateHelper().eval(Properties.selector);
        return value;
    }

    public void setSelector(String selector) {
        getStateHelper().put(Properties.selector, selector);
    }

    protected enum Properties {
        enabledInInput,
        key,
        onkeydown,
        onkeyup,
        preventDefault,
        selector

    }


}
