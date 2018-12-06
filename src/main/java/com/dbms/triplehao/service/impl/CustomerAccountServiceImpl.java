package com.dbms.triplehao.service.impl;

import com.dbms.triplehao.dao.CustomerAccountDao;
import com.dbms.triplehao.entity.CustomerAccount;
import com.dbms.triplehao.service.CustomerAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CustomerAccountServiceImpl implements CustomerAccountService
{
    @Autowired
    CustomerAccountDao customerAccountDao;

    @Transactional
    @Override
    public boolean addCustomerAccount(CustomerAccount customerAccount)
    {
        if (customerAccount.getUsername() != null && !"".equals(customerAccount.getUsername()) && customerAccount.getPassword() != null && !"".equals(customerAccount.getPassword()))
        {
            try {
                int effectedNum = customerAccountDao.insertCustomerAccount(customerAccount);
                if (effectedNum>0)
                {
                    return true;
                }
                else
                {
                    throw new RuntimeException("Insert failed!");
                }
            }
            catch (Exception e)
            {
                throw new RuntimeException("Insert failed:" + e.getMessage());
            }

        }
        else
        {
            throw new RuntimeException("Insert data can not be null!!");
        }
    }

    @Override
    public List<CustomerAccount> searchCustomerAccount(String username)
    {
        return customerAccountDao.searchCustomerAccount(username);
    }
    @Override
    public int countCustomer() {
        return customerAccountDao.queryCountCustomer();
    }

}
