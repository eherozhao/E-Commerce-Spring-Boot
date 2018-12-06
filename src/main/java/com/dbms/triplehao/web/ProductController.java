package com.dbms.triplehao.web;

import com.alibaba.fastjson.JSON;
import com.dbms.triplehao.entity.Product;
import com.dbms.triplehao.service.ProductService;
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
public class ProductController
{
    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/listproduct", method = RequestMethod.GET)
    private String listProduct()
    {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        List<Product> list = productService.getProductList();
        modelMap.put("productList", list);
        String json= JSON.toJSON(modelMap).toString();
        return json;
//        return modelMap;
    }

    @RequestMapping(value = "/getproductbyid", method  = RequestMethod.GET)
    private String getProductById(HttpServletRequest request)
    {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        int ProductId = Integer.parseInt(request.getParameter("ProductId"));
        List<Product> list = productService.getProductById(ProductId);
        modelMap.put("product",list);
        String json=JSON.toJSON(modelMap).toString();
        return json;
    }

    @RequestMapping(value = "/getproductbyname", method  = RequestMethod.GET)
    private String getProductByName(HttpServletRequest request)
    {
        Map<String, Object> modelMap = new HashMap<String, Object>();
////        String ProductName = String.parseInt(request.getParameter("name"));
//        String ProductName = request.getParameter("name");
        String ProductName = "TCL";
        List<Product> list = productService.getProductByName(ProductName);
        modelMap.put("product",list);
        String json=JSON.toJSON(modelMap).toString();
        return json;
    }

    @RequestMapping(value = "/sortproductbyprice", method = RequestMethod.GET)
    private String sortProductByPrice() {
        Map<String, Object> modelMap = new HashMap<>();
        List<Product> list = productService.sortByProduct();
        modelMap.put("productListByPrice", list);
        String json = JSON.toJSON(modelMap).toString();
        return json;
    }
    @RequestMapping(value = "/sortproductbypricedesc", method = RequestMethod.GET)
    private String sortProductByPriceDesc() {
        Map<String, Object> modelMap = new HashMap<>();
        List<Product> list = productService.sortByProductDesc();
        modelMap.put("productListByPriceDesc", list);
        String json = JSON.toJSON(modelMap).toString();
        return json;
    }

    @RequestMapping(value = "/searchforcamera", method = RequestMethod.GET)
    private String searchForCamera() {
        Map<String, Object> modelMap = new HashMap<>();
        List<Product> list = productService.searchForCamera();
        modelMap.put("searchforcamera", list);
        String json = JSON.toJSON(modelMap).toString();
        return json;
    }

    @RequestMapping(value = "/searchforheadphone", method = RequestMethod.GET)
    private String searchForHeadphone() {
        Map<String, Object> modelMap = new HashMap<>();
        List<Product> list = productService.searchForHeadphone();
        modelMap.put("searchforheadphone", list);
        String json = JSON.toJSON(modelMap).toString();
        return json;
    }

    @RequestMapping(value = "/searchforacc", method = RequestMethod.GET)
    private String searchForAcc() {
        Map<String, Object> modelMap = new HashMap<>();
        List<Product> list = productService.searchForAcc();
        modelMap.put("searchforacc", list);
        String json = JSON.toJSON(modelMap).toString();
        return json;
    }

    @RequestMapping(value = "/searchforcell", method = RequestMethod.GET)
    private String searchForCellphone() {
        Map<String, Object> modelMap = new HashMap<>();
        List<Product> list = productService.searchForCellphone();
        modelMap.put("searchforcell", list);
        String json = JSON.toJSON(modelMap).toString();
        return json;
    }

    @RequestMapping(value = "/searchforlaptop", method = RequestMethod.GET)
    private String searchForLaptop() {
        Map<String, Object> modelMap = new HashMap<>();
        List<Product> list = productService.searchForLaptop();
        modelMap.put("searchforlaptop", list);
        String json = JSON.toJSON(modelMap).toString();
        return json;
    }

    @RequestMapping(value = "/searchfortele", method = RequestMethod.GET)
    private String searchForTele() {
        Map<String, Object> modelMap = new HashMap<>();
        List<Product> list = productService.searchForTele();
        modelMap.put("searchfortele", list);
        String json = JSON.toJSON(modelMap).toString();
        return json;
    }

    @RequestMapping(value = "/searchfortablet", method = RequestMethod.GET)
    private String searchForTablet() {
        Map<String, Object> modelMap = new HashMap<>();
        List<Product> list = productService.searchForTablet();
        modelMap.put("searchfortablet", list);
        String json = JSON.toJSON(modelMap).toString();
        return json;
    }

}
