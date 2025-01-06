package org.richfaces.component;

import jakarta.faces.context.FacesContext;

public interface ClientSideMessage {
    void updateMessages(FacesContext context, String clientId);

    String getFor();
}