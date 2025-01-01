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

import org.richfaces.component.AbstractChartSeries;
import org.richfaces.model.ChartDataModel;
import org.richfaces.model.ChartDataModel.ChartType;
import org.richfaces.model.PlotClickListener;

import javax.annotation.Generated;
import javax.el.MethodExpression;
import javax.faces.component.behavior.ClientBehaviorHolder;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * The &lt;rich:chartSeries&gt; defines the data to be plotted in a chart. It represents
 * the set of values with a common label. Data can be passed using attribute
 * data. It expects ChartDataModel object. You can also use facelet iteration.
 *
 * @author Lukas Macko
 **/
@Generated({"RichFaces CDK", "4.5.0-SNAPSHOT"})
public class UISeries extends AbstractChartSeries implements ClientBehaviorHolder {
    public static final String COMPONENT_TYPE = "org.richfaces.ui.output.Series";

    public static final String COMPONENT_FAMILY = "org.richfaces.ui.output.ChartFamily";
    private static final Collection<String> EVENT_NAMES = Collections.unmodifiableCollection(Arrays.asList(
            "plothover",
            "plotclick"
    ));

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

    public String getColor() {
        String value = (String) getStateHelper().eval(Properties.color);
        return value;
    }

    public void setColor(String color) {
        getStateHelper().put(Properties.color, color);
    }

    public ChartDataModel getData() {
        ChartDataModel value = (ChartDataModel) getStateHelper().eval(Properties.data);
        return value;
    }

    public void setData(ChartDataModel data) {
        getStateHelper().put(Properties.data, data);
    }

    public String getLabel() {
        String value = (String) getStateHelper().eval(Properties.label);
        return value;
    }

    public void setLabel(String label) {
        getStateHelper().put(Properties.label, label);
    }

    public String getOnplotclick() {
        String value = (String) getStateHelper().eval(Properties.onplotclick);
        return value;
    }

    public void setOnplotclick(String onplotclick) {
        getStateHelper().put(Properties.onplotclick, onplotclick);
    }

    public String getOnplothover() {
        String value = (String) getStateHelper().eval(Properties.onplothover);
        return value;
    }

    public void setOnplothover(String onplothover) {
        getStateHelper().put(Properties.onplothover, onplothover);
    }

    public MethodExpression getPlotClickListener() {
        MethodExpression value = (MethodExpression) getStateHelper().get(Properties.plotClickListener);
        return value;
    }

    public void setPlotClickListener(MethodExpression plotClickListener) {
        getStateHelper().put(Properties.plotClickListener, plotClickListener);
    }

    public SymbolType getSymbol() {
        SymbolType value = (SymbolType) getStateHelper().eval(Properties.symbol);
        return value;
    }

    public void setSymbol(SymbolType symbol) {
        getStateHelper().put(Properties.symbol, symbol);
    }

    public ChartType getType() {
        ChartType value = (ChartType) getStateHelper().eval(Properties.type);
        return value;
    }

    public void setType(ChartType type) {
        getStateHelper().put(Properties.type, type);
    }

    public void addPlotClickListener(PlotClickListener listener) {
        addFacesListener(listener);
    }

    public PlotClickListener[] getPlotClickListeners() {
        PlotClickListener[] al = (PlotClickListener[]) getFacesListeners(PlotClickListener.class);
        return (al);
    }

    public void removePlotClickListener(PlotClickListener listener) {
        removeFacesListener(listener);
    }

    protected enum Properties {
        color,
        data,
        label,
        onplotclick,
        onplothover,
        plotClickListener,
        symbol,
        type
    }
}
