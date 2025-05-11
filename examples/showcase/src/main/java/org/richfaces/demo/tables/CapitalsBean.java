package org.richfaces.demo.tables;

import java.io.Serializable;
import java.util.List;

import org.richfaces.demo.tables.model.capitals.Capital;

import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.annotation.ManagedProperty;
import jakarta.inject.Named;

@Named
@SessionScoped
public class CapitalsBean implements Serializable {
    private static final long serialVersionUID = -1509108399715814302L;
    @ManagedProperty(value = "#{capitalsParser.capitalsList}")
    private List<Capital> capitals;

    public List<Capital> getCapitals() {
        return capitals;
    }

    public void setCapitals(List<Capital> capitals) {
        this.capitals = capitals;
    }
}
