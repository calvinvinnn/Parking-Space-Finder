package com.example.parking_space_finder.model;

public class Customer {
    private String name;
    private String phoneNumber;
    private String address;
    private Car car;

    public Customer() {
        name = "NULL";
        phoneNumber = "NULL";
        address = "NULL";

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        address = address;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
