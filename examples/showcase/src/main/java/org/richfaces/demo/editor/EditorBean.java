package org.richfaces.demo.editor;

import java.io.Serializable;

import jakarta.faces.annotation.ManagedProperty;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;


@Named
@ViewScoped
public class EditorBean implements Serializable {
    private static final long serialVersionUID = 1L;

    @ManagedProperty(value = "#{fairyTailBean}")
    private transient FairyTailBean fairyTailBean;

    private String toolbar = "basic";
    private String skin = "moono-lisa";
    private String language = "fr";
    private String value = null;

    public void setFairyTailBean(FairyTailBean fairyTailBean) {
        this.fairyTailBean = fairyTailBean;
    }

    public String getToolbar() {
        return toolbar;
    }

    public void setToolbar(String toolbar) {
        this.toolbar = toolbar;
    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getValue() {
        if (value == null) {
            return fairyTailBean.getFairyTail();
        }
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
