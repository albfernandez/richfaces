package org.richfaces.renderkit;

import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;

public class AbstractAutocompleteLayoutStrategy {
    public String getContainerElementId(FacesContext facesContext, UIComponent component) {
        return component.getClientId(facesContext) + "Items";
    }
}
