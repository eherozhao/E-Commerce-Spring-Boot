package com.dbms.triplehao.dao;

import com.dbms.triplehao.entity.Stores;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StoreDaoTest {
    @Autowired
    private StoreDao storeDao;

    @Test
    @Ignore
    public void queryStore() {
        List<Stores> storesList = storeDao.queryStore();
        assertEquals(0, storesList.size());
    }

    @Test
    @Ignore
    public void queryStoreById() {
        List<Stores> store = storeDao.queryStoreById(1);
        assertEquals(1, store.size());
    }

//    @Test
//    @Ignore
//    public void queryStoreByName() {
//        int result = storeDao.queryStoreByName();
//        assertEquals(81,result);
//    }

    @Test
    //@Ignore
    public void insertStore() {
        Stores store = new Stores();
        store.setAddress("Pitt");
        store.setStoreManager("William");
        store.setRegionId(1);
        int effectedNum = storeDao.insertStore(store);
        assertEquals(1,effectedNum);

    }

    @Test
    @Ignore
    public void updatedStore() {
        Stores store = new Stores();
        store.setAddress("New York");
        store.setStoreManager("Peter");
//        store.setRegionId(12);
        store.setStoreId(2);
        int effectedNum = storeDao.updatedStore(store);
        assertEquals(1,effectedNum);
    }

    @Test
    @Ignore
    public void deleteStore() {
        int effectedNum = storeDao.deleteStore(1);
        assertEquals(0,effectedNum);
    }
}