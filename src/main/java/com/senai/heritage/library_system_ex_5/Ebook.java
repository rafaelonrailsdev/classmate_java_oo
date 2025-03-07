package com.senai.heritage.library_system_ex_5;

import java.util.ArrayList;
import java.util.Scanner;

class Ebook extends Book {
    double fileSizeInMb;
    protected static ArrayList<Ebook> ebookArrayList = new ArrayList<>();

    public Ebook(String title, String author, double fileSizeInMb) {
        super(title, author);
        this.fileSizeInMb = fileSizeInMb;
    }


    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("File Size: " + fileSizeInMb + " MB");
    }
    public static  void newEbook(Scanner scanner) {
        boolean validInput = false;
        int amountBooks= 0;
        int fileSizeInMbInterger = 0;

        boolean validFileSizeInMb = false;
        do {
            System.out.println("quantidades de ebooks que vão ser cadastrados:");
            String amount = scanner.nextLine();
            try {
                amountBooks = Integer.parseInt(amount);
                validInput = true;
            } catch (NumberFormatException e){
                System.out.println("erro: por favor insira o número valido ");
            }
        }while (!validInput);


        for (int i = 0; i<amountBooks; i++){
            System.out.println("Tittle:");
            String title = scanner.nextLine();
            System.out.println("Author: ");
            String author = scanner.nextLine();
            do {
                System.out.println("tamanho do ebook em mb");
                String fileSizeInMb = scanner.nextLine();
                try{ fileSizeInMbInterger = Integer.parseInt(fileSizeInMb); validFileSizeInMb = true;}catch (NumberFormatException e){
                    System.out.println("erro: por favor insira apenas números naturais.");
                }
            }while (!validFileSizeInMb);
            Ebook ebook = new Ebook(title,author,fileSizeInMbInterger);
            ebookArrayList.add(ebook);
        }
    }
}