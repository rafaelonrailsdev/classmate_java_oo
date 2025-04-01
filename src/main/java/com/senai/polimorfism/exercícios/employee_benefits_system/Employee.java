package com.senai.polimorfism.exercícios.employee_benefits_system;

public abstract class Employee  {
    String name;
    double salary;
    public Employee(String name, double salary){this.name = name; this.salary = salary;}
    public double getSalary() {return salary;}
    public String getName() {return name;}

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
