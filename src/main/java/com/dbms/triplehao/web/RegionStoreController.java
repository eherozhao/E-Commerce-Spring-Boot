package com.dbms.triplehao.web;

import com.alibaba.fastjson.JSON;
import com.dbms.triplehao.entity.RegionStore;
import com.dbms.triplehao.service.RegionStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "*", maxAge = 3600)       //允许后台做跨域传输
@RestController
@RequestMapping("/superadmin")
public class RegionStoreController {

    @Autowired
    private RegionStoreService regionStoreService;

    @RequestMapping(value = "/listregionstore", method = RequestMethod.GET)
    private String listRegionStore() {
        Map<String, Object> map = new HashMap<>();
        List<RegionStore> list = regionStoreService.getRegionStoreList();
        map.put("regionstoreList", list);
        String json = JSON.toJSON(map).toString();
        return json;
    }

}
