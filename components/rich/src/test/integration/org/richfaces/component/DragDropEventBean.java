package org.richfaces.component;

import jakarta.faces.bean.ManagedBean;
import jakarta.faces.bean.ManagedProperty;
import jakarta.faces.bean.RequestScoped;
import org.richfaces.event.DropEvent;
import org.richfaces.event.DropListener;

@ManagedBean
@RequestScoped
public class DragDropEventBean implements DropListener {

    @ManagedProperty(value = "#{dragDropBean}")
    private DragDropBean dragDropBean;

    public void setDragDropBean(DragDropBean dragDropBean) {
        this.dragDropBean = dragDropBean;
    }

    @Override
    public void processDrop(DropEvent event) {
        dragDropBean.moveFramework((Framework) event.getDragValue());
    }
}