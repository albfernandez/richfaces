package org.richfaces.renderkit.html;

import org.richfaces.renderkit.ControlsState;
import org.richfaces.renderkit.DataScrollerBaseRenderer;
import org.richfaces.renderkit.RenderKitUtils.Attributes;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import java.io.IOException;
import java.util.Map;

import static org.richfaces.renderkit.RenderKitUtils.attributes;
import static org.richfaces.renderkit.RenderKitUtils.renderPassThroughAttributes;
import static org.richfaces.renderkit.RenderKitUtils.shouldRenderAttribute;


public class DataScrollerRenderer extends DataScrollerBaseRenderer {

    private static final Attributes PASS_THROUGH_ATTRIBUTES23 = attributes()
            .generic("title", "title");


    private static String convertToString(Object object) {
        return object != null ? object.toString() : "";
    }

    @Override
    public void doEncodeEnd(ResponseWriter responseWriter, FacesContext facesContext, UIComponent component)
            throws IOException {
        String clientId = component.getClientId(facesContext);
        ControlsState controlsState = (ControlsState) this.getControlsState(facesContext, component);
        Object style = (Object) component.getAttributes().get("style");
        Object styleClass = (Object) component.getAttributes().get("styleClass");
        responseWriter.startElement("span", component);
        {
            String value = "rf-ds " + convertToString(styleClass);
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

        {
            Object value = (this.shouldRender(component) ? style : "display:none");
            if (null != value &&
                    shouldRenderAttribute(value)
            ) {
                responseWriter.writeAttribute("style", value, null);
            }

        }


        renderPassThroughAttributes(facesContext, component,
                PASS_THROUGH_ATTRIBUTES23);

        if (this.shouldRender(component)) {
            if (controlsState.getFirstRendered()) {
                boolean isEnabled = (boolean) controlsState.getFirstEnabled();
                UIComponent facet = (UIComponent) (isEnabled ? component.getFacet("first") : component.getFacet("first_disabled"));
                String enabledStyles = (String) "rf-ds-btn rf-ds-btn-first";
                String disabledStyles = (String) "rf-ds-btn rf-ds-btn-first rf-ds-dis";
                String id = (String) convertToString(clientId) + "_ds_f";
                String defaultText = (String) "\u00AB\u00AB\u00AB\u00AB";
                if (isEnabled) {
                    responseWriter.startElement("a", component);
                    {
                        String value = enabledStyles;
                        if (null != value &&
                                value.length() > 0
                        ) {
                            responseWriter.writeAttribute("class", value, null);
                        }

                    }

                    responseWriter.writeURIAttribute("href", "javascript:void(0);", null);

                    {
                        String value = id;
                        if (null != value &&
                                value.length() > 0
                        ) {
                            responseWriter.writeAttribute("id", value, null);
                        }

                    }


                    if ((facet != null)) {
                        encodeFacet(facesContext, facet);

                    } else {
                        {
                            Object text = defaultText;
                            if (text != null) {
                                responseWriter.writeText(text, null);
                            }
                        }

                    }
                    responseWriter.endElement("a");
                } else {
                    responseWriter.startElement("span", component);
                    {
                        String value = disabledStyles;
                        if (null != value &&
                                value.length() > 0
                        ) {
                            responseWriter.writeAttribute("class", value, null);
                        }

                    }

                    {
                        String value = id;
                        if (null != value &&
                                value.length() > 0
                        ) {
                            responseWriter.writeAttribute("id", value, null);
                        }

                    }


                    if ((facet != null)) {
                        encodeFacet(facesContext, facet);

                    } else {
                        {
                            Object text = defaultText;
                            if (text != null) {
                                responseWriter.writeText(text, null);
                            }
                        }

                    }
                    responseWriter.endElement("span");
                }
            }
            if (controlsState.getFastRewindRendered()) {
                boolean isEnabled = (boolean) controlsState.getFastRewindEnabled();
                UIComponent facet = (UIComponent) (isEnabled ? component.getFacet("fastRewind") : component.getFacet("fastRewind_disabled"));
                String enabledStyles = (String) "rf-ds-btn rf-ds-btn-fastrwd";
                String disabledStyles = (String) "rf-ds-btn rf-ds-btn-fastrwd rf-ds-dis";
                String id = (String) convertToString(clientId) + "_ds_fr";
                String defaultText = (String) "\u00AB\u00AB";
                if (isEnabled) {
                    responseWriter.startElement("a", component);
                    {
                        String value = enabledStyles;
                        if (null != value &&
                                value.length() > 0
                        ) {
                            responseWriter.writeAttribute("class", value, null);
                        }

                    }

                    responseWriter.writeURIAttribute("href", "javascript:void(0);", null);

                    {
                        String value = id;
                        if (null != value &&
                                value.length() > 0
                        ) {
                            responseWriter.writeAttribute("id", value, null);
                        }

                    }


                    if ((facet != null)) {
                        encodeFacet(facesContext, facet);

                    } else {
                        {
                            Object text = defaultText;
                            if (text != null) {
                                responseWriter.writeText(text, null);
                            }
                        }

                    }
                    responseWriter.endElement("a");
                } else {
                    responseWriter.startElement("span", component);
                    {
                        String value = disabledStyles;
                        if (null != value &&
                                value.length() > 0
                        ) {
                            responseWriter.writeAttribute("class", value, null);
                        }

                    }

                    {
                        String value = id;
                        if (null != value &&
                                value.length() > 0
                        ) {
                            responseWriter.writeAttribute("id", value, null);
                        }

                    }


                    if ((facet != null)) {
                        encodeFacet(facesContext, facet);

                    } else {
                        {
                            Object text = defaultText;
                            if (text != null) {
                                responseWriter.writeText(text, null);
                            }
                        }

                    }
                    responseWriter.endElement("span");
                }
            }
            if (controlsState.getPreviousRendered()) {
                boolean isEnabled = (boolean) controlsState.getPreviousEnabled();
                UIComponent facet = (UIComponent) (isEnabled ? component.getFacet("previous") : component.getFacet("previous_disabled"));
                String enabledStyles = (String) "rf-ds-btn rf-ds-btn-prev";
                String disabledStyles = (String) "rf-ds-btn rf-ds-btn-prev rf-ds-dis";
                String id = (String) convertToString(clientId) + "_ds_prev";
                String defaultText = (String) "\u00AB";
                if (isEnabled) {
                    responseWriter.startElement("a", component);
                    {
                        String value = enabledStyles;
                        if (null != value &&
                                value.length() > 0
                        ) {
                            responseWriter.writeAttribute("class", value, null);
                        }

                    }

                    responseWriter.writeURIAttribute("href", "javascript:void(0);", null);

                    {
                        String value = id;
                        if (null != value &&
                                value.length() > 0
                        ) {
                            responseWriter.writeAttribute("id", value, null);
                        }

                    }


                    if ((facet != null)) {
                        encodeFacet(facesContext, facet);

                    } else {
                        {
                            Object text = defaultText;
                            if (text != null) {
                                responseWriter.writeText(text, null);
                            }
                        }

                    }
                    responseWriter.endElement("a");
                } else {
                    responseWriter.startElement("span", component);
                    {
                        String value = disabledStyles;
                        if (null != value &&
                                value.length() > 0
                        ) {
                            responseWriter.writeAttribute("class", value, null);
                        }

                    }

                    {
                        String value = id;
                        if (null != value &&
                                value.length() > 0
                        ) {
                            responseWriter.writeAttribute("id", value, null);
                        }

                    }


                    if ((facet != null)) {
                        encodeFacet(facesContext, facet);

                    } else {
                        {
                            Object text = defaultText;
                            if (text != null) {
                                responseWriter.writeText(text, null);
                            }
                        }

                    }
                    responseWriter.endElement("span");
                }
            }
            Map digitals = (Map) this.renderPager(responseWriter, facesContext, component);
            if (controlsState.getNextRendered()) {
                boolean isEnabled = (boolean) controlsState.getNextEnabled();
                UIComponent facet = (UIComponent) (isEnabled ? component.getFacet("next") : component.getFacet("next_disabled"));
                String enabledStyles = (String) "rf-ds-btn rf-ds-btn-next";
                String disabledStyles = (String) "rf-ds-btn rf-ds-btn-next rf-ds-dis";
                String id = (String) convertToString(clientId) + "_ds_next";
                String defaultText = (String) "\u00BB";
                if (isEnabled) {
                    responseWriter.startElement("a", component);
                    {
                        String value = enabledStyles;
                        if (null != value &&
                                value.length() > 0
                        ) {
                            responseWriter.writeAttribute("class", value, null);
                        }

                    }

                    responseWriter.writeURIAttribute("href", "javascript:void(0);", null);

                    {
                        String value = id;
                        if (null != value &&
                                value.length() > 0
                        ) {
                            responseWriter.writeAttribute("id", value, null);
                        }

                    }


                    if ((facet != null)) {
                        encodeFacet(facesContext, facet);

                    } else {
                        {
                            Object text = defaultText;
                            if (text != null) {
                                responseWriter.writeText(text, null);
                            }
                        }

                    }
                    responseWriter.endElement("a");
                } else {
                    responseWriter.startElement("span", component);
                    {
                        String value = disabledStyles;
                        if (null != value &&
                                value.length() > 0
                        ) {
                            responseWriter.writeAttribute("class", value, null);
                        }

                    }

                    {
                        String value = id;
                        if (null != value &&
                                value.length() > 0
                        ) {
                            responseWriter.writeAttribute("id", value, null);
                        }

                    }


                    if ((facet != null)) {
                        encodeFacet(facesContext, facet);

                    } else {
                        {
                            Object text = defaultText;
                            if (text != null) {
                                responseWriter.writeText(text, null);
                            }
                        }

                    }
                    responseWriter.endElement("span");
                }
            }
            if (controlsState.getFastForwardRendered()) {
                boolean isEnabled = (boolean) controlsState.getFastForwardEnabled();
                UIComponent facet = (UIComponent) (isEnabled ? component.getFacet("fastForward") : component.getFacet("fastForward_disabled"));
                String enabledStyles = (String) "rf-ds-btn rf-ds-btn-fastfwd";
                String disabledStyles = (String) "rf-ds-btn rf-ds-btn-fastfwd rf-ds-dis";
                String id = (String) convertToString(clientId) + "_ds_ff";
                String defaultText = (String) "\u00BB\u00BB";
                if (isEnabled) {
                    responseWriter.startElement("a", component);
                    {
                        String value = enabledStyles;
                        if (null != value &&
                                value.length() > 0
                        ) {
                            responseWriter.writeAttribute("class", value, null);
                        }

                    }

                    responseWriter.writeURIAttribute("href", "javascript:void(0);", null);

                    {
                        String value = id;
                        if (null != value &&
                                value.length() > 0
                        ) {
                            responseWriter.writeAttribute("id", value, null);
                        }

                    }


                    if ((facet != null)) {
                        encodeFacet(facesContext, facet);

                    } else {
                        {
                            Object text = defaultText;
                            if (text != null) {
                                responseWriter.writeText(text, null);
                            }
                        }

                    }
                    responseWriter.endElement("a");
                } else {
                    responseWriter.startElement("span", component);
                    {
                        String value = disabledStyles;
                        if (null != value &&
                                value.length() > 0
                        ) {
                            responseWriter.writeAttribute("class", value, null);
                        }

                    }

                    {
                        String value = id;
                        if (null != value &&
                                value.length() > 0
                        ) {
                            responseWriter.writeAttribute("id", value, null);
                        }

                    }


                    if ((facet != null)) {
                        encodeFacet(facesContext, facet);

                    } else {
                        {
                            Object text = defaultText;
                            if (text != null) {
                                responseWriter.writeText(text, null);
                            }
                        }

                    }
                    responseWriter.endElement("span");
                }
            }
            if (controlsState.getLastRendered()) {
                boolean isEnabled = (boolean) controlsState.getLastEnabled();
                UIComponent facet = (UIComponent) (isEnabled ? component.getFacet("last") : component.getFacet("last_disabled"));
                String enabledStyles = (String) "rf-ds-btn rf-ds-btn-last";
                String disabledStyles = (String) "rf-ds-btn rf-ds-btn-last rf-ds-dis";
                String id = (String) convertToString(clientId) + "_ds_l";
                String defaultText = (String) "\u00BB\u00BB\u00BB\u00BB";
                if (isEnabled) {
                    responseWriter.startElement("a", component);
                    {
                        String value = enabledStyles;
                        if (null != value &&
                                value.length() > 0
                        ) {
                            responseWriter.writeAttribute("class", value, null);
                        }

                    }

                    responseWriter.writeURIAttribute("href", "javascript:void(0);", null);

                    {
                        String value = id;
                        if (null != value &&
                                value.length() > 0
                        ) {
                            responseWriter.writeAttribute("id", value, null);
                        }

                    }


                    if ((facet != null)) {
                        encodeFacet(facesContext, facet);

                    } else {
                        {
                            Object text = defaultText;
                            if (text != null) {
                                responseWriter.writeText(text, null);
                            }
                        }

                    }
                    responseWriter.endElement("a");
                } else {
                    responseWriter.startElement("span", component);
                    {
                        String value = disabledStyles;
                        if (null != value &&
                                value.length() > 0
                        ) {
                            responseWriter.writeAttribute("class", value, null);
                        }

                    }

                    {
                        String value = id;
                        if (null != value &&
                                value.length() > 0
                        ) {
                            responseWriter.writeAttribute("id", value, null);
                        }

                    }


                    if ((facet != null)) {
                        encodeFacet(facesContext, facet);

                    } else {
                        {
                            Object text = defaultText;
                            if (text != null) {
                                responseWriter.writeText(text, null);
                            }
                        }

                    }
                    responseWriter.endElement("span");
                }
            }
            Map buttons = (Map) this.getControls(facesContext, component, controlsState);
            responseWriter.startElement("script", component);
            responseWriter.writeAttribute("type", "text/javascript", null);


            buildScript(responseWriter, facesContext, component, buttons, digitals);

            responseWriter.endElement("script");
        }
        responseWriter.endElement("span");

    }
}
