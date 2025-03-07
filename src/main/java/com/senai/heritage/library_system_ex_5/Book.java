package com.senai.heritage.library_system_ex_5;

import java.util.ArrayList;
import java.util.Scanner;

public class Book {
    protected String title;
    String author;
   protected static ArrayList<Book> bookArrayList = new ArrayList<>();

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }


    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    public static void newBook(Scanner scanner) {
        boolean validInput = false;
        int amountBooks= 0;
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
            System.out.println("Tittle:");
            String tittle = scanner.nextLine();
            System.out.println("Author: ");
            String author = scanner.nextLine();
            Book book  = new Book(tittle,author);
            bookArrayList.add(book);
            }
    }
}
