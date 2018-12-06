package com.dbms.triplehao.service.impl;

import com.dbms.triplehao.dao.StoreDao;
import com.dbms.triplehao.entity.Stores;
import com.dbms.triplehao.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StoreServiceImpl implements StoreService
{
    @Autowired
    private StoreDao storeDao;

    @Override
    public List<Stores> getStoreList() {
        return storeDao.queryStore();
    }

    @Override
    public List<Stores> getStoreById(int storeId) {
        return storeDao.queryStoreById(storeId);
    }

    @Override
    public List<Stores> getStoreByName(String address) {
        return storeDao.queryStoreByName(address);
    }

    @Transactional
    @Override
    public boolean addStore(Stores stores) {
        if (stores.getAddress() != null && !"".equals(stores.getAddress()) && stores.getRegionId() != null && stores.getStoreManager() != null && !"".equals(stores.getStoreManager()))
        {
            try {
                int effectedNum = storeDao.insertStore(stores);
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
    public boolean modifyStore(Stores stores) {
        if (stores.getStoreId() != null && stores.getStoreId() > 0)
        {
            try {
                int effectedNum = storeDao.updatedStore(stores);
                if (effectedNum > 0)
                {
                    return true;
                }
                else
                {
                    throw new RuntimeException("Update failed");
                }
            }
            catch (Exception e)
            {
                throw new RuntimeException("Update failed" + e.toString());
            }
        }
        else
        {
            throw new RuntimeException("data can not be null");
        }
    }

    @Override
    public boolean deleteStore(int storeId)
    {
        if (storeId > 0) {
            try {
                int effectedNum = storeDao.deleteStore(storeId);
                if (effectedNum > 0) {
                    return true;
                }
                else {
                    throw new RuntimeException("Delete Failed");
                }
            } catch (Exception e) {
                throw new RuntimeException("Delete Failed" + e.toString());
            }
        }
        else {
            throw new RuntimeException("storeId must not be null or negative");
        }
    }
}
