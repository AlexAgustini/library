package com.library.customers.models;

import com.library.address.model.Address;

public class Customer {
    private String name;
    private String email;
    private int age;
    private Address address;

    public Customer() {}

    public Customer(String name, String email, int age, Address address) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer [name=" + name + ", email=" + email + ", age=" + age + ", address=" + address + "]";
    }
}
