package com.senai.heritage.inventory_control_ex_1;

import java.util.Scanner;

public class Food extends Product {

    private String expirationDate;
    Food(String name, double price, int amount, String expirationDate){
        super(name,price,amount);
        this.expirationDate = expirationDate;
    }
    static Scanner scan = new Scanner(System.in);

    public static void newFood(){
        String name = null;
        String amount;
        int amountFinal = 0;
        String price;
        double priceFinal = 0;
        String expirationDate = "dd/mm/yy";
        String amountProducts;
        int amountProductsFinal;
        do {
            System.out.println("quantity of products to be added to stock");
            amountProducts = scan.nextLine();
            try{amountProductsFinal = Integer.parseInt(amountProducts);
                for (int i = 0; i < amountProductsFinal; i++) {
                    System.out.println("Name: ");
                    name = scan.nextLine();
                    System.out.println("Price: ");
                    price = scan.nextLine();
                    try{priceFinal = Double.parseDouble(price);
                        System.out.println("Amount: ");
                        amount = scan.nextLine();
                        try {amountFinal =Integer.parseInt(amount);
                            System.out.println("expirantion Date:");
                            System.out.println("dd/mm/yy");
                            expirationDate = scan.nextLine();
                            listFood.add(new Food(name,priceFinal,amountFinal,expirationDate));
                            listProduct.add(new Food(name,priceFinal,amountFinal,expirationDate));
                        } catch (NumberFormatException e) {System.out.println("wrong choice.");}
                    } catch (NumberFormatException e) {System.out.println("wrong choice.");}

                }
            } catch (NumberFormatException e){System.out.println("wrong choice.");}
            return;
        }while (true);
    }

    @Override
    public String toString() {
        System.out.println("Product: ");
        return
                "\nname= " + getName()+ "| price=" +"$"+ getPrice() + "| amount=" + getAmount() + "| expiration date=" + expirationDate;}
    public static void showStock() {
        if (listFood.isEmpty()) {
            System.out.println("stock empty");
        } else {
            System.out.println("Food Stock:");
            System.out.println(listFood.toString());
        }
    }
}
