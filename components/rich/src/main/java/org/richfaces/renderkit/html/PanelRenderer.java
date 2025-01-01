package org.richfaces.renderkit.html;

import org.richfaces.renderkit.RenderKitUtils.Attributes;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import java.io.IOException;

import static org.richfaces.renderkit.RenderKitUtils.attributes;
import static org.richfaces.renderkit.RenderKitUtils.renderPassThroughAttributes;


public class PanelRenderer extends PanelBaseRenderer {

    private static final Attributes PASS_THROUGH_ATTRIBUTES15 = attributes()
            .generic("align", "align")


            .generic("dir", "dir")


            .generic("lang", "lang")


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


            .generic("role", "role")


            .generic("style", "style")


            .generic("title", "title");


    private static String convertToString(Object object) {
        return object != null ? object.toString() : "";
    }

    @Override
    public void doEncodeEnd(ResponseWriter responseWriter, FacesContext facesContext, UIComponent component)
            throws IOException {
        String clientId = component.getClientId(facesContext);
        responseWriter.startElement("div", component);
        {
            String value = "rf-p " + convertToString(component.getAttributes().get("styleClass"));
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
                PASS_THROUGH_ATTRIBUTES15);

        if (((component.getFacet("header") != null) && component.getFacet("header").isRendered())) {
            responseWriter.startElement("div", component);
            {
                String value = "rf-p-hdr " + convertToString(component.getAttributes().get("headerClass"));
                if (null != value &&
                        value.length() > 0
                ) {
                    responseWriter.writeAttribute("class", value, null);
                }

            }

            {
                String value = convertToString(clientId) + "_header";
                if (null != value &&
                        value.length() > 0
                ) {
                    responseWriter.writeAttribute("id", value, null);
                }

            }


            renderHeaderFacet(facesContext, component);
            responseWriter.endElement("div");
        } else if (((component.getAttributes().get("header") != null) && (!component.getAttributes().get("header").equals("")))) {
            responseWriter.startElement("div", component);
            {
                String value = "rf-p-hdr " + convertToString(component.getAttributes().get("headerClass"));
                if (null != value &&
                        value.length() > 0
                ) {
                    responseWriter.writeAttribute("class", value, null);
                }

            }

            {
                String value = convertToString(clientId) + "_header";
                if (null != value &&
                        value.length() > 0
                ) {
                    responseWriter.writeAttribute("id", value, null);
                }

            }


            {
                Object text = component.getAttributes().get("header");
                if (text != null) {
                    responseWriter.writeText(text, null);
                }
            }

            responseWriter.endElement("div");
        } else {
        }
        responseWriter.startElement("div", component);
        {
            String value = "rf-p-b " + convertToString(component.getAttributes().get("bodyClass"));
            if (null != value &&
                    value.length() > 0
            ) {
                responseWriter.writeAttribute("class", value, null);
            }

        }

        {
            String value = convertToString(clientId) + "_body";
            if (null != value &&
                    value.length() > 0
            ) {
                responseWriter.writeAttribute("id", value, null);
            }

        }


        renderChildren(facesContext, component);
        responseWriter.endElement("div");
        responseWriter.endElement("div");

    }
}
