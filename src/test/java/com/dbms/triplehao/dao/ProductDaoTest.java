package com.dbms.triplehao.dao;

import com.dbms.triplehao.entity.Product;
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
public class ProductDaoTest {
    @Autowired
    private ProductDao productDao;

    @Test
    @Ignore
    public void queryProduct() {
        List<Product> productList = productDao.queryProduct();
        assertEquals(81, productList.size());
    }

    @Test
    @Ignore
    public void queryProductById() {
        List<Product> product = productDao.queryProductById(1);
        assertEquals(1, product.size());
    }

    @Test
    @Ignore
    public void queryCountProduct() {
        int result = productDao.queryCountProduct();
        assertEquals(81,result);
    }


    @Test
    //@Ignore
    public void sortByPrice() {
        List<Product> productListByPrice = productDao.querySortByPrice();
        assertEquals(81, productListByPrice.size());
    }

    @Test
    //@Ignore
    public void sortByPriceDesc() {
        List<Product> productListByPrice = productDao.querySortByPriceDesc();
        assertEquals(81, productListByPrice.size());
    }

    @Test
    @Ignore
    public void insertProduct() {
        Product product = new Product();
        product.setName("iPod Classic");
        product.setPrice(399.99);
        product.setInventoryAmount(1);
        product.setCategory("Accessories");
        int effectedNum = productDao.insertProduct(product);
        assertEquals(1,effectedNum);

    }

    @Test
    @Ignore
    public void updatedProduct() {
        Product product = new Product();
        product.setName("MacBook in-case bag");
        product.setPrice(79.99);
        product.setInventoryAmount(12);
        product.setCategory("Accessories");
        product.setProductID(82);
        int effectedNum = productDao.updatedProduct(product);
        assertEquals(1,effectedNum);
    }

    @Test
    @Ignore
    public void deleteProduct() {
        int effectedNum = productDao.deleteProduct(83);
        assertEquals(1,effectedNum);
    }

}