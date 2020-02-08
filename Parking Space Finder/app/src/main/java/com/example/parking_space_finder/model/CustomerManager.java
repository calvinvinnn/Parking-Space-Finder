package com.example.parking_space_finder.model;

import java.util.ArrayList;
import java.util.List;

public class CustomerManager {
    private List<Customer> customerList = new ArrayList<>();

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void addCustomer(Customer c) {
        customerList.add(c);
    }
}
