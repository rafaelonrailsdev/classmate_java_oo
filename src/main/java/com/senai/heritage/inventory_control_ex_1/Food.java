package com.senai.heritage.inventory_control_ex_1;

import java.util.Scanner;

public class Food extends Product {

    private String expirationDate;
    Food(String name, Double price, int amount, String expirationDate){
        super(name,price,amount);
        this.expirationDate = expirationDate;
    }
    static Scanner scan = new Scanner(System.in);

    public static void newFood(){
        String amountProducts;
        do {
            System.out.println("quantity of products to be added to stock");
            amountProducts = scan.nextLine();
            try{addFoodInStock(Integer.parseInt(amountProducts));}
            catch (NumberFormatException e){System.out.println("wrong choice.");}
        }while (true);
    }
    public static void addFoodInStock(int amountProducts){
        for (int i = 0; i <amountProducts; i++) {
            System.out.println("Name: ");
            String name = scan.nextLine();
            System.out.println("Price: ");
            double price = scan.nextDouble();
            scan.nextLine();
            System.out.println("Amount: ");
            int amount = scan.nextInt();
            scan.nextLine();
            System.out.println("expirantion Date:");
            System.out.println("dd/mm/yy");
            String expirationDate = scan.nextLine();
            Food food = new Food(name,price,amount,expirationDate);
        listFood.add(food);
        listProduct.add(food);
        }
    }

    @Override
    public String toString() {
        System.out.println("Product: ");
        return
                "\nname= " + getName()+ "| price=" +"$"+ getPrice() + "| amount=" + getAmount() + "| expiration date=" + expirationDate;
    }
    public static void showStock(){
        System.out.println("Food Stock:");
        System.out.println(listFood.toString());
    }
}
