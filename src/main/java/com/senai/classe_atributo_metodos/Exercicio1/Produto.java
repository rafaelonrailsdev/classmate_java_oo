package com.senai.classe_atributo_metodos.Exercicio1;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Produto {
    String nome;
    double preco;
    int quantidade;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Double.compare(preco, produto.preco) == 0 && quantidade == produto.quantidade && Objects.equals(nome, produto.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, preco, quantidade);
    }

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "preco=" + preco +
                ", quantidade=" + quantidade +
                ", nome='" + nome + '\'' +
                '}';
    }
    public void atualizarEstoque(int quantidadeAtualizada){

        System.out.println("quantidade atual: "+quantidade);
        quantidade+= quantidadeAtualizada;
        System.out.println("quantidade do estoque atualizada: "+quantidade);



    }
    public void valorDoEstoque(){
        System.out.println("Valor do estoque: "+preco*quantidade+"R$");
    }
}
