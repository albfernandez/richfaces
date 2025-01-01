package org.richfaces.renderkit.html;

import org.richfaces.component.InplaceState;
import org.richfaces.renderkit.InplaceInputRendererBase;
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


public class InplaceInputRenderer extends InplaceInputRendererBase {

    private static final Attributes PASS_THROUGH_ATTRIBUTES37 = attributes()
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

    private static final Attributes PASS_THROUGH_ATTRIBUTES38 = attributes()
            .generic("tabindex", "tabindex");

    private static final Attributes ATTRIBUTES_FOR_SCRIPT_HASH31 = attributes()
            .generic("state", "state")
            .generic("saveOnBlur", "saveOnBlur")
            .defaultValue(true)
            .generic("showControls", "showControls")
            .defaultValue(false);

    private static final Attributes ATTRIBUTES_FOR_SCRIPT_HASH32 = attributes()
            .generic("onbegin", "onbegin")
            .generic("oncomplete", "oncomplete")
            .generic("onerror", "onerror")
            .generic("onbeforedomupdate", "onbeforedomupdate")
            .generic("onselectitem", "onselectitem")
            .generic("onchange", "onchange", "change")
            .generic("onblur", "onblur", "blur")
            .generic("onfocus", "onfocus", "focus");

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

        return Boolean.parseBoolean(object.toString());
    }

    @Override
    public void doEncodeEnd(ResponseWriter responseWriter, FacesContext facesContext, UIComponent component) throws IOException {
        String clientId = component.getClientId(facesContext);
        InplaceState inplaceState = this.getInplaceState(component);
        String inplaceValue = this.getValue(facesContext, component);
        String defaultLabel = ((inplaceValue != null) && (!inplaceValue.isEmpty())) ? inplaceValue : "\u00A0\u00A0\u00A0";
        responseWriter.startElement("span", component);

        Object styleClassValue = this.concatClasses(this.getContainerStyleClasses(component), component.getAttributes().get("styleClassValue"));
        if (null != styleClassValue && shouldRenderAttribute(styleClassValue)) {
            responseWriter.writeAttribute("class", styleClassValue, null);
        }

        if (null != clientId && !clientId.isEmpty()) {
            responseWriter.writeAttribute("id", clientId, null);
        }

        renderPassThroughAttributes(facesContext, component, PASS_THROUGH_ATTRIBUTES37);

        responseWriter.startElement("span", component);

        String defaultLabelValue = "rf-ii-lbl" + convertToString((isEqual(inplaceValue, component.getAttributes().get("defaultLabel")) ? " rf-ii-dflt-lbl" : ""));
        responseWriter.writeAttribute("class", defaultLabelValue, null);

        String labelValue = convertToString(clientId) + "Label";
        responseWriter.writeAttribute("id", labelValue, null);

        responseWriter.writeText(defaultLabel, null);

        responseWriter.endElement("span");
        if ((!convertToBoolean(component.getAttributes().get("disabled")))) {
            responseWriter.startElement("input", component);
            responseWriter.writeAttribute("class", "rf-ii-fc", null);

            String focusValue = convertToString(clientId) + "Focus";
            responseWriter.writeAttribute("id", focusValue, null);
            responseWriter.writeAttribute("name", focusValue, null);

            responseWriter.writeAttribute("type", "button", null);

            responseWriter.endElement("input");
            responseWriter.startElement("span", component);

            String editStyleClassValue = this.getEditStyleClass(component, inplaceState);
            if (null != editStyleClassValue && !editStyleClassValue.isEmpty()) {
                responseWriter.writeAttribute("class", editStyleClassValue, null);
            }

            String editValue = convertToString(clientId) + "Edit";
            responseWriter.writeAttribute("id", editValue, null);

            responseWriter.startElement("input", component);
            responseWriter.writeAttribute("autocomplete", "off", null);

            responseWriter.writeAttribute("class", "rf-ii-fld", null);

            String idValue = convertToString(clientId) + "Input";
            responseWriter.writeAttribute("id", idValue, null);

            if (null != clientId && !clientId.isEmpty()) {
                responseWriter.writeAttribute("name", clientId, null);
            }

            String widthValue = "width: " + convertToString(this.getInputWidth(component)) + ";";
            responseWriter.writeAttribute("style", widthValue, null);

            responseWriter.writeAttribute("type", "text", null);

            String value = this.getInputValue(facesContext, component);
            if (null != value && !value.isEmpty()) {
                responseWriter.writeAttribute("value", value, null);
            }

            renderPassThroughAttributes(facesContext, component, PASS_THROUGH_ATTRIBUTES38);
            renderInputHandlers(facesContext, component);
            responseWriter.endElement("input");

            if (convertToBoolean(component.getAttributes().get("showControls"))) {
                responseWriter.startElement("span", component);
                responseWriter.writeAttribute("class", "rf-ii-btn-prepos", null);

                responseWriter.startElement("span", component);
                responseWriter.writeAttribute("class", "rf-ii-btn-pos", null);

                responseWriter.startElement("span", component);
                responseWriter.writeAttribute("class", "rf-ii-btn-shdw", null);

                String btnshadowValue = convertToString(clientId) + "Btnshadow";
                responseWriter.writeAttribute("id", btnshadowValue, null);

                responseWriter.startElement("span", component);
                responseWriter.writeAttribute("class", "rf-ii-btn-shdw-t", null);

                responseWriter.endElement("span");
                responseWriter.startElement("span", component);
                responseWriter.writeAttribute("class", "rf-ii-btn-shdw-l", null);

                responseWriter.endElement("span");
                responseWriter.startElement("span", component);
                responseWriter.writeAttribute("class", "rf-ii-btn-shdw-r", null);

                responseWriter.endElement("span");
                responseWriter.startElement("span", component);
                responseWriter.writeAttribute("class", "rf-ii-btn-shdw-b", null);

                responseWriter.endElement("span");
                responseWriter.startElement("span", component);
                responseWriter.writeAttribute("class", "rf-ii-btn-cntr", null);

                String btnValue = convertToString(clientId) + "Btn";
                responseWriter.writeAttribute("id", btnValue, null);

                responseWriter.startElement("input", component);
                responseWriter.writeAttribute("class", "rf-ii-btn", null);

                String okbtnValue = convertToString(clientId) + "Okbtn";
                responseWriter.writeAttribute("id", okbtnValue, null);
                responseWriter.writeAttribute("name", okbtnValue, null);

                responseWriter.writeAttribute("onmousedown", "this.className='rf-ii-btn-p'", null);

                responseWriter.writeAttribute("onmouseout", "this.className='rf-ii-btn'", null);

                responseWriter.writeAttribute("onmouseup", "this.className='rf-ii-btn'", null);

                String srcValue = this.getResourcePath(facesContext, "org.richfaces", "ico_ok.gif");
                if (null != srcValue && !srcValue.isEmpty()) {
                    responseWriter.writeURIAttribute("src", srcValue, null);
                }

                responseWriter.writeAttribute("tabindex", "-1", null);
                responseWriter.writeAttribute("type", "image", null);

                responseWriter.endElement("input");
                responseWriter.startElement("input", component);
                responseWriter.writeAttribute("class", "rf-ii-btn", null);

                String cancelbtnValue = convertToString(clientId) + "Cancelbtn";
                responseWriter.writeAttribute("id", cancelbtnValue, null);
                responseWriter.writeAttribute("name", cancelbtnValue, null);

                responseWriter.writeAttribute("onmousedown", "this.className='rf-ii-btn-press'", null);

                responseWriter.writeAttribute("onmouseout", "this.className='rf-ii-btn'", null);

                responseWriter.writeAttribute("onmouseup", "this.className='rf-ii-btn'", null);

                String srcCancelValue = this.getResourcePath(facesContext, "org.richfaces", "ico_cancel.gif");
                if (null != srcCancelValue && !srcCancelValue.isEmpty()) {
                    responseWriter.writeURIAttribute("src", srcCancelValue, null);
                }

                responseWriter.writeAttribute("tabindex", "-1", null);

                responseWriter.writeAttribute("type", "image", null);


                responseWriter.endElement("input");
                responseWriter.endElement("span");
                responseWriter.endElement("span");
                responseWriter.endElement("span");
                responseWriter.endElement("span");
            }
            responseWriter.endElement("span");
            responseWriter.startElement("script", component);
            responseWriter.writeAttribute("type", "text/javascript", null);

            Map<String, Object> options = new LinkedHashMap<>();

            addToScriptHash(options, "readyCss", this.concatClasses("rf-ii", component.getAttributes().get("readyStateClass")), null, null);
            addToScriptHash(options, "noneCss", this.concatClasses("rf-ii-none", component.getAttributes().get("noneStateClass")), null, null);
            addToScriptHash(options, "changedCss", this.concatClasses("rf-ii-chng", component.getAttributes().get("changedClass")), null, null);
            addToScriptHash(options, "editCss", this.concatClasses("rf-ii-act", component.getAttributes().get("activeClass")), null, null);
            addToScriptHash(options, "editEvent", this.getEditEvent(component), null, null);
            addToScriptHash(options, "defaultLabel", defaultLabel, null, null);
            addToScriptHash(options, facesContext, component, ATTRIBUTES_FOR_SCRIPT_HASH31, null);
            addToScriptHash(options, facesContext, component, ATTRIBUTES_FOR_SCRIPT_HASH32, ScriptHashVariableWrapper.eventHandler);

            Object text = "new RichFaces.ui.InplaceInput(\"" + convertToString(clientId) + "\", " + convertToString(toScriptArgs(options)) + ");";
            responseWriter.writeText(text, null);

            responseWriter.endElement("script");
        }
        responseWriter.endElement("span");
    }
}
