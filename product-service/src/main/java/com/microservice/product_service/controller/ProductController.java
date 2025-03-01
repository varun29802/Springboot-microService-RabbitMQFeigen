package com.microservice.product_service.controller;

import com.microservice.product_service.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping("/api/products/{id}")
    public Product getProductById(){
        System.out.println("Service called by order-service");
        return new Product(101L,"Testing Product",99999);
    }
}
