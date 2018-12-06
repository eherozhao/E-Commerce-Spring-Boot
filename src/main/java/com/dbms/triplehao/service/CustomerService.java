package com.dbms.triplehao.service;

import com.dbms.triplehao.entity.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> getCustomerList();

    List<Customer> getCustomerByName(String name);

//    boolean addCustomer(Customer customer);

    int getCountCustomer();
}

