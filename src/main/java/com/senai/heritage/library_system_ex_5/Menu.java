package com.senai.heritage.library_system_ex_5;

import java.util.Scanner;

public class Menu {
    public static void displayMenu(){
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("""
                    1 - Book
                    2 - Ebook 
                    3 - Physical Book
                    4 - display books
                    4 - Exit
                    """);
            String option = scan.nextLine();

            switch (option){
                case "1": Book.newBook(scan);break;
                case "2":  ;break;
                case "3": PhysicalBook.newPhysical(scan);break;
                case "5":  try {
                    System.out.printf("exit");
                    for (int i = 0; i < 3; i++) {
                        System.out.printf(".");
                        Thread.sleep(300);
                    }return;
                }catch (InterruptedException e) {e.printStackTrace();}break;
                default:
                    System.out.println("tente novamente.");
            }
            scan.close();
        }while (true);

    }
}
