package com.senai.aula02_colecoes.exercicio2;

import java.util.Objects;

public class Estoque {
    String nomeProduto;
    int qtdEstoque;

    public Estoque(String nProduto, int qtdEstoque) {
        this.nomeProduto = nProduto;
        this.qtdEstoque = qtdEstoque;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estoque estoque = (Estoque) o;
        return qtdEstoque == estoque.qtdEstoque && Objects.equals(nomeProduto, estoque.nomeProduto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeProduto, qtdEstoque);
    }

    @Override
    public String toString() {
        return   "Nome: " + nomeProduto + " | " +
                " Quantidade: " + qtdEstoque;
    }
}
