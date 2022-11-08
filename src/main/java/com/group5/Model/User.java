package com.group5.Model;

import javax.persistence.*;

@Entity
@Table(name = "user",schema = "housingsystem")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    @Column(name = "name")
    String name;
    @Column(name = "surname")
    String surname;
    @Column(name = "email")
    String email;
    @Column(name = "password")
    String password;
    protected User(){}
    public User(String name, String surname, String email, String password) {
        this.name=name;
        this.surname=surname;
        this.email=email;
        this.password=password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
}
