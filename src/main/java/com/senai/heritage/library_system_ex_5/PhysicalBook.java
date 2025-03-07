package com.senai.heritage.library_system_ex_5;

class PhysicalBook extends Book {
    int numberOfPages;

    // Construtor para inicializar título, autor e número de páginas
    public PhysicalBook(String title, String author, int numberOfPages) {
        super(title, author);
        this.numberOfPages = numberOfPages;
    }

    // Método para exibir informações específicas do LivroFisico
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Pages: " + numberOfPages);
    }
}