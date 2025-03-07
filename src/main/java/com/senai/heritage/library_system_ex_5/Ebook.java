package com.senai.heritage.library_system_ex_5;

class Ebook extends Book {
    double fileSizeInMb;

    // Construtor para inicializar título, autor e tamanho do arquivo
    public Ebook(String title, String author, double fileSizeInMb) {
        super(title, author);
        this.fileSizeInMb = fileSizeInMb;
    }

    // Método para exibir informações específicas do Ebook
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("File Size: " + fileSizeInMb + " MB");
    }
}