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

import org.richfaces.component.attribute.EventsRowProps;
import org.richfaces.component.attribute.IterationProps;
import org.richfaces.component.attribute.RowsProps;
import org.richfaces.component.attribute.SequenceProps;
import org.richfaces.component.attribute.StyleProps;
import org.richfaces.component.attribute.TableStyleProps;
import org.richfaces.model.SortMode;

import javax.annotation.Generated;
import jakarta.el.ValueExpression;
import jakarta.faces.component.UIComponent;
import jakarta.faces.component.behavior.ClientBehaviorHolder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * <p>
 * The &lt;rich:collapsibleSubTable&gt; component acts as a child element to a &lt;rich:dataTable&gt; component. The
 * &lt;rich:collapsibleSubTable&gt; component iterates through the child collections in the currently iterated object to create
 * master-detail tables.
 * </p>
 *
 * @author Anton Belevich
 **/
@Generated({"RichFaces CDK", "4.5.0-SNAPSHOT"})
public class UICollapsibleSubTable extends AbstractCollapsibleSubTable
        implements ClientBehaviorHolder, Column, Expandable, EventsRowProps, IterationProps, RowsProps, SequenceProps, StyleProps, TableStyleProps {

    public static final String COMPONENT_TYPE = "org.richfaces.CollapsibleSubTable";

    public static final String COMPONENT_FAMILY = "org.richfaces.Data";
    private static final Collection<String> EVENT_NAMES = Collections.unmodifiableCollection(Arrays.asList(
            "rowkeypress",
            "rowmouseup",
            "rowkeyup",
            "rowmouseover",
            "rowdblclick",
            "rowmousemove",
            "rowmouseout",
            "rowclick",
            "rowkeydown",
            "rowmousedown"
    ));
    private static final String ATTRIBUTES_THAT_ARE_SET_KEY = "javax.faces.component.UIComponentBase.attributesThatAreSet";

    public UICollapsibleSubTable() {
        super();
        setRendererType("org.richfaces.CollapsibleSubTableRenderer");
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

    public String getCellClass() {
        String value = (String) getStateHelper().eval(Properties.cellClass);
        return value;
    }

    public void setCellClass(String cellClass) {
        getStateHelper().put(Properties.cellClass, cellClass);
    }


    public String getColumnClasses() {
        String value = (String) getStateHelper().eval(Properties.columnClasses);
        return value;
    }

    public void setColumnClasses(String columnClasses) {
        getStateHelper().put(Properties.columnClasses, columnClasses);
    }


    public String getColumnFooterCellClass() {
        String value = (String) getStateHelper().eval(Properties.columnFooterCellClass);
        return value;
    }

    public void setColumnFooterCellClass(String columnFooterCellClass) {
        getStateHelper().put(Properties.columnFooterCellClass, columnFooterCellClass);
    }


    public String getColumnFooterClass() {
        String value = (String) getStateHelper().eval(Properties.columnFooterClass);
        return value;
    }

    public void setColumnFooterClass(String columnFooterClass) {
        getStateHelper().put(Properties.columnFooterClass, columnFooterClass);
    }


    public String getColumnHeaderCellClass() {
        String value = (String) getStateHelper().eval(Properties.columnHeaderCellClass);
        return value;
    }

    public void setColumnHeaderCellClass(String columnHeaderCellClass) {
        getStateHelper().put(Properties.columnHeaderCellClass, columnHeaderCellClass);
    }


    public String getColumnHeaderClass() {
        String value = (String) getStateHelper().eval(Properties.columnHeaderClass);
        return value;
    }

    public void setColumnHeaderClass(String columnHeaderClass) {
        getStateHelper().put(Properties.columnHeaderClass, columnHeaderClass);
    }


    public String getColumnHeaderFirstClass() {
        String value = (String) getStateHelper().eval(Properties.columnHeaderFirstClass);
        return value;
    }

    public void setColumnHeaderFirstClass(String columnHeaderFirstClass) {
        getStateHelper().put(Properties.columnHeaderFirstClass, columnHeaderFirstClass);
    }


    public String getExpandMode() {
        String value = (String) getStateHelper().eval(Properties.expandMode);
        return value;
    }

    public void setExpandMode(String expandMode) {
        getStateHelper().put(Properties.expandMode, expandMode);
    }


    public String getFilterVar() {
        String value = (String) getStateHelper().eval(Properties.filterVar);
        return value;
    }

    public void setFilterVar(String filterVar) {
        getStateHelper().put(Properties.filterVar, filterVar);
    }


    public String getFirstColumnFooterClass() {
        String value = (String) getStateHelper().eval(Properties.firstColumnFooterClass);
        return value;
    }

    public void setFirstColumnFooterClass(String firstColumnFooterClass) {
        getStateHelper().put(Properties.firstColumnFooterClass, firstColumnFooterClass);
    }


    public String getFirstRowClass() {
        String value = (String) getStateHelper().eval(Properties.firstRowClass);
        return value;
    }

    public void setFirstRowClass(String firstRowClass) {
        getStateHelper().put(Properties.firstRowClass, firstRowClass);
    }


    public String getFooterCellClass() {
        String value = (String) getStateHelper().eval(Properties.footerCellClass);
        return value;
    }

    public void setFooterCellClass(String footerCellClass) {
        getStateHelper().put(Properties.footerCellClass, footerCellClass);
    }


    public String getFooterClass() {
        String value = (String) getStateHelper().eval(Properties.footerClass);
        return value;
    }

    public void setFooterClass(String footerClass) {
        getStateHelper().put(Properties.footerClass, footerClass);
    }


    public String getFooterFirstClass() {
        String value = (String) getStateHelper().eval(Properties.footerFirstClass);
        return value;
    }

    public void setFooterFirstClass(String footerFirstClass) {
        getStateHelper().put(Properties.footerFirstClass, footerFirstClass);
    }


    public String getHeaderCellClass() {
        String value = (String) getStateHelper().eval(Properties.headerCellClass);
        return value;
    }

    public void setHeaderCellClass(String headerCellClass) {
        getStateHelper().put(Properties.headerCellClass, headerCellClass);
    }


    public String getHeaderClass() {
        String value = (String) getStateHelper().eval(Properties.headerClass);
        return value;
    }

    public void setHeaderClass(String headerClass) {
        getStateHelper().put(Properties.headerClass, headerClass);
    }


    public String getHeaderFirstClass() {
        String value = (String) getStateHelper().eval(Properties.headerFirstClass);
        return value;
    }

    public void setHeaderFirstClass(String headerFirstClass) {
        getStateHelper().put(Properties.headerFirstClass, headerFirstClass);
    }


    public String getNoDataLabel() {
        String value = (String) getStateHelper().eval(Properties.noDataLabel);
        return value;
    }

    public void setNoDataLabel(String noDataLabel) {
        getStateHelper().put(Properties.noDataLabel, noDataLabel);
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

    private void handleAttribute(String name, Object value) {
        List<String> setAttributes = (List<String>) this.getAttributes().get(ATTRIBUTES_THAT_ARE_SET_KEY);
        if (setAttributes == null) {
            setAttributes = new ArrayList<String>(11);
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
        cellClass,
        columnClasses,
        columnFooterCellClass,
        columnFooterClass,
        columnHeaderCellClass,
        columnHeaderClass,
        columnHeaderFirstClass,
        expandMode,
        filterVar,
        firstColumnFooterClass,
        firstRowClass,
        footerCellClass,
        footerClass,
        footerFirstClass,
        headerCellClass,
        headerClass,
        headerFirstClass,
        noDataLabel,
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
        rowClass,
        rowClasses,
        sortMode,
        sortPriority,
        style

    }


}
