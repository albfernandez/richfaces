package org.richfaces.demo.validation;

import java.io.Serializable;

import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Named;
import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Size;

@Named
@SessionScoped
public class PasswordValidationBean implements Cloneable, Serializable {
    private static final long serialVersionUID = 1952428504080910113L;
    @Size(min = 5, max = 15, message = "Password length must be between {min} and {max} characters.")
    private String password = "";
    private String confirm = "";

    @AssertTrue(message = "Different passwords entered!")
    public boolean isPasswordsEquals() {
        return password.equals(confirm);
    }

    public void storeNewPassword() {
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_INFO, "Successfully changed!", "Successfully changed!"));
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setConfirm(String confirm) {
        this.confirm = confirm;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirm() {
        return confirm;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
