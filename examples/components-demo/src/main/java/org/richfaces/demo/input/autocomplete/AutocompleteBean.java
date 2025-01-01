package org.richfaces.demo.input.autocomplete;

import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import org.richfaces.demo.model.person.Person;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;

@ManagedBean
@RequestScoped
public class AutocompleteBean implements Serializable {

    private Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public List<Person> getPeople() {
        return Person.people;
    }

    public Collection<Person> suggest(FacesContext facesContext, UIComponent component, final String prefix) {
        return Collections2.filter(Person.people, new Predicate<Person>() {
            @Override
            public boolean apply(Person input) {
                if (prefix == null) {
                    return true;
                }
                return input.getName().toLowerCase().startsWith(prefix.toLowerCase());
            }
        });
    }

}
