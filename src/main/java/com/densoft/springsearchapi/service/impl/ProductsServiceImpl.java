package com.densoft.springsearchapi.service.impl;

import com.densoft.springsearchapi.entity.Product;
import com.densoft.springsearchapi.repository.ProductRepository;
import com.densoft.springsearchapi.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsServiceImpl implements ProductService {


    private ProductRepository productRepository;


    public ProductsServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> searchProducts(String query) {
        return productRepository.searchProducts(query);
    }
}
