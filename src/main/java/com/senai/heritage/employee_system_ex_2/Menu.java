package com.senai.heritage.employee_system_ex_2;

import com.senai.heritage.inventory_control_ex_1.CR;

import java.util.Scanner;

public class Menu {
   public static void menu(){
        Scanner scan = new Scanner(System.in);
       String option;
       do {

           System.out.println("""
               1 - 
               2 - 
               3 - exit
               """);

           option = scan.nextLine();
           switch (option){
               case "1": break;
               case "2":  break;
               case "3":  try {System.out.printf("exit");
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
