package com.senai.heritage.employee_system_ex_2;


import com.senai.heritage.inventory_control_ex_1.Product;

import java.util.Scanner;

public class Show {
    static Scanner scan = new Scanner(System.in);


    public static void read(){
        String option;
        do {
            System.out.println("""
                employee's list
                1 - Director
                2 - Teacher
                3 - Employee
                4 - Exit to menu
                """);
            option = scan.nextLine();
            switch (option){
                case "1": showDirector(); break;
                case "2": Teacher.showTeacher(); break;
                case "3": Employee.showEmployee();break;
                case "4": Menu.menu();
                default: System.out.println("wrong choice");
            }
        }while (true);

    }
    public static void showDirector() {
        Scanner scan = new Scanner(System.in);
        System.out.println("""
                1 - show directors
                2 - show directors and their respective teams
                """);
        String choice = scan.nextLine();
        switch (choice){
            case "1":
                if (Employee.directorArrayList.isEmpty()) {System.out.println("No directors available.");}
                else {System.out.println("Directors List:");for (Director director : Employee.directorArrayList) {System.out.println(director);}}break;
            case "2":
                if (Employee.directorArrayList.isEmpty()) {System.out.println("No directors available.");}
                else {
                    System.out.println("list of directors with their respective teams:");
                    showTeamWithDirector();
                }break;
            default: System.out.println("wrong choice");
        }
    }
    public static void showTeamWithDirector(){
        for (int i = 0; i < Employee.directorArrayList.size(); i++) {
            if (Employee.directorArrayList.get(i).departament.equals("sesi")) {
                showDirector();
                for (Teacher teacher : Director.departamentSesi) {
                    System.out.println(teacher);
                }
            }
//            else if (Employee.directorArrayList.get(i).departament.equals("")) {
//                for (Teacher teacher : Director.)      //repetir o mesmo bloco do if
//            }
        }
    }
}
