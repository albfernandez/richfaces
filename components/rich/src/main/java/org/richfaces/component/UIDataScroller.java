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

import org.ajax4jsf.component.IterationStateHolder;
import org.richfaces.component.attribute.AjaxProps;
import org.richfaces.component.attribute.CoreProps;
import org.richfaces.event.DataScrollSource;

import javax.annotation.Generated;
import jakarta.el.MethodExpression;
import jakarta.el.ValueExpression;
import jakarta.faces.component.UIComponent;
import jakarta.faces.component.behavior.ClientBehaviorHolder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * <p> The &lt;rich:dataScroller&gt; component is used for navigating through multiple pages of tables or grids. </p>
 **/
@Generated({"RichFaces CDK", "4.5.0-SNAPSHOT"})
public class UIDataScroller extends AbstractDataScroller
        implements ClientBehaviorHolder, IterationStateHolder, AjaxProps, CoreProps, DataScrollSource {

    public static final String COMPONENT_TYPE = "org.richfaces.DataScroller";

    public static final String COMPONENT_FAMILY = "org.richfaces.DataScroller";
    private static final Collection<String> EVENT_NAMES = Collections.unmodifiableCollection(Arrays.asList(
            "beforedomupdate",
            "begin",
            "complete"
    ));
    private static final String ATTRIBUTES_THAT_ARE_SET_KEY = "javax.faces.component.UIComponentBase.attributesThatAreSet";

    public UIDataScroller() {
        super();
        setRendererType("org.richfaces.DataScrollerRenderer");
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

    public DataScrollerControlsMode getBoundaryControls() {
        DataScrollerControlsMode value = (DataScrollerControlsMode) getStateHelper().eval(Properties.boundaryControls);
        return value;
    }

    public void setBoundaryControls(DataScrollerControlsMode boundaryControls) {
        getStateHelper().put(Properties.boundaryControls, boundaryControls);
    }


    public Object getData() {
        Object value = (Object) getStateHelper().eval(Properties.data);
        return value;
    }

    public void setData(Object data) {
        getStateHelper().put(Properties.data, data);
    }


    public Object getExecute() {
        Object value = (Object) getStateHelper().eval(Properties.execute);
        return value;
    }

    public void setExecute(Object execute) {
        getStateHelper().put(Properties.execute, execute);
    }


    public DataScrollerControlsMode getFastControls() {
        DataScrollerControlsMode value = (DataScrollerControlsMode) getStateHelper().eval(Properties.fastControls);
        return value;
    }

    public void setFastControls(DataScrollerControlsMode fastControls) {
        getStateHelper().put(Properties.fastControls, fastControls);
    }


    public int getFastStep() {
        Integer value = (Integer) getStateHelper().eval(Properties.fastStep, Integer.MIN_VALUE);
        return value;
    }

    public void setFastStep(int fastStep) {
        getStateHelper().put(Properties.fastStep, fastStep);
    }


    public String getLastPageMode() {
        String value = (String) getStateHelper().eval(Properties.lastPageMode);
        return value;
    }

    public void setLastPageMode(String lastPageMode) {
        getStateHelper().put(Properties.lastPageMode, lastPageMode);
    }


    public boolean isLimitRender() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.limitRender, false);
        return value;
    }

    public void setLimitRender(boolean limitRender) {
        getStateHelper().put(Properties.limitRender, limitRender);
    }


    public int getMaxPages() {
        Integer value = (Integer) getStateHelper().eval(Properties.maxPages, Integer.MIN_VALUE);
        return value;
    }

    public void setMaxPages(int maxPages) {
        getStateHelper().put(Properties.maxPages, maxPages);
    }


    public String getOnbeforedomupdate() {
        String value = (String) getStateHelper().eval(Properties.onbeforedomupdate);
        return value;
    }

    public void setOnbeforedomupdate(String onbeforedomupdate) {
        getStateHelper().put(Properties.onbeforedomupdate, onbeforedomupdate);
    }


    public String getOnbegin() {
        String value = (String) getStateHelper().eval(Properties.onbegin);
        return value;
    }

    public void setOnbegin(String onbegin) {
        getStateHelper().put(Properties.onbegin, onbegin);
    }


    public String getOncomplete() {
        String value = (String) getStateHelper().eval(Properties.oncomplete);
        return value;
    }

    public void setOncomplete(String oncomplete) {
        getStateHelper().put(Properties.oncomplete, oncomplete);
    }


    public Object getRender() {
        Object value = (Object) getStateHelper().eval(Properties.render);
        return value;
    }

    public void setRender(Object render) {
        getStateHelper().put(Properties.render, render);
    }


    public boolean isRenderIfSinglePage() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.renderIfSinglePage, true);
        return value;
    }

    public void setRenderIfSinglePage(boolean renderIfSinglePage) {
        getStateHelper().put(Properties.renderIfSinglePage, renderIfSinglePage);
    }


    public MethodExpression getScrollListener() {
        MethodExpression value = (MethodExpression) getStateHelper().get(Properties.scrollListener);
        return value;
    }

    public void setScrollListener(MethodExpression scrollListener) {
        getStateHelper().put(Properties.scrollListener, scrollListener);
    }


    public String getStatus() {
        String value = (String) getStateHelper().eval(Properties.status);
        return value;
    }

    public void setStatus(String status) {
        getStateHelper().put(Properties.status, status);
    }


    public DataScrollerControlsMode getStepControls() {
        DataScrollerControlsMode value = (DataScrollerControlsMode) getStateHelper().eval(Properties.stepControls);
        return value;
    }

    public void setStepControls(DataScrollerControlsMode stepControls) {
        getStateHelper().put(Properties.stepControls, stepControls);
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

    public UIComponent getNext() {
        return getFacet("next");
    }

    public void setNext(UIComponent facet) {
        getFacets().put("next", facet);
    }

    public UIComponent getPrevious() {
        return getFacet("previous");
    }

    public void setPrevious(UIComponent facet) {
        getFacets().put("previous", facet);
    }

    public UIComponent getLast() {
        return getFacet("last");
    }

    public void setLast(UIComponent facet) {
        getFacets().put("last", facet);
    }

    public UIComponent getFastRewind() {
        return getFacet("fastRewind");
    }

    public void setFastRewind(UIComponent facet) {
        getFacets().put("fastRewind", facet);
    }

    public UIComponent getFastForward() {
        return getFacet("fastForward");
    }

    public void setFastForward(UIComponent facet) {
        getFacets().put("fastForward", facet);
    }

    protected enum Properties {
        boundaryControls,
        data,
        execute,
        fastControls,
        fastStep,
        lastPageMode,
        limitRender,
        maxPages,
        onbeforedomupdate,
        onbegin,
        oncomplete,
        render,
        renderIfSinglePage,
        scrollListener,
        status,
        stepControls,
        style,
        styleClass,
        title

    }


}
