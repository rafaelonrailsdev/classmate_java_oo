package com.senai.heritage.medical_care_system_ex_4;

import java.util.Scanner;
public class PrivatePatient extends Patient {
    double cosultationCost;
    public PrivatePatient(String name, int age, double cosultationCost){
        super(name, age);
        this.cosultationCost = cosultationCost;
    }
    protected static void registerPrivatePatient(Scanner scanner) {
        System.out.print("\nNome do paciente: ");
        String name = scanner.nextLine();

        System.out.print("Idade do paciente: ");
        int age = scanner.nextInt();

        System.out.print("Custo da consulta: ");
        double cost = scanner.nextDouble();

        Patient.patients.add(new PrivatePatient(name, age, cost));
        System.out.println("Paciente particular cadastrado com sucesso!");
    }

    public double getCosultationCost() {
        return cosultationCost;
    }
}
