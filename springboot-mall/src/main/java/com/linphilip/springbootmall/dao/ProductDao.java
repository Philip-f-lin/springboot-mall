package com.linphilip.springbootmall.dao;

import com.linphilip.springbootmall.dto.ProductQueryParams;
import com.linphilip.springbootmall.dto.ProductRequest;
import com.linphilip.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {

    Integer countProduct(ProductQueryParams productQueryParams);

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);

    void updateStock(Integer productId, Integer stock);
}
