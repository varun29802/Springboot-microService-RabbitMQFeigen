package com.microservice.order_service.RabbitMQService;

import com.microservice.order_service.model.Order;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class OrderListener{

    @RabbitListener(queues = "order-queue")
    public void receiveOrder(Order order){
        System.out.println("Received order from RabbitMQ: " + order.getProductId());
    }
}
