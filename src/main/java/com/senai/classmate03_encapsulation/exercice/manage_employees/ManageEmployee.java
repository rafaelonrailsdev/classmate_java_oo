package com.senai.classmate03_encapsulation.exercice.manage_employees;

import java.util.Scanner;


public class ManageEmployee {
    public static void addEmployee(){
try {
    employee();
}catch (NumberFormatException e){
    System.out.println("field filled in incorrectly. try again.");
    employee();
}
    }
    public static void invalidNumber(){

    }

    public static void employee(){
        Scanner scan = new Scanner(System.in);

        try{
                System.out.printf("loading");

                for (int j = 0; j < 3; j++) {
                    Thread.sleep(300);
                    System.out.printf(".");

                }


            } catch (Exception e) {
                e.printStackTrace();
            }

            do {
                String name;
                System.out.println("\nName: ");
                name = scan.nextLine();

                if (name.isBlank()||name.isEmpty()||name.equals(null)){
                    while (name.isBlank()||name.isEmpty()||name.equals(null)){
                    System.out.println("error. please fill in your name correctly");
                        System.out.println("name");
                        name = scan.nextLine();
                    }
                }else {
                     try{
                        System.out.printf("saving");

                        for (int j = 0; j < 3; j++) {
                            Thread.sleep(300);
                            System.out.printf(".");

                        }
                         System.out.println("\nenter the employee's salary");
                         String salary = scan.nextLine();
                         if (salary.isBlank()||salary.equals("")||salary.isEmpty()) {
                             while (salary.isBlank()||salary.equals("")||salary.isEmpty()){
                                 System.out.println("error. please fill correctly:");
                                 System.out.println("enter the employee's salary");
                                 salary = scan.nextLine();
                             }
                         }
                          else{
                             String position;
                             String message = String.format("choose which position the employee will perform in the company: \n " +
                                     "1 - Manager \t"+
                                     "2 - Analyst \t"+
                                     "3 - Developer");

                             System.out.println(message);
                             position = scan.nextLine();

                             if (position.isBlank()||position.equals("")||position.isEmpty()) {
                                 while (position.isBlank()||position.equals("")||position.isEmpty()){
                                     System.out.println("error. please fill correctly:");
                                     System.out.println(message);
                                     position = scan.nextLine();
                                 }
                             }else{

                                 Employee.employeerList.add(new Employee(name,Double.parseDouble(salary),Integer.parseInt(position)));
                                 System.out.println("saved...");
                             }
                         }

                    } catch (Exception e) {
                        e.printStackTrace();
                    } return;
                }
            }while (true);



    }
    public static void showEmployees(){
        for (Employee employee: Employee.employeerList){
            System.out.println(employee);
        }
    }
    }

