package org.richfaces.demo.lists;

import org.richfaces.demo.tables.model.capitals.Capital;

import jakarta.faces.bean.ManagedBean;
import jakarta.faces.bean.ManagedProperty;
import jakarta.faces.bean.RequestScoped;
import java.util.List;

@ManagedBean
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
