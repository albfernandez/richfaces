package org.richfaces.renderkit.html;

import org.richfaces.component.AbstractPlaceholder;
import org.richfaces.renderkit.PlaceholderRendererBase;
import org.richfaces.renderkit.RenderKitUtils.Attributes;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.richfaces.renderkit.RenderKitUtils.addToScriptHash;
import static org.richfaces.renderkit.RenderKitUtils.attributes;
import static org.richfaces.renderkit.RenderKitUtils.toScriptArgs;


public class PlaceholderRenderer extends PlaceholderRendererBase {

    private static final Attributes ATTRIBUTES_FOR_SCRIPT_HASH4 = attributes()
            .generic("styleClass", "styleClass");


    private static String convertToString(Object object) {
        return object != null ? object.toString() : "";
    }

    private static boolean isEmpty(Object object) {
        if (object == null) {
            return true;
        } else if (object.getClass().isArray()) {
            return ((Object[]) object).length == 0;
        } else if (object instanceof java.util.Collection) {
            return ((java.util.Collection<?>) object).isEmpty();
        } else if (object instanceof Map) {
            return ((Map<?, ?>) object).isEmpty();
        } else {
            return object.toString().length() == 0;
        }
    }

    @Override
    public void doEncodeEnd(ResponseWriter responseWriter, FacesContext facesContext, UIComponent uiComponent)
            throws IOException {
        AbstractPlaceholder component = (AbstractPlaceholder) uiComponent;
        String clientId = component.getClientId(facesContext);
        responseWriter.startElement("span", component);
        {
            String value = clientId;
            if (null != value &&
                    value.length() > 0
            ) {
                responseWriter.writeAttribute("id", value, null);
            }

        }


        responseWriter.startElement("script", component);
        {
            String value = convertToString(clientId) + "Script";
            if (null != value &&
                    value.length() > 0
            ) {
                responseWriter.writeAttribute("id", value, null);
            }

        }

        responseWriter.writeAttribute("type", "text/javascript", null);


        Map<String, Object> options = new LinkedHashMap<String, Object>();


        addToScriptHash(options, facesContext, component, ATTRIBUTES_FOR_SCRIPT_HASH4, null);
        addToScriptHash(options, "targetId", (isEmpty(component.getSelector()) ? component.getParent().getClientId() : null), null, null);

        addToScriptHash(options, "selector", ((!isEmpty(component.getSelector())) ? component.getSelector() : null), null, null);

        addToScriptHash(options, "text", this.getConvertedValue(facesContext, component), null, null);


        {
            Object text = "new RichFaces.ui.Placeholder(\"" + convertToString(clientId) + "\", " + convertToString(toScriptArgs(options)) + ");";
            if (text != null) {
                responseWriter.writeText(text, null);
            }
        }

        responseWriter.endElement("script");
        responseWriter.endElement("span");

    }
}
