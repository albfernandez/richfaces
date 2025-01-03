package org.richfaces.demo.dragdrop;

import org.richfaces.event.DropEvent;
import org.richfaces.event.DropListener;

import jakarta.faces.bean.ManagedBean;
import jakarta.faces.bean.ManagedProperty;
import jakarta.faces.bean.RequestScoped;

@ManagedBean
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
