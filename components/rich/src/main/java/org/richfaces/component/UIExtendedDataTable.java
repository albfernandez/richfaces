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

import org.richfaces.component.attribute.AjaxActivatorProps;
import org.richfaces.component.attribute.EventsRowProps;
import org.richfaces.component.attribute.IterationProps;
import org.richfaces.component.attribute.RowsProps;
import org.richfaces.component.attribute.SequenceProps;
import org.richfaces.component.attribute.StyleClassProps;
import org.richfaces.component.attribute.StyleProps;
import org.richfaces.model.SelectionMode;
import org.richfaces.model.SortMode;

import javax.annotation.Generated;
import javax.el.ValueExpression;
import javax.faces.component.UIComponent;
import javax.faces.component.behavior.ClientBehaviorHolder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * <p> The &lt;rich:extendedDataTable&gt; component builds on the functionality of the &lt;rich:dataTable&gt; component,
 * adding features such as scrolling for the table body (both horizontal and vertical), Ajax loading for vertical
 * scrolling, frozen columns, row selection, and rearranging of columns. It also supports all the basic table features
 * such as sorting, filtering, and paging using the &lt;rich:dataScroller&gt; component. </p>
 *
 * @author Konstantin Mishin
 **/
@Generated({"RichFaces CDK", "4.5.0-SNAPSHOT"})
public class UIExtendedDataTable extends AbstractExtendedDataTable
        implements ClientBehaviorHolder, MetaComponentEncoder, MetaComponentResolver, AjaxActivatorProps, EventsRowProps, IterationProps, RowsProps, SequenceProps, StyleClassProps, StyleProps {

    public static final String COMPONENT_TYPE = "org.richfaces.ExtendedDataTable";

    public static final String COMPONENT_FAMILY = "org.richfaces.Data";
    private static final Collection<String> EVENT_NAMES = Collections.unmodifiableCollection(Arrays.asList(
            "beforeselectionchange",
            "rowmouseup",
            "rowkeyup",
            "selectionchange",
            "rowmousedown",
            "rowkeypress",
            "rowmouseover",
            "ready",
            "beforedomupdate",
            "rowdblclick",
            "rowmousemove",
            "rowmouseout",
            "complete",
            "rowclick",
            "rowkeydown"
    ));
    private static final String ATTRIBUTES_THAT_ARE_SET_KEY = "javax.faces.component.UIComponentBase.attributesThatAreSet";

    public UIExtendedDataTable() {
        super();
        setRendererType("org.richfaces.ExtendedDataTableRenderer");
    }

    @Override
    public String getFamily() {
        return COMPONENT_FAMILY;
    }

    public Collection<String> getEventNames() {
        return EVENT_NAMES;
    }

    public String getDefaultEventName() {
        return "selectionchange";
    }

    public String getColumnClasses() {
        String value = (String) getStateHelper().eval(Properties.columnClasses);
        return value;
    }

    public void setColumnClasses(String columnClasses) {
        getStateHelper().put(Properties.columnClasses, columnClasses);
    }


    public String[] getColumnsOrder() {
        String[] value = (String[]) getStateHelper().eval(Properties.columnsOrder);
        return value;
    }

    public void setColumnsOrder(String[] columnsOrder) {
        getStateHelper().put(Properties.columnsOrder, columnsOrder);
    }


    public Object getData() {
        Object value = (Object) getStateHelper().eval(Properties.data);
        return value;
    }

    public void setData(Object data) {
        getStateHelper().put(Properties.data, data);
    }


    public String getFilterVar() {
        String value = (String) getStateHelper().eval(Properties.filterVar);
        return value;
    }

    public void setFilterVar(String filterVar) {
        getStateHelper().put(Properties.filterVar, filterVar);
    }


    public String getFooterClass() {
        String value = (String) getStateHelper().eval(Properties.footerClass);
        return value;
    }

    public void setFooterClass(String footerClass) {
        getStateHelper().put(Properties.footerClass, footerClass);
    }


    public int getFrozenColumns() {
        Integer value = (Integer) getStateHelper().eval(Properties.frozenColumns, Integer.MIN_VALUE);
        return value;
    }

    public void setFrozenColumns(int frozenColumns) {
        getStateHelper().put(Properties.frozenColumns, frozenColumns);
    }


    public String getHeaderClass() {
        String value = (String) getStateHelper().eval(Properties.headerClass);
        return value;
    }

    public void setHeaderClass(String headerClass) {
        getStateHelper().put(Properties.headerClass, headerClass);
    }


    public boolean isLimitRender() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.limitRender, false);
        return value;
    }

    public void setLimitRender(boolean limitRender) {
        getStateHelper().put(Properties.limitRender, limitRender);
    }


    public String getNoDataLabel() {
        String value = (String) getStateHelper().eval(Properties.noDataLabel);
        return value;
    }

    public void setNoDataLabel(String noDataLabel) {
        getStateHelper().put(Properties.noDataLabel, noDataLabel);
    }


    public String getOnbeforedomupdate() {
        String value = (String) getStateHelper().eval(Properties.onbeforedomupdate);
        return value;
    }

    public void setOnbeforedomupdate(String onbeforedomupdate) {
        getStateHelper().put(Properties.onbeforedomupdate, onbeforedomupdate);
    }


    public String getOnbeforeselectionchange() {
        String value = (String) getStateHelper().eval(Properties.onbeforeselectionchange);
        return value;
    }

    public void setOnbeforeselectionchange(String onbeforeselectionchange) {
        getStateHelper().put(Properties.onbeforeselectionchange, onbeforeselectionchange);
    }


    public String getOncomplete() {
        String value = (String) getStateHelper().eval(Properties.oncomplete);
        return value;
    }

    public void setOncomplete(String oncomplete) {
        getStateHelper().put(Properties.oncomplete, oncomplete);
    }


    public String getOnready() {
        String value = (String) getStateHelper().eval(Properties.onready);
        return value;
    }

    public void setOnready(String onready) {
        getStateHelper().put(Properties.onready, onready);
    }


    public String getOnrowclick() {
        String value = (String) getStateHelper().eval(Properties.onrowclick);
        return value;
    }

    public void setOnrowclick(String onrowclick) {
        getStateHelper().put(Properties.onrowclick, onrowclick);
        handleAttribute("onrowclick", onrowclick);
    }


    public String getOnrowdblclick() {
        String value = (String) getStateHelper().eval(Properties.onrowdblclick);
        return value;
    }

    public void setOnrowdblclick(String onrowdblclick) {
        getStateHelper().put(Properties.onrowdblclick, onrowdblclick);
        handleAttribute("onrowdblclick", onrowdblclick);
    }


    public String getOnrowkeydown() {
        String value = (String) getStateHelper().eval(Properties.onrowkeydown);
        return value;
    }

    public void setOnrowkeydown(String onrowkeydown) {
        getStateHelper().put(Properties.onrowkeydown, onrowkeydown);
        handleAttribute("onrowkeydown", onrowkeydown);
    }


    public String getOnrowkeypress() {
        String value = (String) getStateHelper().eval(Properties.onrowkeypress);
        return value;
    }

    public void setOnrowkeypress(String onrowkeypress) {
        getStateHelper().put(Properties.onrowkeypress, onrowkeypress);
        handleAttribute("onrowkeypress", onrowkeypress);
    }


    public String getOnrowkeyup() {
        String value = (String) getStateHelper().eval(Properties.onrowkeyup);
        return value;
    }

    public void setOnrowkeyup(String onrowkeyup) {
        getStateHelper().put(Properties.onrowkeyup, onrowkeyup);
        handleAttribute("onrowkeyup", onrowkeyup);
    }


    public String getOnrowmousedown() {
        String value = (String) getStateHelper().eval(Properties.onrowmousedown);
        return value;
    }

    public void setOnrowmousedown(String onrowmousedown) {
        getStateHelper().put(Properties.onrowmousedown, onrowmousedown);
        handleAttribute("onrowmousedown", onrowmousedown);
    }


    public String getOnrowmousemove() {
        String value = (String) getStateHelper().eval(Properties.onrowmousemove);
        return value;
    }

    public void setOnrowmousemove(String onrowmousemove) {
        getStateHelper().put(Properties.onrowmousemove, onrowmousemove);
        handleAttribute("onrowmousemove", onrowmousemove);
    }


    public String getOnrowmouseout() {
        String value = (String) getStateHelper().eval(Properties.onrowmouseout);
        return value;
    }

    public void setOnrowmouseout(String onrowmouseout) {
        getStateHelper().put(Properties.onrowmouseout, onrowmouseout);
        handleAttribute("onrowmouseout", onrowmouseout);
    }


    public String getOnrowmouseover() {
        String value = (String) getStateHelper().eval(Properties.onrowmouseover);
        return value;
    }

    public void setOnrowmouseover(String onrowmouseover) {
        getStateHelper().put(Properties.onrowmouseover, onrowmouseover);
        handleAttribute("onrowmouseover", onrowmouseover);
    }


    public String getOnrowmouseup() {
        String value = (String) getStateHelper().eval(Properties.onrowmouseup);
        return value;
    }

    public void setOnrowmouseup(String onrowmouseup) {
        getStateHelper().put(Properties.onrowmouseup, onrowmouseup);
        handleAttribute("onrowmouseup", onrowmouseup);
    }


    public String getOnselectionchange() {
        String value = (String) getStateHelper().eval(Properties.onselectionchange);
        return value;
    }

    public void setOnselectionchange(String onselectionchange) {
        getStateHelper().put(Properties.onselectionchange, onselectionchange);
    }


    public Object getRender() {
        Object value = (Object) getStateHelper().eval(Properties.render);
        return value;
    }

    public void setRender(Object render) {
        getStateHelper().put(Properties.render, render);
    }


    public String getRowClass() {
        String value = (String) getStateHelper().eval(Properties.rowClass);
        return value;
    }

    public void setRowClass(String rowClass) {
        getStateHelper().put(Properties.rowClass, rowClass);
    }


    public String getRowClasses() {
        String value = (String) getStateHelper().eval(Properties.rowClasses);
        return value;
    }

    public void setRowClasses(String rowClasses) {
        getStateHelper().put(Properties.rowClasses, rowClasses);
    }


    public Collection<Object> getSelection() {
        Collection<Object> value = (Collection<Object>) getStateHelper().eval(Properties.selection);
        return value;
    }

    public void setSelection(Collection<Object> selection) {
        getStateHelper().put(Properties.selection, selection);
    }


    public SelectionMode getSelectionMode() {
        SelectionMode value = (SelectionMode) getStateHelper().eval(Properties.selectionMode);
        return value;
    }

    public void setSelectionMode(SelectionMode selectionMode) {
        getStateHelper().put(Properties.selectionMode, selectionMode);
    }


    public boolean isShowColumnControl() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.showColumnControl, false);
        return value;
    }

    public void setShowColumnControl(boolean showColumnControl) {
        getStateHelper().put(Properties.showColumnControl, showColumnControl);
    }


    public SortMode getSortMode() {
        SortMode value = (SortMode) getStateHelper().eval(Properties.sortMode);
        return value;
    }

    public void setSortMode(SortMode sortMode) {
        getStateHelper().put(Properties.sortMode, sortMode);
    }


    public Collection<Object> getSortPriority() {
        Collection<Object> value = (Collection<Object>) getStateHelper().eval(Properties.sortPriority);
        return value;
    }

    public void setSortPriority(Collection<Object> sortPriority) {
        getStateHelper().put(Properties.sortPriority, sortPriority);
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
        handleAttribute("styleClass", styleClass);
    }


    public String getTableState() {
        String value = (String) getStateHelper().eval(Properties.tableState);
        return value;
    }

    public void setTableState(String tableState) {
        getStateHelper().put(Properties.tableState, tableState);
    }

    private void handleAttribute(String name, Object value) {
        List<String> setAttributes = (List<String>) this.getAttributes().get(ATTRIBUTES_THAT_ARE_SET_KEY);
        if (setAttributes == null) {
            setAttributes = new ArrayList<String>(12);
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

    public UIComponent getFooter() {
        return getFacet("footer");
    }

    public void setFooter(UIComponent facet) {
        getFacets().put("footer", facet);
    }

    public UIComponent getHeader() {
        return getFacet("header");
    }

    public void setHeader(UIComponent facet) {
        getFacets().put("header", facet);
    }

    public UIComponent getNoData() {
        return getFacet("noData");
    }

    public void setNoData(UIComponent facet) {
        getFacets().put("noData", facet);
    }

    protected enum Properties {
        columnClasses,
        columnsOrder,
        data,
        filterVar,
        footerClass,
        frozenColumns,
        headerClass,
        limitRender,
        noDataLabel,
        onbeforedomupdate,
        onbeforeselectionchange,
        oncomplete,
        onready,
        onrowclick,
        onrowdblclick,
        onrowkeydown,
        onrowkeypress,
        onrowkeyup,
        onrowmousedown,
        onrowmousemove,
        onrowmouseout,
        onrowmouseover,
        onrowmouseup,
        onselectionchange,
        render,
        rowClass,
        rowClasses,
        selection,
        selectionMode,
        showColumnControl,
        sortMode,
        sortPriority,
        style,
        styleClass,
        tableState

    }


}
