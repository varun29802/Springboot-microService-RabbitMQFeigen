package com.microservice.order_service.controller;

import com.microservice.order_service.ClientService.ProductServiceClient;
import com.microservice.order_service.RabbitMQService.RabbitMQService;
import com.microservice.order_service.model.Order;
import com.microservice.order_service.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    private ProductServiceClient productServiceClient;

    @Autowired
    private RabbitMQService rabbitMQService;

    @PostMapping("/order")
    public String createOrder(@RequestBody Order order){

        Product  product = productServiceClient.getProduct(order.getProductId());

        // Log the product details and order quantity
        System.out.println("Product details: " + product);
        System.out.println("Order quantity: " + order.getQuantity());

        // Send an order event to RabbitMQ
        rabbitMQService.sendOrderToQueue(order);

        return "Order placed successfully!";
    }

}
