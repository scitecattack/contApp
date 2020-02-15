package com.contApp.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int supplierId;
    private String supplierName;
    private static Date supplierScadency;

@OneToMany(mappedBy = "supplier",cascade = CascadeType.ALL)
    private List<Invoice> invoiceList;
@ManyToOne
    private Firm firm;

    public Supplier() {
    }

    public Firm getFirm() {
        return firm;
    }

    public void setFirm(Firm firm) {
        this.firm = firm;
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
