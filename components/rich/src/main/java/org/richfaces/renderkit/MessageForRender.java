package org.richfaces.renderkit;

import jakarta.faces.application.FacesMessage;
import jakarta.faces.application.FacesMessage.Severity;

public class MessageForRender {
    private final FacesMessage msg;
    private final String sourceId;

    public MessageForRender(FacesMessage msg, String sourceId) {
        this.msg = msg;
        this.sourceId = sourceId;
    }

    /**
     * <p class="changed_added_4_0">
     * </p>
     *
     * @see jakarta.faces.application.FacesMessage#getDetail()
     */
    public String getDetail() {
        return this.msg.getDetail();
    }

    /**
     * <p class="changed_added_4_0">
     * </p>
     *
     * @see jakarta.faces.application.FacesMessage#getSeverity()
     */
    public Severity getSeverity() {
        return this.msg.getSeverity();
    }

    /**
     * <p class="changed_added_4_0">
     * </p>
     *
     * @see jakarta.faces.application.FacesMessage#getSummary()
     */
    public String getSummary() {
        return this.msg.getSummary();
    }

    /**
     * <p class="changed_added_4_0">
     * </p>
     *
     * @see jakarta.faces.application.FacesMessage#isRendered()
     */
    public boolean isRendered() {
        return this.msg.isRendered();
    }

    /**
     * <p class="changed_added_4_0">
     * </p>
     *
     * @see jakarta.faces.application.FacesMessage#rendered()
     */
    public void rendered() {
        this.msg.rendered();
    }

    /**
     * <p class="changed_added_4_0">
     * </p>
     *
     * @return the sourceId
     */
    public String getSourceId() {
        return sourceId;
    }
}
