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

import org.richfaces.component.attribute.CoreProps;
import org.richfaces.model.PlotClickListener;

import javax.annotation.Generated;
import javax.el.MethodExpression;
import javax.el.ValueExpression;
import javax.faces.component.behavior.ClientBehaviorHolder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * A component used to generate visual charts.
 *
 * @author Lukas Macko
 **/
@Generated({"RichFaces CDK", "4.5.0-SNAPSHOT"})
public class UIChart extends AbstractChart
        implements ClientBehaviorHolder, CoreProps {

    public static final String COMPONENT_TYPE = "org.richfaces.Chart";

    public static final String COMPONENT_FAMILY = "org.richfaces.Chart";
    private static final Collection<String> EVENT_NAMES = Collections.unmodifiableCollection(Arrays.asList(
            "mouseout",
            "plothover",
            "plotclick"
    ));
    private static final String ATTRIBUTES_THAT_ARE_SET_KEY = "javax.faces.component.UIComponentBase.attributesThatAreSet";

    public UIChart() {
        super();
        setRendererType("org.richfaces.ChartRenderer");
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

    public String getHooks() {
        String value = (String) getStateHelper().eval(Properties.hooks);
        return value;
    }

    public void setHooks(String hooks) {
        getStateHelper().put(Properties.hooks, hooks);
    }


    public String getOnmouseout() {
        String value = (String) getStateHelper().eval(Properties.onmouseout);
        return value;
    }

    public void setOnmouseout(String onmouseout) {
        getStateHelper().put(Properties.onmouseout, onmouseout);
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


    public String getStyle() {
        String value = (String) getStateHelper().eval(Properties.style);
        return value;
    }

    public void setStyle(String style) {
        getStateHelper().put(Properties.style, style);
        handleAttribute("style", style);
    }


    public String getStyleClass() {
        String value = (String) getStateHelper().eval(Properties.styleClass);
        return value;
    }

    public void setStyleClass(String styleClass) {
        getStateHelper().put(Properties.styleClass, styleClass);
    }


    public String getTitle() {
        String value = (String) getStateHelper().eval(Properties.title);
        return value;
    }

    public void setTitle(String title) {
        getStateHelper().put(Properties.title, title);
        handleAttribute("title", title);
    }


    public boolean isZoom() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.zoom, false);
        return value;
    }

    public void setZoom(boolean zoom) {
        getStateHelper().put(Properties.zoom, zoom);
    }

    private void handleAttribute(String name, Object value) {
        List<String> setAttributes = (List<String>) this.getAttributes().get(ATTRIBUTES_THAT_ARE_SET_KEY);
        if (setAttributes == null) {
            setAttributes = new ArrayList<String>(2);
            this.getAttributes().put(ATTRIBUTES_THAT_ARE_SET_KEY, setAttributes);
        }
        if (value == null) {
            ValueExpression ve = getValueExpression(name);
            if (ve == null) {
                setAttributes.remove(name);
            }
        } else if (!setAttributes.contains(name)) {
            setAttributes.add(name);
        }
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
        hooks,
        onmouseout,
        onplotclick,
        onplothover,
        plotClickListener,
        style,
        styleClass,
        title,
        zoom
    }
}
