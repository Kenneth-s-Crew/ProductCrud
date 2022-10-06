package com.cognizant.Product.controllers;

import com.cognizant.Product.models.Product;
import com.cognizant.Product.services.ProductService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/product")
@CrossOrigin(origins = "*")
public class ProductController {

    @Autowired
    private ProductService ps;

    @Autowired
    public ProductController(ProductService ps){
        this.ps = ps;
    }


    @GetMapping("/productId")
    public ResponseEntity<List<Product>> getProductId(@RequestParam (name = "productId")int productId) {
        return new ResponseEntity<>(ps.getProductId(productId), HttpStatus.ACCEPTED);
    }

    @GetMapping("/deptId")
    public ResponseEntity<List<Product>> getDeptId(@RequestParam (name = "deptId")int deptId) {
        return new ResponseEntity<>(ps.getDeptId(deptId), HttpStatus.ACCEPTED);
    }

    @GetMapping("/productName")
    public ResponseEntity<List<Product>> getProductName(@RequestParam (name = "productName")String productName) {
        return new ResponseEntity<>(ps.getProductName(productName), HttpStatus.ACCEPTED);
    }

    @GetMapping("/deptName")
    public ResponseEntity<List<Product>> getdeptName(@RequestParam (name = "deptName")String deptName) {
        return new ResponseEntity<>(ps.getDeptName(deptName), HttpStatus.ACCEPTED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Product>> getAll(){
        return new ResponseEntity<>(ps.findAll(), HttpStatus.ACCEPTED);
    }
}
