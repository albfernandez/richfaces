package org.richfaces.demo.param;

import jakarta.faces.bean.ManagedBean;
import jakarta.faces.bean.RequestScoped;
import java.io.Serializable;

@ManagedBean
@RequestScoped
public class ParamBean implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = -5704132574704883576L;
    private String screenWidth;
    private String screenHeight;

    public String getScreenWidth() {
        return screenWidth;
    }

    public void setScreenWidth(String screenWidth) {
        this.screenWidth = screenWidth;
    }

    public String getScreenHeight() {
        return screenHeight;
    }

    public void setScreenHeight(String screenHeight) {
        this.screenHeight = screenHeight;
    }
}
