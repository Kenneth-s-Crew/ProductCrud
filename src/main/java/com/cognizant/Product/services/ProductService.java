package com.cognizant.Product.services;

import com.cognizant.Product.models.Product;
import com.cognizant.Product.repositories.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ProductService {

    @Autowired
    private ProductRepo pr;

    @Autowired
    public ProductService(ProductRepo pr){
        this.pr = pr;
    }

    public List<Product> getProductId(int productId) {
        return pr.findByProductId(productId);
    }

    public List<Product> getProductName(String productName) {
        return pr.findByProductName(productName);
    }

    public List<Product> getDeptId(int deptId) {
        return pr.findByDeptId(deptId);
    }

    public List<Product> getDeptName(String deptName) {
        return pr.findByDeptName(deptName);
    }

    public List<Product> findAll(){
        return pr.findAll();
    }
}
