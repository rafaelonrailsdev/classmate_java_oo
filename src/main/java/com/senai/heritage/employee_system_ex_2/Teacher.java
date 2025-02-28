package com.senai.heritage.employee_system_ex_2;
//e subclasses Professor que possue discplina

import java.util.Scanner;

public class Teacher extends Employee{
    String discipline;
    public Teacher(String name, double salary, String discipline,String department){
        super(name,salary,department);
        this.discipline = discipline;
    }

    public static void newTeacher(){
        Scanner scan = new Scanner(System.in);
        String name = null;
        String salary;
        double salaryFinal = 0;
        String discipline;
        String lengthTeacher;
        int length;
        String department;
        do {
            System.out.println("quantity of new teachers: ");
            lengthTeacher = scan.nextLine();
            try{
                length = Integer.parseInt(lengthTeacher);
                for (int i = 0; i < length; i++) {
                    System.out.println("Name: ");
                    name = scan.nextLine();
                    System.out.println("salary: ");
                    salary = scan.nextLine();
                    try{
                        salaryFinal = Double.parseDouble(salary);
                        System.out.println("""
                    Discipline: 
                    1- Levantamento de requisitos | 2- Arquitetura de redes com iot | 3- Programação back end | 4- Programação front end 
                    """);
                        discipline = scan.nextLine();
                        switch (discipline){
                            case "1"-> discipline = "Levantamento de requisitos";
                            case "2"-> discipline = "Arquitetura de redes com iot";
                            case "3"-> discipline = "Programação back end";
                            case "4"-> discipline = "Programação front end";

                            default -> System.out.println("wrong choice.");
                        }
                        System.out.println("""
                                Department:
                                  1- sesi | 2- senai | 3- senat | 4- sebrae 
                                """);
                        department = scan.nextLine();
                        switch (department){
                            case "1"-> department = "sesi";
                            case "2"-> department = "senai";
                            case "3"-> department = "senat";
                            case "4"-> department = "sebrae";
                            default -> System.out.println("wrong choice.");
                        }
                        try {
                            System.out.printf("loading");
                            for (int j =0; j<3; j++){
                                System.out.printf(".");
                                Thread.sleep(300);}
                            System.out.println("\nSaved\n");
                        }catch (InterruptedException e) {e.printStackTrace();}
                        Teacher teacher = new Teacher( name,salaryFinal,discipline,department);
                        Employee.employeeArrayList.add(teacher);
                        Employee.teacherArrayList.add(teacher);
                        switch (department){
                            case "sesi"-> Director.departamentSesi.add(teacher);
                            case "senai"-> Director.departamentSenai.add(teacher);
                            case "senat"-> Director.departamentSenat.add(teacher);
                            case "sebrae"-> Director.departamentSebrae.add(teacher);
                        }
                    } catch (NumberFormatException e) {System.out.println("wrong choice.");}
                }
            } catch (NumberFormatException e){System.out.println("wrong choice.");}
            return;
        }while (true);
    }
    @Override
    public String toString() {
        return String.format(
                "Teacher{name='%s', salary=%.2f, department='%s'}",
                name, salary, departament
        );
    }

    public static void showTeacher() {
        if (Employee.teacherArrayList.isEmpty()) {
            System.out.println("No teachers available.");
        } else {
            System.out.println("Teachers List:");
            for (Teacher teacher : Employee.teacherArrayList) {
                System.out.println(teacher);
            }
        }
    }
}

