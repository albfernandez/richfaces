package org.richfaces.demo.dragdrop;


import org.richfaces.event.DropEvent;
import org.richfaces.event.DropListener;

import jakarta.enterprise.context.RequestScoped;
import jakarta.faces.annotation.ManagedProperty;
import jakarta.inject.Named;

@Named
@RequestScoped
public class DragDropEventBean implements DropListener {
    @ManagedProperty(value = "#{dragDropBean}")
    private DragDropBean dragDropBean;

    public void setDragDropBean(DragDropBean dragDropBean) {
        this.dragDropBean = dragDropBean;
    }

    public void processDrop(DropEvent event) {
        dragDropBean.moveFramework((Framework) event.getDragValue());
    }
}