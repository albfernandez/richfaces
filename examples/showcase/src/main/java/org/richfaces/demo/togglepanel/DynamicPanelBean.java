package org.richfaces.demo.togglepanel;

import jakarta.faces.bean.ManagedBean;
import jakarta.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean
public class DynamicPanelBean {

    private String activeTab;

    public String getActiveTab() {
        return activeTab;
    }

    public void setActiveTab(String activeTab) {
        this.activeTab = activeTab;
    }
}
