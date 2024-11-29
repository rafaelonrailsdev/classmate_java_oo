package com.senai.aula01_classe_atributo_metodos.pessoa;

import java.util.Objects;

public class Pessoa {
    String nome;
    int idade;
    Endereco endereco;
    public Pessoa(String nome, int idade, Endereco endereco) {
        this.nome = nome;
        this.endereco= endereco;
        this.idade = idade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return idade == pessoa.idade && Objects.equals(nome, pessoa.nome) && Objects.equals(endereco, pessoa.endereco);
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
