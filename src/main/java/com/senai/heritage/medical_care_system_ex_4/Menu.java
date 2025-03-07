package com.senai.heritage.medical_care_system_ex_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private static Scanner scanner = new Scanner(System.in);

    public static void startApp() {
        int option;
        do {
            System.out.println("""
                    Sistema de Pacientes
                    1. Cadastrar Paciente Particular
                    2. Cadastrar Paciente Convênio
                    3. Listar Pacientes
                    4. Sair
                    Escolha uma opção:
                    """);
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                   PrivatePatient.registerPrivatePatient(scanner); break;
                case 2:
                    PatientInsurance.registerPatientInsurance(scanner);
                    break;
                case 3:
                    Patient.listPatient();
                    break;
                case 4:
                    try{
                    System.out.printf("Saindo do sistema");
                    for (int i =0; i<3; i++){
                        System.out.printf(".");
                        Thread.sleep(300);
                    }} catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (option != 4);
    }
}