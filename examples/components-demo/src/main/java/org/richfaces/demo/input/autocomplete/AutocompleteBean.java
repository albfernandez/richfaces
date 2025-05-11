package org.richfaces.demo.input.autocomplete;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import org.richfaces.demo.model.person.Person;

import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;

import jakarta.enterprise.context.RequestScoped;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Named;

@Named
@RequestScoped
public class AutocompleteBean implements Serializable {

	private static final long serialVersionUID = 7029646394934680537L;
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
            @Override
            public boolean test(Person input) {
                return apply(input);
            }
        });
    }

}
