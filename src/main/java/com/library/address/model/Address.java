package com.library.address.model;
;

public class Address {
    private String street;
    private String state;
    private String country;
    private String neighborhood;
    private int number;

    public Address() {
    }

    public Address(String street, String state, String country, String neighborhood, int number) {
        this.street = street;
        this.state = state;
        this.country = country;
        this.neighborhood = neighborhood;
        this.number = number;
    }

    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Address [\nstreet=" + street + ",\n state=" + state + ",\n country=" + country + ",\n neighborhood="
                + neighborhood + ",\n number=" + number + "]";
    }

    
}
