package com.dbms.triplehao.dao;

import com.dbms.triplehao.entity.Region;

import java.util.List;

public interface RegionDao {

    List<Region> queryRegion();

    List<Region> queryRegionById(int regionId);

    int insertRegion(Region region);

    int updatedRegion(Region region);

    int deleteRegion(int regionId);
}
