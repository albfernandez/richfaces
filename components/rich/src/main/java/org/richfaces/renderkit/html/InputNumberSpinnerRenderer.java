package org.richfaces.renderkit.html;

import org.richfaces.renderkit.InputRendererBase;
import org.richfaces.renderkit.RenderKitUtils;
import org.richfaces.renderkit.RenderKitUtils.Attributes;

import javax.faces.application.ResourceDependencies;
import javax.faces.application.ResourceDependency;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import java.io.IOException;

import static org.richfaces.renderkit.RenderKitUtils.attributes;
import static org.richfaces.renderkit.RenderKitUtils.renderPassThroughAttributes;


@ResourceDependencies({@ResourceDependency(name = "jsf.js", library = "javax.faces", target = ""), @ResourceDependency(name = "jquery.js", library = "org.richfaces", target = ""), @ResourceDependency(name = "richfaces.js", library = "org.richfaces", target = ""), @ResourceDependency(name = "richfaces-base-component.js", library = "org.richfaces", target = ""), @ResourceDependency(name = "jquery.position.js", library = "org.richfaces", target = ""), @ResourceDependency(name = "jquery.mousewheel.js", library = "org.richfaces", target = ""), @ResourceDependency(name = "inputNumberSpinner.js", library = "org.richfaces", target = ""), @ResourceDependency(name = "inputNumberSpinner.ecss", library = "org.richfaces", target = "")})
public class InputNumberSpinnerRenderer extends InputRendererBase {

    private static final Attributes PASS_THROUGH_ATTRIBUTES6 = attributes()
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

    private static final Attributes PASS_THROUGH_ATTRIBUTES7 = attributes()
            .generic("accesskey", "accesskey")


            .bool("disabled", "disabled")


            .generic("maxlength", "maxlength")


            .generic("onblur", "onblur", "blur")


            .generic("onclick", "oninputclick", "inputclick")


            .generic("ondblclick", "oninputdblclick", "inputdblclick")


            .generic("onfocus", "onfocus", "focus")


            .generic("onkeydown", "oninputkeydown", "inputkeydown")


            .generic("onkeypress", "oninputkeypress", "inputkeypress")


            .generic("onkeyup", "oninputkeyup", "inputkeyup")


            .generic("onmousedown", "oninputmousedown", "inputmousedown")


            .generic("onmousemove", "oninputmousemove", "inputmousemove")


            .generic("onmouseout", "oninputmouseout", "inputmouseout")


            .generic("onmouseover", "oninputmouseover", "inputmouseover")


            .generic("onmouseup", "oninputmouseup", "inputmouseup")


            .generic("onselect", "onselect", "select")


            .generic("tabindex", "tabindex");

    private static final Attributes PASS_THROUGH_ATTRIBUTES8 = attributes()
            .generic("onclick", "onupclick", "upclick");

    private static final Attributes PASS_THROUGH_ATTRIBUTES9 = attributes()
            .generic("onclick", "ondownclick", "downclick");


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

    @Override
    public void doEncodeEnd(ResponseWriter responseWriter, FacesContext facesContext, UIComponent component)
            throws IOException {
        String clientId = component.getClientId(facesContext);
        responseWriter.startElement("span", component);
        {
            String value = "rf-insp " + convertToString(component.getAttributes().get("styleClass"));
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
                PASS_THROUGH_ATTRIBUTES6);

        Integer inputSize = (Integer) component.getAttributes().get("inputSize");
        responseWriter.startElement("input", component);
        {
            String value = (convertToBoolean(component.getAttributes().get("disableBrowserAutoComplete")) ? "off" : "");
            if (null != value &&
                    value.length() > 0
            ) {
                responseWriter.writeAttribute("autocomplete", value, null);
            }

        }

        {
            String value = "rf-insp-inp " + convertToString(component.getAttributes().get("inputClass"));
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
                responseWriter.writeAttribute("name", value, null);
            }

        }

        if ((!convertToBoolean(component.getAttributes().get("enableManualInput")))) {
            responseWriter.writeAttribute("readonly", "readonly", null);
        }

        {
            Integer value = ((inputSize > 0) ? inputSize : null);
            if (null != value &&
                    value != Integer.MIN_VALUE
            ) {
                responseWriter.writeAttribute("size", value, null);
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
                PASS_THROUGH_ATTRIBUTES7);

        responseWriter.endElement("input");
        responseWriter.startElement("span", component);
        responseWriter.writeAttribute("class", "rf-insp-btns", null);


        responseWriter.startElement("span", component);
        {
            String value = "rf-insp-inc" + convertToString((convertToBoolean(component.getAttributes().get("disabled")) ? "-dis" : ""));
            if (null != value &&
                    value.length() > 0
            ) {
                responseWriter.writeAttribute("class", value, null);
            }

        }


        renderPassThroughAttributes(facesContext, component,
                PASS_THROUGH_ATTRIBUTES8);

        responseWriter.endElement("span");
        responseWriter.startElement("span", component);
        {
            String value = "rf-insp-dec" + convertToString((convertToBoolean(component.getAttributes().get("disabled")) ? "-dis" : ""));
            if (null != value &&
                    value.length() > 0
            ) {
                responseWriter.writeAttribute("class", value, null);
            }

        }


        renderPassThroughAttributes(facesContext, component,
                PASS_THROUGH_ATTRIBUTES9);

        responseWriter.endElement("span");
        responseWriter.endElement("span");
        String onchange = (String) convertToString(RenderKitUtils.getAttributeAndBehaviorsValue(facesContext, component, RenderKitUtils.attributes().generic("onchange", "onchange", "change", "valueChange").first()));
        responseWriter.startElement("script", component);
        responseWriter.writeAttribute("type", "text/javascript", null);


        {
            Object text = "new RichFaces.ui.InputNumberSpinner('" + convertToString(clientId) + "', {\n                cycled: " + convertToString(component.getAttributes().get("cycled")) + ",\n                maxValue: " + convertToString(component.getAttributes().get("maxValue")) + ",\n                minValue: " + convertToString(component.getAttributes().get("minValue")) + ",\n                onchange:\n                " + convertToString(((onchange.length() > 0) ? (("function (event) {" + onchange) + "}") : "null")) + ",\n                step: " + convertToString(component.getAttributes().get("step")) + "\n                });";
            if (text != null) {
                responseWriter.writeText(text, null);
            }
        }

        responseWriter.endElement("script");
        responseWriter.endElement("span");

    }
}
