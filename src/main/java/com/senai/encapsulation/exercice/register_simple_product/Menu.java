package com.senai.encapsulation.exercice.register_simple_product;

import java.util.Scanner;

public class Menu{

    public static void toMenu(){
        Scanner scan = new Scanner(System.in);
        int option;
        String message = """
                --- Register simple product system ---
                1 - Add new product
                2 - Show the products
                3 - exit
                """;

        do {
            System.out.println(message);
            option = scan.nextInt();
            switch (option){
                case 1 -> Product.newProduct();
                case 2 -> Product.showProduct();
                case 3 -> System.out.println("end");
                default -> System.out.println("set a valid number");

            }
        }while (option!=3);
    }
}
