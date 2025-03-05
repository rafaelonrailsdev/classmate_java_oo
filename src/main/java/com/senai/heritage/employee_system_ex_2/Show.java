package com.senai.heritage.employee_system_ex_2;


import com.senai.heritage.inventory_control_ex_1.Product;

import java.util.Scanner;

public class Show {
    static Scanner scan = new Scanner(System.in);


    public static void fljkdjsl(){
        String option;
        do {
            System.out.println("""
                employee's list
                1 - Employee
                2 - Exit to menu
                """);
            option = scan.nextLine();
            switch (option){
                case "1": read(); break;
                case "2": Menu.menu();
                default: System.out.println("wrong choice");
            }
        }while (true);

    }
    public static void read() {
        Scanner scan = new Scanner(System.in);
        System.out.println("""
                1 - show directors
                2 - show directors and their respective teams
                """);
        String choice = scan.nextLine();
        switch (choice){
            case "1":
                if (Employee.directorArrayList.isEmpty()) {System.out.println("No directors available.");Director.newDirector();}
                else {System.out.println("Directors List:");
                    System.out.println(Employee.directorArrayList);}break;
            case "2":

                    System.out.println("list of directors with their respective teams:");
                    showTeamWithDirector();break;
            default: System.out.println("wrong choice");
        }
    }
    public static void showTeamWithDirector(){
        if (Employee.directorArrayList.isEmpty()||Employee.teacherArrayList.isEmpty()||Employee.employeeArrayList.isEmpty()) {System.out.println("empty.");Employee.create();}
        for (int i = 0; i < Employee.directorArrayListSesi.size(); i++) {
            if (Employee.directorArrayListSesi.get(i).departament.equals("sesi")) {
                System.out.println("Sesi :");for (Director director : Employee.directorArrayListSesi) {System.out.println(director);}}

                    System.out.println(Employee.teacherArrayListSesi);

            }
        for (int i = 0; i < Employee.directorArrayListSenai.size(); i++) {
            if (Employee.directorArrayListSenai.get(i).departament.equals("senai")) {
                System.out.println("Senai:");for (Director director : Employee.directorArrayListSenai) {System.out.println(director);}}
            System.out.println(Employee.teacherArrayListSenai);
        }
        for (int i = 0; i < Employee.directorArrayListSenat.size(); i++) {
            if (Employee.directorArrayListSenat.get(i).departament.equals("senat")) {
                System.out.println("Senat:");for (Director director : Employee.directorArrayListSenat) {System.out.println(director);}}
            System.out.println(Employee.teacherArrayListSenat);
        }
        for (int i = 0; i < Employee.directorArrayListSebrae.size(); i++) {
            if (Employee.directorArrayListSebrae.get(i).departament.equals("sebrae")) {
                System.out.println("Sebrae:");for (Director director : Employee.directorArrayListSebrae) {System.out.println(director);}}
            System.out.println(Employee.teacherArrayListSebrae);
        }

//            else if (Employee.directorArrayList.get(i).departament.equals("")) {
//                for (Teacher teacher : Director.)      //repetir o mesmo bloco do if
//            }
        }
    }

