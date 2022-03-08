package com.example.accessdb;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "employees")
public class Employee {
    private long id;
    private String firstName;
    private String lastName;
    private String emailId;

    public Employee(){

    }


    public Employee(long id, String firstName, String lastName, String emailId) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name="first_name", nullable = false)
    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name="last_name", nullable = false)
    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name="email_address", nullable = false)
    public String getEmailId() {
        return this.emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    
}
