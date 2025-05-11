package org.richfaces.demo.validation;

import jakarta.faces.application.FacesMessage;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.validator.FacesValidator;
import jakarta.faces.validator.Validator;
import jakarta.faces.validator.ValidatorException;

import org.jsoup.Jsoup;
import org.jsoup.safety.Safelist;

@FacesValidator("safeHtml")
public class SafeHtmlValidator implements Validator {

    private static Safelist safelist = Safelist.simpleText();

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        if (value != null) {
            if (!Jsoup.isValid(value.toString(), safelist)) {
                FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_WARN, "message contains unsafe character sequence", "");
                throw new ValidatorException(message);
            }
        }
    }
}
