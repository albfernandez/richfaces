package org.richfaces.component;

import jakarta.faces.bean.ManagedBean;
import jakarta.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class DropDownMenuBean {
    private static String _current = "none";

    public static String getCurrent() {
        return _current;
    }

    public static void setCurrent(String current) {
        _current = current;
    }

    public void doAction() {
        _current = "action";
    }
}
