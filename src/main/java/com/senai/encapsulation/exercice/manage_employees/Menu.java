package com.senai.encapsulation.exercice.manage_employees;


import java.util.Scanner;

public class Menu {

    public static void toMenu(){
        Scanner scan = new Scanner(System.in);
        String choice ;


        String menu = """
        +----------------------+
        |      MAIN MENU       |
        +----------------------+
        | 1 - SIGN UP EMPLOYEE |
        | 2 - SHOW EMPLOYEE    |
        | 3 - EXIT             |
        +----------------------+
        CHOOSE AN OPTION: """;

        do{
            System.out.printf(menu);
            choice = scan.nextLine();
            switch (choice){
                case "1":ManageEmployee.addEmployee(); break;
                case "2": ManageEmployee.showEmployees(); break;
                case "3":
                    try {
                        System.out.printf("exit");
                        System.out.printf(".");
                        Thread.sleep(300);
                        System.out.printf(".");
                        Thread.sleep(300);
                        System.out.printf(".");
                        Thread.sleep(300);


                    } catch (InterruptedException e) {
                         e.printStackTrace();
                    }
                    return;
                default : System.out.println("wrong choice");
            }
        }while (!choice.equals("3"));

    }

}
