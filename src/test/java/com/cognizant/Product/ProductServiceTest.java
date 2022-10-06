package com.cognizant.Product;

import com.cognizant.Product.models.Product;
import com.cognizant.Product.repositories.ProductRepo;
import com.cognizant.Product.services.ProductService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class ProductServiceTest {
    @Mock
    ProductRepo pr;

    @Autowired
    ProductService ps;

    @BeforeEach
    public void prodcutregTest(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void ProductTest(){
    }
}
