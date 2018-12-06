package com.dbms.triplehao.dao;

import com.dbms.triplehao.entity.Stores;

import java.util.List;

public interface StoreDao {

    List<Stores> queryStore();

    List<Stores> queryStoreById(int storeId);

    List<Stores> queryStoreByName(String address);

    int insertStore(Stores store);

    int updatedStore(Stores store);

    int deleteStore(int storeId);
}
