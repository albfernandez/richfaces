/**
 *
 */
package org.richfaces.component;

import jakarta.faces.component.UIComponent;
import jakarta.faces.component.UIInput;
import jakarta.faces.context.FacesContext;
import jakarta.faces.validator.DoubleRangeValidator;
import jakarta.faces.validator.ValidatorException;
import java.util.Map;

/**
 * @author Konstantin Mishin
 */
public class UIInputNumber extends UIInput {
    private static double doubleValue(Object value) {
        if (value instanceof Number) {
            return ((Number) value).doubleValue();
        } else {
            return Double.parseDouble(value.toString());
        }
    }

    @Override
    protected void validateValue(FacesContext context, Object newValue) {
        Map<String, Object> attributes = getAttributes();
        DoubleRangeValidator validator = new DoubleRangeValidator(doubleValue(attributes.get("maxValue")),
                doubleValue(attributes.get("minValue"))) {
            @Override
            public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
                super.validate(context, component, UIInputNumber.this.getSubmittedValue());
            }
        };
        addValidator(validator);
        super.validateValue(context, newValue);
        removeValidator(validator);
    }
}
