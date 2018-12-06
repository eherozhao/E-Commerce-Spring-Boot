package com.dbms.triplehao.service.impl;

import com.dbms.triplehao.dao.ProductDao;
import com.dbms.triplehao.entity.Product;
import com.dbms.triplehao.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService
{
    @Autowired
    private ProductDao productDao;

    @Override
    public List<Product> getProductList() {
        return productDao.queryProduct();
    }

    @Override
    public List<Product> getProductById(int productId) {
        return productDao.queryProductById(productId);
    }

    @Override
    public List<Product> getProductByName(String name) {
        return productDao.queryProductByName(name);
    }

    @Override
    public int countProduct() {
        return productDao.queryCountProduct();
    }

    @Transactional
    @Override
    public boolean addProduct(Product product) {
        if (product.getName() != null && !"".equals(product.getName()) && product.getInventoryAmount() != null && product.getCategory() != null && !"".equals(product.getCategory()))
        {
            try {
                int effectedNum = productDao.insertProduct(product);
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
    public boolean modifyProduct(Product product) {
        if (product.getProductID() != null && product.getProductID() > 0)
        {
            try {
                int effectedNum = productDao.updatedProduct(product);
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
    public boolean deleteProduct(int productId)
    {
        if (productId > 0)
        {
            try {
                int effectedNum = productDao.deleteProduct(productId);
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

    @Override
    public List<Product> sortByProduct() {
        return productDao.querySortByPrice();
    }

    @Override
    public List<Product> sortByProductDesc() {
        return productDao.querySortByPriceDesc();
    }

    @Override
    public List<Product> searchForCamera() {
        return productDao.queryForCamera();
    }
    //search Camera
    @Override
    public List<Product> searchForHeadphone() {
        return productDao.queryForHeadphone();
    }
    //search Camera
    @Override
    public List<Product> searchForAcc() {
        return productDao.queryForAccessories();
    }
    //search Camera
    @Override
    public List<Product> searchForCellphone() {
        return productDao.queryForCellphone();
    }
    //search Camera
    @Override
    public List<Product> searchForLaptop() {
        return productDao.queryForLaptop();
    }
    //search Camera
    @Override
    public List<Product> searchForTele() {
        return productDao.queryForTele();
    }
    //search Camera
    @Override
    public List<Product> searchForTablet() {
        return productDao.queryForTablet();
    }
}
