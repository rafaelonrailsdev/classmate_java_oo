package com.senai.aula01_classe_atributo_metodos.objetos.pessoa;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("rafael",
                23,
                new Endereco("MARIESTELA",
                        55,
                        "ELDORADO",
                        "CIDADE ADEMAR",
                        0000010));
        Person[] people = new Person[1];
        ArrayList pessoasLista = new ArrayList<>();

        pessoasLista.add(person1);
        Person person2 = new Person("Maria",
                73,
                new Endereco("Porto velho",
                        71,
                        "Três corações",
                        "Grájau",
                        773388));
        pessoasLista.add(person2);
        System.out.println(person2);
        System.out.println(pessoasLista.get(0));

    }
}
