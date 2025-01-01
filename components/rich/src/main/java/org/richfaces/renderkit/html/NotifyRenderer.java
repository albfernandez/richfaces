package org.richfaces.renderkit.html;

import org.richfaces.renderkit.RenderKitUtils.Attributes;
import org.richfaces.renderkit.RenderKitUtils.ScriptHashVariableWrapper;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.richfaces.renderkit.NotifyRendererUtils.addFacetOrAttributeAsOption;
import static org.richfaces.renderkit.NotifyRendererUtils.addStackIdOption;
import static org.richfaces.renderkit.RenderKitUtils.addToScriptHash;
import static org.richfaces.renderkit.RenderKitUtils.attributes;
import static org.richfaces.renderkit.RenderKitUtils.toScriptArgs;


public class NotifyRenderer extends NotifyRendererBase {

    private static final Attributes ATTRIBUTES_FOR_SCRIPT_HASH5 = attributes()
            .generic("position", "position")


            .generic("sticky", "sticky")
            .defaultValue(false)

            .generic("stayTime", "stayTime")


            .generic("delay", "delay")


            .generic("styleClass", "styleClass")


            .generic("appearAnimation", "appearAnimation")


            .generic("hideAnimation", "hideAnimation")


            .generic("animationSpeed", "animationSpeed")


            .generic("showHistory", "showHistory")


            .generic("nonblocking", "nonblocking")
            .defaultValue(false)

            .generic("showShadow", "showShadow")
            .defaultValue(false)

            .generic("showCloseButton", "showCloseButton")
            .defaultValue(true)

            .generic("nonblockingOpacity", "nonblockingOpacity");

    private static final Attributes ATTRIBUTES_FOR_SCRIPT_HASH6 = attributes()
            .generic("onclick", "onclick", "click")


            .generic("ondblclick", "ondblclick", "dblclick")


            .generic("onkeydown", "onkeydown", "keydown")


            .generic("onkeypress", "onkeypress", "keypress")


            .generic("onkeyup", "onkeyup", "keyup")


            .generic("onmousedown", "onmousedown", "mousedown")


            .generic("onmousemove", "onmousemove", "mousemove")


            .generic("onmouseout", "onmouseout", "mouseout")


            .generic("onmouseover", "onmouseover", "mouseover")


            .generic("onmouseup", "onmouseup", "mouseup");


    private static String convertToString(Object object) {
        return object != null ? object.toString() : "";
    }

    @Override
    public void doEncodeEnd(ResponseWriter responseWriter, FacesContext facesContext, UIComponent component)
            throws IOException {
        String clientId = component.getClientId(facesContext);
        responseWriter.startElement("span", component);
        responseWriter.writeAttribute("class", "rf-ntf-span", null);

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


        addToScriptHash(options, facesContext, component, ATTRIBUTES_FOR_SCRIPT_HASH5, null);


        addToScriptHash(options, facesContext, component, ATTRIBUTES_FOR_SCRIPT_HASH6, ScriptHashVariableWrapper.eventHandler);

        addStackIdOption(options, facesContext, component);
        addFacetOrAttributeAsOption("summary", options, facesContext, component);
        addFacetOrAttributeAsOption("detail", options, facesContext, component);
        {
            Object text = "RichFaces.ui.Notify(" + convertToString(toScriptArgs(options)) + ");";
            if (text != null) {
                responseWriter.writeText(text, null);
            }
        }

        responseWriter.endElement("script");
        responseWriter.endElement("span");

    }
}
