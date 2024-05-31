package com.fidan.userManagement.entity;


import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("Workers")
public class Worker extends Personal{
    public Worker(String name, String email, String phone, String password) {
        super(name, email, phone, password);
    }

    public Worker() {

    }

    @Override
    public boolean login() {
        System.out.println(this.name + " (worker) is logged in");
        return true;
    }
}
