package com.example.parking_space_finder.model;

import java.util.ArrayList;
import java.util.List;

public class ParkingManager {

    private static final int PARKING_CAPACITY = 20;

    private Customer[] customerList = new Customer[PARKING_CAPACITY];

    public Customer getCustomerList(int i) {
        return customerList[i];
    }

    public int customerSize() {
        int count = 0;
        for (int i = 0; i < PARKING_CAPACITY; i++) {
            if (getCustomerList(i).getName().equals("NULL")) {
                count++;
            }
        }
        return count;
    }

    public void addCustomer(Customer c) {
        if (isFull()) {
            System.out.printf("Full Capacity");
        }
        for (int i = 0; i < PARKING_CAPACITY; i++) {
            if (getCustomerList(i).equals("NULL")) {
                getCustomerList(i).setName(c.getName());
                getCustomerList(i).setAddress(c.getAddress());
                getCustomerList(i).setPhoneNumber(c.getPhoneNumber());
                getCustomerList(i).getCar().setMake(c.getCar().getMake());
                getCustomerList(i).getCar().setLicencePlate(c.getCar().getLicencePlate());
                getCustomerList(i).getCar().setColor(c.getCar().getColor());
            }
        }
    }

    public boolean isFull() {
        if (customerSize() >= PARKING_CAPACITY) {
            return true;
        }
        return false;
    }
}
