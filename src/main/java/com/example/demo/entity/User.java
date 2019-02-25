package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//  @Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String userName;
    private String password;
    private String address1;
    private String address2;
    private String city;

    public void setId(int id) {
        this.id = id;
    }
    // // @Column(name="id")
    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }
    // // @Column(name="name")
    public String getName() {
        return name;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    // @Column(name="userName")
    public String getUserName() {
        return userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    // @Column(name="password")
    public String getPassword() {
        return password;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }
    // @Column(name="address1")
    public String getAddress1() {
        return address1;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }
    // @Column(name="address2")
    public String getAddress2() {
        return address2;
    }

    public void setCity(String city) {
        this.city = city;
    }
    // @Column(name="city")
    public String getCity() {
        return city;
    }
}