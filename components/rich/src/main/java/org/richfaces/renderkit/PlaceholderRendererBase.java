package org.richfaces.renderkit;

import java.io.IOException;

import jakarta.faces.application.ResourceDependencies;
import jakarta.faces.application.ResourceDependency;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.context.ResponseWriter;
import jakarta.faces.convert.Converter;

import org.richfaces.component.AbstractPlaceholder;
import org.richfaces.component.util.InputUtils;

@ResourceDependencies({ @ResourceDependency(library = "jakarta.faces", name = "jsf.js"),
        @ResourceDependency(library = "org.richfaces", name = "jquery.js"),
        @ResourceDependency(library = "org.richfaces", name = "richfaces.js"),
        @ResourceDependency(library = "org.richfaces", name = "richfaces-base-component.js"),
        @ResourceDependency(name = "placeholder.js", library = "org.richfaces", target = "head"),
        @ResourceDependency(name = "placeholder.css", library = "org.richfaces") })
public abstract class PlaceholderRendererBase extends RendererBase {

    public static final String RENDERER_TYPE = "org.richfaces.PlaceholderRenderer";

    @Override
    public void doEncodeEnd(ResponseWriter writer, FacesContext context, UIComponent component) throws IOException {
        // needed for compilation
    }

    @Override
    public boolean isAlreadyRendered(UIComponent component) {
        AbstractPlaceholder placeholder = (AbstractPlaceholder) component;

        // skip direct rendering for nested usage (workaround for RF-12589)
        return placeholder.getSelector() == null || placeholder.getSelector().isEmpty();
    }

    public String getConvertedValue(FacesContext facesContext, AbstractPlaceholder placeholder) {
        final Object value = placeholder.getValue();

        Converter converter = InputUtils.findConverter(facesContext, placeholder, "value");

        if (converter != null) {
            return converter.getAsString(facesContext, placeholder, value);
        } else {
            return value != null ? value.toString() : "";
        }
    }
}
