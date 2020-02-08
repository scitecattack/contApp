package com.contApp.model;

import java.util.Date;
import java.util.List;

public class Supplier {
    private int supplierId;
    private String supplierName;
    private static Date supplierScadency;
    private List<Invoice> invoiceList;
    private Firm firm;

    public Firm getFirm() {
        return firm;
    }

    public void setFirm(Firm firm) {
        this.firm = firm;
    }

    public Supplier() {
    }

    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public static Date getSupplierScadency() {
        return supplierScadency;
    }

    public void setSupplierScadency(Date supplierScadency) {
        this.supplierScadency = supplierScadency;
    }

    public List<Invoice> getInvoiceList() {
        return invoiceList;
    }

    public void setInvoiceList(List<Invoice> invoiceList) {
        this.invoiceList = invoiceList;
    }
}
