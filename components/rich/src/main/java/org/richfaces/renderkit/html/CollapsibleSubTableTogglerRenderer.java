package org.richfaces.renderkit.html;

import org.richfaces.renderkit.CollapsibleSubTableTogglerRendererBase;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import java.io.IOException;

import static org.richfaces.renderkit.RenderKitUtils.shouldRenderAttribute;


public class CollapsibleSubTableTogglerRenderer extends CollapsibleSubTableTogglerRendererBase {


    @Override
    public void doEncodeEnd(ResponseWriter responseWriter, FacesContext facesContext, UIComponent component)
            throws IOException {
        String clientId = component.getClientId(facesContext);
        responseWriter.startElement("span", component);
        {
            Object value = this.concatClasses(component.getAttributes().get("styleClass"), "rf-csttg");
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


        encodeControl(facesContext, component);

        responseWriter.endElement("span");

    }
}
