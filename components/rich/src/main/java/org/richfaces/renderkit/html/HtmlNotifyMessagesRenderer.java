package org.richfaces.renderkit.html;

import org.richfaces.renderkit.NotifyMessageRendererBase;
import org.richfaces.renderkit.RenderKitUtils.Attributes;
import org.richfaces.renderkit.RenderKitUtils.ScriptHashVariableWrapper;

import jakarta.faces.application.ResourceDependencies;
import jakarta.faces.application.ResourceDependency;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.context.ResponseWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.richfaces.renderkit.NotifyRendererUtils.addStackIdOption;
import static org.richfaces.renderkit.RenderKitUtils.addToScriptHash;
import static org.richfaces.renderkit.RenderKitUtils.attributes;
import static org.richfaces.renderkit.RenderKitUtils.renderPassThroughAttributes;


@ResourceDependencies({@ResourceDependency(name = "jsf.js", library = "javax.faces", target = ""), @ResourceDependency(name = "jquery.js", library = "org.richfaces", target = ""), @ResourceDependency(name = "richfaces.js", library = "org.richfaces", target = ""), @ResourceDependency(name = "richfaces-base-component.js", library = "org.richfaces", target = ""), @ResourceDependency(name = "richfaces-event.js", library = "org.richfaces", target = ""), @ResourceDependency(name = "notifyMessage.js", library = "org.richfaces", target = ""), @ResourceDependency(name = "jquery.pnotify.js", library = "org.richfaces", target = ""), @ResourceDependency(name = "notify.js", library = "org.richfaces", target = ""), @ResourceDependency(name = "notifyStack.js", library = "org.richfaces", target = ""), @ResourceDependency(name = "notify.ecss", library = "org.richfaces", target = "")})
public class HtmlNotifyMessagesRenderer extends NotifyMessageRendererBase {

    private static final Attributes PASS_THROUGH_ATTRIBUTES36 = attributes()
            .generic("onclick", "onclick", "click")


            .generic("ondblclick", "ondblclick", "dblclick")


            .generic("onkeydown", "onkeydown", "keydown")


            .generic("onkeypress", "onkeypress", "keypress")


            .generic("onkeyup", "onkeyup", "keyup")


            .generic("onmousedown", "onmousedown", "mousedown")


            .generic("onmousemove", "onmousemove", "mousemove")


            .generic("onmouseout", "onmouseout", "mouseout")


            .generic("onmouseover", "onmouseover", "mouseover")


            .generic("onmouseup", "onmouseup", "mouseup")


            .generic("role", "role");

    private static final Attributes ATTRIBUTES_FOR_SCRIPT_HASH29 = attributes()
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

            .generic("nonblockingOpacity", "nonblockingOpacity")


            .generic("dir", "dir")


            .generic("lang", "lang")


            .generic("style", "style")


            .generic("title", "title");

    private static final Attributes ATTRIBUTES_FOR_SCRIPT_HASH30 = attributes()
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
        {
            String value = "rf-ntf-msgs " + convertToString(component.getAttributes().get("styleClass"));
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


        renderPassThroughAttributes(facesContext, component,
                PASS_THROUGH_ATTRIBUTES36);

        Map<String, Object> options = new LinkedHashMap<String, Object>();


        addToScriptHash(options, facesContext, component, ATTRIBUTES_FOR_SCRIPT_HASH29, null);


        addToScriptHash(options, facesContext, component, ATTRIBUTES_FOR_SCRIPT_HASH30, ScriptHashVariableWrapper.eventHandler);

        addStackIdOption(options, facesContext, component);
        encodeScript(facesContext, component, options);
        encodeNotification(facesContext, component, options);
        responseWriter.endElement("span");

    }
}
