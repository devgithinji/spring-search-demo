package com.densoft.springsearchapi.service;

import com.densoft.springsearchapi.entity.Product;

import java.util.List;

public interface ProductService {
    Product createProduct(Product product);

    List<Product> searchProducts(String query);
}
