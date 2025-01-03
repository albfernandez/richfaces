package org.richfaces.demo.model.person;

import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.convert.Converter;
import jakarta.faces.convert.FacesConverter;

/**
 * Created by bleathem on 15/08/14.
 */
@FacesConverter("PersonConverter")
public class PersonConverter implements Converter {
    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        return Person.peopleMap.get(value);
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        return value == null ? null : String.valueOf(((Person) value).getId());
    }
}
