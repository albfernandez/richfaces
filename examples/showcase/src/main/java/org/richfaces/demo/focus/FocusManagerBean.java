package org.richfaces.demo.focus;


import org.richfaces.application.ServiceTracker;
import org.richfaces.focus.FocusManager;

import jakarta.inject.Named;

@Named
public class FocusManagerBean {

    public void preRenderView() {
        FocusManager focusManager = ServiceTracker.getService(FocusManager.class);
        focusManager.focus("input2");
    }
}
