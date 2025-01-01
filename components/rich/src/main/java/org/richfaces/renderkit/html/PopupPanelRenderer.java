package org.richfaces.renderkit.html;

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


public class PopupPanelRenderer extends PopupPanelBaseRenderer {

    private static final Attributes PASS_THROUGH_ATTRIBUTES17 = attributes()
            .generic("align", "align")


            .generic("dir", "dir")


            .generic("lang", "lang")


            .generic("onclick", "onclick")


            .generic("ondblclick", "ondblclick")


            .generic("onkeydown", "onkeydown")


            .generic("onkeypress", "onkeypress")


            .generic("onkeyup", "onkeyup")


            .generic("onmousedown", "onmousedown")


            .generic("onmousemove", "onmousemove")


            .generic("onmouseout", "onmouseout")


            .generic("onmouseover", "onmouseover")


            .generic("onmouseup", "onmouseup")


            .generic("role", "role")


            .generic("title", "title");

    private static final Attributes ATTRIBUTES_FOR_SCRIPT_HASH15 = attributes()
            .generic("width", "width")
            .defaultValue(-1)

            .generic("height", "height")
            .defaultValue(-1)

            .generic("minWidth", "minWidth")
            .defaultValue(-1)

            .generic("minHeight", "minHeight")
            .defaultValue(-1)

            .generic("maxWidth", "maxWidth")
            .defaultValue(Integer.MIN_VALUE)

            .generic("maxHeight", "maxHeight")
            .defaultValue(Integer.MIN_VALUE)

            .generic("moveable", "moveable")
            .defaultValue(true)

            .generic("followByScroll", "followByScroll")
            .defaultValue(true)

            .generic("left", "left")


            .generic("top", "top")


            .generic("zindex", "zindex")
            .defaultValue(100)

            .generic("shadowDepth", "shadowDepth")


            .generic("shadowOpacity", "shadowOpacity")


            .generic("domElementAttachment", "domElementAttachment")


            .generic("show", "show")
            .defaultValue(false)

            .generic("keepVisualState", "keepVisualState")
            .defaultValue(false)

            .generic("autosized", "autosized")
            .defaultValue(false)

            .generic("resizeable", "resizeable")
            .defaultValue(false)

            .generic("modal", "modal")
            .defaultValue(true)

            .generic("overlapEmbedObjects", "overlapEmbedObjects")
            .defaultValue(false)

            .generic("visualOptions", "visualOptions");

    private static final Attributes ATTRIBUTES_FOR_SCRIPT_HASH16 = attributes()
            .generic("onshow", "onshow", "show")


            .generic("onhide", "onhide", "hide")


            .generic("onresize", "onresize", "resize")


            .generic("onmove", "onmove", "move")


            .generic("onbeforeshow", "onbeforeshow", "beforeshow")


            .generic("onbeforehide", "onbeforehide", "beforehide");


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

    private static boolean isEqual(Object o1, Object o2) {
        if (o1 != null) {
            return o1.equals(o2);
        } else {
            //o1 == null
            return o2 == null;
        }
    }

    @Override
    public void doEncodeEnd(ResponseWriter responseWriter, FacesContext facesContext, UIComponent component)
            throws IOException {
        String clientId = component.getClientId(facesContext);
        Object zindex = (Object) component.getAttributes().get("zindex");
        checkOptions(facesContext, component);
        responseWriter.startElement("div", component);
        {
            String value = clientId;
            if (null != value &&
                    value.length() > 0
            ) {
                responseWriter.writeAttribute("id", value, null);
            }

        }

        responseWriter.writeAttribute("style", "visibility: hidden; display: inline-block;", null);


        if (convertToBoolean(component.getAttributes().get("modal"))) {
            responseWriter.startElement("div", component);
            responseWriter.writeAttribute("class", "rf-pp-shade", null);

            {
                String value = convertToString(clientId) + "_shade";
                if (null != value &&
                        value.length() > 0
                ) {
                    responseWriter.writeAttribute("id", value, null);
                }

            }

            {
                Object value = component.getAttributes().get("onmaskclick");
                if (null != value &&
                        shouldRenderAttribute(value)
                ) {
                    responseWriter.writeAttribute("onclick", value, null);
                }

            }

            {
                Object value = component.getAttributes().get("onmaskcontextmenu");
                if (null != value &&
                        shouldRenderAttribute(value)
                ) {
                    responseWriter.writeAttribute("oncontextmenu", value, null);
                }

            }

            {
                Object value = component.getAttributes().get("onmaskdblclick");
                if (null != value &&
                        shouldRenderAttribute(value)
                ) {
                    responseWriter.writeAttribute("ondblclick", value, null);
                }

            }

            {
                Object value = component.getAttributes().get("onmaskmousedown");
                if (null != value &&
                        shouldRenderAttribute(value)
                ) {
                    responseWriter.writeAttribute("onmousedown", value, null);
                }

            }

            {
                Object value = component.getAttributes().get("onmaskmousemove");
                if (null != value &&
                        shouldRenderAttribute(value)
                ) {
                    responseWriter.writeAttribute("onmousemove", value, null);
                }

            }

            {
                Object value = component.getAttributes().get("onmaskmouseout");
                if (null != value &&
                        shouldRenderAttribute(value)
                ) {
                    responseWriter.writeAttribute("onmouseout", value, null);
                }

            }

            {
                Object value = component.getAttributes().get("onmaskmouseover");
                if (null != value &&
                        shouldRenderAttribute(value)
                ) {
                    responseWriter.writeAttribute("onmouseover", value, null);
                }

            }

            {
                Object value = component.getAttributes().get("onmaskmouseup");
                if (null != value &&
                        shouldRenderAttribute(value)
                ) {
                    responseWriter.writeAttribute("onmouseup", value, null);
                }

            }

            {
                String value = "z-index:" + convertToString(zindex) + ";";
                if (null != value &&
                        value.length() > 0
                ) {
                    responseWriter.writeAttribute("style", value, null);
                }

            }


            responseWriter.startElement("button", component);
            responseWriter.writeAttribute("class", "rf-pp-btn", null);

            {
                String value = convertToString(clientId) + "FirstHref";
                if (null != value &&
                        value.length() > 0
                ) {
                    responseWriter.writeAttribute("id", value, null);
                }

            }

            {
                String value = convertToString(clientId) + "firstHref";
                if (null != value &&
                        value.length() > 0
                ) {
                    responseWriter.writeAttribute("name", value, null);
                }

            }


            responseWriter.endElement("button");
            responseWriter.endElement("div");
        }
        responseWriter.startElement("div", component);
        {
            String value = "rf-pp-cntr " + convertToString(component.getAttributes().get("styleClass"));
            if (null != value &&
                    value.length() > 0
            ) {
                responseWriter.writeAttribute("class", value, null);
            }

        }

        {
            String value = convertToString(clientId) + "_container";
            if (null != value &&
                    value.length() > 0
            ) {
                responseWriter.writeAttribute("id", value, null);
            }

        }

        {
            String value = this.getContainerStyle(component);
            if (null != value &&
                    value.length() > 0
            ) {
                responseWriter.writeAttribute("style", value, null);
            }

        }


        renderPassThroughAttributes(facesContext, component,
                PASS_THROUGH_ATTRIBUTES17);

        responseWriter.startElement("div", component);
        responseWriter.writeAttribute("class", "rf-pp-shdw", null);

        {
            String value = convertToString(clientId) + "_shadow";
            if (null != value &&
                    value.length() > 0
            ) {
                responseWriter.writeAttribute("id", value, null);
            }

        }


        responseWriter.endElement("div");
        if (((component.getFacet("header") != null) && component.getFacet("header").isRendered())) {
            responseWriter.startElement("div", component);
            {
                String value = "rf-pp-hdr " + convertToString(component.getAttributes().get("headerClass"));
                if (null != value &&
                        value.length() > 0
                ) {
                    responseWriter.writeAttribute("class", value, null);
                }

            }

            {
                String value = convertToString(clientId) + "_header";
                if (null != value &&
                        value.length() > 0
                ) {
                    responseWriter.writeAttribute("id", value, null);
                }

            }


            responseWriter.startElement("div", component);
            responseWriter.writeAttribute("class", "rf-pp-hdr-cnt", null);

            {
                String value = convertToString(clientId) + "_header_content";
                if (null != value &&
                        value.length() > 0
                ) {
                    responseWriter.writeAttribute("id", value, null);
                }

            }


            renderHeaderFacet(facesContext, component);
            responseWriter.endElement("div");
            responseWriter.endElement("div");
        }
        if (((component.getAttributes().get("header") != null) && ((component.getFacet("header") == null) || (!component.getFacet("header").isRendered())))) {
            responseWriter.startElement("div", component);
            {
                String value = "rf-pp-hdr " + convertToString(component.getAttributes().get("headerClass"));
                if (null != value &&
                        value.length() > 0
                ) {
                    responseWriter.writeAttribute("class", value, null);
                }

            }

            {
                String value = convertToString(clientId) + "_header";
                if (null != value &&
                        value.length() > 0
                ) {
                    responseWriter.writeAttribute("id", value, null);
                }

            }


            responseWriter.startElement("div", component);
            responseWriter.writeAttribute("class", "rf-pp-hdr-cnt", null);

            {
                String value = convertToString(clientId) + "_header_content";
                if (null != value &&
                        value.length() > 0
                ) {
                    responseWriter.writeAttribute("id", value, null);
                }

            }


            {
                Object text = component.getAttributes().get("header");
                if (text != null) {
                    responseWriter.writeText(text, null);
                }
            }

            responseWriter.endElement("div");
            responseWriter.endElement("div");
        }
        if (((component.getFacet("controls") != null) && component.getFacet("controls").isRendered())) {
            responseWriter.startElement("div", component);
            {
                String value = "rf-pp-hdr-cntrls " + convertToString(component.getAttributes().get("controlsClass"));
                if (null != value &&
                        value.length() > 0
                ) {
                    responseWriter.writeAttribute("class", value, null);
                }

            }

            {
                String value = convertToString(clientId) + "_header_controls";
                if (null != value &&
                        value.length() > 0
                ) {
                    responseWriter.writeAttribute("id", value, null);
                }

            }


            renderControlsFacet(facesContext, component);
            responseWriter.endElement("div");
        }
        responseWriter.startElement("div", component);
        responseWriter.writeAttribute("class", "rf-pp-cnt-scrlr", null);

        {
            String value = convertToString(clientId) + "_content_scroller";
            if (null != value &&
                    value.length() > 0
            ) {
                responseWriter.writeAttribute("id", value, null);
            }

        }

        {
            String value = this.getStyleIfTrimmed(component);
            if (null != value &&
                    value.length() > 0
            ) {
                responseWriter.writeAttribute("style", value, null);
            }

        }


        responseWriter.startElement("div", component);
        responseWriter.writeAttribute("class", "rf-pp-cnt", null);

        {
            String value = convertToString(clientId) + "_content";
            if (null != value &&
                    value.length() > 0
            ) {
                responseWriter.writeAttribute("id", value, null);
            }

        }


        renderChildren(facesContext, component);
        responseWriter.endElement("div");
        responseWriter.endElement("div");
        if (convertToBoolean(component.getAttributes().get("resizeable"))) {
            responseWriter.startElement("div", component);
            responseWriter.writeAttribute("class", "rf-pp-hndlr  rf-pp-hndlr-l", null);

            {
                String value = convertToString(clientId) + "ResizerW";
                if (null != value &&
                        value.length() > 0
                ) {
                    responseWriter.writeAttribute("id", value, null);
                }

            }


            responseWriter.endElement("div");
            responseWriter.startElement("div", component);
            responseWriter.writeAttribute("class", "rf-pp-hndlr rf-pp-hndlr-r", null);

            {
                String value = convertToString(clientId) + "ResizerE";
                if (null != value &&
                        value.length() > 0
                ) {
                    responseWriter.writeAttribute("id", value, null);
                }

            }


            responseWriter.endElement("div");
            responseWriter.startElement("div", component);
            responseWriter.writeAttribute("class", "rf-pp-hndlr rf-pp-hndlr-t", null);

            {
                String value = convertToString(clientId) + "ResizerN";
                if (null != value &&
                        value.length() > 0
                ) {
                    responseWriter.writeAttribute("id", value, null);
                }

            }


            responseWriter.endElement("div");
            responseWriter.startElement("div", component);
            responseWriter.writeAttribute("class", "rf-pp-hndlr rf-pp-hndlr-b", null);

            {
                String value = convertToString(clientId) + "ResizerS";
                if (null != value &&
                        value.length() > 0
                ) {
                    responseWriter.writeAttribute("id", value, null);
                }

            }


            responseWriter.endElement("div");
            responseWriter.startElement("div", component);
            responseWriter.writeAttribute("class", "rf-pp-hndlr rf-pp-hndlr-tl", null);

            {
                String value = convertToString(clientId) + "ResizerNW";
                if (null != value &&
                        value.length() > 0
                ) {
                    responseWriter.writeAttribute("id", value, null);
                }

            }


            responseWriter.endElement("div");
            responseWriter.startElement("div", component);
            responseWriter.writeAttribute("class", "rf-pp-hndlr rf-pp-hndlr-tr", null);

            {
                String value = convertToString(clientId) + "ResizerNE";
                if (null != value &&
                        value.length() > 0
                ) {
                    responseWriter.writeAttribute("id", value, null);
                }

            }


            responseWriter.endElement("div");
            responseWriter.startElement("div", component);
            responseWriter.writeAttribute("class", "rf-pp-hndlr rf-pp-hndlr-bl", null);

            {
                String value = convertToString(clientId) + "ResizerSW";
                if (null != value &&
                        value.length() > 0
                ) {
                    responseWriter.writeAttribute("id", value, null);
                }

            }


            responseWriter.endElement("div");
            responseWriter.startElement("div", component);
            responseWriter.writeAttribute("class", "rf-pp-hndlr rf-pp-hndlr-br", null);

            {
                String value = convertToString(clientId) + "ResizerSE";
                if (null != value &&
                        value.length() > 0
                ) {
                    responseWriter.writeAttribute("id", value, null);
                }

            }


            responseWriter.endElement("div");
        }
        responseWriter.endElement("div");
        Map<String, Object> options = new LinkedHashMap<String, Object>();
        addToScriptHash(options, "left", this.getLeftOrDefault(component), "auto", null);

        addToScriptHash(options, "top", this.getTopOrDefault(component), "auto", null);


        addToScriptHash(options, facesContext, component, ATTRIBUTES_FOR_SCRIPT_HASH15, null);


        addToScriptHash(options, facesContext, component, ATTRIBUTES_FOR_SCRIPT_HASH16, ScriptHashVariableWrapper.eventHandler);

        responseWriter.startElement("script", component);
        responseWriter.writeAttribute("type", "text/javascript", null);


        {
            Object text = "new RichFaces.ui.PopupPanel(" + convertToString(toScriptArgs(clientId, options)) + ");";
            if (text != null) {
                responseWriter.writeText(text, null);
            }
        }

        if (!isEqual(component.getAttributes().get("show"), false)) {
            {
                Object text = "RichFaces.ui.PopupPanel.showPopupPanel(" + convertToString(toScriptArgs(clientId, this.getHandledVisualOptions(component))) + ");";
                if (text != null) {
                    responseWriter.writeText(text, null);
                }
            }

        }
        responseWriter.endElement("script");
        responseWriter.endElement("div");

    }
}
