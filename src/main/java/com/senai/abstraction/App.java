package com.senai.abstraction;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Animal dog = new Cachorro("Vampeta");

        Animal cat = new Gato("Bolsonaro");

        List<Animal> animalList = new ArrayList<>();

        animalList.add(cat);
        animalList.add(dog);

        animalList.forEach(Animal::dormir);
        animalList.forEach(System.out::println);
    }
}
