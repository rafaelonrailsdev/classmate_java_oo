package com.senai.heritage.employee_system_ex_2;

import java.util.ArrayList;
import java.util.Scanner;

//sub classe  coordenador possue uma equipe de professores
public class Director extends Employee{

    //1- sesi | 2- senai | 3- senat | 4- sebrae
static ArrayList<Teacher> departamentSesi = new ArrayList<>();
static ArrayList<Teacher> departamentSenai = new ArrayList<>();
static ArrayList<Teacher> departamentSenat = new ArrayList<>();
static ArrayList<Teacher> departamentSebrae = new ArrayList<>();

    public Director(String name, double salary,String departament){
        super(name,salary,departament);

    }
    public static void newDirector(Scanner scan){

        String name = null;
        String salary;
        double salaryFinal = 0;
        String departament;
        String lengthDirector;
        int length;
        do {
            System.out.println("quantity of new director: ");
            lengthDirector = scan.nextLine();
            try{
                length = Integer.parseInt(lengthDirector);
                for (int i = 0; i < length; i++) {
                    System.out.println("Name: ");
                    name = scan.nextLine();
                    System.out.println("salary: ");
                    salary = scan.nextLine();
                    try{
                        salaryFinal = Double.parseDouble(salary);
                        System.out.println("""
                    Department:
                    1- sesi | 2- senai | 3- senat | 4- sebrae
                    """);
                        departament = scan.nextLine();
                        switch (departament){
                            case "1": departament = "sesi";break;
                            case "2": departament = "senai";break;
                            case "3": departament = "senat";break;
                            case "4": departament = "sebrae";break;
                            default : System.out.println("wrong choice.");return;
                        }
                        try {
                            System.out.printf("loading");
                            for (int j =0; j<3; j++){
                                System.out.printf(".");
                                Thread.sleep(300);
                            }
                            System.out.println("\nSaved\n");
                        }catch (InterruptedException e) {e.printStackTrace();Menu.menu();}
                        Director director = new Director(name,salaryFinal,departament);
                        Employee.employeeArrayList.add(director);
                        Employee.directorArrayList.add(director);
                        if (departament.equals("sesi")){Employee.directorArrayListSesi.add(director);} else if (departament.equals("senai")) {Employee.directorArrayListSenai.add(director);}else if (departament.equals("senat")) {Employee.directorArrayListSenat.add(director);}else if (departament.equals("sebrae")) {Employee.directorArrayListSebrae.add(director);}
                    } catch (NumberFormatException e) {System.out.println("wrong choice.");Menu.menu();}
                }
            } catch (NumberFormatException e){System.out.println("wrong choice.");Menu.menu();}
            return;
        }while (true);
    }

    @Override
    public String toString() {
        return String.format(
                "Director{name='%s', salary=%.2f, department='%s'}",
                name, salary, departament
        );
    }



}
