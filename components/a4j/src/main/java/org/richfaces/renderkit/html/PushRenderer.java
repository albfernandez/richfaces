package org.richfaces.renderkit.html;

import org.richfaces.renderkit.PushRendererBase;
import org.richfaces.renderkit.RenderKitUtils.Attributes;
import org.richfaces.renderkit.RenderKitUtils.ScriptHashVariableWrapper;

import javax.faces.application.ResourceDependencies;
import javax.faces.application.ResourceDependency;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.richfaces.renderkit.RenderKitUtils.addToScriptHash;
import static org.richfaces.renderkit.RenderKitUtils.attributes;
import static org.richfaces.renderkit.RenderKitUtils.toScriptArgs;


@ResourceDependencies({@ResourceDependency(name = "jsf.js", library = "javax.faces", target = ""), @ResourceDependency(name = "jquery.js", library = "org.richfaces", target = ""), @ResourceDependency(name = "richfaces.js", library = "org.richfaces", target = ""), @ResourceDependency(name = "richfaces-queue.reslib", library = "org.richfaces", target = ""), @ResourceDependency(name = "richfaces-base-component.js", library = "org.richfaces", target = ""), @ResourceDependency(name = "richfaces-event.js", library = "org.richfaces", target = ""), @ResourceDependency(name = "atmosphere.js", library = "net.java.dev.atmosphere", target = ""), @ResourceDependency(name = "push.js", library = "org.richfaces", target = "")})
public class PushRenderer extends PushRendererBase {

    private static final Attributes ATTRIBUTES_FOR_SCRIPT_HASH2 = attributes()
            .generic("address", "address");

    private static final Attributes ATTRIBUTES_FOR_SCRIPT_HASH3 = attributes()
            .generic("push", "ondataavailable", "dataavailable")


            .generic("subscribed", "onsubscribed", "subscribed")


            .generic("error", "onerror", "error");


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
        } else if (object instanceof java.util.Map) {
            return ((java.util.Map<?, ?>) object).isEmpty();
        } else {
            return object.toString().length() == 0;
        }
    }

    @Override
    public void doEncodeEnd(ResponseWriter responseWriter, FacesContext facesContext, UIComponent component)
            throws IOException {
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
        responseWriter.writeAttribute("type", "text/javascript", null);


        if (this.shouldEncodePushUrl(facesContext)) {
            {
                Object text = "RichFaces.push.setPushResourceUrl(\"" + convertToString(this.getPushResourceUrl(facesContext)) + "\");";
                if (text != null) {
                    responseWriter.writeText(text, null);
                }
            }

            String pushHandlerUrl = (String) this.getPushHandlerUrl(facesContext);
            if ((!isEmpty(pushHandlerUrl))) {
                {
                    Object text = "RichFaces.push.setPushHandlerUrl(\"" + convertToString(pushHandlerUrl) + "\");";
                    if (text != null) {
                        responseWriter.writeText(text, null);
                    }
                }

            }
        }
        Map<String, Object> options = new LinkedHashMap<String, Object>();


        addToScriptHash(options, facesContext, component, ATTRIBUTES_FOR_SCRIPT_HASH2, null);


        addToScriptHash(options, facesContext, component, ATTRIBUTES_FOR_SCRIPT_HASH3, ScriptHashVariableWrapper.eventHandler);

        {
            Object text = "RichFaces.jQuery(document.getElementById('" + convertToString(clientId) + "')).richpush(" + convertToString(toScriptArgs(options)) + ");";
            if (text != null) {
                responseWriter.writeText(text, null);
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
