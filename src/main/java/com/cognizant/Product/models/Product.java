package com.cognizant.Product.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "PRODUCT")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int productId;

    private String productName;

    private int deptId;

    private String deptName;
}
