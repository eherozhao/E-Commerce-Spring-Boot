package com.dbms.triplehao.dao;

import com.dbms.triplehao.entity.SalesAccount;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SalesAccountDaoTest {
    @Autowired
    private SalesAccountDao salesAccountDao;

    @Test
    public void insertSalesAccount()
    {
        SalesAccount salesAccount = new SalesAccount();
        salesAccount.setUsername("coldplay@hotmail.com");
        salesAccount.setPassword("123456");
        int effectedNum = salesAccountDao.insertSalesAccount(salesAccount);
        assertEquals(1,effectedNum);
    }
}
