package org.richfaces.renderkit;

import jakarta.faces.application.FacesMessage;

import com.google.common.base.Function;

public class MessageTransformer implements Function<FacesMessage, MessageForRender> {
    private final String sourceId;

    public MessageTransformer(String sourceId) {
        this.sourceId = sourceId;
    }

    public MessageForRender apply(FacesMessage input) {
        return new MessageForRender(input, sourceId);
    }
}
