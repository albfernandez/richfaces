package org.richfaces.renderkit.html;

import org.richfaces.renderkit.EditorRendererBase;
import org.richfaces.renderkit.RenderKitUtils.Attributes;
import org.richfaces.renderkit.RenderKitUtils.ScriptHashVariableWrapper;

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


public class EditorRenderer extends EditorRendererBase {

    private static final Attributes PASS_THROUGH_ATTRIBUTES34 = attributes()
            .generic("accesskey", "accesskey")


            .generic("cols", "cols")


            .generic("dir", "dir")


            .bool("disabled", "disabled")


            .generic("lang", "lang")


            .generic("onblur", "onblur", "blur")


            .generic("onchange", "onchange", "change")


            .generic("onclick", "onclick")


            .generic("ondblclick", "ondblclick")


            .generic("onfocus", "onfocus", "focus")


            .generic("onkeydown", "onkeydown")


            .generic("onkeypress", "onkeypress")


            .generic("onkeyup", "onkeyup")


            .generic("onmousedown", "onmousedown")


            .generic("onmousemove", "onmousemove")


            .generic("onmouseout", "onmouseout")


            .generic("onmouseover", "onmouseover")


            .generic("onmouseup", "onmouseup")


            .generic("onselect", "onselect")


            .generic("role", "role")


            .generic("rows", "rows")


            .generic("tabindex", "tabindex")


            .generic("title", "title");

    private static final Attributes ATTRIBUTES_FOR_SCRIPT_HASH25 = attributes()
            .generic("width", "width")
            .defaultValue("100%")

            .generic("height", "height")
            .defaultValue("200px")

            .generic("toolbar", "toolbar")
            .defaultValue("Basic")

            .generic("skin", "skin")
            .defaultValue("moono")

            .generic("lang", "lang")


            .generic("style", "style")


            .generic("styleClass", "styleClass")


            .generic("editorStyle", "editorStyle")


            .generic("editorClass", "editorClass");

    private static final Attributes ATTRIBUTES_FOR_SCRIPT_HASH26 = attributes()
            .generic("onfocus", "onfocus", "focus")


            .generic("onblur", "onblur", "blur")


            .generic("onchange", "onchange", "change")


            .generic("oninit", "oninit", "init")


            .generic("ondirty", "ondirty", "dirty");


    private static String convertToString(Object object) {
        return object != null ? object.toString() : "";
    }

    private static boolean convertToBoolean(Object object) {
        if (object == null) {
            return false;
        }

        if (object instanceof Boolean) {
            return (Boolean) object;
        }

        return Boolean.valueOf(object.toString());
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
        Object textareaStyle = (Object) component.getAttributes().get("textareaStyle");
        String width = (String) this.resolveUnits(component.getAttributes().get("width"));
        String height = (String) this.resolveUnits(component.getAttributes().get("height"));
        Object config = (Object) component.getAttributes().get("config");
        UIComponent configFacet = (UIComponent) component.getFacets().get("config");
        responseWriter.startElement("div", component);
        responseWriter.writeAttribute("class", "rf-ed", null);

        {
            String value = clientId;
            if (null != value &&
                    value.length() > 0
            ) {
                responseWriter.writeAttribute("id", value, null);
            }

        }


        responseWriter.startElement("textarea", component);
        {
            Object value = this.concatClasses("rf-ed-inp", component.getAttributes().get("styleClass"), component.getAttributes().get("textareaClass"));
            if (null != value &&
                    shouldRenderAttribute(value)
            ) {
                responseWriter.writeAttribute("class", value, null);
            }

        }

        {
            String value = convertToString(clientId) + ":inp";
            if (null != value &&
                    value.length() > 0
            ) {
                responseWriter.writeAttribute("id", value, null);
            }

        }

        {
            String value = clientId;
            if (null != value &&
                    value.length() > 0
            ) {
                responseWriter.writeAttribute("name", value, null);
            }

        }

        if ("readonly".equals((convertToBoolean(component.getAttributes().get("readonly")) ? "readonly" : "")) || Boolean.valueOf((convertToBoolean(component.getAttributes().get("readonly")) ? "readonly" : ""))) {
            responseWriter.writeAttribute("readonly", "readonly", null);
        }

        {
            String value = convertToString((isEmpty(style) ? "" : (style + "; "))) + convertToString((isEmpty(textareaStyle) ? "" : (textareaStyle + "; "))) + "width: " + convertToString((isEmpty(width) ? DEFAULT_WIDTH : width)) + "; height: " + convertToString((isEmpty(height) ? DEFAULT_HEIGHT : height)) + "; ";
            if (null != value &&
                    value.length() > 0
            ) {
                responseWriter.writeAttribute("style", value, null);
            }

        }


        renderPassThroughAttributes(facesContext, component,
                PASS_THROUGH_ATTRIBUTES34);

        {
            Object text = this.getInputValue(facesContext, component);
            if (text != null) {
                responseWriter.writeText(text, null);
            }
        }

        responseWriter.endElement("textarea");
        responseWriter.startElement("script", component);
        {
            String value = convertToString(clientId) + "Script";
            if (null != value &&
                    value.length() > 0
            ) {
                responseWriter.writeAttribute("id", value, null);
            }

        }

        responseWriter.writeAttribute("type", "text/javascript", null);


        Map<String, Object> options = new LinkedHashMap<String, Object>();


        addToScriptHash(options, facesContext, component, ATTRIBUTES_FOR_SCRIPT_HASH25, null);


        addToScriptHash(options, facesContext, component, ATTRIBUTES_FOR_SCRIPT_HASH26, ScriptHashVariableWrapper.eventHandler);

        {
            Object text = "window.CKEDITOR_BASEPATH = '" + convertToString(facesContext.getExternalContext().getRequestContextPath()) + "/org.richfaces.resources/javax.faces.resource/org.richfaces.ckeditor/';\n                \n                (function() {\n                    var options = " + convertToString((isEmpty(toScriptArgs(options)) ? "null" : toScriptArgs(options))) + ";\n                    var config = {";
            if (text != null) {
                responseWriter.writeText(text, null);
            }
        }

        if (((configFacet != null) && configFacet.isRendered())) {
            configFacet.encodeAll(facesContext);
        } else if ((!isEmpty(config))) {
            {
                Object text = config;
                if (text != null) {
                    responseWriter.writeText(text, null);
                }
            }

        } else {
        }
        {
            Object text = "};\n                    \n                    new RichFaces.ui.Editor(\"" + convertToString(clientId) + "\", options, config);\n                })();";
            if (text != null) {
                responseWriter.writeText(text, null);
            }
        }

        responseWriter.endElement("script");
        responseWriter.endElement("div");

    }
}
