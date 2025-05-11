package org.richfaces.demo.tables;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.richfaces.component.SortOrder;

import jakarta.faces.context.FacesContext;
import jakarta.faces.event.ValueChangeEvent;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;

@Named
@ViewScoped
public class CarsSortingBean implements Serializable {
    private static final long serialVersionUID = 1L;
    private Map<String, SortOrder> sortsOrders;
    private List<String> sortPriorities;

    private boolean multipleSorting = false;

    private static final String SORT_PROPERTY_PARAMETER = "sortProperty";

    public CarsSortingBean() {
        sortsOrders = new HashMap<String, SortOrder>();
        sortPriorities = new ArrayList<String>();
    }

    public void sort() {
        String property = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap()
            .get(SORT_PROPERTY_PARAMETER);
        if (property != null) {
            SortOrder currentPropertySortOrder = sortsOrders.get(property);
            if (multipleSorting) {
                if (!sortPriorities.contains(property)) {
                    sortPriorities.add(property);
                }
            } else {
                sortsOrders.clear();
            }
            if (currentPropertySortOrder == null || currentPropertySortOrder.equals(SortOrder.descending)) {
                sortsOrders.put(property, SortOrder.ascending);
            } else {
                sortsOrders.put(property, SortOrder.descending);
            }
        }
    }

    public void modeChanged(ValueChangeEvent event) {
        reset();
    }

    public void reset() {
        sortPriorities.clear();
        sortsOrders.clear();
    }

    public boolean isMultipleSorting() {
        return multipleSorting;
    }

    public void setMultipleSorting(boolean multipleSorting) {
        this.multipleSorting = multipleSorting;
    }

    public List<String> getSortPriorities() {
        return sortPriorities;
    }

    public Map<String, SortOrder> getSortsOrders() {
        return sortsOrders;
    }
}
