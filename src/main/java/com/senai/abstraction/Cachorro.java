package com.senai.abstraction;

public class Cachorro extends Animal{

    public Cachorro(String nome){
        super(nome);

    }

    @Override
    void fazerSom() {
        System.out.println("latida de cachorro.");
    }

    @Override
    void dormir() {
        super.dormir();
    }
}
