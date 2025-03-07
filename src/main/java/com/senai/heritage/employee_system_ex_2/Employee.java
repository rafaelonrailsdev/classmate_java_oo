package com.senai.heritage.employee_system_ex_2;

import java.util.ArrayList;
import java.util.Scanner;

//um sistema que tenha uma classe Funcionário
public abstract class Employee {
    static ArrayList<Employee> employeeArrayList = new ArrayList<>();
    static ArrayList<Teacher> teacherArrayList = new ArrayList<>();
    static  ArrayList<Director> directorArrayList = new ArrayList<>();
    static  ArrayList<Director> directorArrayListSesi
 = new ArrayList<>();
    static ArrayList<Teacher> teacherArrayListSesi = new ArrayList<>();
    static ArrayList<Teacher> teacherArrayListSenai = new ArrayList<>();
    static  ArrayList<Director> directorArrayListSenai = new ArrayList<>();
    static ArrayList<Teacher> teacherArrayListSenat = new ArrayList<>();
    static  ArrayList<Director> directorArrayListSenat = new ArrayList<>();
    static ArrayList<Teacher> teacherArrayListSebrae = new ArrayList<>();
    static  ArrayList<Director> directorArrayListSebrae = new ArrayList<>();




    String name;
    double salary;
    String departament;
    public Employee(String name , double salary,String departament){
        this.name = name;
        this.salary = salary;
        this.departament = departament;
    }
    public static void create(Scanner scan){
        String option;
        while (true){
            System.out.println("""
                    add new employee
                    1 - Director
                    2 - Teacher
                    3 - back to menu
                    """);
            option = scan.nextLine();
            switch (option){
                case "1": Director.newDirector(scan); break;
                case "2": Teacher.newTeacher();  break;
                case "3": Menu.menu();
                default:
                    System.out.println("wrong choice.");
            }
        }
    }
    @Override
    public String toString() {
        return String.format(
                "employee{name='%s', salary=%.2f, department='%s'}",
                name, salary, departament
        );
    }
}
