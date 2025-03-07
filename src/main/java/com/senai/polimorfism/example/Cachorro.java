package com.senai.polimorfism.example;

public class Cachorro extends Animal{

    // Construtor
    Cachorro(String nome) {
        super(nome);
    }

    // Implementando o método abstrato fazerSom
    @Override
    void fazerSom() {
        System.out.println(nome + " faz au au");
    }

    // Implementando o método abstrato seMover
    @Override
    void seMover() {
        System.out.println(nome + " está andando alegremente");
    }
}
