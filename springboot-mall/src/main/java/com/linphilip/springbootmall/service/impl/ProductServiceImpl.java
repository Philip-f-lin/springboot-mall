package com.linphilip.springbootmall.service.impl;

import com.linphilip.springbootmall.dao.ProductDao;
import com.linphilip.springbootmall.model.Product;
import com.linphilip.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }
}