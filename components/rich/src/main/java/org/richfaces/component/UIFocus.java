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

import org.ajax4jsf.component.AjaxOutput;

import javax.annotation.Generated;
import javax.faces.convert.Converter;

/**
 * <p>
 * Focus component allows to set focus based on validation of components or alternatively it can preserve focus on currently
 * focused form input.
 * </p>
 *
 * <p>
 * Focus can be bound to form (in case of placement to h:form) or to whole view (when placed outside of forms) - in latter case,
 * all forms will be managed by one Focus. There can be at most one Focus per form. When there is one view-scoped Focus and form
 * defines own Focus, form-scoped Focus settings will be used.
 * </p>
 *
 * <p>
 * Focus is applied each time the component is rendered - for each full page submit and for each partial page request (in case
 * of ajaxRendered=true). Alternatively, you can use JavaScript API: <tt>applyFocus()</tt> function will immediately cause.
 * </p>
 **/
@Generated({"RichFaces CDK", "4.5.0-SNAPSHOT"})
public class UIFocus extends AbstractFocus
        implements AjaxOutput {

    public static final String COMPONENT_TYPE = "org.richfaces.Focus";

    public static final String COMPONENT_FAMILY = "org.richfaces.Focus";

    public UIFocus() {
        super();
        setRendererType("org.richfaces.FocusRenderer");
    }

    @Override
    public String getFamily() {
        return COMPONENT_FAMILY;
    }

    public boolean isAjaxRendered() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.ajaxRendered, true);
        return value;
    }

    public void setAjaxRendered(boolean ajaxRendered) {
        getStateHelper().put(Properties.ajaxRendered, ajaxRendered);
    }

    public Converter getConverter() {
        Converter value = (Converter) getStateHelper().eval(Properties.converter);
        return value;
    }

    public void setConverter(Converter converter) {
        getStateHelper().put(Properties.converter, converter);
    }

    public boolean isDelayed() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.delayed, false);
        return value;
    }

    public void setDelayed(boolean delayed) {
        getStateHelper().put(Properties.delayed, delayed);
    }

    public boolean isKeepTransient() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.keepTransient, false);
        return value;
    }

    public void setKeepTransient(boolean keepTransient) {
        getStateHelper().put(Properties.keepTransient, keepTransient);
    }

    public boolean isPreserve() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.preserve, false);
        return value;
    }

    public void setPreserve(boolean preserve) {
        getStateHelper().put(Properties.preserve, preserve);
    }

    public boolean isValidationAware() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.validationAware, true);
        return value;
    }

    public void setValidationAware(boolean validationAware) {
        getStateHelper().put(Properties.validationAware, validationAware);
    }

    public Object getValue() {
        Object value = (Object) getStateHelper().eval(Properties.value);
        return value;
    }

    public void setValue(Object value) {
        getStateHelper().put(Properties.value, value);
    }

    protected enum Properties {
        ajaxRendered,
        converter,
        delayed,
        keepTransient,
        preserve,
        validationAware,
        value

    }


}
