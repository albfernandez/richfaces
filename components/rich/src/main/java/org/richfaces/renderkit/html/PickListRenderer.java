package org.richfaces.renderkit.html;

import org.richfaces.renderkit.PickListRendererBase;
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


public class PickListRenderer extends PickListRendererBase {

    private static final Attributes PASS_THROUGH_ATTRIBUTES28 = attributes()
            .generic("onclick", "onclick", "click")


            .generic("ondblclick", "ondblclick", "dblclick")


            .generic("onkeydown", "onkeydown", "keydown")


            .generic("onkeypress", "onkeypress", "keypress")


            .generic("onkeyup", "onkeyup", "keyup")


            .generic("onmousedown", "onmousedown", "mousedown")


            .generic("onmousemove", "onmousemove", "mousemove")


            .generic("onmouseout", "onmouseout", "mouseout")


            .generic("onmouseover", "onmouseover", "mouseover")


            .generic("onmouseup", "onmouseup", "mouseup");

    private static final Attributes PASS_THROUGH_ATTRIBUTES29 = attributes()
            .generic("onkeydown", "onsourcekeydown", "listkeydown")


            .generic("onkeypress", "onsourcekeypress", "listkeypress")


            .generic("onkeyup", "onsourcekeyup", "listkeyup");

    private static final Attributes PASS_THROUGH_ATTRIBUTES30 = attributes()
            .generic("onclick", "onsourceclick", "listclick")


            .generic("ondblclick", "onsourcedblclick", "listdblclick")


            .generic("onmousedown", "onsourcemousedown", "listmousedown")


            .generic("onmousemove", "onsourcemousemove", "listmousemove")


            .generic("onmouseout", "onsourcemouseout", "listmouseout")


            .generic("onmouseover", "onsourcemouseover", "listmouseover")


            .generic("onmouseup", "onsourcemouseup", "listmouseup");

    private static final Attributes PASS_THROUGH_ATTRIBUTES31 = attributes()
            .generic("onkeydown", "ontargetkeydown", "listkeydown")


            .generic("onkeypress", "ontargetkeypress", "listkeypress")


            .generic("onkeyup", "ontargetkeyup", "listkeyup");

    private static final Attributes PASS_THROUGH_ATTRIBUTES32 = attributes()
            .generic("onclick", "ontargetclick", "listclick")


            .generic("ondblclick", "ontargetdblclick", "listdblclick")


            .generic("onmousedown", "ontargetmousedown", "listmousedown")


            .generic("onmousemove", "ontargetmousemove", "listmousemove")


            .generic("onmouseout", "ontargetmouseout", "listmouseout")


            .generic("onmouseover", "ontargetmouseover", "listmouseover")


            .generic("onmouseup", "ontargetmouseup", "listmouseup");

    private static final Attributes ATTRIBUTES_FOR_SCRIPT_HASH22 = attributes()
            .generic("onbegin", "onbegin")


            .generic("oncomplete", "oncomplete")


            .generic("onerror", "onerror")


            .generic("onbeforedomupdate", "onbeforedomupdate")


            .generic("onchange", "onchange", "change")


            .generic("onblur", "onblur", "blur")


            .generic("onsourceblur", "onsourceblur", "sourceblur")


            .generic("ontargetblur", "ontargetblur", "targetblur")


            .generic("onadditems", "onadditems", "additems")


            .generic("onremoveitems", "onremoveitems", "removeitems")


            .generic("onfocus", "onfocus", "focus")


            .generic("onsourcefocus", "onsourcefocus", "sourcefocus")


            .generic("ontargetfocus", "ontargetfocus", "targetfocus");

    private static final Attributes ATTRIBUTES_FOR_SCRIPT_HASH23 = attributes()
            .generic("disabled", "disabled")
            .defaultValue(false)

            .generic("switchByClick", "switchByClick")
            .defaultValue(false)

            .generic("switchByDblClick", "switchByDblClick")
            .defaultValue(true)

            .generic("keepSourceOrder", "keepSourceOrder")
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
        responseWriter.startElement("div", component);
        {
            Object value = this.concatClasses("rf-pick", component.getAttributes().get("styleClass"), (convertToBoolean(disabled) ? component.getAttributes().get("disabledClass") : ""));
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

        responseWriter.writeAttribute("tabindex", "-1", null);


        renderPassThroughAttributes(facesContext, component,
                PASS_THROUGH_ATTRIBUTES28);

        responseWriter.startElement("table", component);

        responseWriter.startElement("tr", component);

        responseWriter.startElement("td", component);


        renderPassThroughAttributes(facesContext, component,
                PASS_THROUGH_ATTRIBUTES29);

        responseWriter.startElement("div", component);
        {
            String value = convertToString(clientId) + "Source";
            if (null != value &&
                    value.length() > 0
            ) {
                responseWriter.writeAttribute("id", value, null);
            }

        }


        responseWriter.startElement("div", component);
        responseWriter.writeAttribute("class", "rf-pick-src", null);

        {
            String value = convertToString(clientId) + "SourceList";
            if (null != value &&
                    value.length() > 0
            ) {
                responseWriter.writeAttribute("id", value, null);
            }

        }


        responseWriter.startElement("input", component);
        responseWriter.writeAttribute("class", "rf-pick-fc", null);

        {
            String value = convertToString(clientId) + "SourceListFocusKeeper";
            if (null != value &&
                    value.length() > 0
            ) {
                responseWriter.writeAttribute("id", value, null);
            }

        }

        {
            String value = convertToString(clientId) + "SourceListFocusKeeper";
            if (null != value &&
                    value.length() > 0
            ) {
                responseWriter.writeAttribute("name", value, null);
            }

        }

        responseWriter.writeAttribute("type", "button", null);

        responseWriter.writeAttribute("value", "", null);


        responseWriter.endElement("input");
        Object sourceCaption = (Object) component.getAttributes().get("sourceCaption");
        if ((!isEmpty(sourceCaption))) {
            responseWriter.startElement("div", component);
            responseWriter.writeAttribute("class", "rf-pick-src-cptn", null);


            {
                Object text = sourceCaption;
                if (text != null) {
                    responseWriter.writeText(text, null);
                }
            }

            responseWriter.endElement("div");
        }
        responseWriter.startElement("div", component);
        responseWriter.writeAttribute("class", "rf-pick-lst-dcrtn", null);


        renderPassThroughAttributes(facesContext, component,
                PASS_THROUGH_ATTRIBUTES30);

        responseWriter.startElement("div", component);
        responseWriter.writeAttribute("class", "rf-pick-lst-scrl", null);

        {
            String value = convertToString(clientId) + "SourceScroll";
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
                String value = convertToString(clientId) + "SourceItems";
                if (null != value &&
                        value.length() > 0
                ) {
                    responseWriter.writeAttribute("id", value, null);
                }

            }


            encodeSourceItems(facesContext, component, clientSelectItems);

            responseWriter.endElement("div");
        } else {
            responseWriter.startElement("div", component);
            responseWriter.writeAttribute("class", "rf-pick-lst", null);

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

            responseWriter.writeAttribute("class", "rf-pick-tbl", null);


            if (this.isHeaderExists(facesContext, component)) {
                responseWriter.startElement("thead", component);
                responseWriter.writeAttribute("class", "rf-pick-lst-hdr", null);


                encodeSourceHeader(facesContext, component);

                responseWriter.endElement("thead");
            }
            responseWriter.startElement("tbody", component);
            {
                String value = convertToString(clientId) + "SourceItems";
                if (null != value &&
                        value.length() > 0
                ) {
                    responseWriter.writeAttribute("id", value, null);
                }

            }


            encodeSourceRows(facesContext, component, clientSelectItems);

            responseWriter.endElement("tbody");
            responseWriter.endElement("table");
            responseWriter.endElement("div");
        }
        responseWriter.endElement("div");
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
            String value = this.getButtonClass(component, "rf-pick-add-all");
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
            String value = convertToString(clientId) + "addAll";
            if (null != value &&
                    value.length() > 0
            ) {
                responseWriter.writeAttribute("name", value, null);
            }

        }

        responseWriter.writeAttribute("type", "button", null);


        {
            Object text = component.getAttributes().get("addAllText");
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
            String value = this.getButtonClass(component, "rf-pick-add");
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
            String value = convertToString(clientId) + "add";
            if (null != value &&
                    value.length() > 0
            ) {
                responseWriter.writeAttribute("name", value, null);
            }

        }

        responseWriter.writeAttribute("type", "button", null);


        {
            Object text = component.getAttributes().get("addText");
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
            String value = this.getButtonClass(component, "rf-pick-rem");
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
            String value = convertToString(clientId) + "remove";
            if (null != value &&
                    value.length() > 0
            ) {
                responseWriter.writeAttribute("name", value, null);
            }

        }

        responseWriter.writeAttribute("type", "button", null);


        {
            Object text = component.getAttributes().get("removeText");
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
            String value = this.getButtonClass(component, "rf-pick-rem-all");
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
            String value = convertToString(clientId) + "removeAll";
            if (null != value &&
                    value.length() > 0
            ) {
                responseWriter.writeAttribute("name", value, null);
            }

        }

        responseWriter.writeAttribute("type", "button", null);


        {
            Object text = component.getAttributes().get("removeAllText");
            if (text != null) {
                responseWriter.writeText(text, null);
            }
        }

        responseWriter.endElement("button");
        responseWriter.endElement("td");
        responseWriter.endElement("tr");
        responseWriter.endElement("table");
        responseWriter.endElement("td");
        responseWriter.startElement("td", component);

        responseWriter.startElement("table", component);
        {
            String value = convertToString(clientId) + "Target";
            if (null != value &&
                    value.length() > 0
            ) {
                responseWriter.writeAttribute("id", value, null);
            }

        }


        responseWriter.startElement("tr", component);

        responseWriter.startElement("td", component);


        renderPassThroughAttributes(facesContext, component,
                PASS_THROUGH_ATTRIBUTES31);

        responseWriter.startElement("div", component);

        responseWriter.startElement("div", component);
        responseWriter.writeAttribute("class", "rf-pick-tgt", null);

        {
            String value = convertToString(clientId) + "TargetList";
            if (null != value &&
                    value.length() > 0
            ) {
                responseWriter.writeAttribute("id", value, null);
            }

        }


        responseWriter.startElement("input", component);
        responseWriter.writeAttribute("class", "rf-pick-fc", null);

        {
            String value = convertToString(clientId) + "TargetListFocusKeeper";
            if (null != value &&
                    value.length() > 0
            ) {
                responseWriter.writeAttribute("id", value, null);
            }

        }

        {
            String value = convertToString(clientId) + "TargetListFocusKeeper";
            if (null != value &&
                    value.length() > 0
            ) {
                responseWriter.writeAttribute("name", value, null);
            }

        }

        responseWriter.writeAttribute("type", "button", null);

        responseWriter.writeAttribute("value", "", null);


        responseWriter.endElement("input");
        Object targetCaption = (Object) component.getAttributes().get("targetCaption");
        if ((!isEmpty(targetCaption))) {
            responseWriter.startElement("div", component);
            responseWriter.writeAttribute("class", "rf-pick-tgt-cptn", null);


            {
                Object text = targetCaption;
                if (text != null) {
                    responseWriter.writeText(text, null);
                }
            }

            responseWriter.endElement("div");
        }
        responseWriter.startElement("div", component);
        responseWriter.writeAttribute("class", "rf-pick-lst-dcrtn", null);


        renderPassThroughAttributes(facesContext, component,
                PASS_THROUGH_ATTRIBUTES32);

        responseWriter.startElement("div", component);
        responseWriter.writeAttribute("class", "rf-pick-lst-scrl", null);

        {
            String value = convertToString(clientId) + "TargetScroll";
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
                String value = convertToString(clientId) + "TargetItems";
                if (null != value &&
                        value.length() > 0
                ) {
                    responseWriter.writeAttribute("id", value, null);
                }

            }


            encodeTargetItems(facesContext, component, clientSelectItems);

            responseWriter.endElement("div");
        } else {
            responseWriter.startElement("div", component);
            responseWriter.writeAttribute("class", "rf-pick-lst", null);

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

            responseWriter.writeAttribute("class", "rf-pick-tbl", null);


            if (this.isHeaderExists(facesContext, component)) {
                responseWriter.startElement("thead", component);
                responseWriter.writeAttribute("class", "rf-pick-lst-hdr", null);


                encodeTargetHeader(facesContext, component);

                responseWriter.endElement("thead");
            }
            responseWriter.startElement("tbody", component);
            {
                String value = convertToString(clientId) + "TargetItems";
                if (null != value &&
                        value.length() > 0
                ) {
                    responseWriter.writeAttribute("id", value, null);
                }

            }


            encodeTargetRows(facesContext, component, clientSelectItems);

            responseWriter.endElement("tbody");
            responseWriter.endElement("table");
            responseWriter.endElement("div");
        }
        responseWriter.endElement("div");
        responseWriter.endElement("div");
        responseWriter.endElement("div");
        responseWriter.endElement("div");
        responseWriter.endElement("td");
        if (convertToBoolean(component.getAttributes().get("orderable"))) {
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
        }
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

        addToScriptHash(options, "itemCss", this.concatClasses("rf-pick-opt", component.getAttributes().get("itemClass")), null, null);

        addToScriptHash(options, "orderable", component.getAttributes().get("orderable"), null, null);

        addToScriptHash(options, "selectItemCss", this.concatClasses("rf-pick-sel", component.getAttributes().get("selectItemClass")), null, null);


        addToScriptHash(options, facesContext, component, ATTRIBUTES_FOR_SCRIPT_HASH22, ScriptHashVariableWrapper.eventHandler);


        addToScriptHash(options, facesContext, component, ATTRIBUTES_FOR_SCRIPT_HASH23, null);

        {
            Object text = "new RichFaces.ui.PickList(\"" + convertToString(clientId) + "\", " + convertToString(toScriptArgs(options)) + ");";
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
