package org.richfaces.demo.lists;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named
@RequestScoped
public class ListBean {
    private String listType = "ordered";

    public String getListType() {
        return listType;
    }

    public void setListType(String listType) {
        this.listType = listType;
    }
}
