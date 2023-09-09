package com.linphilip.springbootmall.service;

import com.linphilip.springbootmall.dto.ProductRequest;
import com.linphilip.springbootmall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);
}
