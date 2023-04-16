package com.mnesa.declarativefunctionprogramming.CombinatorPattern;

import java.time.LocalDate;

public class Customer {
    private String name;
    private String email;
    private String phone;
    private LocalDate dob;

    public Customer(String name, String email, String phone, LocalDate dob) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.dob = dob;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public LocalDate getDob() {
        return dob;
    }
}
