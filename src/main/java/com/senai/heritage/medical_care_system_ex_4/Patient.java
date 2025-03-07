package com.senai.heritage.medical_care_system_ex_4;

import java.util.ArrayList;
import java.util.List;

public class Patient {
    public static List<Patient> patients = new ArrayList<>();

    String name;
    int age;

    // Construtor
    public Patient(String nome, int idade) {
        this.name = nome;
        this.age = idade;
    }

    // Métodos
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    protected static void listPatient() {
        if (patients.isEmpty()) {
            System.out.println("\nNenhum paciente cadastrado.");
            return;
        }

        System.out.println("\n=== Lista de Pacientes ===");
        for (Patient patient : patients) {
            System.out.println("Nome: " + patient.getName() + ", Idade: " + patient.getAge());
            if (patient instanceof PrivatePatient) {
                System.out.println("Tipo: Particular, Custo: " + ((PrivatePatient) patient).getCosultationCost());
            } else if (patient instanceof PatientInsurance) {

                System.out.println("Tipo: Convênio, Custo: " + ((PatientInsurance) patient).getConsultationDiscount());
            }
            System.out.println("----------------------");
        }
    }
}
