package org.richfaces.renderkit.html;

import org.richfaces.renderkit.HotKeyRendererBase;
import org.richfaces.renderkit.RenderKitUtils.Attributes;
import org.richfaces.renderkit.RenderKitUtils.ScriptHashVariableWrapper;

import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.context.ResponseWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.richfaces.renderkit.RenderKitUtils.addToScriptHash;
import static org.richfaces.renderkit.RenderKitUtils.attributes;
import static org.richfaces.renderkit.RenderKitUtils.toScriptArgs;


public class HotKeyRenderer extends HotKeyRendererBase {

    private static final Attributes ATTRIBUTES_FOR_SCRIPT_HASH9 = attributes()
            .generic("key", "key")


            .generic("enabledInInput", "enabledInInput")
            .defaultValue(false)

            .generic("preventDefault", "preventDefault")
            .defaultValue(true);

    private static final Attributes ATTRIBUTES_FOR_SCRIPT_HASH10 = attributes()
            .generic("onkeydown", "onkeydown", "keydown")


            .generic("onkeyup", "onkeyup", "keyup");


    private static String convertToString(Object object) {
        return object != null ? object.toString() : "";
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


        Map<String, Object> options = new LinkedHashMap<String, Object>();


        addToScriptHash(options, facesContext, component, ATTRIBUTES_FOR_SCRIPT_HASH9, null);
        addToScriptHash(options, "selector", this.getEscapedSelector(facesContext, component), null, null);


        addToScriptHash(options, facesContext, component, ATTRIBUTES_FOR_SCRIPT_HASH10, ScriptHashVariableWrapper.eventHandler);

        {
            Object text = "new RichFaces.ui.HotKey(\"" + convertToString(clientId) + "\",  " + convertToString(toScriptArgs(options)) + ");";
            if (text != null) {
                responseWriter.writeText(text, null);
            }
        }

        responseWriter.endElement("script");
        responseWriter.endElement("span");

    }
}
