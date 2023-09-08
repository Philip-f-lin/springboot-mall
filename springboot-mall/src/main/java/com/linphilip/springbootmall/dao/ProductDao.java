package com.linphilip.springbootmall.dao;

import com.linphilip.springbootmall.model.Product;

public interface ProductDao {
    Product getProductById(Integer productId);
}
