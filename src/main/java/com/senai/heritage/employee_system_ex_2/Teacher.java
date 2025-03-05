package com.senai.heritage.employee_system_ex_2;
//e subclasses Professor que possue discplina

import java.util.Scanner;

public class Teacher extends Employee{
    String discipline;
    static String department;
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
                            case "1": discipline = "Levantamento de requisitos";break;
                            case "2": discipline = "Arquitetura de redes com iot";break;
                            case "3": discipline = "Programação back end";break;
                            case "4": discipline = "Programação front end";break;

                            default : System.out.println("wrong choice.");return;
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
                            case "sesi"-> Teacher.teacherArrayListSesi.add(teacher);
                            case "senai"-> Teacher.teacherArrayListSenai.add(teacher);
                            case "senat"-> Teacher.teacherArrayListSenat.add(teacher);
                            case "sebrae"-> Teacher.teacherArrayListSebrae.add(teacher);
                        }
                    } catch (NumberFormatException e) {System.out.println("wrong choice.");Menu.menu();}
                }
            } catch (NumberFormatException e){System.out.println("wrong choice.");Menu.menu();}
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


}

