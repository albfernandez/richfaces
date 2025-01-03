package org.richfaces.renderkit.html;

import org.richfaces.renderkit.RenderKitUtils.Attributes;

import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.context.ResponseWriter;
import java.io.IOException;

import static org.richfaces.renderkit.RenderKitUtils.attributes;
import static org.richfaces.renderkit.RenderKitUtils.renderPassThroughAttributes;
import static org.richfaces.renderkit.RenderKitUtils.shouldRenderAttribute;


public class CommandButtonRenderer extends CommandButtonRendererBase {

    private static final Attributes PASS_THROUGH_ATTRIBUTES2 = attributes()
            .generic("accept", "accept")
            .generic("accesskey", "accesskey")
            .generic("align", "align")
            .generic("alt", "alt")
            .bool("checked", "checked")
            .generic("class", "styleClass")
            .generic("dir", "dir")
            .bool("disabled", "disabled")
            .generic("lang", "lang")
            .generic("maxlength", "maxlength")
            .generic("onblur", "onblur")
            .generic("onchange", "onchange")
            .generic("ondblclick", "ondblclick", "dblclick")
            .generic("onfocus", "onfocus")
            .generic("onkeydown", "onkeydown", "keydown")
            .generic("onkeypress", "onkeypress", "keypress")
            .generic("onkeyup", "onkeyup", "keyup")
            .generic("onmousedown", "onmousedown", "mousedown")
            .generic("onmousemove", "onmousemove", "mousemove")
            .generic("onmouseout", "onmouseout", "mouseout")
            .generic("onmouseover", "onmouseover", "mouseover")
            .generic("onmouseup", "onmouseup", "mouseup")
            .generic("onselect", "onselect")
            .bool("readonly", "readonly")
            .generic("role", "role")
            .generic("size", "size")
            .uri("src", "src")
            .generic("style", "style")
            .generic("tabindex", "tabindex")
            .generic("title", "title")
            .uri("usemap", "usemap");

    @Override
    public void doEncodeEnd(ResponseWriter responseWriter, FacesContext facesContext, UIComponent component) throws IOException {
        String clientId = component.getClientId(facesContext);
        responseWriter.startElement("input", component);
        if (null != clientId && !clientId.isEmpty()) {
            responseWriter.writeAttribute("id", clientId, null);
            responseWriter.writeAttribute("name", clientId, null);
        }

        String onClickValue = this.getOnClick(facesContext, component);
        if (null != onClickValue && !onClickValue.isEmpty()) {
            responseWriter.writeAttribute("onclick", onClickValue, null);
        }

        Object value = component.getAttributes().get("value");
        if (null != value && shouldRenderAttribute(value)) {
            responseWriter.writeAttribute("value", value, null);
        }

        renderPassThroughAttributes(facesContext, component, PASS_THROUGH_ATTRIBUTES2);
        encodeTypeAndImage(facesContext, component);
        responseWriter.endElement("input");
    }
}
