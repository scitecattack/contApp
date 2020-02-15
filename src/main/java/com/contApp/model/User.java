package com.contApp.model;

import javax.persistence.*;

@Entity
public class User {
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String email;
    private String password;
    private boolean isAdmin;
    private String userName;

   @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Firm firm;

    public User() {
    }
public User(String email, String password){
        this.email=email;
        this.password=password;

}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Firm getFirm() {
        return firm;
    }

    public void setFirm(Firm firm) {
        this.firm = firm;
    }


}
