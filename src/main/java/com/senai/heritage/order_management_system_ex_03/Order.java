package com.senai.heritage.order_management_system_ex_03;

public class Order {
    String orderId;
    double totalValue;

    public Order(String orderId, double totalValue) {
        this.orderId = orderId;
        this.totalValue = totalValue;
    }
    public void showOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Total Value: " + totalValue);
    }
}