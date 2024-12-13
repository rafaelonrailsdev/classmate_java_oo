package com.senai.aula01_classe_atributo_metodos.objetos.pessoa;

import java.util.Objects;

public class Person {
    String nome;
    int idade;
    Endereco endereco;
    public Person(String nome, int idade, Endereco endereco) {
        this.nome = nome;
        this.endereco= endereco;
        this.idade = idade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return idade == person.idade && Objects.equals(nome, person.nome) && Objects.equals(endereco, person.endereco);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, idade, endereco);
    }

    @Override
    public String toString(){
        return "O nome da pessoa é: "+nome+", ela tem "+idade+" anos e mora no endereço "+endereco;
    }

}
