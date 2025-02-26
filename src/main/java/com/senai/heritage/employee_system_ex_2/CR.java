package com.senai.heritage.employee_system_ex_2;

import java.util.Scanner;

public class CR {
    static Scanner scan = new Scanner(System.in);
    public static void create(){

        String option;
        while (true){
            System.out.println("""
                    1 - 
                    2 - 
                    3 - back to menu
                    """);
            option = scan.nextLine();
            switch (option){
                case "1":  break;
                case "2":  break;
                case "3": return;
                default:
                    System.out.println("wrong choice.");
            }
        }
    }
    public static void read(){
        String option;
        System.out.println("""
                1 - 
                2 - 
                3 - 
                """);
        option = scan.nextLine();
        switch (option){
            case "1": break;
            case "2":break;
            case "3": break; // crie uma lista que receba todos os produtos de forma genérica.
        }
    }
}
