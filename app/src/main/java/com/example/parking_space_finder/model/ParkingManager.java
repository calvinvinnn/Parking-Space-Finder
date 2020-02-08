package com.example.parking_space_finder.model;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class ParkingManager {
    private List<Customer> customerList = new ArrayList<>();
    private static final int MAX_CAPACITY = 5;

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void addCustomer(Customer c) {
        customerList.add(c);
    }

    public boolean isFull() {
        if (customerList.size() >= MAX_CAPACITY) {
            return true;
        }
        return false;
    }

    //Singleton
    private static ParkingManager instance;

    public static ParkingManager getInstance() {
        if (instance == null) {
            instance = new ParkingManager();
        }
        return instance;
    }

    private ParkingManager() {
        //private constructor
    }
}
