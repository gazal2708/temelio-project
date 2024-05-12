package com.example.backend.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Foundation {
    @Id
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
