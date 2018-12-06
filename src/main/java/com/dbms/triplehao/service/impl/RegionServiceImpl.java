package com.dbms.triplehao.service.impl;

import com.dbms.triplehao.dao.RegionDao;
import com.dbms.triplehao.entity.Region;
import com.dbms.triplehao.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RegionServiceImpl implements RegionService{
    @Autowired
    public RegionDao regionDao;

    @Override
    public List<Region> getRegionList() {
        return regionDao.queryRegion();
    }

    @Override
    public List<Region> getRegionById(int id) {
        return regionDao.queryRegionById(id);
    }

    @Transactional
    @Override
    public boolean addRegion(Region region) {
        if (region.getRegionName() != null && !"".equals(region.getRegionName()) && region.getRegionManager() != null && !"".equals(region.getRegionManager()))
        {
            try {
                int effectedNum = regionDao.insertRegion(region);
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
    public boolean modifyRegion(Region region) {
        if (region.getRegionId() != null && region.getRegionId() > 0)
        {
            try {
                int effectedNum = regionDao.updatedRegion(region);
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
    public boolean deleteRegion(int regionId)
    {
        if (regionId > 0)
        {
            try {
                int effectedNum = regionDao.deleteRegion(regionId);
                if (effectedNum > 0)
                {
                    return true;
                }
                else
                {
                    throw new RuntimeException("Delete failed");
                }
            }
            catch (Exception e)
            {
                throw new RuntimeException("Delete failed" + e.toString());
            }
        }
        else
        {
            throw new RuntimeException("productId can not be null!");
        }
    }
}
