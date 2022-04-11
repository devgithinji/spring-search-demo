package com.densoft.springsearchapi.repository;

import com.densoft.springsearchapi.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    @Query("SELECT p from Product p WHERE p.name LIKE CONCAT('%',:query,'%') OR p.description LIKE CONCAT('%',:query,'%')  ")
    List<Product> searchProducts(@Param("query") String query);

    //native sql query
    @Query(value = "SELECT * from products p WHERE p.name LIKE CONCAT('%',:query,'%') OR p.description LIKE CONCAT('%',:query,'%')  ", nativeQuery = true)
    List<Product> searchProductsNativeQuery(@Param("query") String query);
}
