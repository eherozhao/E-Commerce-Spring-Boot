package com.dbms.triplehao.dao;

import com.dbms.triplehao.entity.CustomerAccount;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerAccountDaoTest {
    @Autowired
    private CustomerAccountDao customerAccountDao;

    @Test
    @Ignore
    public void insertCustomerAccount()
    {
        CustomerAccount customerAccount = new CustomerAccount();
        customerAccount.setUsername("Nate.LZH@hotmail.com");
        customerAccount.setPassword("123456");
        int effectedNum = customerAccountDao.insertCustomerAccount(customerAccount);
        assertEquals(1,effectedNum);
    }
    @Test
    //@Ignore
    public void queryCountCustomer() {
        int result = customerAccountDao.queryCountCustomer();
        assertEquals(1,result);
    }

}
