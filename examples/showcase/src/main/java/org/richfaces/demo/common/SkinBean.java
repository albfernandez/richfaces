/**
 *
 */
package org.richfaces.demo.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.annotation.ManagedProperty;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Named;

/**
 * @author ishaikovsky
 */
@Named("skinBean")
@SessionScoped
public class SkinBean implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = -2399884208294434812L;
    private static final String SKIN_VIEW_PARAMETER = "skin";
    @ManagedProperty(value = "blueSky")
    private String skin;
    private List<String> skins;

    @PostConstruct
    public void initialize() {
        skins = new ArrayList<String>();
        skins.add("blueSky");
        skins.add("classic");
        skins.add("deepMarine");
        skins.add("emeraldTown");
        skins.add("japanCherry");
        skins.add("ruby");
        skins.add("wine");
    }

    // TODO: move to utility class. used in navigator also.
    private String getViewParameter(String name) {
        FacesContext fc = FacesContext.getCurrentInstance();
        String param = (String) fc.getExternalContext().getRequestParameterMap().get(name);
        if (param != null && param.trim().length() > 0) {
            return param;
        } else {
            return null;
        }
    }

    public String getSkin() {
        String currentSkin = getViewParameter(SKIN_VIEW_PARAMETER);
        if (currentSkin != null) {
            skin = currentSkin;
        }
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public List<String> getSkins() {
        return skins;
    }
}
