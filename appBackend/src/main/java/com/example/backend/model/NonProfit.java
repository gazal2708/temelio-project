package com.example.backend.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Nonprofit {
    @Id
    private String email;
    private String name;
    private String address;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
