package com.dbms.triplehao.dao;

import com.dbms.triplehao.entity.Product;

import java.util.List;

public interface ProductDao {

    List<Product> queryProduct();

    List<Product> queryProductById(int productId);

    List<Product> queryProductByName(String name);

    int insertProduct(Product product);

    int updatedProduct(Product product);

    int deleteProduct(int productId);

    int queryCountProduct();

    List<Product> querySortByPrice();

    List<Product> querySortByPriceDesc();

    List<Product> queryForCamera();

    List<Product> queryForHeadphone();

    List<Product> queryForAccessories();

    List<Product> queryForCellphone();

    List<Product> queryForLaptop();

    List<Product> queryForTele();

    List<Product> queryForTablet();

}
