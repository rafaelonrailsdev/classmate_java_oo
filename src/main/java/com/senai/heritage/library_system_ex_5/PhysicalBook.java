package com.senai.heritage.library_system_ex_5;

import java.util.ArrayList;
import java.util.Scanner;

class PhysicalBook extends Book {
    int numberOfPages;

    protected  static ArrayList<PhysicalBook> physicalBookArrayList  = new ArrayList<>();
    public PhysicalBook(String title, String author, int numberOfPages) {
        super(title, author);
        this.numberOfPages = numberOfPages;
    }


    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Pages: " + numberOfPages);
    }
    public static void newPhysical(Scanner scanner) {
        boolean validInput = false;
        int amountBooks= 0;
        int lenghtPagesInterger = 0;

        boolean validPhysicalBook = false;
        do {
            System.out.println("quantidades de livros que vão ser cadastrados:");
            String amount = scanner.nextLine();
            try {
                amountBooks = Integer.parseInt(amount);
                validInput = true;
            } catch (NumberFormatException e){
                System.out.println("erro: por favor insira o número valido ");
            }
        }while (!validInput);
        for (int i = 0; i<amountBooks; i++){
            System.out.println("Title:");
            String title = scanner.nextLine();
            System.out.println("Author: ");
            String author = scanner.nextLine();
            do {
                System.out.println("quantidade de páginas");
                String lenghtPages = scanner.nextLine();
                try{ lenghtPagesInterger = Integer.parseInt(lenghtPages); validPhysicalBook = true;}catch (NumberFormatException e){
                    System.out.println("erro: por favor insira apenas números naturais.");
                }
            }while (!validPhysicalBook);
            PhysicalBook physicalBook = new PhysicalBook(title,author,lenghtPagesInterger);
            physicalBookArrayList.add(physicalBook);
        }
    }
}