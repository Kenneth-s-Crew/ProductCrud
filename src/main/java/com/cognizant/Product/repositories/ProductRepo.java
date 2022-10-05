package com.cognizant.Product.repositories;

import com.cognizant.Product.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository <Product, Integer> {

    List<Product> findByProductId(int productId);

    List<Product> findByProductName(String productName);

    List<Product> findByDeptId(int deptId);

    List<Product> findByDeptName(String deptName);


    List<Product> findAll();




}