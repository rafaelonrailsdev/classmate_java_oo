package com.senai.abstracao.example1_animal;
//06/03/2025
public abstract class Animal {
    String nome;

    // Construtor
    Animal(String nome) {
        this.nome = nome;
    }

    // Método concreto implementando
    void dormir() {
        System.out.println(nome + " está dormindo");
    }

    // Método concreto implementando
    void comer() {
        System.out.println(nome + " está comendo");
    }

    // Método concreto implementando
    void beber() {
        System.out.println(nome + " está bebendo água");
    }

    // Método concreto implementando
    void correr() {
        System.out.println(nome + " está correndo");
    }

    // Método abstrato que deve ser implementado nas subclasses
    abstract void fazerSom();

    // Método abstrato para ação de se mover
    abstract void seMover();
}
