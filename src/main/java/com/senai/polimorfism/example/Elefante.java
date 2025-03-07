package com.senai.polimorfism.example;

public class Elefante extends Animal{
    // Construtor
    Elefante(String nome) {
        super(nome);
    }

    // Implementando o método abstrato fazerSom
    @Override
    void fazerSom() {
        System.out.println(nome + " faz um trompete");
    }

    // Implementando o método abstrato seMover
    @Override
    void seMover() {
        System.out.println(nome + " está andando lentamente");
    }
}
