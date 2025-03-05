package com.senai.heritage.employee_system_ex_2;

import java.util.Scanner;

public class Menu {
   public static void menu(){
        Scanner scan = new Scanner(System.in);
       String option;
       do {

           System.out.println("""
               Main menu
               1 - add new employee
               2 - employee's list
               3 - exit
               """);

           option = scan.nextLine();
           switch (option){
               case "1": Employee.create(); break;
               case "2": Show.read();
               case "3": try {System.out.printf("exit");
                   for (int i =0; i<3; i++){
                       System.out.printf(".");
                       Thread.sleep(300);
                   }System.exit(0);
               } catch (InterruptedException e) {e.printStackTrace();}
               default:
                   System.out.println("wrong choice");
           }

       }while (true);
   }
}
