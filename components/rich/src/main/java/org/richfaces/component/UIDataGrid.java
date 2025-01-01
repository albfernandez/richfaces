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
import org.richfaces.component.attribute.CoreProps;
import org.richfaces.component.attribute.IterationProps;
import org.richfaces.component.attribute.RowColumnStyleProps;
import org.richfaces.component.attribute.SequenceProps;

import javax.annotation.Generated;
import javax.el.ValueExpression;
import javax.faces.component.UIComponent;
import java.util.ArrayList;
import java.util.List;

/**
 * <p> The &lt;rich:dataGrid&gt; component is used to arrange data objects in a grid. Values in the grid can be updated
 * dynamically from the data model, and Ajax updates can be limited to specific rows. The component supports header,
 * footer, and caption facets. </p>
 *
 * @author Anton Belevich
 **/
@Generated({"RichFaces CDK", "4.5.0-SNAPSHOT"})
public class UIDataGrid extends AbstractDataGrid
        implements MetaComponentEncoder, MetaComponentResolver, Row, ColumnProps, CoreProps, IterationProps, RowColumnStyleProps, SequenceProps {

    public static final String COMPONENT_TYPE = "org.richfaces.DataGrid";

    public static final String COMPONENT_FAMILY = "org.richfaces.Data";
    private static final String ATTRIBUTES_THAT_ARE_SET_KEY = "javax.faces.component.UIComponentBase.attributesThatAreSet";

    public UIDataGrid() {
        super();
        setRendererType("org.richfaces.DataGridRenderer");
    }

    @Override
    public String getFamily() {
        return COMPONENT_FAMILY;
    }

    public String getColumnClasses() {
        String value = (String) getStateHelper().eval(Properties.columnClasses);
        return value;
    }

    public void setColumnClasses(String columnClasses) {
        getStateHelper().put(Properties.columnClasses, columnClasses);
    }


    public int getElements() {
        Integer value = (Integer) getStateHelper().eval(Properties.elements, Integer.MIN_VALUE);
        return value;
    }

    public void setElements(int elements) {
        getStateHelper().put(Properties.elements, elements);
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


    public String getRowClasses() {
        String value = (String) getStateHelper().eval(Properties.rowClasses);
        return value;
    }

    public void setRowClasses(String rowClasses) {
        getStateHelper().put(Properties.rowClasses, rowClasses);
    }


    public int getRows() {
        Integer value = (Integer) getStateHelper().eval(Properties.rows, Integer.MIN_VALUE);
        return value;
    }

    public void setRows(int rows) {
        getStateHelper().put(Properties.rows, rows);
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

    public UIComponent getCaption() {
        return getFacet("caption");
    }

    public void setCaption(UIComponent facet) {
        getFacets().put("caption", facet);
    }

    public UIComponent getNoData() {
        return getFacet("noData");
    }

    public void setNoData(UIComponent facet) {
        getFacets().put("noData", facet);
    }

    protected enum Properties {
        columnClasses,
        elements,
        footerClass,
        headerClass,
        rowClasses,
        rows,
        style,
        styleClass,
        title

    }


}
