package org.richfaces.demo.inplaces;

import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import org.richfaces.demo.tables.model.capitals.Capital;

import javax.annotation.PostConstruct;
import jakarta.faces.bean.ManagedBean;
import jakarta.faces.bean.ManagedProperty;
import jakarta.faces.bean.RequestScoped;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.model.SelectItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@ManagedBean
@RequestScoped
public class InplaceSelectBean {
    @ManagedProperty(value = "#{capitalsParser.capitalsList}")
    private List<Capital> capitals;
    private List<SelectItem> capitalsOptions = null;
    private String value;

    @PostConstruct
    public void init() {
        capitalsOptions = new ArrayList<SelectItem>();
        for (Capital capital : capitals) {
            capitalsOptions.add(new SelectItem(capital.getName(), capital.getState()));
        }
    }

    public Collection<Capital> autocomplete(FacesContext facesContext, UIComponent component, final String prefix) {
        Collection<Capital> persons = Collections2.filter(capitals, new Predicate<Capital>() {
            @Override
            public boolean apply(Capital capital) {
                if (prefix == null) {
                    return true;
                }
                return capital.getState().toLowerCase().startsWith(prefix.toLowerCase());
            }
        });
        return persons;
    }

    public List<SelectItem> getCapitalsOptions() {
        return capitalsOptions;
    }

    public void setCapitalsOptions(List<SelectItem> capitalsOptions) {
        this.capitalsOptions = capitalsOptions;
    }

    public void setCapitals(List<Capital> capitals) {
        this.capitals = capitals;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
