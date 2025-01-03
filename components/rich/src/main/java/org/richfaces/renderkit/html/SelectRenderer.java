package org.richfaces.renderkit.html;

import org.richfaces.renderkit.RenderKitUtils.Attributes;
import org.richfaces.renderkit.RenderKitUtils.ScriptHashVariableWrapper;
import org.richfaces.renderkit.SelectRendererBase;

import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.context.ResponseWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static org.richfaces.component.AutocompleteMode.ajax;
import static org.richfaces.component.AutocompleteMode.client;
import static org.richfaces.component.AutocompleteMode.lazyClient;
import static org.richfaces.renderkit.RenderKitUtils.addToScriptHash;
import static org.richfaces.renderkit.RenderKitUtils.attributes;
import static org.richfaces.renderkit.RenderKitUtils.renderPassThroughAttributes;
import static org.richfaces.renderkit.RenderKitUtils.shouldRenderAttribute;
import static org.richfaces.renderkit.RenderKitUtils.toScriptArgs;


public class SelectRenderer extends SelectRendererBase {

    private static final Attributes PASS_THROUGH_ATTRIBUTES40 = attributes()
            .generic("accept", "accept")


            .generic("accesskey", "accesskey")


            .generic("align", "align")


            .generic("alt", "alt")


            .bool("checked", "checked")


            .generic("dir", "dir")


            .generic("lang", "lang")


            .generic("maxlength", "maxlength")


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


            .generic("onselect", "onselect")


            .generic("role", "role")


            .generic("size", "size")


            .uri("src", "src")


            .generic("tabindex", "tabindex")


            .generic("title", "title")


            .uri("usemap", "usemap");

    private static final Attributes ATTRIBUTES_FOR_SCRIPT_HASH33 = attributes()
            .generic("onbegin", "onbegin", "begin")


            .generic("oncomplete", "oncomplete", "complete")


            .generic("onerror", "onerror")


            .generic("onbeforedomupdate", "onbeforedomupdate", "beforedomupdate")


            .generic("onchange", "onchange", "change")


            .generic("onblur", "onblur", "blur")


            .generic("onselectitem", "onselectitem", "selectitem")


            .generic("onfocus", "onfocus", "focus")


            .generic("onlistshow", "onlistshow", "listshow")


            .generic("onlisthide", "onlisthide", "listhide");

    private static final Attributes ATTRIBUTES_FOR_SCRIPT_HASH34 = attributes()
            .generic("showControl", "showControl")


            .generic("defaultLabel", "defaultLabel")


            .generic("enableManualInput", "enableManualInput")
            .defaultValue(false)

            .generic("selectFirst", "selectFirst")
            .defaultValue(true)

            .generic("disabled", "disabled")
            .defaultValue(false);


    private static String convertToString(Object object) {
        return object != null ? object.toString() : "";
    }

    private static boolean isEqual(Object o1, Object o2) {
        if (o1 != null) {
            return o1.equals(o2);
        } else {
            //o1 == null
            return o2 == null;
        }
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

    @Override
    public void doEncodeEnd(ResponseWriter responseWriter, FacesContext facesContext, UIComponent component)
            throws IOException {
        String clientId = component.getClientId(facesContext);
        List clientSelectItems = (List) this.getConvertedSelectItems(facesContext, component);
        Object disabled = (Object) component.getAttributes().get("disabled");
        responseWriter.startElement("div", component);
        {
            Object value = this.concatClasses("rf-sel", component.getAttributes().get("styleClass"));
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


        responseWriter.startElement("span", component);
        responseWriter.writeAttribute("class", "rf-sel-cntr", null);


        responseWriter.startElement("input", component);
        {
            String value = convertToString(clientId) + "selValue";
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

        responseWriter.writeAttribute("type", "hidden", null);

        {
            String value = this.getInputValue(facesContext, component);
            if (null != value &&
                    value.length() > 0
            ) {
                responseWriter.writeAttribute("value", value, null);
            }

        }


        responseWriter.endElement("input");
        String label = (String) this.getSelectLabel(facesContext, component);
        responseWriter.startElement("input", component);
        responseWriter.writeAttribute("autocomplete", "off", null);

        {
            String value = "rf-sel-inp" + convertToString((isEqual(label, component.getAttributes().get("defaultLabel")) ? " rf-sel-dflt-lbl" : ""));
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

        if ("readonly".equals(((convertToBoolean(component.getAttributes().get("enableManualInput")) || this.isAutocomplete(component)) ? "" : "readonly")) || Boolean.valueOf(((convertToBoolean(component.getAttributes().get("enableManualInput")) || this.isAutocomplete(component)) ? "" : "readonly"))) {
            responseWriter.writeAttribute("readonly", "readonly", null);
        }

        responseWriter.writeAttribute("type", "text", null);

        {
            String value = label;
            if (null != value &&
                    value.length() > 0
            ) {
                responseWriter.writeAttribute("value", value, null);
            }

        }


        renderPassThroughAttributes(facesContext, component,
                PASS_THROUGH_ATTRIBUTES40);

        responseWriter.endElement("input");
        if (convertToBoolean(component.getAttributes().get("showButton"))) {
            if (convertToBoolean(component.getAttributes().get("disabled"))) {
                responseWriter.startElement("span", component);
                responseWriter.writeAttribute("class", "rf-sel-btn rf-sel-btn-dis", null);

                {
                    String value = convertToString(clientId) + "Button";
                    if (null != value &&
                            value.length() > 0
                    ) {
                        responseWriter.writeAttribute("id", value, null);
                    }

                }


                responseWriter.startElement("span", component);
                responseWriter.writeAttribute("class", "rf-sel-btn-arrow", null);


                responseWriter.endElement("span");
                responseWriter.endElement("span");
            }
            if ((!convertToBoolean(component.getAttributes().get("disabled")))) {
                responseWriter.startElement("span", component);
                responseWriter.writeAttribute("class", "rf-sel-btn", null);

                {
                    String value = convertToString(clientId) + "Button";
                    if (null != value &&
                            value.length() > 0
                    ) {
                        responseWriter.writeAttribute("id", value, null);
                    }

                }


                responseWriter.startElement("span", component);
                responseWriter.writeAttribute("class", "rf-sel-btn-arrow", null);


                responseWriter.endElement("span");
                responseWriter.endElement("span");
            }
        }
        responseWriter.endElement("span");
        responseWriter.startElement("div", component);
        {
            String value = this.getListCss(component);
            if (null != value &&
                    value.length() > 0
            ) {
                responseWriter.writeAttribute("class", value, null);
            }

        }

        {
            String value = convertToString(clientId) + "List";
            if (null != value &&
                    value.length() > 0
            ) {
                responseWriter.writeAttribute("id", value, null);
            }

        }


        renderListHandlers(facesContext, component);

        responseWriter.startElement("div", component);
        responseWriter.writeAttribute("class", "rf-sel-shdw", null);


        responseWriter.startElement("div", component);
        responseWriter.writeAttribute("class", "rf-sel-shdw-l", null);


        responseWriter.endElement("div");
        responseWriter.startElement("div", component);
        responseWriter.writeAttribute("class", "rf-sel-shdw-r", null);


        responseWriter.endElement("div");
        responseWriter.startElement("div", component);
        responseWriter.writeAttribute("class", "rf-sel-shdw-b", null);


        responseWriter.endElement("div");
        responseWriter.startElement("div", component);
        responseWriter.writeAttribute("class", "rf-sel-lst-dcrtn", null);


        responseWriter.startElement("div", component);
        responseWriter.writeAttribute("class", "rf-sel-lst-scrl", null);

        {
            String value = this.encodeHeightAndWidth(component);
            if (null != value &&
                    value.length() > 0
            ) {
                responseWriter.writeAttribute("style", value, null);
            }

        }


        encodeItemsContainer(facesContext, component, clientSelectItems);

        responseWriter.endElement("div");
        responseWriter.endElement("div");
        responseWriter.endElement("div");
        responseWriter.endElement("div");
        responseWriter.startElement("script", component);
        responseWriter.writeAttribute("type", "text/javascript", null);


        Object mode = (Object) component.getAttributes().get("mode");
        Map<String, Object> options = new LinkedHashMap<String, Object>();
        addToScriptHash(options, "clientSelectItems", clientSelectItems, null, null);

        addToScriptHash(options, "itemCss", "rf-sel-opt", null, null);

        addToScriptHash(options, "selectItemCss", this.concatClasses("rf-sel-sel", component.getAttributes().get("selectItemClass")), null, null);


        addToScriptHash(options, facesContext, component, ATTRIBUTES_FOR_SCRIPT_HASH33, ScriptHashVariableWrapper.eventHandler);


        addToScriptHash(options, facesContext, component, ATTRIBUTES_FOR_SCRIPT_HASH34, null);
        addToScriptHash(options, "minChars", this.getMinCharsOrDefault(component), null, null);

        addToScriptHash(options, "filterFunction", this.getClientFilterFunction(component), null, null);

        addToScriptHash(options, "isAutocomplete", this.isAutocomplete(component), false, null);

        addToScriptHash(options, "isCachedAjax", (isEqual(ajax, mode) ? false : true), true, null);

        addToScriptHash(options, "ajaxMode", ((isEqual(client, mode) || isEqual(lazyClient, mode)) ? false : true), true, null);

        addToScriptHash(options, "lazyClientMode", (isEqual(lazyClient, mode) ? true : false), false, null);

        addToScriptHash(options, "status", component.getAttributes().get("status"), null, null);


        {
            Object text = "new RichFaces.ui.Select(\"" + convertToString(clientId) + "\", " + convertToString(toScriptArgs(options)) + ");";
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
