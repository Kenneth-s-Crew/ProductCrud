package com.cognizant.Product;

import com.cognizant.Product.models.Product;
import com.cognizant.Product.repositories.ProductRepo;
import com.cognizant.Product.services.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import javax.transaction.Transactional;

import java.util.ArrayList;
import java.util.List;

import static java.nio.file.Paths.get;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class ProductControllerTest {

    @Autowired
    private MockMvc mockMvc;


    @Autowired
    private ProductRepo pr;

    @Autowired
    private ProductService ps;

    @Test
    @Transactional
    void getProductId() throws Exception {

        List<Product> productList = new ArrayList<>();
        Product p = new Product();

        mockMvc.perform(get("/productId")
                .p("productId","1")).andDo(print())
                .andExpect(status().isAccepted());


        //mockMvc.perform(Reques("/product/productId")).andDo(print()).andExpect(status().isAccepted());
              //  .param("productId", "1").andDo(print()).andExpect(status().isOk());

    }




}
