package com.senai.heritage.order_management_system_ex_03;

import java.util.Scanner;

public class Menu {
    public static void startApp(){
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("""
                    Menu de Pedido:
                    1 - Pedido Online
                    2 - Pedido Presencial
                    3 - Sair
                    Escolha uma opção:
                    """);
            String choice = scanner.nextLine();
            switch (choice){
                case "1": OrderOnline.order(scanner);break;
                case "2": OrderInPerson.order(scanner);break;
                case "3":System.out.println("Saindo...");scanner.close();return;
                default : System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
    }

