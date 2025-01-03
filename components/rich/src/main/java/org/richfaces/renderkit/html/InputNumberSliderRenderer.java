package org.richfaces.renderkit.html;

import org.richfaces.renderkit.InputNumberSliderRendererBase;
import org.richfaces.renderkit.RenderKitUtils;
import org.richfaces.renderkit.RenderKitUtils.Attributes;

import jakarta.faces.application.ResourceDependencies;
import jakarta.faces.application.ResourceDependency;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.context.ResponseWriter;
import java.io.IOException;

import static org.richfaces.renderkit.RenderKitUtils.attributes;
import static org.richfaces.renderkit.RenderKitUtils.renderPassThroughAttributes;


@ResourceDependencies({@ResourceDependency(name = "jsf.js", library = "javax.faces", target = ""), @ResourceDependency(name = "jquery.js", library = "org.richfaces", target = ""), @ResourceDependency(name = "richfaces.js", library = "org.richfaces", target = ""), @ResourceDependency(name = "richfaces-base-component.js", library = "org.richfaces", target = ""), @ResourceDependency(name = "jquery.position.js", library = "org.richfaces", target = ""), @ResourceDependency(name = "jquery.mousewheel.js", library = "org.richfaces", target = ""), @ResourceDependency(name = "inputNumberSlider.js", library = "org.richfaces", target = ""), @ResourceDependency(name = "inputNumberSlider.ecss", library = "org.richfaces", target = "")})
public class InputNumberSliderRenderer extends InputNumberSliderRendererBase {

    private static final Attributes PASS_THROUGH_ATTRIBUTES41 = attributes()
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

    private static final Attributes PASS_THROUGH_ATTRIBUTES42 = attributes()
            .generic("accesskey", "accesskey")


            .bool("disabled", "disabled")


            .generic("tabindex", "tabindex");

    private static final Attributes PASS_THROUGH_ATTRIBUTES43 = attributes()
            .generic("accesskey", "accesskey")


            .bool("disabled", "disabled")


            .generic("tabindex", "tabindex");


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
            String value = "rf-insl" + convertToString((this.isBarStyleHandle(component) ? " rf-insl-bar" : "")) + " " + convertToString(component.getAttributes().get("styleClass"));
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
                PASS_THROUGH_ATTRIBUTES41);

        Integer maxlength = (Integer) component.getAttributes().get("maxlength");
        Integer inputSize = (Integer) component.getAttributes().get("inputSize");
        if ((this.isInputPosition(component, "left") || this.isInputPosition(component, "top"))) {
            responseWriter.startElement("span", component);
            responseWriter.writeAttribute("class", "rf-insl-inp-cntr", null);


            responseWriter.startElement("input", component);
            {
                String value = "rf-insl-inp " + convertToString(component.getAttributes().get("inputClass"));
                if (null != value &&
                        value.length() > 0
                ) {
                    responseWriter.writeAttribute("class", value, null);
                }

            }

            {
                String value = convertToString(clientId) + "_input";
                if (null != value &&
                        value.length() > 0
                ) {
                    responseWriter.writeAttribute("id", value, null);
                }

            }

            {
                Integer value = ((maxlength > 0) ? maxlength : null);
                if (null != value &&
                        value != Integer.MIN_VALUE
                ) {
                    responseWriter.writeAttribute("maxlength", value, null);
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

            {
                String value = (convertToBoolean(component.getAttributes().get("showInput")) ? null : "display: none;");
                if (null != value &&
                        value.length() > 0
                ) {
                    responseWriter.writeAttribute("style", value, null);
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
                    PASS_THROUGH_ATTRIBUTES42);

            responseWriter.endElement("input");
            responseWriter.endElement("span");
            if ((this.isInputPosition(component, "top") && convertToBoolean(component.getAttributes().get("showInput")))) {
                responseWriter.startElement("br", component);

                responseWriter.endElement("br");
            }
        }
        if (convertToBoolean(component.getAttributes().get("showArrows"))) {
            responseWriter.startElement("span", component);
            {
                String value = "rf-insl-dec" + convertToString((convertToBoolean(component.getAttributes().get("disabled")) ? "-dis" : "")) + " " + convertToString(component.getAttributes().get("decreaseClass"));
                if (null != value &&
                        value.length() > 0
                ) {
                    responseWriter.writeAttribute("class", value, null);
                }

            }


            responseWriter.endElement("span");
        }
        responseWriter.startElement("span", component);
        responseWriter.writeAttribute("class", "rf-insl-trc-cntr", null);


        if (convertToBoolean(component.getAttributes().get("showBoundaryValues"))) {
            responseWriter.startElement("span", component);
            responseWriter.writeAttribute("class", "rf-insl-mn", null);


            {
                Object text = component.getAttributes().get("minValue");
                if (text != null) {
                    responseWriter.writeText(text, null);
                }
            }

            responseWriter.endElement("span");
            responseWriter.startElement("span", component);
            responseWriter.writeAttribute("class", "rf-insl-mx", null);


            {
                Object text = component.getAttributes().get("maxValue");
                if (text != null) {
                    responseWriter.writeText(text, null);
                }
            }

            responseWriter.endElement("span");
        }
        responseWriter.startElement("span", component);
        {
            String value = "rf-insl-trc " + convertToString(component.getAttributes().get("trackClass"));
            if (null != value &&
                    value.length() > 0
            ) {
                responseWriter.writeAttribute("class", value, null);
            }

        }


        responseWriter.startElement("span", component);
        responseWriter.writeAttribute("class", "rf-insl-hnd-cntr", null);


        responseWriter.startElement("span", component);
        {
            String value = "rf-insl-hnd" + convertToString((convertToBoolean(component.getAttributes().get("disabled")) ? "-dis" : "")) + " " + convertToString(component.getAttributes().get("handleClass"));
            if (null != value &&
                    value.length() > 0
            ) {
                responseWriter.writeAttribute("class", value, null);
            }

        }


        responseWriter.endElement("span");
        responseWriter.endElement("span");
        responseWriter.endElement("span");
        responseWriter.endElement("span");
        if (convertToBoolean(component.getAttributes().get("showArrows"))) {
            responseWriter.startElement("span", component);
            {
                String value = "rf-insl-inc" + convertToString((convertToBoolean(component.getAttributes().get("disabled")) ? "-dis" : "")) + " " + convertToString(component.getAttributes().get("increaseClass"));
                if (null != value &&
                        value.length() > 0
                ) {
                    responseWriter.writeAttribute("class", value, null);
                }

            }


            responseWriter.endElement("span");
        }
        if ((this.isInputPosition(component, "right") || this.isInputPosition(component, "bottom"))) {
            if ((this.isInputPosition(component, "bottom") && convertToBoolean(component.getAttributes().get("showInput")))) {
                responseWriter.startElement("br", component);

                responseWriter.endElement("br");
            }
            responseWriter.startElement("span", component);
            responseWriter.writeAttribute("class", "rf-insl-inp-cntr", null);


            responseWriter.startElement("input", component);
            {
                String value = "rf-insl-inp " + convertToString(component.getAttributes().get("inputClass"));
                if (null != value &&
                        value.length() > 0
                ) {
                    responseWriter.writeAttribute("class", value, null);
                }

            }

            {
                String value = convertToString(clientId) + "_input";
                if (null != value &&
                        value.length() > 0
                ) {
                    responseWriter.writeAttribute("id", value, null);
                }

            }

            {
                Integer value = ((maxlength > 0) ? maxlength : null);
                if (null != value &&
                        value != Integer.MIN_VALUE
                ) {
                    responseWriter.writeAttribute("maxlength", value, null);
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

            {
                String value = (convertToBoolean(component.getAttributes().get("showInput")) ? null : "display: none;");
                if (null != value &&
                        value.length() > 0
                ) {
                    responseWriter.writeAttribute("style", value, null);
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
                    PASS_THROUGH_ATTRIBUTES43);

            responseWriter.endElement("input");
            responseWriter.endElement("span");
        }
        if (convertToBoolean(component.getAttributes().get("showTooltip"))) {
            responseWriter.startElement("span", component);
            {
                String value = "rf-insl-tt " + convertToString(component.getAttributes().get("tooltipClass"));
                if (null != value &&
                        value.length() > 0
                ) {
                    responseWriter.writeAttribute("class", value, null);
                }

            }


            {
                Object text = this.getInputValue(facesContext, component);
                if (text != null) {
                    responseWriter.writeText(text, null);
                }
            }

            responseWriter.endElement("span");
        }
        String onchange = (String) convertToString(RenderKitUtils.getAttributeAndBehaviorsValue(facesContext, component, RenderKitUtils.attributes().generic("onchange", "onchange", "change", "valueChange").first()));
        responseWriter.startElement("script", component);
        responseWriter.writeAttribute("type", "text/javascript", null);


        {
            Object text = "new RichFaces.ui.InputNumberSlider('" + convertToString(clientId) + "', {\n                delay: " + convertToString(component.getAttributes().get("delay")) + ",\n                disabled: " + convertToString(component.getAttributes().get("disabled")) + ",\n                handleType: '" + convertToString(component.getAttributes().get("handleType")) + "',\n                maxValue: " + convertToString(component.getAttributes().get("maxValue")) + ",\n                minValue:\n                " + convertToString(component.getAttributes().get("minValue")) + ",\n                onchange: " + convertToString(((onchange.length() > 0) ? (("function (event) {" + onchange) + "}") : "null")) + ",\n                step: " + convertToString(component.getAttributes().get("step")) + ",\n                tabIndex:\n                " + convertToString((convertToBoolean(RenderKitUtils.shouldRenderAttribute(component.getAttributes().get("tabindex"))) ? component.getAttributes().get("tabindex") : "null")) + "\n                }, {\n                decreaseSelectedClass: '" + convertToString(component.getAttributes().get("decreaseSelectedClass")) + "',\n                handleSelectedClass:\n                '" + convertToString(component.getAttributes().get("handleSelectedClass")) + "',\n                increaseSelectedClass:\n                '" + convertToString(component.getAttributes().get("increaseSelectedClass")) + "'\n                });";
            if (text != null) {
                responseWriter.writeText(text, null);
            }
        }

        responseWriter.endElement("script");
        responseWriter.endElement("span");

    }
}
