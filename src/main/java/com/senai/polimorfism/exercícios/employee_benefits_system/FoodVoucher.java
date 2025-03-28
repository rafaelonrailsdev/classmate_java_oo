package com.senai.polimorfism.exercícios.employee_benefits_system;

public class FoodVoucher extends Benefits{

    public FoodVoucher(double benefitsDiscount, double benefits, String name, double salary) {
        super(benefitsDiscount, benefits, name,  salary);
    }

    @Override
    double salaryDeduction() {
        benefits = 500;
        benefitsDiscount = benefits*0.1;
        salary-=benefitsDiscount;
        System.out.printf("Vale de alimentação: "+benefits+"R$ Desconto do seu salário bruto para ter vale alimentação: "+benefitsDiscount);
        System.out.println("Salário: "+salary);
        return salary;
    }
}
