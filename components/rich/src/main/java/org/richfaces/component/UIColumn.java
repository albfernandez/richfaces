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

import org.richfaces.component.attribute.ColumnProps;
import org.richfaces.component.attribute.StyleClassProps;
import org.richfaces.component.attribute.StyleProps;
import org.richfaces.model.Filter;

import javax.annotation.Generated;
import jakarta.el.ValueExpression;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * <p> The &lt;rich:column&gt; component facilitates columns in a table. It supports merging columns and rows, sorting,
 * filtering, and customized skinning. </p>
 *
 * @author Anton Belevich
 **/
@Generated({"RichFaces CDK", "4.5.0-SNAPSHOT"})
public class UIColumn extends AbstractColumn
        implements Column, ColumnProps, StyleClassProps, StyleProps {

    public static final String COMPONENT_TYPE = "org.richfaces.Column";

    public static final String COMPONENT_FAMILY = "org.richfaces.Column";
    private static final String ATTRIBUTES_THAT_ARE_SET_KEY = "javax.faces.component.UIComponentBase.attributesThatAreSet";

    @Override
    public String getFamily() {
        return COMPONENT_FAMILY;
    }

    public boolean isBreakRowBefore() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.breakRowBefore, false);
        return value;
    }

    public void setBreakRowBefore(boolean breakRowBefore) {
        getStateHelper().put(Properties.breakRowBefore, breakRowBefore);
    }


    public int getColspan() {
        Integer value = (Integer) getStateHelper().eval(Properties.colspan, Integer.MIN_VALUE);
        return value;
    }

    public void setColspan(int colspan) {
        getStateHelper().put(Properties.colspan, colspan);
    }


    public Comparator<?> getComparator() {
        Comparator<?> value = (Comparator<?>) getStateHelper().eval(Properties.comparator);
        return value;
    }

    public void setComparator(Comparator<?> comparator) {
        getStateHelper().put(Properties.comparator, comparator);
    }


    public Filter<?> getFilter() {
        Filter<?> value = (Filter<?>) getStateHelper().eval(Properties.filter);
        return value;
    }

    public void setFilter(Filter<?> filter) {
        getStateHelper().put(Properties.filter, filter);
    }


    public String getFilterConverterMessage() {
        String value = (String) getStateHelper().eval(Properties.filterConverterMessage);
        return value;
    }

    public void setFilterConverterMessage(String filterConverterMessage) {
        getStateHelper().put(Properties.filterConverterMessage, filterConverterMessage);
    }


    public Object getFilterExpression() {
        Object value = (Object) getStateHelper().eval(Properties.filterExpression);
        return value;
    }

    public void setFilterExpression(Object filterExpression) {
        getStateHelper().put(Properties.filterExpression, filterExpression);
    }


    public String getFilterType() {
        String value = (String) getStateHelper().eval(Properties.filterType, "string");
        return value;
    }

    public void setFilterType(String filterType) {
        getStateHelper().put(Properties.filterType, filterType);
    }


    public Object getFilterValue() {
        Object value = (Object) getStateHelper().eval(Properties.filterValue);
        return value;
    }

    public void setFilterValue(Object filterValue) {
        getStateHelper().put(Properties.filterValue, filterValue);
    }


    public String getFooterClass() {
        String value = (String) getStateHelper().eval(Properties.footerClass);
        return value;
    }

    public void setFooterClass(String footerClass) {
        getStateHelper().put(Properties.footerClass, footerClass);
    }


    public String getHeaderClass() {
        String value = (String) getStateHelper().eval(Properties.headerClass);
        return value;
    }

    public void setHeaderClass(String headerClass) {
        getStateHelper().put(Properties.headerClass, headerClass);
    }


    public String getName() {
        String value = (String) getStateHelper().eval(Properties.name);
        return value;
    }

    public void setName(String name) {
        getStateHelper().put(Properties.name, name);
    }


    public int getRowspan() {
        Integer value = (Integer) getStateHelper().eval(Properties.rowspan, Integer.MIN_VALUE);
        return value;
    }

    public void setRowspan(int rowspan) {
        getStateHelper().put(Properties.rowspan, rowspan);
    }


    public Object getSortBy() {
        Object value = (Object) getStateHelper().eval(Properties.sortBy);
        return value;
    }

    public void setSortBy(Object sortBy) {
        getStateHelper().put(Properties.sortBy, sortBy);
    }


    public SortOrder getSortOrder() {
        SortOrder value = (SortOrder) getStateHelper().eval(Properties.sortOrder);
        return value;
    }

    public void setSortOrder(SortOrder sortOrder) {
        getStateHelper().put(Properties.sortOrder, sortOrder);
    }


    public String getSortType() {
        String value = (String) getStateHelper().eval(Properties.sortType, "string");
        return value;
    }

    public void setSortType(String sortType) {
        getStateHelper().put(Properties.sortType, sortType);
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


    public String getSubmittedFilterValue() {
        String value = (String) getStateHelper().eval(Properties.submittedFilterValue);
        return value;
    }

    public void setSubmittedFilterValue(String submittedFilterValue) {
        getStateHelper().put(Properties.submittedFilterValue, submittedFilterValue);
    }


    public String getWidth() {
        String value = (String) getStateHelper().eval(Properties.width);
        return value;
    }

    public void setWidth(String width) {
        getStateHelper().put(Properties.width, width);
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

    protected enum Properties {
        breakRowBefore,
        colspan,
        comparator,
        filter,
        filterConverterMessage,
        filterExpression,
        filterType,
        filterValue,
        footerClass,
        headerClass,
        name,
        rowspan,
        sortBy,
        sortOrder,
        sortType,
        style,
        styleClass,
        submittedFilterValue,
        width

    }


}
