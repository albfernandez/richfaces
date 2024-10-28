package org.richfaces.event;

import jakarta.faces.event.FacesListener;

public interface FilteringListener extends FacesListener {
    void processFiltering(FilteringEvent filteringEvent);
}
