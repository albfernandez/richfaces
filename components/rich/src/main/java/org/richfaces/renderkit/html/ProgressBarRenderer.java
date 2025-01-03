package org.richfaces.renderkit.html;

import org.richfaces.renderkit.RenderKitUtils.Attributes;

import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.context.ResponseWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.richfaces.renderkit.RenderKitUtils.addToScriptHash;
import static org.richfaces.renderkit.RenderKitUtils.attributes;
import static org.richfaces.renderkit.RenderKitUtils.renderPassThroughAttributes;
import static org.richfaces.renderkit.RenderKitUtils.shouldRenderAttribute;
import static org.richfaces.renderkit.RenderKitUtils.toScriptArgs;


public class ProgressBarRenderer extends ProgressBarBaseRenderer {

    private static final Attributes PASS_THROUGH_ATTRIBUTES14 = attributes()
            .generic("align", "align")


            .generic("dir", "dir")


            .generic("lang", "lang")


            .generic("onclick", "onclick", "click")


            .generic("ondblclick", "ondblclick", "dblclick")


            .generic("onkeydown", "onkeydown")


            .generic("onkeypress", "onkeypress")


            .generic("onkeyup", "onkeyup")


            .generic("onmousedown", "onmousedown", "mousedown")


            .generic("onmousemove", "onmousemove", "mousemove")


            .generic("onmouseout", "onmouseout", "mouseout")


            .generic("onmouseover", "onmouseover", "mouseover")


            .generic("onmouseup", "onmouseup", "mouseup")


            .generic("role", "role")


            .generic("title", "title");

    private static final Attributes ATTRIBUTES_FOR_SCRIPT_HASH12 = attributes()
            .generic("interval", "interval")
            .defaultValue(Integer.MIN_VALUE)

            .generic("enabled", "enabled")
            .defaultValue(false)

            .generic("value", "value")


            .generic("onfinish", "onfinish", "finish")


            .generic("resource", "resource");


    private static String convertToString(Object object) {
        return object != null ? object.toString() : "";
    }

    @Override
    public void doEncodeEnd(ResponseWriter responseWriter, FacesContext facesContext, UIComponent component)
            throws IOException {
        String clientId = component.getClientId(facesContext);
        responseWriter.startElement("div", component);
        {
            Object value = this.concatClasses("rf-pb", component.getAttributes().get("styleClass"));
            if (null != value &&
                    shouldRenderAttribute(value)
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

        {
            Object value = component.getAttributes().get("style");
            if (null != value &&
                    shouldRenderAttribute(value)
            ) {
                responseWriter.writeAttribute("style", value, null);
            }

        }


        renderPassThroughAttributes(facesContext, component,
                PASS_THROUGH_ATTRIBUTES14);

        ProgressBarStateEncoder encoder = (ProgressBarStateEncoder) this.getEncoder(facesContext, component);
        ProgressBarState currentState = (ProgressBarState) this.getCurrentState(facesContext, component);

        encoder.encodeInitialState(facesContext, component, currentState);


        encoder.encodeCompleteState(facesContext, component, currentState);


        encoder.encodeProgressState(facesContext, component, currentState);

        responseWriter.startElement("script", component);
        responseWriter.writeAttribute("type", "text/javascript", null);


        Map<String, Object> options = new LinkedHashMap<String, Object>();
        addToScriptHash(options, "submitFunction", this.getSubmitFunction(facesContext, component), null, null);

        addToScriptHash(options, "minValue", this.getMinValueOrDefault(component), 0, null);

        addToScriptHash(options, "maxValue", this.getMaxValueOrDefault(component), 100, null);


        addToScriptHash(options, facesContext, component, ATTRIBUTES_FOR_SCRIPT_HASH12, null);

        {
            Object text = "new RichFaces.ui.ProgressBar(" + convertToString(toScriptArgs(clientId, options)) + ");";
            if (text != null) {
                responseWriter.writeText(text, null);
            }
        }

        responseWriter.endElement("script");
        responseWriter.endElement("div");

    }

    @Override
    public boolean getRendersChildren() {
        return true;
    }
}
