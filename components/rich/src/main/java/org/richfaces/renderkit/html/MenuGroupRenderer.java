package org.richfaces.renderkit.html;

import org.richfaces.renderkit.RenderKitUtils;
import org.richfaces.renderkit.RenderKitUtils.Attributes;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import java.io.IOException;

import static org.richfaces.renderkit.RenderKitUtils.attributes;
import static org.richfaces.renderkit.RenderKitUtils.renderPassThroughAttributes;
import static org.richfaces.renderkit.RenderKitUtils.shouldRenderAttribute;


public class MenuGroupRenderer extends MenuGroupRendererBase {

    private static final Attributes PASS_THROUGH_ATTRIBUTES13 = attributes()
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


            .generic("title", "title");


    private static String convertToString(Object object) {
        return object != null ? object.toString() : "";
    }

    @Override
    public void doEncodeEnd(ResponseWriter responseWriter, FacesContext facesContext, UIComponent component)
            throws IOException {
        String clientId = component.getClientId(facesContext);
        Object style = (Object) component.getAttributes().get("style");
        Object cssRoot = (Object) component.getAttributes().get("cssRoot");
        Object iconClass = (Object) component.getAttributes().get("iconClass");
        Object labelClass = (Object) component.getAttributes().get("labelClass");
        String styleClass = (String) this.getStyleClass(facesContext, component, "groupClass", "styleClass");
        String selectedClass = (String) this.getStyleClass(facesContext, component, "selectedGroupClass", "selectedClass");
        String disabledClass = (String) this.getStyleClass(facesContext, component, "disabledGroupClass", "disabledClass");
        boolean isDisabled = (boolean) this.isDisabled(facesContext, component);
        UIComponent iconFacet = (UIComponent) this.getIconFacet(facesContext, component);
        String iconAttribute = (String) this.getIconAttribute(facesContext, component);
        responseWriter.startElement("div", component);
        {
            String value = "rf-" + convertToString(cssRoot) + "-itm " + convertToString(((isDisabled ? (((("rf-" + cssRoot) + "-itm-dis ") + disabledClass) + " ") : (("rf-" + cssRoot) + "-itm-unsel ")) + styleClass));
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
            Object value = style;
            if (null != value &&
                    shouldRenderAttribute(value)
            ) {
                responseWriter.writeAttribute("style", value, null);
            }

        }


        renderPassThroughAttributes(facesContext, component,
                PASS_THROUGH_ATTRIBUTES13);

        responseWriter.startElement("span", component);
        {
            String value = "rf-" + convertToString(cssRoot) + "-itm-ic " + convertToString(iconClass);
            if (null != value &&
                    value.length() > 0
            ) {
                responseWriter.writeAttribute("class", value, null);
            }

        }


        if (((iconFacet != null) && iconFacet.isRendered())) {
            iconFacet.encodeAll(facesContext);
        } else if ((!this.isStringEmpty(iconAttribute))) {
            responseWriter.startElement("img", component);
            responseWriter.writeAttribute("alt", "", null);

            responseWriter.writeAttribute("height", "16", null);

            {
                Object value = RenderKitUtils.getResourceURL(iconAttribute, facesContext);
                if (null != value && value.toString().length() > 0) {
                    responseWriter.writeURIAttribute("src", value, null);
                }
            }

            responseWriter.writeAttribute("width", "16", null);


            responseWriter.endElement("img");
        } else {
            responseWriter.startElement("span", component);
            {
                String value = "rf-" + convertToString(cssRoot) + "-emptyIcon";
                if (null != value &&
                        value.length() > 0
                ) {
                    responseWriter.writeAttribute("class", value, null);
                }

            }


            responseWriter.endElement("span");
        }
        responseWriter.endElement("span");
        if ((!isDisabled)) {
            responseWriter.startElement("span", component);
            {
                String value = "rf-" + convertToString(cssRoot) + "-itm-lbl " + convertToString(labelClass);
                if (null != value &&
                        value.length() > 0
                ) {
                    responseWriter.writeAttribute("class", value, null);
                }

            }


            {
                Object text = component.getAttributes().get("label");
                if (text != null) {
                    responseWriter.writeText(text, null);
                }
            }

            responseWriter.endElement("span");
        } else {
            {
                Object text = component.getAttributes().get("label");
                if (text != null) {
                    responseWriter.writeText(text, null);
                }
            }

        }
        responseWriter.startElement("div", component);
        {
            String value = "rf-" + convertToString(cssRoot) + "-nd";
            if (null != value &&
                    value.length() > 0
            ) {
                responseWriter.writeAttribute("class", value, null);
            }

        }


        if ((!isDisabled)) {
            responseWriter.startElement("div", component);
            {
                String value = "rf-" + convertToString(cssRoot) + "-lst rf-" + convertToString(cssRoot) + "-sublst";
                if (null != value &&
                        value.length() > 0
                ) {
                    responseWriter.writeAttribute("class", value, null);
                }

            }

            {
                String value = convertToString(clientId) + "_list";
                if (null != value &&
                        value.length() > 0
                ) {
                    responseWriter.writeAttribute("id", value, null);
                }

            }

            {
                String value = "display:none;min-width:" + convertToString(this.getMinPopupWidth(facesContext, component)) + "px;";
                if (null != value &&
                        value.length() > 0
                ) {
                    responseWriter.writeAttribute("style", value, null);
                }

            }


            responseWriter.startElement("div", component);
            {
                String value = "rf-" + convertToString(cssRoot) + "-lst-bg";
                if (null != value &&
                        value.length() > 0
                ) {
                    responseWriter.writeAttribute("class", value, null);
                }

            }


            renderChildren(facesContext, component);
            responseWriter.endElement("div");
            responseWriter.endElement("div");
        }
        responseWriter.endElement("div");
        responseWriter.endElement("div");

    }

    @Override
    public boolean getRendersChildren() {
        return true;
    }
}
