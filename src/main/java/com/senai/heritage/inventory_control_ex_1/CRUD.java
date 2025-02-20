package com.senai.heritage.inventory_control_ex_1;

import java.util.Scanner;

public class CRUD {
    public static void create(){
        String option;
        while (true){
            Scanner scan = new Scanner(System.in);
            System.out.println("""
                    1 - food
                    2 - eletronic
                    3 - back to menu
                    """);
            option = scan.nextLine();
            switch (option){
                case "1": break;
                case "2": break;
                case "3":Menu.menu(); break;
                default:
                    System.out.println("wrong choice.");
            }
        }
    }
    public static void read(){}
    public static void update(){}
    public static void delete(){}
}
