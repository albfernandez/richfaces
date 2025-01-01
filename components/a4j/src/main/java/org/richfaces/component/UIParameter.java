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

import org.ajax4jsf.component.JavaScriptParameter;

import javax.annotation.Generated;
import javax.faces.event.ActionListener;

/**
 * <p>
 * The &lt;a4j:param&gt; behavior combines the functionality of the JavaServer Faces (JSF) components
 * &lt;f:param&gt; and &lt;f:actionListener&gt;.
 * </p>
 *
 * @author shura, alexsmirnov
 **/
@Generated({"RichFaces CDK", "4.5.0-SNAPSHOT"})
public class UIParameter extends AbstractParameter
        implements ActionListener, JavaScriptParameter {

    public static final String COMPONENT_TYPE = "org.richfaces.Parameter";

    public static final String COMPONENT_FAMILY = "javax.faces.Parameter";

    @Override
    public String getFamily() {
        return COMPONENT_FAMILY;
    }

    public Object getAssignTo() {
        Object value = (Object) getStateHelper().eval(Properties.assignTo);
        return value;
    }

    public void setAssignTo(Object assignTo) {
        getStateHelper().put(Properties.assignTo, assignTo);
    }

    public boolean isNoEscape() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.noEscape, false);
        return value;
    }

    public void setNoEscape(boolean noEscape) {
        getStateHelper().put(Properties.noEscape, noEscape);
    }

    public boolean isRendered() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.rendered, false);
        return value;
    }

    public void setRendered(boolean rendered) {
        getStateHelper().put(Properties.rendered, rendered);
    }

    protected enum Properties {
        assignTo,
        noEscape,
        rendered

    }


}
