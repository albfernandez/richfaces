package org.richfaces.renderkit.html;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import java.io.IOException;


public class MenuSeparatorRenderer extends MenuSeparatorRendererBase {


    private static String convertToString(Object object) {
        return object != null ? object.toString() : "";
    }

    @Override
    public void doEncodeEnd(ResponseWriter responseWriter, FacesContext facesContext, UIComponent component)
            throws IOException {
        String clientId = component.getClientId(facesContext);
        Object cssRoot = (Object) component.getAttributes().get("cssRoot");
        responseWriter.startElement("div", component);
        {
            String value = "rf-" + convertToString(cssRoot) + "-sep";
            if (null != value &&
                    value.length() > 0
            ) {
                responseWriter.writeAttribute("class", value, null);
            }

        }


        responseWriter.endElement("div");

    }

    @Override
    public boolean getRendersChildren() {
        return true;
    }
}
