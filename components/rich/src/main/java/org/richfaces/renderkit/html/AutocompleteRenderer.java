package org.richfaces.renderkit.html;

import org.richfaces.renderkit.AutocompleteRendererBase;
import org.richfaces.renderkit.RenderKitUtils.Attributes;
import org.richfaces.renderkit.RenderKitUtils.ScriptHashVariableWrapper;

import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.context.ResponseWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.richfaces.component.AutocompleteMode.ajax;
import static org.richfaces.component.AutocompleteMode.client;
import static org.richfaces.component.AutocompleteMode.lazyClient;
import static org.richfaces.renderkit.RenderKitUtils.addToScriptHash;
import static org.richfaces.renderkit.RenderKitUtils.attributes;
import static org.richfaces.renderkit.RenderKitUtils.renderPassThroughAttributes;
import static org.richfaces.renderkit.RenderKitUtils.shouldRenderAttribute;
import static org.richfaces.renderkit.RenderKitUtils.toScriptArgs;


public class AutocompleteRenderer extends AutocompleteRendererBase {

    private static final Attributes PASS_THROUGH_ATTRIBUTES19 = attributes()
            .generic("style", "style");

    private static final Attributes PASS_THROUGH_ATTRIBUTES20 = attributes()
            .generic("tabindex", "tabindex")


            .generic("title", "title");

    private static final Attributes ATTRIBUTES_FOR_SCRIPT_HASH18 = attributes()
            .generic("selectedItemClass", "selectedItemClass")
            .defaultValue("rf-au-itm-sel")

            .generic("autofill", "autofill")
            .defaultValue(true)

            .generic("disabled", "disabled")
            .defaultValue(false)

            .generic("selectFirst", "selectFirst")
            .defaultValue(true)

            .generic("tokens", "tokens")


            .generic("queueId", "queueId");

    private static final Attributes ATTRIBUTES_FOR_SCRIPT_HASH19 = attributes()
            .generic("onbegin", "onbegin", "begin")


            .generic("oncomplete", "oncomplete", "complete")


            .generic("onerror", "onerror")


            .generic("onbeforedomupdate", "onbeforedomupdate", "beforedomupdate")


            .generic("onchange", "onchange", "change")


            .generic("onselectitem", "onselectitem", "selectitem")


            .generic("onfocus", "onfocus", "focus")


            .generic("onblur", "onblur", "blur");


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

    private static boolean isEqual(Object o1, Object o2) {
        if (o1 != null) {
            return o1.equals(o2);
        } else {
            //o1 == null
            return o2 == null;
        }
    }

    @Override
    public void doEncodeBegin(ResponseWriter responseWriter, FacesContext facesContext, UIComponent component)
            throws IOException {
        String clientId = component.getClientId(facesContext);
        Object disabled = (Object) component.getAttributes().get("disabled");
        responseWriter.startElement("span", component);
        {
            Object value = this.concatClasses("rf-au", component.getAttributes().get("styleClass"));
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


        renderPassThroughAttributes(facesContext, component,
                PASS_THROUGH_ATTRIBUTES19);

        responseWriter.startElement("input", component);
        {
            String value = convertToString(clientId) + "Value";
            if (null != value &&
                    value.length() > 0
            ) {
                responseWriter.writeAttribute("id", value, null);
            }

        }

        {
            String value = convertToString(clientId) + "Value";
            if (null != value &&
                    value.length() > 0
            ) {
                responseWriter.writeAttribute("name", value, null);
            }

        }

        responseWriter.writeAttribute("type", "hidden", null);


        responseWriter.endElement("input");
        responseWriter.startElement("span", component);
        {
            String value = (convertToBoolean(component.getAttributes().get("showButton")) ? "rf-au-fld-btn" : "");
            if (null != value &&
                    value.length() > 0
            ) {
                responseWriter.writeAttribute("class", value, null);
            }

        }


        responseWriter.startElement("input", component);
        responseWriter.writeAttribute("autocomplete", "off", null);

        {
            String value = "rf-au-fnt rf-au-inp " + convertToString(component.getAttributes().get("inputClass"));
            if (null != value &&
                    value.length() > 0
            ) {
                responseWriter.writeAttribute("class", value, null);
            }

        }

        if (null != disabled && (Boolean.valueOf(disabled.toString()) || "disabled".equals(disabled.toString()))) {
            responseWriter.writeAttribute("disabled", "disabled", null);
        }

        {
            String value = convertToString(clientId) + "Input";
            if (null != value &&
                    value.length() > 0
            ) {
                responseWriter.writeAttribute("id", value, null);
            }

        }

        {
            String value = convertToString(clientId) + "Input";
            if (null != value &&
                    value.length() > 0
            ) {
                responseWriter.writeAttribute("name", value, null);
            }

        }

        {
            Object value = component.getAttributes().get("onclick");
            if (null != value &&
                    shouldRenderAttribute(value)
            ) {
                responseWriter.writeAttribute("onclick", value, null);
            }

        }

        {
            Object value = component.getAttributes().get("ondblclick");
            if (null != value &&
                    shouldRenderAttribute(value)
            ) {
                responseWriter.writeAttribute("ondblclick", value, null);
            }

        }

        {
            Object value = component.getAttributes().get("onkeydown");
            if (null != value &&
                    shouldRenderAttribute(value)
            ) {
                responseWriter.writeAttribute("onkeydown", value, null);
            }

        }

        {
            Object value = component.getAttributes().get("onkeypress");
            if (null != value &&
                    shouldRenderAttribute(value)
            ) {
                responseWriter.writeAttribute("onkeypress", value, null);
            }

        }

        {
            Object value = component.getAttributes().get("onkeyup");
            if (null != value &&
                    shouldRenderAttribute(value)
            ) {
                responseWriter.writeAttribute("onkeyup", value, null);
            }

        }

        {
            Object value = component.getAttributes().get("onmousedown");
            if (null != value &&
                    shouldRenderAttribute(value)
            ) {
                responseWriter.writeAttribute("onmousedown", value, null);
            }

        }

        {
            Object value = component.getAttributes().get("onmousemove");
            if (null != value &&
                    shouldRenderAttribute(value)
            ) {
                responseWriter.writeAttribute("onmousemove", value, null);
            }

        }

        {
            Object value = component.getAttributes().get("onmouseout");
            if (null != value &&
                    shouldRenderAttribute(value)
            ) {
                responseWriter.writeAttribute("onmouseout", value, null);
            }

        }

        {
            Object value = component.getAttributes().get("onmouseover");
            if (null != value &&
                    shouldRenderAttribute(value)
            ) {
                responseWriter.writeAttribute("onmouseover", value, null);
            }

        }

        {
            Object value = component.getAttributes().get("onmouseup");
            if (null != value &&
                    shouldRenderAttribute(value)
            ) {
                responseWriter.writeAttribute("onmouseup", value, null);
            }

        }

        responseWriter.writeAttribute("type", "text", null);

        {
            String value = this.getInputValue(facesContext, component);
            if (null != value &&
                    value.length() > 0
            ) {
                responseWriter.writeAttribute("value", value, null);
            }

        }


        renderPassThroughAttributes(facesContext, component,
                PASS_THROUGH_ATTRIBUTES20);

        responseWriter.endElement("input");
        if (convertToBoolean(component.getAttributes().get("showButton"))) {
            responseWriter.startElement("span", component);
            responseWriter.writeAttribute("class", "rf-au-btn", null);

            {
                String value = convertToString(clientId) + "Button";
                if (null != value &&
                        value.length() > 0
                ) {
                    responseWriter.writeAttribute("id", value, null);
                }

            }


            responseWriter.startElement("span", component);
            {
                String value = "rf-au-btn-arrow" + convertToString((convertToBoolean(component.getAttributes().get("disabled")) ? "-dis" : ""));
                if (null != value &&
                        value.length() > 0
                ) {
                    responseWriter.writeAttribute("class", value, null);
                }

            }


            responseWriter.endElement("span");
            responseWriter.endElement("span");
        }
        responseWriter.endElement("span");
        responseWriter.startElement("div", component);
        responseWriter.writeAttribute("class", "rf-au-lst-cord", null);

        {
            String value = convertToString(clientId) + "List";
            if (null != value &&
                    value.length() > 0
            ) {
                responseWriter.writeAttribute("id", value, null);
            }

        }

        {
            Object value = component.getAttributes().get("onlistclick");
            if (null != value &&
                    shouldRenderAttribute(value)
            ) {
                responseWriter.writeAttribute("onclick", value, null);
            }

        }

        {
            Object value = component.getAttributes().get("onlistdblclick");
            if (null != value &&
                    shouldRenderAttribute(value)
            ) {
                responseWriter.writeAttribute("ondblclick", value, null);
            }

        }

        {
            Object value = component.getAttributes().get("onlistkeydown");
            if (null != value &&
                    shouldRenderAttribute(value)
            ) {
                responseWriter.writeAttribute("onkeydown", value, null);
            }

        }

        {
            Object value = component.getAttributes().get("onlistkeypress");
            if (null != value &&
                    shouldRenderAttribute(value)
            ) {
                responseWriter.writeAttribute("onkeypress", value, null);
            }

        }

        {
            Object value = component.getAttributes().get("onlistkeyup");
            if (null != value &&
                    shouldRenderAttribute(value)
            ) {
                responseWriter.writeAttribute("onkeyup", value, null);
            }

        }

        {
            Object value = component.getAttributes().get("onlistmousedown");
            if (null != value &&
                    shouldRenderAttribute(value)
            ) {
                responseWriter.writeAttribute("onmousedown", value, null);
            }

        }

        {
            Object value = component.getAttributes().get("onlistmousemove");
            if (null != value &&
                    shouldRenderAttribute(value)
            ) {
                responseWriter.writeAttribute("onmousemove", value, null);
            }

        }

        {
            Object value = component.getAttributes().get("onlistmouseout");
            if (null != value &&
                    shouldRenderAttribute(value)
            ) {
                responseWriter.writeAttribute("onmouseout", value, null);
            }

        }

        {
            Object value = component.getAttributes().get("onlistmouseover");
            if (null != value &&
                    shouldRenderAttribute(value)
            ) {
                responseWriter.writeAttribute("onmouseover", value, null);
            }

        }

        {
            Object value = component.getAttributes().get("onlistmouseup");
            if (null != value &&
                    shouldRenderAttribute(value)
            ) {
                responseWriter.writeAttribute("onmouseup", value, null);
            }

        }


        responseWriter.startElement("div", component);
        responseWriter.writeAttribute("class", "rf-au-shdw", null);


        responseWriter.startElement("div", component);
        responseWriter.writeAttribute("class", "rf-au-shdw-t", null);


        responseWriter.endElement("div");
        responseWriter.startElement("div", component);
        responseWriter.writeAttribute("class", "rf-au-shdw-l", null);


        responseWriter.endElement("div");
        responseWriter.startElement("div", component);
        responseWriter.writeAttribute("class", "rf-au-shdw-r", null);


        responseWriter.endElement("div");
        responseWriter.startElement("div", component);
        responseWriter.writeAttribute("class", "rf-au-shdw-b", null);


        responseWriter.endElement("div");
        responseWriter.startElement("div", component);
        {
            String value = "rf-au-lst-dcrtn " + convertToString(component.getAttributes().get("popupClass"));
            if (null != value &&
                    value.length() > 0
            ) {
                responseWriter.writeAttribute("class", value, null);
            }

        }


        responseWriter.startElement("div", component);
        responseWriter.writeAttribute("class", "rf-au-lst-scrl", null);


    }

    @Override
    public void doEncodeChildren(ResponseWriter responseWriter, FacesContext facesContext, UIComponent component)
            throws IOException {
        String clientId = component.getClientId(facesContext);
        encodeItemsContainer(facesContext, component);

    }

    @Override
    public void doEncodeEnd(ResponseWriter responseWriter, FacesContext facesContext, UIComponent component)
            throws IOException {
        String clientId = component.getClientId(facesContext);
        responseWriter.endElement("div");
        responseWriter.endElement("div");
        responseWriter.endElement("div");
        responseWriter.endElement("div");
        if ((!convertToBoolean(component.getAttributes().get("disabled")))) {
            responseWriter.startElement("script", component);
            responseWriter.writeAttribute("type", "text/javascript", null);


            Object mode = (Object) component.getAttributes().get("mode");
            Map<String, Object> options = new LinkedHashMap<String, Object>();
            addToScriptHash(options, "buttonId", convertToString(clientId) + "Button", null, null);


            addToScriptHash(options, facesContext, component, ATTRIBUTES_FOR_SCRIPT_HASH18, null);


            addToScriptHash(options, facesContext, component, ATTRIBUTES_FOR_SCRIPT_HASH19, ScriptHashVariableWrapper.eventHandler);
            addToScriptHash(options, "minChars", this.getMinCharsOrDefault(component), null, null);

            addToScriptHash(options, "filterFunction", this.getClientFilterFunction(component), null, null);

            addToScriptHash(options, "isCachedAjax", (isEqual(ajax, mode) ? false : true), true, null);

            addToScriptHash(options, "ajaxMode", ((isEqual(client, mode) || isEqual(lazyClient, mode)) ? false : true), true, null);

            addToScriptHash(options, "lazyClientMode", (isEqual(lazyClient, mode) ? true : false), false, null);

            addToScriptHash(options, "status", component.getAttributes().get("status"), null, null);


            {
                Object text = "new RichFaces.ui.Autocomplete(\"" + convertToString(clientId) + "\",\n                    \"" + convertToString(clientId) + "Input\", " + convertToString(toScriptArgs(options)) + "\n                    );";
                if (text != null) {
                    responseWriter.writeText(text, null);
                }
            }

            responseWriter.endElement("script");
        }
        responseWriter.endElement("span");

    }

    @Override
    public boolean getRendersChildren() {
        return true;
    }
}
