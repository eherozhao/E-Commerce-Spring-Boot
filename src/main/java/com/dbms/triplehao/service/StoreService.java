package com.dbms.triplehao.service;

import com.dbms.triplehao.entity.Stores;

import java.util.List;

public interface StoreService {
    List<Stores> getStoreList();

    List<Stores> getStoreById(int storeId);

    List<Stores> getStoreByName(String address);

    boolean addStore(Stores stores);

    boolean modifyStore(Stores stores);

    boolean deleteStore(int storeId);

}
