package com.microservice.order_service.model;

public class Order {
    private Long productId;
    private Integer quantity;

    public Order(Long productId, Integer quantity) {
        this.productId = productId;
        this.quantity = quantity;
    }

    public Order() {
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
