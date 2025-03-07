package com.senai.heritage.order_management_system_ex_03;

import java.util.Scanner;

public class OrderInPerson extends Order {
    double cashPaymentDiscount;

    public OrderInPerson(String orderId, double totalValue, double cashPaymentDiscount) {
        super(orderId, totalValue);
        this.cashPaymentDiscount = cashPaymentDiscount;
    }

    @Override
    public void showOrderDetails() {
        super.showOrderDetails();
        System.out.println("Cash Payment Discount: " + cashPaymentDiscount);
        System.out.println("Total Value with Discount: " + (totalValue - cashPaymentDiscount));
    }
    public static void order(Scanner scanner){
        // Pedido Presencial
        System.out.print("Digite o número do pedido: ");
        String orderId = scanner.nextLine();

        System.out.print("Digite o valor total do pedido: ");
        double totalValue = scanner.nextDouble();

        System.out.print("Digite o desconto para pagamento à vista: ");
        double cashPaymentDiscount = scanner.nextDouble();
        scanner.nextLine();
        OrderInPerson inPersonOrder = new OrderInPerson(orderId, totalValue, cashPaymentDiscount);
        inPersonOrder.showOrderDetails();
    }
}