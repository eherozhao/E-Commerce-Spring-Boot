package com.dbms.triplehao.service.impl;

import com.dbms.triplehao.dao.CustomerDao;
import com.dbms.triplehao.entity.Customer;
import com.dbms.triplehao.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService
{
    @Autowired
    private CustomerDao customerDao;

    @Override
    public List<Customer> getCustomerList()
    {
        return customerDao.queryCustomer();
    }

    @Override
    public List<Customer> getCustomerByName(String firstName)
    {
        return customerDao.queryCustomerByName(firstName);
    }


    @Override
    public int getCountCustomer()
    {
        return customerDao.queryCountCustomer();
    }
}
