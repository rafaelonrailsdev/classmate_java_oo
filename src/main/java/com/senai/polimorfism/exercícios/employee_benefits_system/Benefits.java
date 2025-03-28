package com.senai.polimorfism.exercícios.employee_benefits_system;

public abstract class Benefits{
    double benefitsDiscount;
    double benefits;

    public Benefits(double benefitsDiscount, final double benefits, String name,double salary){

        this.benefits = benefits;
        this.benefitsDiscount = benefitsDiscount;
    }
    abstract double salaryDeduction();
}
