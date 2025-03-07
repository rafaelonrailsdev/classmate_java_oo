package com.senai.heritage.library_system_ex_5;

public class Book {
    String title;
    String author;

    // Construtor para inicializar título e autor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Método para exibir informações básicas do livro
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}
