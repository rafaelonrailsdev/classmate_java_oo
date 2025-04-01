package com.senai.polimorfism.exercícios.employee_benefits_system;

public class TransportAssistance extends Benefits{
    public TransportAssistance(double benefitsDiscount, double benefits) {
        super(benefitsDiscount, benefits);
    }

    @Override
    double salaryDeduction() {
        benefits = 200;
        benefitsDiscount = benefits*0.06;

        System.out.printf("Plano auxílio de transporte: "+benefits+"R$ Desconto do seu salário bruto para ter o benefício: "+benefitsDiscount);
        System.out.println("Salário: "+salary);
        return salary;
    }
}
