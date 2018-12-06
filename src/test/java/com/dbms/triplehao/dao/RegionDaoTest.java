package com.dbms.triplehao.dao;

import com.dbms.triplehao.entity.Region;
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
public class RegionDaoTest {
    @Autowired
    private RegionDao regionDao;

    @Test
    @Ignore
    public void queryRegion() {
        List<Region> regionList = regionDao.queryRegion();
        assertEquals(0, regionList.size());
    }

    @Test
    @Ignore
    public void queryRegionById() {
        List<Region> region = regionDao.queryRegionById(2);
        assertEquals(1, region.size());
    }

//    @Test
//    @Ignore
//    public void queryStoreByName() {
//        int result = storeDao.queryStoreByName();
//        assertEquals(81,result);
//    }

    @Test
    @Ignore
    public void insertRegion() {
        Region region = new Region();
        region.setRegionName("Michigan");
        region.setRegionManager("Sam");
        int effectedNum = regionDao.insertRegion(region);
        assertEquals(1,effectedNum);

    }

    @Test
    @Ignore
    public void updatedRegion() {
        Region region = new Region();
        region.setRegionName("California");
        region.setRegionManager("Stan");
        region.setRegionId(2);
        int effectedNum = regionDao.updatedRegion(region);
        assertEquals(1,effectedNum);
    }

    @Test
    //@Ignore
    public void deleteRegion() {
        int effectedNum = regionDao.deleteRegion(2);
        assertEquals(1,effectedNum);
    }
}