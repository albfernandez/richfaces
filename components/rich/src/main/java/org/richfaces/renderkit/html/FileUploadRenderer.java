package org.richfaces.renderkit.html;

import org.richfaces.renderkit.FileUploadRendererBase;
import org.richfaces.renderkit.RenderKitUtils.Attributes;

import jakarta.faces.application.ResourceDependencies;
import jakarta.faces.application.ResourceDependency;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.context.ResponseWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.richfaces.renderkit.RenderKitUtils.addToScriptHash;
import static org.richfaces.renderkit.RenderKitUtils.attributes;
import static org.richfaces.renderkit.RenderKitUtils.renderPassThroughAttributes;
import static org.richfaces.renderkit.RenderKitUtils.shouldRenderAttribute;
import static org.richfaces.renderkit.RenderKitUtils.toScriptArgs;


@ResourceDependencies({@ResourceDependency(name = "jsf.js", library = "javax.faces", target = ""), @ResourceDependency(name = "jquery.js", library = "org.richfaces", target = ""), @ResourceDependency(name = "richfaces.js", library = "org.richfaces", target = ""), @ResourceDependency(name = "richfaces-queue.reslib", library = "org.richfaces", target = ""), @ResourceDependency(name = "richfaces-base-component.js", library = "org.richfaces", target = ""), @ResourceDependency(name = "richfaces-event.js", library = "org.richfaces", target = ""), @ResourceDependency(name = "fileupload.js", library = "org.richfaces", target = ""), @ResourceDependency(name = "fileupload.ecss", library = "org.richfaces", target = "")})
public class FileUploadRenderer extends FileUploadRendererBase {

    private static final Attributes PASS_THROUGH_ATTRIBUTES44 = attributes()
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

    private static final Attributes ATTRIBUTES_FOR_SCRIPT_HASH36 = attributes()
            .generic("acceptedTypes", "acceptedTypes")


            .generic("maxFilesQuantity", "maxFilesQuantity")
            .defaultValue(-1)

            .generic("maxFileSize", "maxFileSize")
            .defaultValue(0L)

            .generic("immediateUpload", "immediateUpload")
            .defaultValue(false)

            .generic("onfileselect", "onfileselect", "fileselect")


            .generic("noDuplicate", "noDuplicate")
            .defaultValue(false)

            .generic("onfilesubmit", "onfilesubmit", "filesubmit")


            .generic("ontyperejected", "ontyperejected", "typerejected")


            .generic("onuploadcomplete", "onuploadcomplete", "uploadcomplete")


            .generic("doneLabel", "doneLabel")


            .generic("onsizerejected", "onsizerejected", "sizerejected")


            .generic("sizeExceededLabel", "sizeExceededLabel")


            .generic("stoppedLabel", "stoppedLabel")


            .generic("serverErrorLabel", "serverErrorLabel")


            .generic("clearLabel", "clearLabel")


            .generic("deleteLabel", "deleteLabel")


            .generic("onclear", "onclear", "clear")


            .generic("status", "status")


            .generic("onbegin", "onbegin", "begin")


            .generic("onbeforedomupdate", "onbeforedomupdate", "beforedomupdate")


            .generic("onerror", "onerror", "error");


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
    public void doEncodeEnd(ResponseWriter responseWriter, FacesContext facesContext, UIComponent component)
            throws IOException {
        String clientId = component.getClientId(facesContext);
        Map<String, Object> attributes = (Map<String, Object>) component.getAttributes();
        Object disabled = (Object) attributes.get("disabled");
        responseWriter.startElement("div", component);
        {
            String value = "rf-fu " + convertToString(attributes.get("styleClass"));
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

        responseWriter.writeAttribute("tabindex", "-1", null);


        renderPassThroughAttributes(facesContext, component,
                PASS_THROUGH_ATTRIBUTES44);

        responseWriter.startElement("div", component);
        responseWriter.writeAttribute("class", "rf-fu-hdr", null);


        responseWriter.startElement("span", component);
        responseWriter.writeAttribute("class", "rf-fu-btns-lft", null);


        responseWriter.startElement("span", component);
        {
            String value = "rf-fu-btn-add" + convertToString((convertToBoolean(disabled) ? "-dis" : ""));
            if (null != value &&
                    value.length() > 0
            ) {
                responseWriter.writeAttribute("class", value, null);
            }

        }


        responseWriter.startElement("span", component);
        {
            String value = "rf-fu-btn-cnt-add" + convertToString((convertToBoolean(disabled) ? "-dis" : ""));
            if (null != value &&
                    value.length() > 0
            ) {
                responseWriter.writeAttribute("class", value, null);
            }

        }


        if ((!convertToBoolean(disabled))) {
            responseWriter.startElement("span", component);
            responseWriter.writeAttribute("class", "rf-fu-inp-cntr", null);


            responseWriter.startElement("input", component);
            {
                Object value = attributes.get("acceptedTypes");
                if (null != value &&
                        shouldRenderAttribute(value)
                ) {
                    responseWriter.writeAttribute("accept", value, null);
                }

            }

            responseWriter.writeAttribute("class", "rf-fu-inp", null);

            responseWriter.writeAttribute("multiple", "multiple", null);

            responseWriter.writeAttribute("type", "file", null);


            responseWriter.endElement("input");
            responseWriter.endElement("span");
        }
        Object addLabel = (Object) attributes.get("addLabel");
        {
            Object text = ((!isEmpty(addLabel)) ? addLabel : "Add...");
            if (text != null) {
                responseWriter.writeText(text, null);
            }
        }

        responseWriter.endElement("span");
        responseWriter.endElement("span");
        if ((!convertToBoolean(disabled))) {
            responseWriter.startElement("span", component);
            responseWriter.writeAttribute("class", "rf-fu-btn-upl", null);


            Object uploadLabel = (Object) attributes.get("uploadLabel");
            responseWriter.startElement("span", component);
            responseWriter.writeAttribute("class", "rf-fu-btn-cnt-upl", null);


            {
                Object text = ((!isEmpty(uploadLabel)) ? uploadLabel : "Upload");
                if (text != null) {
                    responseWriter.writeText(text, null);
                }
            }

            responseWriter.endElement("span");
            responseWriter.endElement("span");
        }
        responseWriter.endElement("span");
        if ((!convertToBoolean(disabled))) {
            responseWriter.startElement("span", component);
            responseWriter.writeAttribute("class", "rf-fu-btns-rgh", null);


            responseWriter.startElement("span", component);
            responseWriter.writeAttribute("class", "rf-fu-btn-clr", null);


            Object clearAllLabel = (Object) attributes.get("clearAllLabel");
            responseWriter.startElement("span", component);
            responseWriter.writeAttribute("class", "rf-fu-btn-cnt-clr", null);


            {
                Object text = ((!isEmpty(clearAllLabel)) ? clearAllLabel : "Clear All");
                if (text != null) {
                    responseWriter.writeText(text, null);
                }
            }

            responseWriter.endElement("span");
            responseWriter.endElement("span");
            responseWriter.endElement("span");
        }
        responseWriter.endElement("div");
        responseWriter.startElement("div", component);
        responseWriter.writeAttribute("class", "rf-fu-lst", null);

        {
            String value = "height: " + convertToString(attributes.get("listHeight"));
            if (null != value &&
                    value.length() > 0
            ) {
                responseWriter.writeAttribute("style", value, null);
            }

        }


        responseWriter.endElement("div");
        if ((!convertToBoolean(disabled))) {
            responseWriter.startElement("div", component);
            responseWriter.writeAttribute("class", "rf-fu-cntr-hdn", null);


            UIComponent progressBar = (UIComponent) component.getFacets().get("progress");
            if (((progressBar != null) && progressBar.isRendered())) {
                progressBar.encodeAll(facesContext);
            }
            responseWriter.endElement("div");
            Map<String, Object> options = new LinkedHashMap<String, Object>();


            addToScriptHash(options, facesContext, component, ATTRIBUTES_FOR_SCRIPT_HASH36, null);

            responseWriter.startElement("script", component);
            responseWriter.writeAttribute("type", "text/javascript", null);


            {
                Object text = "new RichFaces.ui.FileUpload(" + convertToString(toScriptArgs(clientId, options)) + ");";
                if (text != null) {
                    responseWriter.writeText(text, null);
                }
            }

            responseWriter.endElement("script");
        }
        responseWriter.endElement("div");

    }
}
