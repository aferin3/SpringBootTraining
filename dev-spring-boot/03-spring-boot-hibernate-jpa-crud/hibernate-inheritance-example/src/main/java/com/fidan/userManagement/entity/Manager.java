package com.fidan.userManagement.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("Manager")
public class Manager extends Personal{

    public Manager(String name, String email, String phone, String password) {
        super(name, email, phone, password);
    }

    public Manager() {

    }

    @Override
    public boolean login() {
        System.out.println(name+" (manager) is logged in");
        return true;
    }
}
