package com.senai.classmate03_encapsulation.exercice.manage_employees;

import java.util.ArrayList;

public class Employee {
    private String name = null;
    private double salary = 1320.00;
    private  String position;
    static ArrayList<Employee> employeerList = new ArrayList<>();
    public Employee(String name, double salary, int position) {
        setName(name);
        setSalary(salary);
        switch (position){
            case 1-> this.position = "Manager";
            case 2-> this.position = "Analystic";
            case 3-> this.position = "Developer";

        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public double setSalary(double salary) {
        this.salary = salary;

        if (salary<this.salary){
            System.out.println("min salary is 1.320,00. the employee salary is 1.320,00 now.");
            salary = this.salary;
            return  salary;
        }
        return salary;
    }

    @Override
    public String toString() {
        return String.format(
                "----------------------------\n" +
                        " Employer Name : %s\n" +
                        " Salary        : %.2f U$\n" +
                        " Position      : %s\n",
                name, salary, position
        );
    }

}
