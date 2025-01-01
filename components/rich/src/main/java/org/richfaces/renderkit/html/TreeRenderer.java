package org.richfaces.renderkit.html;

import org.richfaces.component.SwitchType;
import org.richfaces.renderkit.RenderKitUtils.Attributes;
import org.richfaces.renderkit.TreeRendererBase;

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
import static org.richfaces.renderkit.RenderKitUtils.shouldRenderAttribute;
import static org.richfaces.renderkit.RenderKitUtils.toScriptArgs;


@ResourceDependencies({@ResourceDependency(name = "jsf.js", library = "javax.faces", target = ""), @ResourceDependency(name = "jquery.js", library = "org.richfaces", target = ""), @ResourceDependency(name = "richfaces.js", library = "org.richfaces", target = ""), @ResourceDependency(name = "richfaces-queue.reslib", library = "org.richfaces", target = ""), @ResourceDependency(name = "richfaces-base-component.js", library = "org.richfaces", target = ""), @ResourceDependency(name = "richfaces-event.js", library = "org.richfaces", target = ""), @ResourceDependency(name = "tree.js", library = "org.richfaces", target = ""), @ResourceDependency(name = "tree.ecss", library = "org.richfaces", target = "")})
public class TreeRenderer extends TreeRendererBase {

    private static final Attributes PASS_THROUGH_ATTRIBUTES35 = attributes()
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

    private static final Attributes ATTRIBUTES_FOR_SCRIPT_HASH27 = attributes()
            .generic("toggleType", "toggleType");

    private static final Attributes ATTRIBUTES_FOR_SCRIPT_HASH28 = attributes()
            .generic("onselectionchange", "onselectionchange", "selectionchange")


            .generic("onbeforeselectionchange", "onbeforeselectionchange", "beforeselectionchange")


            .generic("toggleNodeEvent", "toggleNodeEvent");

    private static String convertToString(Object object) {
        return object != null ? object.toString() : "";
    }

    @Override
    public void doEncodeBegin(ResponseWriter responseWriter, FacesContext facesContext, UIComponent component)
            throws IOException {
        String clientId = component.getClientId(facesContext);
        responseWriter.startElement("div", component);
        {
            Object value = this.concatClasses("rf-tr", component.getAttributes().get("styleClass"));
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


        renderPassThroughAttributes(facesContext, component,
                PASS_THROUGH_ATTRIBUTES35);

        createTreeRenderingContext(facesContext, component);

    }

    @Override
    public void doEncodeChildren(ResponseWriter responseWriter, FacesContext facesContext, UIComponent component)
            throws IOException {
        String clientId = component.getClientId(facesContext);
        encodeTree(facesContext, component);

    }

    @Override
    public void doEncodeEnd(ResponseWriter responseWriter, FacesContext facesContext, UIComponent component)
            throws IOException {
        String clientId = component.getClientId(facesContext);
        Object clientEventHandlers = (Object) this.getClientEventHandlers(facesContext);
        deleteTreeRenderingContext(facesContext);
        encodeSelectionStateInput(facesContext, component);
        responseWriter.startElement("script", component);
        responseWriter.writeAttribute("type", "text/javascript", null);


        Map<String, Object> options = new LinkedHashMap<String, Object>();


        addToScriptHash(options, facesContext, component, ATTRIBUTES_FOR_SCRIPT_HASH27, null);
        addToScriptHash(options, "selectionType", this.getSelectionType(facesContext, component), SwitchType.client, null);

        addToScriptHash(options, "ajaxSubmitFunction", this.getAjaxSubmitFunction(facesContext, component), null, null);


        addToScriptHash(options, facesContext, component, ATTRIBUTES_FOR_SCRIPT_HASH28, null);
        addToScriptHash(options, "clientEventHandlers", clientEventHandlers, null, null);


        {
            Object text = "new RichFaces.ui.Tree(" + convertToString(toScriptArgs(clientId, options)) + ");";
            if (text != null) {
                responseWriter.writeText(text, null);
            }
        }

        responseWriter.endElement("script");
        responseWriter.endElement("div");

    }

    @Override
    public boolean getRendersChildren() {
        return true;
    }
}
