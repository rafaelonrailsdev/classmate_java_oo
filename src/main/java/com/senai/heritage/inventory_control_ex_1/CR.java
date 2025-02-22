package com.senai.heritage.inventory_control_ex_1;

import java.util.Scanner;

public class CR {
    static Scanner scan = new Scanner(System.in);
    public static void create(){

        String option;
        while (true){
            System.out.println("""
                    1 - food
                    2 - eletronic
                    3 - back to menu
                    """);
            option = scan.nextLine();
            switch (option){
                case "1": Food.newFood(); break;
                case "2": Eletronic.newEletronic(); break;
                case "3": return;
                default:
                    System.out.println("wrong choice.");
            }
        }
    }
    public static void read(){
        String option;
        System.out.println("""
                1 - Food
                2 - Eletronic
                3 - Stock
                """);
        option = scan.nextLine();
        switch (option){
            case "1": Food.showStock(); break;
            case "2": Eletronic.showStock();break;
            case "3": Product.showStock();break; // crie uma lista que receba todos os produtos de forma genérica.
        }
    }
}
