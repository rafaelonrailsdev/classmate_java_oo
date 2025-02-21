package com.senai.heritage.inventory_control_ex_1;

import java.util.Scanner;

public class Eletronic extends  Product{
    static Scanner scan = new Scanner(System.in);
    private String voltage;
    public Eletronic(String name, Double price, int amount, String voltage){

        super(name,price,amount);
        this.voltage = voltage;
    }

    public static void newEletronicInventory(){
        System.out.println("quantity of products to be added to stock");
        //transforme em string e faça um teste para ver se o usuário realmente digitou um número
        int amountProducts = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < amountProducts; i++) {
            String voltage;
            System.out.println("Name: ");
            String name = scan.nextLine();

            System.out.println("Price: ");
            double price = scan.nextDouble();
            scan.nextLine();
            System.out.println("Amount: ");
            int amount = scan.nextInt();
            scan.nextLine();
            System.out.println("""
                    voltage: 
                    1- 115 volts | 2- 127 volts | 3- 220 volts | 4- 230 volts 
                    5- 240 volts | 6- 254 volts | 7- 380 volts | 8- 440 volts
                    """);
            voltage = scan.nextLine();

                switch (voltage){
                    case "1"-> voltage = "115 volts";
                    case "2"-> voltage = "127 volts";
                    case "3"-> voltage = "220 volts";
                    case "4"-> voltage = "230 volts";
                    case "5"-> voltage = "240 volts";
                    case "6"-> voltage = "254 volts";
                    case "7"-> voltage = "380 volts";
                    case "8"-> voltage = "440 volts";
                    default -> System.out.println("wrong choice.");
                }
                Eletronic eletronic = new Eletronic(name,price,amount,voltage);
                listEletronic.add(eletronic);
                listProduct.add(eletronic);
        }
    }
    @Override
    public String toString() {

        return
                "\n name= " + getName()+ "| price=" +"$"+ getPrice() + "| amount=" + getAmount() + "| voltage=" + voltage+"\n";
    }
    public static void showStock(){
        System.out.println("Eletronic Stock:");
        System.out.println(listEletronic.toString().replaceAll(",",""));
    }
}
