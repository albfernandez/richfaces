package org.richfaces.demo.tables;

import org.richfaces.demo.tables.model.expenses.ExpenseReport;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named
@RequestScoped
public class ReportBean {
    ExpenseReport expReport;

    public ExpenseReport getExpReport() {
        if (expReport == null) {
            expReport = new ExpenseReport();
        }
        return expReport;
    }

    public void setExpReport(ExpenseReport expReport) {
        this.expReport = expReport;
    }
}
