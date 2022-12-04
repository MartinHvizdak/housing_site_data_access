package com.group5.Model;

import javax.persistence.*;

@Entity
@Table(name = "user_seller")
public class User {
    @Id
    @Column(name = "email")
    String email;
    @Column(name = "name")
    String name;
    @Column(name = "surname")
    String surname;

    @Column(name = "password")
    String password;
    protected User(){}
    public User(String name, String surname, String email, String password) {
        this.name=name;
        this.surname=surname;
        this.email=email;
        this.password=password;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
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
}
