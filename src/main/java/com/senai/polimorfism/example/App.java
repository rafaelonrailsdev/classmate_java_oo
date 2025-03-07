package com.senai.polimorfism.example;

import java.util.ArrayList;
import java.util.List;

public class App {

        public static void main(String[] args) {
            Animal cachorro = new Cachorro("vampeta");
            cachorro.dormir();
            cachorro.comer();
            cachorro.beber();
            cachorro.correr();
            cachorro.fazerSom();
            cachorro.seMover();

            System.out.println();

            Animal gato = new Gato("gabiru");
            gato.dormir();
            gato.comer();
            gato.beber();
            gato.correr();
            gato.fazerSom();
            gato.seMover();

            System.out.println();

            Animal elefante = new Elefante("chiquinho");
            elefante.dormir();
            elefante.comer();
            elefante.beber();
            elefante.correr();
            elefante.fazerSom();
            elefante.seMover();

            List<Animal> animalList = new ArrayList<>();

            animalList.add(gato);
            animalList.add(cachorro);

            animalList.forEach(Animal::dormir);
            animalList.forEach(System.out::println);
        }
    }

