package org.richfaces.renderkit.html;

import org.richfaces.component.AbstractCalendar.Mode;
import org.richfaces.component.Positioning;
import org.richfaces.renderkit.CalendarRendererBase;
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


public class CalendarRenderer extends CalendarRendererBase {

    private static final Attributes PASS_THROUGH_ATTRIBUTES21 = attributes()
            .generic("title", "title");

    private static final Attributes PASS_THROUGH_ATTRIBUTES22 = attributes()
            .generic("title", "title");

    private static final Attributes ATTRIBUTES_FOR_SCRIPT_HASH20 = attributes()
            .generic("enableManualInput", "enableManualInput")
            .defaultValue(false)

            .generic("disabled", "disabled")
            .defaultValue(false)

            .generic("readonly", "readonly")
            .defaultValue(false)

            .generic("resetTimeOnDateSelect", "resetTimeOnDateSelect")
            .defaultValue(false)

            .generic("showApplyButton", "showApplyButton")
            .defaultValue(false)

            .generic("popup", "popup")
            .defaultValue(true)

            .generic("showInput", "showInput")
            .defaultValue(true)

            .generic("showHeader", "showHeader")
            .defaultValue(true)

            .generic("showFooter", "showFooter")
            .defaultValue(true)

            .generic("showWeeksBar", "showWeeksBar")
            .defaultValue(true)

            .generic("datePattern", "datePattern")


            .generic("hidePopupOnScrol", "hidePopupOnScrol")


            .generic("showWeekDaysBar", "showWeekDaysBar")
            .defaultValue(true)

            .generic("defaultLabel", "defaultLabel");

    private static final Attributes ATTRIBUTES_FOR_SCRIPT_HASH21 = attributes()
            .generic("onchange", "onchange", "change")


            .generic("ondateselect", "ondateselect", "dateselect")


            .generic("oncurrentdateselect", "oncurrentdateselect", "currentdateselect")


            .generic("onbeforedateselect", "onbeforedateselect", "beforedateselect")


            .generic("onbeforecurrentdateselect", "onbeforecurrentdateselect", "beforecurrentdateselect")


            .generic("onhide", "onhide", "hide")


            .generic("onshow", "onshow", "show")


            .generic("ondatemouseover", "ondatemouseover", "datemouseover")


            .generic("ondatemouseout", "ondatemouseout", "datemouseout")


            .generic("onclean", "onclean", "clean")


            .generic("ontimeselect", "ontimeselect", "timeselect")


            .generic("onbeforetimeselect", "onbeforetimeselect", "beforetimeselect");


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
        responseWriter.startElement("div", component);
        {
            Object value = this.concatClasses("rf-cal", component.getAttributes().get("styleClass"));
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
        {
            String value = convertToString(clientId) + "Popup";
            if (null != value &&
                    value.length() > 0
            ) {
                responseWriter.writeAttribute("id", value, null);
            }

        }

        {
            String value = (convertToBoolean(component.getAttributes().get("popup")) ? "white-space: nowrap;" : "display: none;");
            if (null != value &&
                    value.length() > 0
            ) {
                responseWriter.writeAttribute("style", value, null);
            }

        }


        if ((!convertToBoolean(component.getAttributes().get("popup")))) {
            responseWriter.startElement("input", component);
            responseWriter.writeAttribute("autocomplete", "off", null);

            {
                String value = convertToString(clientId) + "InputDate";
                if (null != value &&
                        value.length() > 0
                ) {
                    responseWriter.writeAttribute("id", value, null);
                }

            }

            {
                String value = convertToString(clientId) + "InputDate";
                if (null != value &&
                        value.length() > 0
                ) {
                    responseWriter.writeAttribute("name", value, null);
                }

            }

            responseWriter.writeAttribute("style", "display:none", null);

            responseWriter.writeAttribute("type", "hidden", null);

            {
                String value = this.getInputValue(facesContext, component);
                if (null != value &&
                        value.length() > 0
                ) {
                    responseWriter.writeAttribute("value", value, null);
                }

            }


            renderPassThroughAttributes(facesContext, component,
                    PASS_THROUGH_ATTRIBUTES21);

            responseWriter.endElement("input");
        } else {
            responseWriter.startElement("input", component);
            {
                Object value = component.getAttributes().get("accesskey");
                if (null != value &&
                        shouldRenderAttribute(value)
                ) {
                    responseWriter.writeAttribute("accesskey", value, null);
                }

            }

            {
                String value = "rf-cal-inp " + convertToString(component.getAttributes().get("inputClass"));
                if (null != value &&
                        value.length() > 0
                ) {
                    responseWriter.writeAttribute("class", value, null);
                }

            }

            if (null != component.getAttributes().get("disabled") && (Boolean.valueOf(component.getAttributes().get("disabled").toString()) || "disabled".equals(component.getAttributes().get("disabled").toString()))) {
                responseWriter.writeAttribute("disabled", "disabled", null);
            }

            {
                String value = convertToString(clientId) + "InputDate";
                if (null != value &&
                        value.length() > 0
                ) {
                    responseWriter.writeAttribute("id", value, null);
                }

            }

            {
                Object value = component.getAttributes().get("maxlength");
                if (null != value &&
                        shouldRenderAttribute(value)
                ) {
                    responseWriter.writeAttribute("maxlength", value, null);
                }

            }

            {
                String value = convertToString(clientId) + "InputDate";
                if (null != value &&
                        value.length() > 0
                ) {
                    responseWriter.writeAttribute("name", value, null);
                }

            }

            if ("readonly".equals((((!convertToBoolean(component.getAttributes().get("enableManualInput"))) || convertToBoolean(component.getAttributes().get("readonly"))) ? "readonly" : "")) || Boolean.valueOf((((!convertToBoolean(component.getAttributes().get("enableManualInput"))) || convertToBoolean(component.getAttributes().get("readonly"))) ? "readonly" : ""))) {
                responseWriter.writeAttribute("readonly", "readonly", null);
            }

            {
                Object value = component.getAttributes().get("inputSize");
                if (null != value &&
                        shouldRenderAttribute(value)
                ) {
                    responseWriter.writeAttribute("size", value, null);
                }

            }

            {
                String value = "vertical-align: middle; " + convertToString(component.getAttributes().get("inputStyle"));
                if (null != value &&
                        value.length() > 0
                ) {
                    responseWriter.writeAttribute("style", value, null);
                }

            }

            {
                Object value = component.getAttributes().get("tabindex");
                if (null != value &&
                        shouldRenderAttribute(value)
                ) {
                    responseWriter.writeAttribute("tabindex", value, null);
                }

            }

            {
                String value = (convertToBoolean(component.getAttributes().get("showInput")) ? "text" : "hidden");
                if (null != value &&
                        value.length() > 0
                ) {
                    responseWriter.writeAttribute("type", value, null);
                }

            }

            {
                String value = this.getInputValue(facesContext, component);
                if (null != value &&
                        value.length() > 0
                ) {
                    responseWriter.writeAttribute("value", value, null);
                }

            }


            renderPassThroughAttributes(facesContext, component,
                    PASS_THROUGH_ATTRIBUTES22);

            renderInputHandlers(facesContext, component);

            responseWriter.endElement("input");
            if (this.isUseIcons(facesContext, component)) {
                responseWriter.startElement("img", component);
                {
                    Object value = component.getAttributes().get("accesskey");
                    if (null != value &&
                            shouldRenderAttribute(value)
                    ) {
                        responseWriter.writeAttribute("accesskey", value, null);
                    }

                }

                responseWriter.writeAttribute("alt", "", null);

                {
                    String value = "rf-cal-btn " + convertToString(component.getAttributes().get("buttonClass"));
                    if (null != value &&
                            value.length() > 0
                    ) {
                        responseWriter.writeAttribute("class", value, null);
                    }

                }

                {
                    String value = convertToString(clientId) + "PopupButton";
                    if (null != value &&
                            value.length() > 0
                    ) {
                        responseWriter.writeAttribute("id", value, null);
                    }

                }

                {
                    String value = this.getButtonIcon(facesContext, component);
                    if (null != value && value.length() > 0) {
                        responseWriter.writeURIAttribute("src", value, null);
                    }
                }

                responseWriter.writeAttribute("style", "vertical-align: middle", null);

                {
                    Object value = component.getAttributes().get("tabindex");
                    if (null != value &&
                            shouldRenderAttribute(value)
                    ) {
                        responseWriter.writeAttribute("tabindex", value, null);
                    }

                }


                responseWriter.endElement("img");
            } else {
                responseWriter.startElement("button", component);
                {
                    String value = "rf-cal-btn " + convertToString(component.getAttributes().get("buttonClass"));
                    if (null != value &&
                            value.length() > 0
                    ) {
                        responseWriter.writeAttribute("class", value, null);
                    }

                }

                if (null != component.getAttributes().get("disabled") && (Boolean.valueOf(component.getAttributes().get("disabled").toString()) || "disabled".equals(component.getAttributes().get("disabled").toString()))) {
                    responseWriter.writeAttribute("disabled", "disabled", null);
                }

                {
                    String value = convertToString(clientId) + "PopupButton";
                    if (null != value &&
                            value.length() > 0
                    ) {
                        responseWriter.writeAttribute("id", value, null);
                    }

                }

                {
                    String value = convertToString(clientId) + "PopupButton";
                    if (null != value &&
                            value.length() > 0
                    ) {
                        responseWriter.writeAttribute("name", value, null);
                    }

                }

                responseWriter.writeAttribute("style", "vertical-align: middle", null);

                {
                    Object value = component.getAttributes().get("tabindex");
                    if (null != value &&
                            shouldRenderAttribute(value)
                    ) {
                        responseWriter.writeAttribute("tabindex", value, null);
                    }

                }

                responseWriter.writeAttribute("type", "button", null);


                {
                    Object text = component.getAttributes().get("buttonLabel");
                    if (text != null) {
                        responseWriter.writeText(text, null);
                    }
                }

                responseWriter.endElement("button");
            }
        }
        responseWriter.startElement("input", component);
        responseWriter.writeAttribute("autocomplete", "off", null);

        {
            String value = convertToString(clientId) + "InputCurrentDate";
            if (null != value &&
                    value.length() > 0
            ) {
                responseWriter.writeAttribute("id", value, null);
            }

        }

        {
            String value = convertToString(clientId) + "InputCurrentDate";
            if (null != value &&
                    value.length() > 0
            ) {
                responseWriter.writeAttribute("name", value, null);
            }

        }

        responseWriter.writeAttribute("style", "display:none", null);

        responseWriter.writeAttribute("type", "hidden", null);

        {
            String value = this.getCurrentDateAsString(facesContext, component);
            if (null != value &&
                    value.length() > 0
            ) {
                responseWriter.writeAttribute("value", value, null);
            }

        }


        responseWriter.endElement("input");
        responseWriter.endElement("span");
        responseWriter.startElement("span", component);
        {
            String value = convertToString(clientId) + "Content";
            if (null != value &&
                    value.length() > 0
            ) {
                responseWriter.writeAttribute("id", value, null);
            }

        }

        responseWriter.writeAttribute("style", "display: none;", null);


        responseWriter.endElement("span");
        responseWriter.startElement("span", component);
        {
            String value = convertToString(clientId) + "Script";
            if (null != value &&
                    value.length() > 0
            ) {
                responseWriter.writeAttribute("id", value, null);
            }

        }

        responseWriter.writeAttribute("style", "display: none;", null);


        responseWriter.startElement("script", component);
        responseWriter.writeAttribute("type", "text/javascript", null);


        Map<String, Object> options = new LinkedHashMap<String, Object>();


        addToScriptHash(options, facesContext, component, ATTRIBUTES_FOR_SCRIPT_HASH20, null);


        addToScriptHash(options, facesContext, component, ATTRIBUTES_FOR_SCRIPT_HASH21, ScriptHashVariableWrapper.eventHandler);
        addToScriptHash(options, "mode", this.getModeOrDefault(component), Mode.client, null);

        addToScriptHash(options, "todayControlMode", this.getTodayControlModeOrDefault(component), "select", null);

        addToScriptHash(options, "direction", this.getDirection(component), Positioning.DEFAULT.getValue(), null);

        addToScriptHash(options, "jointPoint", this.getJointPoint(component), Positioning.DEFAULT.getValue(), null);

        addToScriptHash(options, "horizontalOffset", component.getAttributes().get("horizontalOffset"), 0, null);

        addToScriptHash(options, "verticalOffset", component.getAttributes().get("verticalOffset"), 0, null);

        addToScriptHash(options, "boundaryDatesMode", this.getBoundaryDatesModeOrDefault(component), "inactive", null);

        addToScriptHash(options, "currentDate", this.getCurrentDate(facesContext, component), null, null);

        addToScriptHash(options, "selectedDate", this.getSelectedDate(facesContext, component), null, null);

        addToScriptHash(options, "dayCellClass", this.getDayCellClass(facesContext, component), null, null);

        addToScriptHash(options, "dayStyleClass", this.getDayStyleClass(facesContext, component), null, null);

        addToScriptHash(options, "isDayEnabled", this.getDayEnabled(facesContext, component), null, null);

        addToScriptHash(options, "labels", this.getLabels(facesContext, component), null, null);

        addToScriptHash(options, "defaultTime", this.getPreparedDefaultTime(facesContext, component), null, null);

        addToScriptHash(options, "style", this.getPopupStyle(facesContext, component), null, null);

        addToScriptHash(options, "styleClass", component.getAttributes().get("popupClass"), null, null);


        {
            Object text = "RichFaces.ui.Calendar.addLocale(\"" + convertToString(this.getAsLocale(facesContext, component).toString()) + "\",\n                    " + convertToString(toScriptArgs(this.getLocaleOptions(facesContext, component))) + ");\n                    new RichFaces.ui.Calendar(\"" + convertToString(clientId) + "\",\n                    \"" + convertToString(this.getAsLocale(facesContext, component).toString()) + "\",\n                    " + convertToString(toScriptArgs(options)) + ").load(" + convertToString(this.writePreloadBody(facesContext, component)) + ");";
            if (text != null) {
                responseWriter.writeText(text, null);
            }
        }

        responseWriter.endElement("script");
        responseWriter.endElement("span");
        responseWriter.endElement("div");

    }
}
