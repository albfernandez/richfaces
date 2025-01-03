package org.richfaces.renderkit.html;

import org.richfaces.component.Mode;
import org.richfaces.renderkit.RenderKitUtils.Attributes;
import org.richfaces.renderkit.RenderKitUtils.ScriptHashVariableWrapper;

import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.context.ResponseWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static org.richfaces.renderkit.RenderKitUtils.addToScriptHash;
import static org.richfaces.renderkit.RenderKitUtils.attributes;
import static org.richfaces.renderkit.RenderKitUtils.renderPassThroughAttributes;
import static org.richfaces.renderkit.RenderKitUtils.toScriptArgs;


public class ContextMenuRenderer extends ContextMenuRendererBase {

    private static final Attributes PASS_THROUGH_ATTRIBUTES18 = attributes()
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

    private static final Attributes ATTRIBUTES_FOR_SCRIPT_HASH17 = attributes()
            .generic("onshow", "onshow", "show")


            .generic("onhide", "onhide", "hide")


            .generic("ongroupshow", "ongroupshow", "groupshow")


            .generic("ongrouphide", "ongrouphide", "grouphide")


            .generic("onitemclick", "onitemclick", "itemclick");


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

    private static String convertToString(Object object) {
        return object != null ? object.toString() : "";
    }

    @Override
    public void doEncodeEnd(ResponseWriter responseWriter, FacesContext facesContext, UIComponent component)
            throws IOException {
        String clientId = component.getClientId(facesContext);
        Object style = (Object) component.getAttributes().get("style");
        Object cssRoot = (Object) component.getAttributes().get("cssRoot");
        Object styleClass = (Object) ((!isEmpty(component.getAttributes().get("styleClass"))) ? component.getAttributes().get("styleClass") : "");
        boolean isDisabled = (boolean) this.isDisabled(facesContext, component);
        List<Map<String, Object>> menuGroups = (List<Map<String, Object>>) this.getMenuGroups(facesContext, component);
        responseWriter.startElement("div", component);
        {
            String value = "rf-ctx-lbl " + convertToString((isDisabled ? "rf-ctx-dis" : "rf-ctx-unsel"));
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


        if ((!this.isDisabled(facesContext, component))) {
            responseWriter.startElement("div", component);
            responseWriter.writeAttribute("class", "rf-ctx-pos", null);


            responseWriter.startElement("div", component);
            {
                String value = "rf-ctx-lst " + convertToString(styleClass);
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
                String value = "display:none;min-width:" + convertToString(this.getPopupWidth(component)) + "px; " + convertToString(style);
                if (null != value &&
                        value.length() > 0
                ) {
                    responseWriter.writeAttribute("style", value, null);
                }

            }


            renderPassThroughAttributes(facesContext, component,
                    PASS_THROUGH_ATTRIBUTES18);

            responseWriter.startElement("div", component);
            responseWriter.writeAttribute("class", "rf-ctx-lst-bg", null);


            renderChildren(facesContext, component);
            responseWriter.endElement("div");
            responseWriter.endElement("div");
            responseWriter.endElement("div");
            responseWriter.startElement("script", component);
            responseWriter.writeAttribute("type", "text/javascript", null);


            Map<String, Object> options = new LinkedHashMap<String, Object>();
            addToScriptHash(options, "direction", this.getDirection(component).getValue(), org.richfaces.component.Positioning.DEFAULT.getValue(), null);

            addToScriptHash(options, "jointPoint", this.getJointPoint(component).getValue(), org.richfaces.component.Positioning.DEFAULT.getValue(), null);

            addToScriptHash(options, "showEvent", this.getShowEvent(component), this.DEFAULT_SHOWEVENT, null);

            addToScriptHash(options, "target", this.getTarget(facesContext, component), "", null);

            addToScriptHash(options, "attached", component.getAttributes().get("attached"), true, null);

            addToScriptHash(options, "mode", this.getMode(component), Mode.server, null);

            addToScriptHash(options, "horizontalOffset", component.getAttributes().get("horizontalOffset"), 0, null);

            addToScriptHash(options, "verticalOffset", component.getAttributes().get("verticalOffset"), 0, null);

            addToScriptHash(options, "hideDelay", component.getAttributes().get("hideDelay"), 300, null);

            addToScriptHash(options, "showDelay", component.getAttributes().get("showDelay"), 50, null);

            addToScriptHash(options, "targetSelector", component.getAttributes().get("targetSelector"), "", null);

            addToScriptHash(options, "sticky", component.getAttributes().get("sticky"), false, null);


            addToScriptHash(options, facesContext, component, ATTRIBUTES_FOR_SCRIPT_HASH17, ScriptHashVariableWrapper.eventHandler);

            {
                Object text = "new RichFaces.ui.ContextMenu(" + convertToString(toScriptArgs(clientId, options)) + ")";
                if (text != null) {
                    responseWriter.writeText(text, null);
                }
            }

            if ((!isEmpty(menuGroups))) {
                {
                    Object text = ".initiateGroups(" + convertToString(toScriptArgs(menuGroups)) + ")";
                    if (text != null) {
                        responseWriter.writeText(text, null);
                    }
                }

            }
            responseWriter.writeText(";", null);

            responseWriter.endElement("script");
        }
        responseWriter.endElement("div");

    }

    @Override
    public boolean getRendersChildren() {
        return true;
    }
}
