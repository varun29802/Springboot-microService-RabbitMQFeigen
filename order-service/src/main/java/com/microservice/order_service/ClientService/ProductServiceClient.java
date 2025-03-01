package com.microservice.order_service.ClientService;

import com.microservice.order_service.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "product-service", url = "http://localhost:8080")
public interface ProductServiceClient {

    @GetMapping("/api/products/{id}")
    Product getProduct(@PathVariable("id") Long id);
}
