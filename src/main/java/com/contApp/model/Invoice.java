package com.contApp.model;

import java.util.Date;

public class Invoice {
    private int invoiceId;
    private int invoiceNumber;
    private int value;
    private Date invoiceDate;
    private Date scadency;
    private boolean isPaid;
    private Supplier supplier;

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public Invoice() {
this.scadency=Supplier.getSupplierScadency();
    }

    public int getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(int invoiceId) {
        this.invoiceId = invoiceId;
    }

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public Date getScadency() {
        return scadency;
    }

    public void setScadency(Date scadency) {
        this.scadency = scadency;
    }
}
