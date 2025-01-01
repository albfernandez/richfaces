package org.richfaces.renderkit.html;

import org.richfaces.component.JQueryAttachType;
import org.richfaces.component.JQueryTiming;
import org.richfaces.renderkit.JQueryRendererBase;
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


public class JQueryRenderer extends JQueryRendererBase {

    private static final Attributes ATTRIBUTES_FOR_SCRIPT_HASH39 = attributes()
            .generic("event", "event")


            .generic("query", "query");


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
    public void encodeEnd(FacesContext facesContext, UIComponent component)
            throws IOException {
        ResponseWriter responseWriter = facesContext.getResponseWriter();
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

        responseWriter.writeAttribute("style", "display: none;", null);


        responseWriter.startElement("script", component);
        responseWriter.writeAttribute("type", "text/javascript", null);


        Object functionName = (Object) component.getAttributes().get("name");
        Map<String, Object> options = new LinkedHashMap<String, Object>();
        addToScriptHash(options, "selector", this.getEscapedSelector(facesContext, component), null, null);


        addToScriptHash(options, facesContext, component, ATTRIBUTES_FOR_SCRIPT_HASH39, null);
        addToScriptHash(options, "attachType", component.getAttributes().get("attachType"), JQueryAttachType.DEFAULT, null);

        addToScriptHash(options, "timing", component.getAttributes().get("timing"), JQueryTiming.DEFAULT, null);


        if ((!isEmpty(functionName))) {
            {
                Object text = convertToString(functionName) + " = RichFaces.ui.jQueryComponent.createFunction(" + convertToString(toScriptArgs(options)) + ");";
                if (text != null) {
                    responseWriter.writeText(text, null);
                }
            }

        } else {
            {
                Object text = "RichFaces.ui.jQueryComponent.query(" + convertToString(toScriptArgs(options)) + ");";
                if (text != null) {
                    responseWriter.writeText(text, null);
                }
            }

        }
        responseWriter.endElement("script");
        responseWriter.endElement("span");

    }

    @Override
    public boolean getRendersChildren() {
        return true;
    }
}
