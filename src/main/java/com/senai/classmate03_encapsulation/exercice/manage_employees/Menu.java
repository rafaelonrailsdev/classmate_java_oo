package com.senai.classmate03_encapsulation.exercice.manage_employees;


import java.util.Scanner;

public class Menu {

    public static void toMenu(){
        Scanner scan = new Scanner(System.in);
        int choice ;
        String menu = """
            MAIN MENU
            1 -  SIGN UP EMPLOYEE
            2 -  SHOW EMPLOYEE
            3 -  EXIT
            ----------------------
            CHOOSE A OPTION:
            """;
        do{
            System.out.printf(menu);
            choice = scan.nextInt();
            switch (choice){
                case 1-> ManageEmployee.addEmployee();
                case 2-> ManageEmployee.showEmployee();
                case 3-> System.out.println("end");
                default -> System.out.println("wrong choice");
            }
        }while (choice!=3);

    }

}
