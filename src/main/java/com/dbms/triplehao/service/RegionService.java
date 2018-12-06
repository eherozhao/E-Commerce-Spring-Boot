package com.dbms.triplehao.service;


import com.dbms.triplehao.entity.Region;

import java.util.List;

public interface RegionService {
    List<Region> getRegionList();

    List<Region> getRegionById(int regionId);

    boolean addRegion(Region region);

    boolean modifyRegion(Region region);

    boolean deleteRegion(int regionId);

}
