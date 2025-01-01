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
 * <p>The &lt;rich:graphValidator&gt; component is used to wrap a set of input components related to one object. The
 * object defined by the &lt;rich:graphValidator&gt; component can then be completely validated. The validation includes
 * all object properties, even those which are not bound to the individual form components. Validation performed in this
 * way allows for cross-field validation in complex forms.</p>
 **/
@Generated({"RichFaces CDK", "4.5.0-SNAPSHOT"})
public class UIGraphValidator extends AbstractGraphValidator {

    public static final String COMPONENT_TYPE = "org.richfaces.GraphValidator";

    public static final String COMPONENT_FAMILY = "org.richfaces.GraphValidator";

    @Override
    public String getFamily() {
        return COMPONENT_FAMILY;
    }

    public Class<?>[] getGroups() {
        Class<?>[] value = (Class<?>[]) getStateHelper().eval(Properties.groups);
        return value;
    }

    public void setGroups(Class<?>[] groups) {
        getStateHelper().put(Properties.groups, groups);
    }

    public String getSummary() {
        String value = (String) getStateHelper().eval(Properties.summary);
        return value;
    }

    public void setSummary(String summary) {
        getStateHelper().put(Properties.summary, summary);
    }

    public String getType() {
        String value = (String) getStateHelper().eval(Properties.type, "org.richfaces.BeanValidator");
        return value;
    }

    public void setType(String type) {
        getStateHelper().put(Properties.type, type);
    }

    public Object getValue() {
        Object value = (Object) getStateHelper().eval(Properties.value);
        return value;
    }

    public void setValue(Object value) {
        getStateHelper().put(Properties.value, value);
    }

    protected enum Properties {
        groups,
        summary,
        type,
        value

    }


}
