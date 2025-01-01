package org.richfaces.renderkit.html;

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


public class NotifyStackRenderer extends NotifyStackRendererBase {

    private static final Attributes ATTRIBUTES_FOR_SCRIPT_HASH35 = attributes()
            .generic("styleClass", "styleClass")


            .generic("position", "position")


            .generic("method", "method")


            .generic("direction", "direction");


    private static String convertToString(Object object) {
        return object != null ? object.toString() : "";
    }

    @Override
    public void doEncodeEnd(ResponseWriter responseWriter, FacesContext facesContext, UIComponent component)
            throws IOException {
        String clientId = component.getClientId(facesContext);
        responseWriter.startElement("span", component);
        responseWriter.writeAttribute("class", "rf-ntf-stck", null);

        {
            String value = clientId;
            if (null != value &&
                    value.length() > 0
            ) {
                responseWriter.writeAttribute("id", value, null);
            }

        }


        responseWriter.startElement("script", component);
        responseWriter.writeAttribute("type", "text/javascript", null);


        Map<String, Object> options = new LinkedHashMap<String, Object>();


        addToScriptHash(options, facesContext, component, ATTRIBUTES_FOR_SCRIPT_HASH35, null);

        {
            Object text = "new RichFaces.ui.NotifyStack(" + convertToString(toScriptArgs(clientId, options)) + ");";
            if (text != null) {
                responseWriter.writeText(text, null);
            }
        }

        responseWriter.endElement("script");
        responseWriter.endElement("span");

    }
}
