package com.senai.heritage.order_management_system_ex_03;


import java.util.Scanner;

public class OrderOnline extends Order {
    double deliveryFee;
    public OrderOnline(String orderId, double totalValue, double deliveryFee) {
        super(orderId, totalValue);
        this.deliveryFee = deliveryFee;
    }
    @Override
    public void showOrderDetails() {
        super.showOrderDetails();
        System.out.println("Delivery Fee: " + deliveryFee);
        System.out.println("Total Value with Delivery: " + (totalValue + deliveryFee));
    }
    public static void order(Scanner scanner){


        System.out.print("Digite o número do pedido: ");
        String orderId = scanner.nextLine();

        System.out.print("Digite o valor total do pedido: ");
        double totalValue = scanner.nextDouble();

        System.out.print("Digite a taxa de entrega: ");
        double deliveryFee = scanner.nextDouble();
        scanner.nextLine();
        OrderOnline onlineOrder = new OrderOnline(orderId, totalValue, deliveryFee);
        onlineOrder.showOrderDetails();
    }
}