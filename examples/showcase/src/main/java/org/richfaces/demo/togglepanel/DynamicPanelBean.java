package org.richfaces.demo.togglepanel;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

@SessionScoped
@Named
public class DynamicPanelBean implements java.io.Serializable {

    private static final long serialVersionUID = 7666337275711147848L;
	private String activeTab;

    public String getActiveTab() {
        return activeTab;
    }

    public void setActiveTab(String activeTab) {
        this.activeTab = activeTab;
    }
}
