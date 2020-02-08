package com.contApp.model;

import org.hibernate.annotations.GeneratorType;

import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import java.util.List;

@Entity
public class Firm {
    @Id
    @GenerationType(strategy= GenerationType.AUTO)
    private int firmId;
    private String firmName;
    private Date scadency;
   private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Firm() {
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
