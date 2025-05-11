package org.richfaces.demo.lists;

import java.util.List;

import org.richfaces.demo.tables.model.capitals.Capital;

import jakarta.enterprise.context.RequestScoped;
import jakarta.faces.annotation.ManagedProperty;
import jakarta.inject.Named;

@Named
@RequestScoped
public class ListSelectBean {
    @ManagedProperty(value = "#{capitalsParser.capitalsList}")
    private List<Capital> capitals;
    private List<Capital> selectedCapitals;

    public List<Capital> getCapitals() {
        return capitals;
    }

    public void setCapitals(List<Capital> capitals) {
        this.capitals = capitals;
    }

    public List<Capital> getSelectedCapitals() {
        return selectedCapitals;
    }

    public void setSelectedCapitals(List<Capital> selectedCapitals) {
        this.selectedCapitals = selectedCapitals;
    }
}
