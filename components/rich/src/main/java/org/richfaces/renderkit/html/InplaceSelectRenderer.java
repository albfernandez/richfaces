package org.richfaces.renderkit.html;

import org.richfaces.component.InplaceState;
import org.richfaces.renderkit.InplaceSelectRendererBase;
import org.richfaces.renderkit.RenderKitUtils.Attributes;
import org.richfaces.renderkit.RenderKitUtils.ScriptHashVariableWrapper;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static org.richfaces.renderkit.RenderKitUtils.addToScriptHash;
import static org.richfaces.renderkit.RenderKitUtils.attributes;
import static org.richfaces.renderkit.RenderKitUtils.renderPassThroughAttributes;
import static org.richfaces.renderkit.RenderKitUtils.toScriptArgs;


public class InplaceSelectRenderer extends InplaceSelectRendererBase {

    private static final Attributes PASS_THROUGH_ATTRIBUTES10 = attributes()
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

    private static final Attributes PASS_THROUGH_ATTRIBUTES11 = attributes()
            .generic("tabindex", "tabindex");

    private static final Attributes ATTRIBUTES_FOR_SCRIPT_HASH7 = attributes()
            .generic("state", "state")


            .generic("saveOnBlur", "saveOnBlur")
            .defaultValue(true)

            .generic("showControls", "showControls")
            .defaultValue(false)

            .generic("openOnEdit", "openOnEdit")
            .defaultValue(true)

            .generic("saveOnSelect", "saveOnSelect")
            .defaultValue(true)

            .generic("inputWidth", "inputWidth");

    private static final Attributes ATTRIBUTES_FOR_SCRIPT_HASH8 = attributes()
            .generic("onbegin", "onbegin")


            .generic("oncomplete", "oncomplete")


            .generic("onerror", "onerror")


            .generic("onbeforedomupdate", "onbeforedomupdate")


            .generic("onselectitem", "onselectitem", "selectitem")


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

        return Boolean.valueOf(object.toString());
    }

    @Override
    public void doEncodeEnd(ResponseWriter responseWriter, FacesContext facesContext, UIComponent component)
            throws IOException {
        String clientId = component.getClientId(facesContext);
        InplaceState inplaceState = (InplaceState) this.getInplaceState(component);
        String inplaceValue = (String) this.getSelectLabel(facesContext, component);
        List clientSelectItems = (List) this.getConvertedSelectItems(facesContext, component);
        String defaultLabel = (String) (((inplaceValue != null) && (inplaceValue.length() != 0)) ? inplaceValue : "\u00A0\u00A0\u00A0");
        responseWriter.startElement("span", component);
        {
            String value = this.getContainerStyleClasses(component);
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
                PASS_THROUGH_ATTRIBUTES10);

        responseWriter.startElement("span", component);
        {
            String value = "rf-is-lbl" + convertToString((isEqual(inplaceValue, component.getAttributes().get("defaultLabel")) ? " rf-is-dflt-lbl" : ""));
            if (null != value &&
                    value.length() > 0
            ) {
                responseWriter.writeAttribute("class", value, null);
            }

        }

        {
            String value = convertToString(clientId) + "Label";
            if (null != value &&
                    value.length() > 0
            ) {
                responseWriter.writeAttribute("id", value, null);
            }

        }


        {
            Object text = defaultLabel;
            if (text != null) {
                responseWriter.writeText(text, null);
            }
        }

        responseWriter.endElement("span");
        if ((!convertToBoolean(component.getAttributes().get("disabled")))) {
            responseWriter.startElement("input", component);
            responseWriter.writeAttribute("class", "rf-is-fc", null);

            {
                String value = convertToString(clientId) + "Focus";
                if (null != value &&
                        value.length() > 0
                ) {
                    responseWriter.writeAttribute("id", value, null);
                }

            }

            {
                String value = convertToString(clientId) + "Focus";
                if (null != value &&
                        value.length() > 0
                ) {
                    responseWriter.writeAttribute("name", value, null);
                }

            }

            responseWriter.writeAttribute("type", "button", null);


            responseWriter.endElement("input");
            responseWriter.startElement("span", component);
            {
                String value = this.getEditStyleClass(component, inplaceState);
                if (null != value &&
                        value.length() > 0
                ) {
                    responseWriter.writeAttribute("class", value, null);
                }

            }

            {
                String value = convertToString(clientId) + "Edit";
                if (null != value &&
                        value.length() > 0
                ) {
                    responseWriter.writeAttribute("id", value, null);
                }

            }


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
            responseWriter.startElement("input", component);
            responseWriter.writeAttribute("autocomplete", "off", null);

            responseWriter.writeAttribute("class", "rf-is-fld", null);

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

            responseWriter.writeAttribute("readonly", "readonly", null);

            {
                String value = this.getInputWidthStyle(component);
                if (null != value &&
                        value.length() > 0
                ) {
                    responseWriter.writeAttribute("style", value, null);
                }

            }

            responseWriter.writeAttribute("type", "text", null);

            {
                String value = this.getSelectInputLabel(facesContext, component);
                if (null != value &&
                        value.length() > 0
                ) {
                    responseWriter.writeAttribute("value", value, null);
                }

            }


            renderPassThroughAttributes(facesContext, component,
                    PASS_THROUGH_ATTRIBUTES11);

            renderInputHandlers(facesContext, component);

            responseWriter.endElement("input");
            if (convertToBoolean(component.getAttributes().get("showControls"))) {
                responseWriter.startElement("span", component);
                responseWriter.writeAttribute("class", "rf-is-btn-prepos", null);


                responseWriter.startElement("span", component);
                responseWriter.writeAttribute("class", "rf-is-btn-pos", null);


                responseWriter.startElement("span", component);
                responseWriter.writeAttribute("class", "rf-is-shdw", null);

                {
                    String value = convertToString(clientId) + "Btnshadow";
                    if (null != value &&
                            value.length() > 0
                    ) {
                        responseWriter.writeAttribute("id", value, null);
                    }

                }


                responseWriter.startElement("span", component);
                responseWriter.writeAttribute("class", "rf-is-shdw-t", null);


                responseWriter.endElement("span");
                responseWriter.startElement("span", component);
                responseWriter.writeAttribute("class", "rf-is-shdw-l", null);


                responseWriter.endElement("span");
                responseWriter.startElement("span", component);
                responseWriter.writeAttribute("class", "rf-is-shdw-r", null);


                responseWriter.endElement("span");
                responseWriter.startElement("span", component);
                responseWriter.writeAttribute("class", "rf-is-shdw-b", null);


                responseWriter.endElement("span");
                responseWriter.startElement("span", component);
                responseWriter.writeAttribute("class", "rf-is-btn-cntr", null);

                {
                    String value = convertToString(clientId) + "Btn";
                    if (null != value &&
                            value.length() > 0
                    ) {
                        responseWriter.writeAttribute("id", value, null);
                    }

                }


                responseWriter.startElement("input", component);
                responseWriter.writeAttribute("class", "rf-is-btn", null);

                {
                    String value = convertToString(clientId) + "Okbtn";
                    if (null != value &&
                            value.length() > 0
                    ) {
                        responseWriter.writeAttribute("id", value, null);
                    }

                }

                {
                    String value = convertToString(clientId) + "Okbtn";
                    if (null != value &&
                            value.length() > 0
                    ) {
                        responseWriter.writeAttribute("name", value, null);
                    }

                }

                responseWriter.writeAttribute("onmousedown", "this.className='rf-is-btn-press'", null);

                responseWriter.writeAttribute("onmouseout", "this.className='rf-is-btn'", null);

                responseWriter.writeAttribute("onmouseup", "this.className='rf-is-btn'", null);

                {
                    String value = this.getResourcePath(facesContext, "org.richfaces", "ico_ok.gif");
                    if (null != value && value.length() > 0) {
                        responseWriter.writeURIAttribute("src", value, null);
                    }
                }

                responseWriter.writeAttribute("type", "image", null);


                responseWriter.endElement("input");
                responseWriter.startElement("input", component);
                responseWriter.writeAttribute("class", "rf-is-btn", null);

                {
                    String value = convertToString(clientId) + "Cancelbtn";
                    if (null != value &&
                            value.length() > 0
                    ) {
                        responseWriter.writeAttribute("id", value, null);
                    }

                }

                {
                    String value = convertToString(clientId) + "Cancelbtn";
                    if (null != value &&
                            value.length() > 0
                    ) {
                        responseWriter.writeAttribute("name", value, null);
                    }

                }

                responseWriter.writeAttribute("onmousedown", "this.className='rf-is-btn-press'", null);

                responseWriter.writeAttribute("onmouseout", "this.className='rf-is-btn'", null);

                responseWriter.writeAttribute("onmouseup", "this.className='rf-is-btn'", null);

                {
                    String value = this.getResourcePath(facesContext, "org.richfaces", "ico_cancel.gif");
                    if (null != value && value.length() > 0) {
                        responseWriter.writeURIAttribute("src", value, null);
                    }
                }

                responseWriter.writeAttribute("type", "image", null);


                responseWriter.endElement("input");
                responseWriter.endElement("span");
                responseWriter.endElement("span");
                responseWriter.endElement("span");
                responseWriter.endElement("span");
            }
            responseWriter.startElement("span", component);
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

            responseWriter.writeAttribute("style", "display: none", null);


            renderListHandlers(facesContext, component);

            responseWriter.startElement("span", component);
            responseWriter.writeAttribute("class", "rf-is-lst-pos", null);

            {
                String value = this.getListWidth(component);
                if (null != value &&
                        value.length() > 0
                ) {
                    responseWriter.writeAttribute("style", value, null);
                }

            }


            responseWriter.startElement("span", component);
            responseWriter.writeAttribute("class", "rf-is-shdw", null);


            responseWriter.startElement("span", component);
            responseWriter.writeAttribute("class", "rf-is-shdw-t", null);


            responseWriter.endElement("span");
            responseWriter.startElement("span", component);
            responseWriter.writeAttribute("class", "rf-is-shdw-l", null);


            responseWriter.endElement("span");
            responseWriter.startElement("span", component);
            responseWriter.writeAttribute("class", "rf-is-shdw-r", null);


            responseWriter.endElement("span");
            responseWriter.startElement("span", component);
            responseWriter.writeAttribute("class", "rf-is-shdw-b", null);


            responseWriter.endElement("span");
            responseWriter.startElement("span", component);
            responseWriter.writeAttribute("class", "rf-is-lst-dec", null);


            responseWriter.startElement("span", component);
            responseWriter.writeAttribute("class", "rf-is-lst-scrl", null);

            {
                String value = this.getListHeight(component);
                if (null != value &&
                        value.length() > 0
                ) {
                    responseWriter.writeAttribute("style", value, null);
                }

            }


            responseWriter.startElement("span", component);
            {
                String value = convertToString(clientId) + "Items";
                if (null != value &&
                        value.length() > 0
                ) {
                    responseWriter.writeAttribute("id", value, null);
                }

            }


            encodeItems(facesContext, component, clientSelectItems);

            responseWriter.endElement("span");
            responseWriter.endElement("span");
            responseWriter.endElement("span");
            responseWriter.endElement("span");
            responseWriter.endElement("span");
            responseWriter.endElement("span");
            responseWriter.endElement("span");
            responseWriter.startElement("script", component);
            responseWriter.writeAttribute("type", "text/javascript", null);


            Map<String, Object> options = new LinkedHashMap<String, Object>();
            addToScriptHash(options, "clientSelectItems", clientSelectItems, null, null);

            addToScriptHash(options, "noneCss", this.concatClasses("rf-is-none", component.getAttributes().get("noneStateClass")), null, null);

            addToScriptHash(options, "changedCss", this.concatClasses("rf-is-chng", component.getAttributes().get("changedClass")), null, null);

            addToScriptHash(options, "editCss", this.concatClasses("rf-is-act", component.getAttributes().get("activeClass")), null, null);

            addToScriptHash(options, "selectItemCss", this.concatClasses("rf-is-sel", component.getAttributes().get("selectItemClass")), null, null);

            addToScriptHash(options, "editEvent", this.getEditEvent(component), null, null);

            addToScriptHash(options, "defaultLabel", defaultLabel, null, null);


            addToScriptHash(options, facesContext, component, ATTRIBUTES_FOR_SCRIPT_HASH7, null);


            addToScriptHash(options, facesContext, component, ATTRIBUTES_FOR_SCRIPT_HASH8, ScriptHashVariableWrapper.eventHandler);

            {
                Object text = "new RichFaces.ui.InplaceSelect(\"" + convertToString(clientId) + "\", " + convertToString(toScriptArgs(options)) + ");";
                if (text != null) {
                    responseWriter.writeText(text, null);
                }
            }

            responseWriter.endElement("script");
        }
        responseWriter.endElement("span");

    }
}
