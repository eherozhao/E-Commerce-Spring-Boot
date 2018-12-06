package com.dbms.triplehao.service;

import com.dbms.triplehao.entity.Product;

import java.util.List;

public interface ProductService
{
    List<Product> getProductList();

    List<Product> getProductById(int productId);

    List<Product> getProductByName(String name);

    boolean addProduct(Product product);

    boolean modifyProduct(Product product);

    boolean deleteProduct(int productId);

    int countProduct();
    //by price increase
    List<Product> sortByProduct();
    //by price descendent
    List<Product> sortByProductDesc();
    //search Camera
    List<Product> searchForCamera();
    //search Camera
    List<Product> searchForHeadphone();
    //search Camera
    List<Product> searchForAcc();
    //search Camera
    List<Product> searchForCellphone();
    //search Camera
    List<Product> searchForLaptop();
    //search Camera
    List<Product> searchForTele();
    //search Camera
    List<Product> searchForTablet();
}
