package com.dbms.triplehao.dao;

import com.dbms.triplehao.entity.CustomerAccount;

import java.util.List;

public interface CustomerAccountDao
{
    int insertCustomerAccount(CustomerAccount customerAccount);
    List<CustomerAccount> searchCustomerAccount(String username);
    int queryCountCustomer();

}
