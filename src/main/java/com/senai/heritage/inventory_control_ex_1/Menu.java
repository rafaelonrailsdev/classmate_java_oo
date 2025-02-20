package com.senai.heritage.inventory_control_ex_1;

import java.util.Scanner;

 public class Menu {
    public static void menu(){
         Scanner scan = new Scanner(System.in);
        String option;
        do {

            System.out.println("""
                1 - add new product
                2 - to update
                3 - delete
                4 - see the inventory
                5 - exit
                """);

            option = scan.nextLine();
            switch (option){
                case "1": CRUD.create();break;
                case "2": CRUD.update();break;
                case "3": CRUD.delete(); break;
                case "4": CRUD.read(); break;
                case "5":  try {System.out.printf("exit");
                    for (int i =0; i<3; i++){
                        System.out.printf(".");
                        Thread.sleep(300);
                    }return ;
                } catch (InterruptedException e) {e.printStackTrace();} break;
                default:
                    System.out.println("wrong choice");
            }

        }while (true);
    }
}
