package com.senai.aula01_classe_atributo_metodos.pessoa;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("rafael",23,new Endereco("MARIESTELA",55,"ELDORADO", "CIDADE ADEMAR",0000010));
        Pessoa[] pessoas = new Pessoa[3];
        pessoas [0]= pessoa1;
        ArrayList pessoasLista = new ArrayList<>();
        pessoasLista.add(pessoa1);
        pessoasLista.add("Teste");
        pessoasLista.add('M');
        pessoasLista.add(111);
        pessoasLista.add(false);
        for (int i = 0; i < 5; i++) {
            System.out.println(pessoasLista.get(i));
        }

    }
}
