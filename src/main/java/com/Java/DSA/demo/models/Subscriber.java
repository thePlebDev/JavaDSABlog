package com.Java.DSA.demo.models;

import javax.persistence.Entity;

@Entity
public class Subscriber extends AbstractEntity{

    //todo: make the email an @Embeddable , pg 62 spring data
    private String email;

    public Subscriber(){}
    public Subscriber(String email){
        this.email = email;
    }

    //GETTERS
    public String getEmail(){
        return this.email;
    }

    //SETTERS
    public void setEmail(String email){
        this.email = email;
    }
}
