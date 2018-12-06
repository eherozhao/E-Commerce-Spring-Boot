package com.dbms.triplehao.dao;

import com.dbms.triplehao.entity.Customer;

import java.util.List;

public interface CustomerDao {
    List<Customer> queryCustomer();

    List<Customer> queryCustomerByName(String firstName);

    int insertCustomer(Customer customer);

    int queryCountCustomer();
}
