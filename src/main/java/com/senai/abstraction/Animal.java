package com.senai.abstraction;
//06/03/2025
public abstract class Animal {
        String nome;
        //constructor
    Animal(String nome){
        this.nome = nome;
    }
    //método concreto implementando
    void dormir(){
        System.out.println(nome+" está dormindo");
    }
    //método abstrato deve ser implenentado nas subclasses
    abstract void fazerSom();
}
