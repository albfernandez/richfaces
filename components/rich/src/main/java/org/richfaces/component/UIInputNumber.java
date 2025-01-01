/**
 *
 */
package org.richfaces.component;

import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.validator.DoubleRangeValidator;
import javax.faces.validator.ValidatorException;
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
