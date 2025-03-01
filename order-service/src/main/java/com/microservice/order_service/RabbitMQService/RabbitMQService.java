package com.microservice.order_service.RabbitMQService;

import com.microservice.order_service.model.Order;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQService {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private Queue queue;

    public void sendOrderToQueue(Order order){
        rabbitTemplate.convertAndSend(queue.getName(),order);
    }
}
