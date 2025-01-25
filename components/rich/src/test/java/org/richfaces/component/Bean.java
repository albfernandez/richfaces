package org.richfaces.component;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

import java.io.Serializable;

@SessionScoped
@Named("test")
public class Bean implements Serializable {
    public static final String FOO_VALUE = "fooValue";
    private String value = FOO_VALUE;

    /**
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(String value) {
        this.value = value;
    }
}
