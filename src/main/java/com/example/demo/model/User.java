package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "ay_user")
public class User {

    @Id
    @GeneratedValue
    private String id;
    @Column(length = 10)
    private String name;
    @Column(length = 32)
    private String password;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
