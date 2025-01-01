package org.richfaces.renderkit.html;

import org.richfaces.component.AbstractFocus;
import org.richfaces.renderkit.FocusRendererBase;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.richfaces.renderkit.RenderKitUtils.addToScriptHash;
import static org.richfaces.renderkit.RenderKitUtils.shouldRenderAttribute;
import static org.richfaces.renderkit.RenderKitUtils.toScriptArgs;


public class FocusRenderer extends FocusRendererBase {


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
        AbstractFocus component = (AbstractFocus) uiComponent;
        String clientId = component.getClientId(facesContext);
        responseWriter.startElement("span", component);
        responseWriter.writeAttribute("class", "rf-fcs", null);

        {
            String value = clientId;
            if (null != value &&
                    value.length() > 0
            ) {
                responseWriter.writeAttribute("id", value, null);
            }

        }


        responseWriter.startElement("input", component);
        {
            String value = convertToString(clientId) + "InputFocus";
            if (null != value &&
                    value.length() > 0
            ) {
                responseWriter.writeAttribute("id", value, null);
            }

        }

        responseWriter.writeAttribute("name", "org.richfaces.focus", null);

        responseWriter.writeAttribute("type", "hidden", null);

        {
            Object value = component.getValue();
            if (null != value &&
                    shouldRenderAttribute(value)
            ) {
                responseWriter.writeAttribute("value", value, null);
            }

        }


        responseWriter.endElement("input");
        Map<String, Object> options = new LinkedHashMap<String, Object>();
        addToScriptHash(options, "mode", component.getMode(), null, null);

        addToScriptHash(options, "focusCandidates", this.getFocusCandidatesAsString(facesContext, component), null, null);


        Object scriptArgs = (Object) toScriptArgs(options);
        String script = (String) "new RichFaces.ui.Focus('" + convertToString(clientId) + "', " + convertToString((isEmpty(scriptArgs) ? "{}" : scriptArgs)) + ");";
        renderOncompleteScript(facesContext, script);
        if (this.shouldApply(facesContext, component)) {
            String applyScript = (String) "RichFaces.component('" + convertToString(clientId) + "').applyFocus()";
            renderOncompleteScript(facesContext, applyScript);
        }
        responseWriter.endElement("span");

    }
}
