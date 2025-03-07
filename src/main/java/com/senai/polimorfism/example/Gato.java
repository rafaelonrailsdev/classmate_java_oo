package com.senai.polimorfism.example;

public class Gato extends Animal {
    // Construtor
    Gato(String nome) {
        super(nome);
    }

    // Implementando o método abstrato fazerSom
    @Override
    void fazerSom() {
        System.out.println(nome + " faz miau");
    }

    // Implementando o método abstrato seMover
    @Override
    void seMover() {
        System.out.println(nome + " está se movendo silenciosamente");
    }
}
