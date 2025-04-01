package com.senai.polimorfism.exercícios.employee_benefits_system;

public class HealthPlan extends Benefits{
    public HealthPlan(double benefitsDiscount, double benefits, String name, double salary) {
        super(benefitsDiscount, benefits, name, salary);
    }

    @Override
    double salaryDeduction() {
        benefits = 350;
        benefitsDiscount = benefits*0.05;
        salary-=benefitsDiscount;
        System.out.printf("Plano de saúde: "+benefits+"R$ Desconto do seu salário bruto para ter o benefício plano de saúde: "+benefitsDiscount);
        System.out.println("Salário: "+salary);
        return salary;
    }
}
