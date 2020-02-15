package com.contApp.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Firm {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int firmId;
    private String firmName;
    private Date scadency;

    @OneToOne(mappedBy = "firm", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private User user;

   @OneToMany(mappedBy = "firm", cascade = CascadeType.ALL)
   private List<Supplier> supplierList;

    public Firm() {
    }

    public List<Supplier> getSupplierList() {
        return supplierList;
    }

    public void setSupplierList(List<Supplier> supplierList) {
        this.supplierList = supplierList;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getFirmId() {
        return firmId;
    }

    public void setFirmId(int firmId) {
        this.firmId = firmId;
    }

    public String getFirmName() {
        return firmName;
    }

    public void setFirmName(String firmName) {
        this.firmName = firmName;
    }

    public Date getScadency() {
        return scadency;
    }

    public void setScadency(Date scadency) {
        this.scadency = scadency;
    }


}
