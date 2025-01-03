package org.richfaces.renderkit.html;

import org.richfaces.renderkit.RenderKitUtils.Attributes;
import org.richfaces.renderkit.TreeNodeRendererBase;
import org.richfaces.renderkit.TreeNodeState;

import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.context.ResponseWriter;
import java.io.IOException;

import static org.richfaces.renderkit.RenderKitUtils.attributes;
import static org.richfaces.renderkit.RenderKitUtils.renderPassThroughAttributes;
import static org.richfaces.renderkit.RenderKitUtils.shouldRenderAttribute;


public class TreeNodeRenderer extends TreeNodeRendererBase {

    private static final Attributes PASS_THROUGH_ATTRIBUTES45 = attributes()
            .generic("align", "align")


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


    private static boolean isEmpty(Object object) {
        if (object == null) {
            return true;
        } else if (object.getClass().isArray()) {
            return ((Object[]) object).length == 0;
        } else if (object instanceof java.util.Collection) {
            return ((java.util.Collection<?>) object).isEmpty();
        } else if (object instanceof java.util.Map) {
            return ((java.util.Map<?, ?>) object).isEmpty();
        } else {
            return object.toString().length() == 0;
        }
    }

    @Override
    public void doEncodeBegin(ResponseWriter responseWriter, FacesContext facesContext, UIComponent component)
            throws IOException {
        String clientId = component.getClientId(facesContext);
        TreeNodeState nodeState = (TreeNodeState) this.getNodeState(facesContext);
        UIComponent tree = (UIComponent) this.getTreeComponent(component);
        addClientEventHandlers(facesContext, component);
        responseWriter.startElement("div", component);
        {
            Object value = this.concatClasses("rf-trn", component.getAttributes().get("styleClass"), tree.getAttributes().get("nodeClass"));
            if (null != value &&
                    shouldRenderAttribute(value)
            ) {
                responseWriter.writeAttribute("class", value, null);
            }

        }


        renderPassThroughAttributes(facesContext, component,
                PASS_THROUGH_ATTRIBUTES45);

        UIComponent loadingFacet = (UIComponent) this.getHandleLoadingFacetIfApplicable(component);
        if (((!isEmpty(loadingFacet)) && loadingFacet.isRendered())) {
            responseWriter.startElement("span", component);
            responseWriter.writeAttribute("class", "rf-trn-hnd-ldn-fct", null);


            loadingFacet.encodeAll(facesContext);

            responseWriter.endElement("span");
        }
        responseWriter.startElement("span", component);
        {
            Object value = this.concatClasses(nodeState.getHandleClass(), component.getAttributes().get("handleClass"), tree.getAttributes().get("handleClass"));
            if (null != value &&
                    shouldRenderAttribute(value)
            ) {
                responseWriter.writeAttribute("class", value, null);
            }

        }


        responseWriter.endElement("span");
        responseWriter.startElement("span", component);
        responseWriter.writeAttribute("class", "rf-trn-cnt", null);


        encodeIcon(facesContext, component);
        responseWriter.startElement("span", component);
        {
            Object value = this.concatClasses("rf-trn-lbl", component.getAttributes().get("labelClass"), tree.getAttributes().get("labelClass"));
            if (null != value &&
                    shouldRenderAttribute(value)
            ) {
                responseWriter.writeAttribute("class", value, null);
            }

        }


    }

    @Override
    public void doEncodeEnd(ResponseWriter responseWriter, FacesContext facesContext, UIComponent component)
            throws IOException {
        String clientId = component.getClientId(facesContext);
        responseWriter.endElement("span");
        responseWriter.endElement("span");
        responseWriter.endElement("div");

    }
}
