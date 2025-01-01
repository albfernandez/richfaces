package org.richfaces.renderkit.focus;

import org.richfaces.component.AbstractFocus;

import javax.faces.context.FacesContext;

public interface FocusRendererInterface {
    void postAddToView(FacesContext context, AbstractFocus component);
}
