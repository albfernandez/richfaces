package org.richfaces.renderkit.html;

import org.richfaces.renderkit.DragIndicatorRendererBase;

import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.context.ResponseWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.richfaces.renderkit.RenderKitUtils.addToScriptHash;
import static org.richfaces.renderkit.RenderKitUtils.toScriptArgs;


public class DragIndicatorRenderer extends DragIndicatorRendererBase {


    private static String convertToString(Object object) {
        return object != null ? object.toString() : "";
    }

    @Override
    public void doEncodeBegin(ResponseWriter responseWriter, FacesContext facesContext, UIComponent component)
            throws IOException {
        String clientId = component.getClientId(facesContext);
        responseWriter.startElement("div", component);
        {
            String value = "rf-ind " + convertToString(component.getAttributes().get("styleClass"));
            if (null != value &&
                    value.length() > 0
            ) {
                responseWriter.writeAttribute("class", value, null);
            }

        }

        {
            String value = clientId;
            if (null != value &&
                    value.length() > 0
            ) {
                responseWriter.writeAttribute("id", value, null);
            }

        }

        responseWriter.writeAttribute("style", "display: none;", null);


    }

    @Override
    public void doEncodeEnd(ResponseWriter responseWriter, FacesContext facesContext, UIComponent component)
            throws IOException {
        String clientId = component.getClientId(facesContext);
        Map<String, Object> options = new LinkedHashMap<String, Object>();
        addToScriptHash(options, "acceptClass", this.concatClasses("rf-ind-acpt", component.getAttributes().get("acceptClass")), null, null);

        addToScriptHash(options, "rejectClass", this.concatClasses("rf-ind-rejt", component.getAttributes().get("rejectClass")), null, null);

        addToScriptHash(options, "draggingClass", this.concatClasses("rf-ind-drag", component.getAttributes().get("draggingClass")), null, null);


        responseWriter.startElement("script", component);
        responseWriter.writeAttribute("type", "text/javascript", null);


        {
            Object text = "new RichFaces.ui.DragIndicator(\"" + convertToString(clientId) + "\", " + convertToString(toScriptArgs(options)) + ");";
            if (text != null) {
                responseWriter.writeText(text, null);
            }
        }

        responseWriter.endElement("script");
        responseWriter.endElement("div");

    }
}
