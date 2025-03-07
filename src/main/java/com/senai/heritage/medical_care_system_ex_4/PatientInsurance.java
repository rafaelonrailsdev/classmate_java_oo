package com.senai.heritage.medical_care_system_ex_4;

import java.util.Scanner;

public class PatientInsurance extends Patient {
    double consultationDiscount;
    double cost;

    public PatientInsurance(String name, int age, double cost, double consultationDiscount) {
        super(name, age);
        this.cost= cost;
        this.consultationDiscount = consultationDiscount;
    }

    public double getConsultationDiscount() {
        return cost - (cost* consultationDiscount);
    }



    public void setCost(double cost) {
        this.cost = cost;
    }

    public static void registerPatientInsurance(Scanner scanner){
        System.out.print("\nNome do paciente: ");
        String name = scanner.nextLine();

        System.out.print("Idade do paciente: ");
        int age = scanner.nextInt();

        System.out.print("Custo da consulta: ");
        double cost = scanner.nextDouble();

        System.out.println("desconto consulta ex 0,2:");
        double consultationDiscount = scanner.nextDouble();

        patients.add(new PatientInsurance(name, age, cost,consultationDiscount));
        System.out.println("Paciente particular cadastrado com sucesso!");
    }
}
