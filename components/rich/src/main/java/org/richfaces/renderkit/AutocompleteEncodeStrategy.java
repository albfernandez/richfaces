package org.richfaces.renderkit;

import java.io.IOException;

import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;

public interface AutocompleteEncodeStrategy {
    void encodeItemsContainerBegin(FacesContext facesContext, UIComponent component) throws IOException;

    void encodeItemsContainerEnd(FacesContext facesContext, UIComponent component) throws IOException;

    void encodeItemBegin(FacesContext facesContext, UIComponent component) throws IOException;

    void encodeItemEnd(FacesContext facesContext, UIComponent component) throws IOException;

    void encodeItem(FacesContext facesContext, UIComponent component) throws IOException;

    void encodeFakeItem(FacesContext facesContext, UIComponent component) throws IOException;

    String getContainerElementId(FacesContext facesContext, UIComponent component);
}
