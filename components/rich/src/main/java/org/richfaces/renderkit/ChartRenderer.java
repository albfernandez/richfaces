package org.richfaces.renderkit;

import org.richfaces.component.AbstractChart;
import org.richfaces.renderkit.RenderKitUtils.Attributes;
import org.richfaces.renderkit.RenderKitUtils.ScriptHashVariableWrapper;

import javax.faces.application.ResourceDependencies;
import javax.faces.application.ResourceDependency;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.richfaces.renderkit.RenderKitUtils.addToScriptHash;
import static org.richfaces.renderkit.RenderKitUtils.attributes;
import static org.richfaces.renderkit.RenderKitUtils.renderPassThroughAttributes;
import static org.richfaces.renderkit.RenderKitUtils.toScriptArgs;


@ResourceDependencies({@ResourceDependency(name = "jsf.js", library = "javax.faces", target = ""), @ResourceDependency(name = "jquery.js", library = "org.richfaces", target = ""), @ResourceDependency(name = "richfaces.js", library = "org.richfaces", target = ""), @ResourceDependency(name = "richfaces-queue.reslib", library = "org.richfaces", target = ""), @ResourceDependency(name = "richfaces-base-component.js", library = "org.richfaces", target = ""), @ResourceDependency(name = "richfaces-event.js", library = "org.richfaces", target = ""), @ResourceDependency(name = "chart.js", library = "org.richfaces", target = ""), @ResourceDependency(name = "chart.ecss", library = "org.richfaces", target = ""), @ResourceDependency(name = "jquery.flot.js", library = "flot", target = ""), @ResourceDependency(name = "jquery.flot.categories.js", library = "flot", target = ""), @ResourceDependency(name = "jquery.flot.pie.js", library = "flot", target = ""), @ResourceDependency(name = "jquery.flot.time.js", library = "flot", target = ""), @ResourceDependency(name = "jquery.flot.axislabels.js", library = "flot", target = ""), @ResourceDependency(name = "jquery.flot.symbol.js", library = "flot", target = ""), @ResourceDependency(name = "jquery.flot.orderBars.js", library = "flot", target = ""), @ResourceDependency(name = "jquery.flot.tooltip.js", library = "flot", target = ""), @ResourceDependency(name = "jquery.flot.selection.js", library = "flot", target = ""), @ResourceDependency(name = "jquery.flot.resize.js", library = "flot", target = "")})
public class ChartRenderer extends ChartRendererBase {

    private static final Attributes ATTRIBUTES_FOR_SCRIPT_HASH11 = attributes()
            .generic("onplotclick", "onplotclick", "plotclick")


            .generic("onplothover", "onplothover", "plothover")


            .generic("onmouseout", "onmouseout", "mouseout");

    private static final Attributes PASS_THROUGH_ATTRIBUTES12 = attributes()
            .generic("style", "style");


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
    public void doEncodeEnd(ResponseWriter responseWriter, FacesContext facesContext, UIComponent uiComponent)
            throws IOException {
        AbstractChart component = (AbstractChart) uiComponent;
        String clientId = component.getClientId(facesContext);
        Map<String, Object> events = new LinkedHashMap<String, Object>();


        addToScriptHash(events, facesContext, component, ATTRIBUTES_FOR_SCRIPT_HASH11, ScriptHashVariableWrapper.eventHandler);

        Object hooks = (Object) component.getAttributes().get("hooks");
        UIComponent hooksFacet = (UIComponent) component.getFacets().get("hooks");
        responseWriter.startElement("div", component);
        {
            String value = convertToString(component.getStyleClass()) + " chart-container";
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
                PASS_THROUGH_ATTRIBUTES12);

        responseWriter.startElement("div", component);
        responseWriter.writeAttribute("class", "chart-title", null);


        {
            Object text = component.getTitle();
            if (text != null) {
                responseWriter.writeText(text, null);
            }
        }

        responseWriter.endElement("div");
        responseWriter.startElement("div", component);
        responseWriter.writeAttribute("class", "chart", null);

        {
            String value = convertToString(clientId) + "Chart";
            if (null != value &&
                    value.length() > 0
            ) {
                responseWriter.writeAttribute("id", value, null);
            }

        }


        responseWriter.endElement("div");
        responseWriter.startElement("script", component);
        responseWriter.writeAttribute("type", "text/javascript", null);


        {
            Object text = "new RichFaces.ui.Chart(\"" + convertToString(clientId) + "\", RichFaces.jQuery.extend({\n                                    handlers: " + convertToString(((!isEmpty(events)) ? toScriptArgs(events) : "{}")) + ",\n                                    particularSeriesHandlers: " + convertToString(this.getParticularSeriesHandler(facesContext, component)) + ",\n                                    data: " + convertToString(this.getChartData(facesContext, component)) + ",\n                                    },\n                                    " + convertToString(this.getOpts(facesContext, component));
            if (text != null) {
                responseWriter.writeText(text, null);
            }
        }

        if (((hooksFacet != null) && hooksFacet.isRendered())) {
            {
                Object text = ", {hooks: " + convertToString(hooksFacet) + "}";
                if (text != null) {
                    responseWriter.writeText(text, null);
                }
            }

        } else if ((!isEmpty(hooks))) {
            {
                Object text = ", {hooks: " + convertToString(hooks) + "}";
                if (text != null) {
                    responseWriter.writeText(text, null);
                }
            }

        } else {
        }
        responseWriter.writeText("));", null);

        responseWriter.endElement("script");
        responseWriter.endElement("div");

    }
}
