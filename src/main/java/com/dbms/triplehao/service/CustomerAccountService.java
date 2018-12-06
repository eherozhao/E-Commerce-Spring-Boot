package com.dbms.triplehao.service;

import com.dbms.triplehao.entity.CustomerAccount;

import java.util.List;

public interface CustomerAccountService
{
    boolean addCustomerAccount(CustomerAccount customerAccount);
    List<CustomerAccount> searchCustomerAccount(String username);
    int countCustomer();
}
