package org.richfaces.renderkit.html;

import org.richfaces.renderkit.LogRendererBase;
import org.richfaces.renderkit.RenderKitUtils.Attributes;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.richfaces.renderkit.RenderKitUtils.addToScriptHash;
import static org.richfaces.renderkit.RenderKitUtils.attributes;
import static org.richfaces.renderkit.RenderKitUtils.renderPassThroughAttributes;
import static org.richfaces.renderkit.RenderKitUtils.shouldRenderAttribute;
import static org.richfaces.renderkit.RenderKitUtils.toScriptArgs;


public class AjaxLogRenderer extends LogRendererBase {

    private static final Attributes PASS_THROUGH_ATTRIBUTES3 = attributes()
            .generic("align", "align")


            .generic("dir", "dir")


            .generic("lang", "lang")


            .generic("onclick", "onclick")


            .generic("ondblclick", "ondblclick")


            .generic("onkeydown", "onkeydown")


            .generic("onkeypress", "onkeypress")


            .generic("onkeyup", "onkeyup")


            .generic("onmousedown", "onmousedown")


            .generic("onmousemove", "onmousemove")


            .generic("onmouseout", "onmouseout")


            .generic("onmouseover", "onmouseover")


            .generic("onmouseup", "onmouseup")


            .generic("role", "role")


            .generic("style", "style")


            .generic("title", "title");

    private static final Attributes ATTRIBUTES_FOR_SCRIPT_HASH0 = attributes()
            .generic("level", "level")


            .generic("hotkey", "hotkey");

    private static final Attributes ATTRIBUTES_FOR_SCRIPT_HASH1 = attributes()
            .generic("mode", "mode");


    private static String convertToString(Object object) {
        return object != null ? object.toString() : "";
    }

    @Override
    public void doEncodeEnd(ResponseWriter responseWriter, FacesContext facesContext, UIComponent component)
            throws IOException {
        String clientId = component.getClientId(facesContext);
        responseWriter.startElement("div", component);
        {
            Object value = this.concatClasses("rf-log", (this.isInline(component.getAttributes().get("mode")) ? "rf-log-inline" : "rf-log-popup rf-log-popup-cnt"), component.getAttributes().get("styleClass"));
            if (null != value &&
                    shouldRenderAttribute(value)
            ) {
                responseWriter.writeAttribute("class", value, null);
            }

        }

        responseWriter.writeAttribute("id", "richfaces.log", null);


        renderPassThroughAttributes(facesContext, component,
                PASS_THROUGH_ATTRIBUTES3);

        Map<String, Object> options = new LinkedHashMap<String, Object>();


        addToScriptHash(options, facesContext, component, ATTRIBUTES_FOR_SCRIPT_HASH0, null);


        addToScriptHash(options, facesContext, component, ATTRIBUTES_FOR_SCRIPT_HASH1, null);

        responseWriter.startElement("script", component);
        responseWriter.writeAttribute("type", "text/javascript", null);


        {
            Object text = "new RichFaces.HtmlLog(" + convertToString(toScriptArgs(options)) + ");";
            if (text != null) {
                responseWriter.writeText(text, null);
            }
        }

        responseWriter.endElement("script");
        responseWriter.endElement("div");

    }
}
