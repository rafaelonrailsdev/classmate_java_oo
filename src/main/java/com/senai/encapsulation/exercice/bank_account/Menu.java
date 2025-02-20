package com.senai.encapsulation.exercice.bank_account;


import java.util.Scanner;

public class Menu {

    public static void toMenu(){
        Scanner scan = new Scanner(System.in);
        int option;
        String message = """
                --- Bank System ---
                1 - deposit
                2 - withdraw
                3 - exit
                """;

        do {
            System.out.println(message);
            option = scan.nextInt();
            switch (option){
//                case 1 -> ;
//                case 2 -> ;
                case 3 -> System.out.println("end");
                default -> System.out.println("set a valid number");

            }
        }while (option!=3);
    }
}
