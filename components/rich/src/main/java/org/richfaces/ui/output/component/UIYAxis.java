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
package org.richfaces.ui.output.component;

import org.richfaces.component.AbstractChartYAxis;
import org.richfaces.component.AxisAttributes;

import javax.annotation.Generated;

/**
 * The &lt;rich:chartYAxis&gt; tag
 *
 * @author Lukas Macko
 **/
@Generated({"RichFaces CDK", "4.5.0-SNAPSHOT"})
public class UIYAxis extends AbstractChartYAxis
        implements AxisAttributes {

    public static final String COMPONENT_TYPE = "org.richfaces.ui.output.YAxis";

    public static final String COMPONENT_FAMILY = "org.richfaces.ui.output.ChartFamily";

    @Override
    public String getFamily() {
        return COMPONENT_FAMILY;
    }

    public String getFormat() {
        String value = (String) getStateHelper().eval(Properties.format);
        return value;
    }

    public void setFormat(String format) {
        getStateHelper().put(Properties.format, format);
    }

    public String getLabel() {
        String value = (String) getStateHelper().eval(Properties.label);
        return value;
    }

    public void setLabel(String label) {
        getStateHelper().put(Properties.label, label);
    }

    public String getMax() {
        String value = (String) getStateHelper().eval(Properties.max);
        return value;
    }

    public void setMax(String max) {
        getStateHelper().put(Properties.max, max);
    }

    public String getMin() {
        String value = (String) getStateHelper().eval(Properties.min);
        return value;
    }

    public void setMin(String min) {
        getStateHelper().put(Properties.min, min);
    }

    public Double getPad() {
        Double value = (Double) getStateHelper().eval(Properties.pad);
        return value;
    }

    public void setPad(Double pad) {
        getStateHelper().put(Properties.pad, pad);
    }

    protected enum Properties {
        format,
        label,
        max,
        min,
        pad

    }


}
