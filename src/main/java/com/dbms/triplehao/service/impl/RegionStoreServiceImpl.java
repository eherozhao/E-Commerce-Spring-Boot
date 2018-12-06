package com.dbms.triplehao.service.impl;

import com.dbms.triplehao.dao.RegionStoreDao;
import com.dbms.triplehao.entity.RegionStore;
import com.dbms.triplehao.service.RegionStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RegionStoreServiceImpl implements RegionStoreService {
    @Autowired
    private RegionStoreDao regionStoreDao;

    @Override
    public List<RegionStore> getRegionStoreList() {
        return regionStoreDao.queryRegionStore();
    }

}
