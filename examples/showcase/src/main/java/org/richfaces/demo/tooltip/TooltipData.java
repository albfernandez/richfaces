package org.richfaces.demo.tooltip;

import java.io.Serializable;
import java.util.Date;

import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;


@Named
@ViewScoped
public class TooltipData implements Serializable {
    private int tooltipCounter = 0;

    public int getTooltipCounter() {
        return tooltipCounter++;
    }

    public Date getTooltipDate() {
        return new Date();
    }
}
