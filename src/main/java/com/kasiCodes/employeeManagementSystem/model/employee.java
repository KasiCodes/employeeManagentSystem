package com.kasiCodes.employeeManagementSystem.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "employee")
public class employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name")
    private String firstName;
    @Column(name = "second_name")
    private String secondName;
    @Column(name = "email")
    private String email;
    @Column(name = "phone")
    private String phone;
    @Column(name = "address")
    private String address;
    
 
    public employee() {
    }
    
    public employee(long id, String firstNme,String secondName, String email, String phone, String address) {
        this.id = id;
        this.firstName = firstNme;
        this.secondName = secondName;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }    
    public long getId() {    
        return id;
    }    
    public void setId(long id) {
        this.id = id;       
    }

    public String getName() {
        return firstName;
    }
    public void setName(String name) {
        this.firstName = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }   

    
}
