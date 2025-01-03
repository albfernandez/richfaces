package org.richfaces.renderkit.html;

import org.richfaces.renderkit.OrderingListRendererBase;
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
import static org.richfaces.renderkit.RenderKitUtils.shouldRenderAttribute;
import static org.richfaces.renderkit.RenderKitUtils.toScriptArgs;


public class OrderingListRenderer extends OrderingListRendererBase {

    private static final Attributes PASS_THROUGH_ATTRIBUTES46 = attributes()
            .generic("onclick", "onclick", "click")


            .generic("ondblclick", "ondblclick", "dblclick")


            .generic("onmousedown", "onmousedown", "mousedown")


            .generic("onmousemove", "onmousemove", "mousemove")


            .generic("onmouseout", "onmouseout", "mouseout")


            .generic("onmouseover", "onmouseover", "mouseover")


            .generic("onmouseup", "onmouseup", "mouseup");

    private static final Attributes PASS_THROUGH_ATTRIBUTES47 = attributes()
            .generic("onkeydown", "onkeydown", "keydown")


            .generic("onkeypress", "onkeypress", "keypress")


            .generic("onkeyup", "onkeyup", "keyup");

    private static final Attributes PASS_THROUGH_ATTRIBUTES48 = attributes()
            .generic("onclick", "onlistclick", "listclick")


            .generic("ondblclick", "onlistdblclick", "listdblclick")


            .generic("onkeydown", "onlistkeydown", "listkeydown")


            .generic("onkeypress", "onlistkeypress", "listkeypress")


            .generic("onkeyup", "onlistkeyup", "listkeyup")


            .generic("onmousedown", "onlistmousedown", "listmousedown")


            .generic("onmousemove", "onlistmousemove", "listmousemove")


            .generic("onmouseout", "onlistmouseout", "listmouseout")


            .generic("onmouseover", "onlistmouseover", "listmouseover")


            .generic("onmouseup", "onlistmouseup", "listmouseup");

    private static final Attributes ATTRIBUTES_FOR_SCRIPT_HASH37 = attributes()
            .generic("onbegin", "onbegin")


            .generic("oncomplete", "oncomplete")


            .generic("onerror", "onerror")


            .generic("onbeforedomupdate", "onbeforedomupdate")


            .generic("onchange", "onchange", "change")


            .generic("onblur", "onblur", "blur")


            .generic("onfocus", "onfocus", "focus");

    private static final Attributes ATTRIBUTES_FOR_SCRIPT_HASH38 = attributes()
            .generic("disabled", "disabled")
            .defaultValue(false);


    private static boolean convertToBoolean(Object object) {
        if (object == null) {
            return false;
        }

        if (object instanceof Boolean) {
            return (Boolean) object;
        }

        return Boolean.valueOf(object.toString());
    }

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
        List clientSelectItems = (List) this.getClientSelectItems(facesContext, component);
        Object disabled = (Object) component.getAttributes().get("disabled");
        Boolean hasColumnChildren = (Boolean) this.hasColumnChildren(facesContext, component);
        Object itemClass = (Object) component.getAttributes().get("itemClass");
        Object selectItemClass = (Object) component.getAttributes().get("selectItemClass");
        responseWriter.startElement("div", component);
        {
            Object value = this.concatClasses("rf-ord", component.getAttributes().get("styleClass"), (convertToBoolean(disabled) ? component.getAttributes().get("disabledClass") : ""));
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
                PASS_THROUGH_ATTRIBUTES46);

        responseWriter.startElement("table", component);

        responseWriter.startElement("tr", component);

        responseWriter.startElement("td", component);


        renderPassThroughAttributes(facesContext, component,
                PASS_THROUGH_ATTRIBUTES47);

        responseWriter.startElement("div", component);
        responseWriter.writeAttribute("class", "rf-ord-cntr", null);

        {
            String value = convertToString(clientId) + "List";
            if (null != value &&
                    value.length() > 0
            ) {
                responseWriter.writeAttribute("id", value, null);
            }

        }


        responseWriter.startElement("input", component);
        responseWriter.writeAttribute("class", "rf-ord-fc", null);

        {
            String value = convertToString(clientId) + "ListFocusKeeper";
            if (null != value &&
                    value.length() > 0
            ) {
                responseWriter.writeAttribute("id", value, null);
            }

        }

        {
            String value = convertToString(clientId) + "ListFocusKeeper";
            if (null != value &&
                    value.length() > 0
            ) {
                responseWriter.writeAttribute("name", value, null);
            }

        }

        responseWriter.writeAttribute("type", "button", null);

        responseWriter.writeAttribute("value", "", null);


        responseWriter.endElement("input");
        Object caption = (Object) component.getAttributes().get("caption");
        if ((!isEmpty(caption))) {
            responseWriter.startElement("div", component);
            responseWriter.writeAttribute("class", "rf-ord-cptn", null);


            {
                Object text = caption;
                if (text != null) {
                    responseWriter.writeText(text, null);
                }
            }

            responseWriter.endElement("div");
        }
        responseWriter.startElement("div", component);
        responseWriter.writeAttribute("class", "rf-ord-lst-dcrtn", null);


        renderPassThroughAttributes(facesContext, component,
                PASS_THROUGH_ATTRIBUTES48);

        responseWriter.startElement("div", component);
        responseWriter.writeAttribute("class", "rf-ord-lst-scrl", null);

        {
            String value = convertToString(clientId) + "Scroll";
            if (null != value &&
                    value.length() > 0
            ) {
                responseWriter.writeAttribute("id", value, null);
            }

        }

        {
            String value = this.encodeHeightAndWidth(component);
            if (null != value &&
                    value.length() > 0
            ) {
                responseWriter.writeAttribute("style", value, null);
            }

        }


        if ((!hasColumnChildren)) {
            responseWriter.startElement("div", component);
            {
                String value = convertToString(clientId) + "Items";
                if (null != value &&
                        value.length() > 0
                ) {
                    responseWriter.writeAttribute("id", value, null);
                }

            }


            encodeItems(facesContext, component, clientSelectItems);

            responseWriter.endElement("div");
        } else {
            responseWriter.startElement("div", component);
            responseWriter.writeAttribute("class", "rf-ord-lst", null);

            {
                String value = convertToString(clientId) + "headerBox";
                if (null != value &&
                        value.length() > 0
                ) {
                    responseWriter.writeAttribute("id", value, null);
                }

            }


            responseWriter.startElement("table", component);
            responseWriter.writeAttribute("cellpadding", "0", null);

            responseWriter.writeAttribute("cellspacing", "0", null);

            responseWriter.writeAttribute("class", "rf-ord-tbl", null);


            if (this.isHeaderExists(facesContext, component)) {
                responseWriter.startElement("thead", component);
                responseWriter.writeAttribute("class", "rf-ord-lst-hdr", null);


                encodeHeader(facesContext, component);

                responseWriter.endElement("thead");
            }
            responseWriter.startElement("tbody", component);
            {
                String value = convertToString(clientId) + "Items";
                if (null != value &&
                        value.length() > 0
                ) {
                    responseWriter.writeAttribute("id", value, null);
                }

            }


            encodeRows(facesContext, component, clientSelectItems);

            responseWriter.endElement("tbody");
            responseWriter.endElement("table");
            responseWriter.endElement("div");
        }
        responseWriter.endElement("div");
        responseWriter.endElement("div");
        responseWriter.endElement("div");
        responseWriter.endElement("td");
        responseWriter.startElement("td", component);

        responseWriter.startElement("table", component);

        responseWriter.startElement("tr", component);

        responseWriter.startElement("td", component);

        responseWriter.startElement("button", component);
        {
            String value = this.getButtonClass(component, "rf-ord-up-tp");
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
            String value = convertToString(clientId) + "upTop";
            if (null != value &&
                    value.length() > 0
            ) {
                responseWriter.writeAttribute("name", value, null);
            }

        }

        responseWriter.writeAttribute("type", "button", null);


        {
            Object text = component.getAttributes().get("upTopText");
            if (text != null) {
                responseWriter.writeText(text, null);
            }
        }

        responseWriter.endElement("button");
        responseWriter.endElement("td");
        responseWriter.endElement("tr");
        responseWriter.startElement("tr", component);

        responseWriter.startElement("td", component);

        responseWriter.startElement("button", component);
        {
            String value = this.getButtonClass(component, "rf-ord-up");
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
            String value = convertToString(clientId) + "up";
            if (null != value &&
                    value.length() > 0
            ) {
                responseWriter.writeAttribute("name", value, null);
            }

        }

        responseWriter.writeAttribute("type", "button", null);


        {
            Object text = component.getAttributes().get("upText");
            if (text != null) {
                responseWriter.writeText(text, null);
            }
        }

        responseWriter.endElement("button");
        responseWriter.endElement("td");
        responseWriter.endElement("tr");
        responseWriter.startElement("tr", component);

        responseWriter.startElement("td", component);

        responseWriter.startElement("button", component);
        {
            String value = this.getButtonClass(component, "rf-ord-dn");
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
            String value = convertToString(clientId) + "down";
            if (null != value &&
                    value.length() > 0
            ) {
                responseWriter.writeAttribute("name", value, null);
            }

        }

        responseWriter.writeAttribute("type", "button", null);


        {
            Object text = component.getAttributes().get("downText");
            if (text != null) {
                responseWriter.writeText(text, null);
            }
        }

        responseWriter.endElement("button");
        responseWriter.endElement("td");
        responseWriter.endElement("tr");
        responseWriter.startElement("tr", component);

        responseWriter.startElement("td", component);

        responseWriter.startElement("button", component);
        {
            String value = this.getButtonClass(component, "rf-ord-dn-bt");
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
            String value = convertToString(clientId) + "downBottom";
            if (null != value &&
                    value.length() > 0
            ) {
                responseWriter.writeAttribute("name", value, null);
            }

        }

        responseWriter.writeAttribute("type", "button", null);


        {
            Object text = component.getAttributes().get("downBottomText");
            if (text != null) {
                responseWriter.writeText(text, null);
            }
        }

        responseWriter.endElement("button");
        responseWriter.endElement("td");
        responseWriter.endElement("tr");
        responseWriter.endElement("table");
        responseWriter.endElement("td");
        responseWriter.endElement("tr");
        responseWriter.endElement("table");
        Object hiddenValues = (Object) this.csvEncodeSelectedItems(clientSelectItems);
        responseWriter.startElement("input", component);
        if (null != disabled && (Boolean.valueOf(disabled.toString()) || "disabled".equals(disabled.toString()))) {
            responseWriter.writeAttribute("disabled", "disabled", null);
        }

        {
            String value = convertToString(clientId) + "SelValue";
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
            Object value = hiddenValues;
            if (null != value &&
                    shouldRenderAttribute(value)
            ) {
                responseWriter.writeAttribute("value", value, null);
            }

        }


        responseWriter.endElement("input");
        responseWriter.startElement("script", component);
        responseWriter.writeAttribute("type", "text/javascript", null);


        Map<String, Object> options = new LinkedHashMap<String, Object>();
        addToScriptHash(options, "clientSelectItems", clientSelectItems, null, null);

        addToScriptHash(options, "itemCss", this.concatClasses("rf-ord-opt", component.getAttributes().get("itemClass")), null, null);

        addToScriptHash(options, "selectItemCss", this.concatClasses("rf-ord-sel", component.getAttributes().get("selectItemClass")), null, null);


        addToScriptHash(options, facesContext, component, ATTRIBUTES_FOR_SCRIPT_HASH37, ScriptHashVariableWrapper.eventHandler);


        addToScriptHash(options, facesContext, component, ATTRIBUTES_FOR_SCRIPT_HASH38, null);

        {
            Object text = "new RichFaces.ui.OrderingList(\"" + convertToString(clientId) + "\", " + convertToString(toScriptArgs(options)) + ");";
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
