package org.richfaces.renderkit.focus;

import jakarta.faces.context.FacesContext;

import org.richfaces.component.AbstractFocus;

public interface FocusRendererInterface {
    void postAddToView(FacesContext context, AbstractFocus component);
}
