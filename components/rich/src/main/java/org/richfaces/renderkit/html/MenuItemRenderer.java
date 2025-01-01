package org.richfaces.renderkit.html;

import org.richfaces.renderkit.RenderKitUtils;
import org.richfaces.renderkit.RenderKitUtils.Attributes;
import org.richfaces.renderkit.RenderKitUtils.ScriptHashVariableWrapper;
import org.richfaces.renderkit.util.RendererUtils;

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
import static org.richfaces.renderkit.RenderKitUtils.renderPassThroughAttributes;
import static org.richfaces.renderkit.RenderKitUtils.shouldRenderAttribute;
import static org.richfaces.renderkit.RenderKitUtils.toScriptArgs;


@ResourceDependencies({@ResourceDependency(name = "jsf.js", library = "javax.faces", target = ""), @ResourceDependency(name = "jquery.js", library = "org.richfaces", target = ""), @ResourceDependency(name = "richfaces.js", library = "org.richfaces", target = ""), @ResourceDependency(name = "richfaces-queue.reslib", library = "org.richfaces", target = ""), @ResourceDependency(name = "richfaces-base-component.js", library = "org.richfaces", target = ""), @ResourceDependency(name = "richfaces-event.js", library = "org.richfaces", target = ""), @ResourceDependency(name = "menuitem.js", library = "org.richfaces", target = ""), @ResourceDependency(name = "dropdownmenu.ecss", library = "org.richfaces", target = "")})
public class MenuItemRenderer extends MenuItemRendererBase {

    private static final Attributes PASS_THROUGH_ATTRIBUTES4 = attributes()
            .generic("align", "align")


            .generic("dir", "dir")


            .generic("lang", "lang")


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
    public void doEncodeEnd(ResponseWriter responseWriter, FacesContext facesContext, UIComponent component)
            throws IOException {
        String clientId = component.getClientId(facesContext);
        Object style = (Object) component.getAttributes().get("style");
        Object cssRoot = (Object) component.getAttributes().get("cssRoot");
        String iconClass = (String) this.getStyleClass(facesContext, component, "", "iconClass", "iconClass");
        String labelClass = (String) this.getStyleClass(facesContext, component, "", "labelClass", "labelClass");
        String styleClass = (String) this.getStyleClass(facesContext, component, "itemClass", "styleClass", "styleClass");
        String selectedClass = (String) this.getStyleClass(facesContext, component, "selectedItemClass", "selectedClass", "selectedClass");
        String disabledClass = (String) this.getStyleClass(facesContext, component, "disabledItemClass", "disabledClass", "disabledClass");
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
                PASS_THROUGH_ATTRIBUTES4);

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


            if ((!isEmpty(component.getAttributes().get("label")))) {
                {
                    Object text = component.getAttributes().get("label");
                    if (text != null) {
                        responseWriter.writeText(text, null);
                    }
                }

            } else {
                renderChildren(facesContext, component);

            }
            responseWriter.endElement("span");
        } else {
            if ((!isEmpty(component.getAttributes().get("label")))) {
                {
                    Object text = component.getAttributes().get("label");
                    if (text != null) {
                        responseWriter.writeText(text, null);
                    }
                }

            } else {
                renderChildren(facesContext, component);

            }
        }
        if ((!isDisabled)) {
            responseWriter.startElement("script", component);
            responseWriter.writeAttribute("type", "text/javascript", null);


            Map<String, Object> options = new LinkedHashMap<String, Object>();
            addToScriptHash(options, "params", RendererUtils.getInstance().createParametersMap(facesContext, component), null, null);

            addToScriptHash(options, "mode", this.getSubmitMode(component), org.richfaces.component.Mode.server, null);

            addToScriptHash(options, "cssRoot", cssRoot, "ddm", null);

            addToScriptHash(options, "onClickHandler", this.getOnClick(facesContext, component), null, ScriptHashVariableWrapper.eventHandler);


            {
                Object text = "new RichFaces.ui.MenuItem(" + convertToString(toScriptArgs(clientId, options)) + ");";
                if (text != null) {
                    responseWriter.writeText(text, null);
                }
            }

            responseWriter.endElement("script");
        } else {
        }
        responseWriter.endElement("div");

    }

    @Override
    public boolean getRendersChildren() {
        return true;
    }
}
