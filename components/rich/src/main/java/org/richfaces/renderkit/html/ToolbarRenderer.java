package org.richfaces.renderkit.html;

import org.richfaces.renderkit.RenderKitUtils.Attributes;

import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.context.ResponseWriter;
import java.io.IOException;

import static org.richfaces.renderkit.RenderKitUtils.attributes;
import static org.richfaces.renderkit.RenderKitUtils.renderPassThroughAttributes;
import static org.richfaces.renderkit.RenderKitUtils.toScriptArgs;


public class ToolbarRenderer extends ToolbarRendererBase {

    private static final Attributes PASS_THROUGH_ATTRIBUTES39 = attributes()
            .generic("align", "align")


            .generic("bgcolor", "bgcolor")


            .generic("border", "border")


            .generic("cellpadding", "cellpadding")


            .generic("cellspacing", "cellspacing")


            .generic("dir", "dir")


            .generic("frame", "frame")


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


            .generic("rules", "rules")


            .generic("summary", "summary")


            .generic("title", "title");


    private static String convertToString(Object object) {
        return object != null ? object.toString() : "";
    }

    @Override
    public void doEncodeBegin(ResponseWriter responseWriter, FacesContext facesContext, UIComponent component)
            throws IOException {
        String clientId = component.getClientId(facesContext);
        responseWriter.startElement("table", component);
        {
            String value = "rf-tb " + convertToString(component.getAttributes().get("styleClass"));
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

        {
            String value = "width : " + convertToString(this.getWidthToolbar(component)) + "; height: " + convertToString(this.getHeightToolbar(component)) + "; " + convertToString(component.getAttributes().get("style"));
            if (null != value &&
                    value.length() > 0
            ) {
                responseWriter.writeAttribute("style", value, null);
            }

        }


        renderPassThroughAttributes(facesContext, component,
                PASS_THROUGH_ATTRIBUTES39);

        renderColElements(facesContext, component);
        responseWriter.startElement("tr", component);
        responseWriter.writeAttribute("class", "rf-tb-cntr", null);


    }

    @Override
    public void doEncodeEnd(ResponseWriter responseWriter, FacesContext facesContext, UIComponent component)
            throws IOException {
        String clientId = component.getClientId(facesContext);
        responseWriter.endElement("tr");
        responseWriter.endElement("table");
        responseWriter.startElement("script", component);
        responseWriter.writeAttribute("type", "text/javascript", null);


        {
            Object text = "RichFaces.ui.toolbarHandlers(" + convertToString(toScriptArgs(this.getOptions(component))) + ");";
            if (text != null) {
                responseWriter.writeText(text, null);
            }
        }

        responseWriter.endElement("script");

    }
}
