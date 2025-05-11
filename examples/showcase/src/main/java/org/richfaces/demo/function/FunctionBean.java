package org.richfaces.demo.function;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named("functionBean")
@RequestScoped
public class FunctionBean {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
