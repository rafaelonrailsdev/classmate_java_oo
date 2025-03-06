package com.senai.abstraction;

public class Gato extends Animal {
    public Gato(String nome) {
        super(nome);
    }

    @Override
    void dormir() {
        super.dormir();
    }

    @Override
    void fazerSom() {
        System.out.println("miau miau");
    }
}
