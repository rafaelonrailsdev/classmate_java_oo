package com.senai.aula01_classe_atributo_metodos.Exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
Produto produto = new Produto("Ovo",0.50,30);
Produto produto1 = new Produto("Paçoca",2.50,10);

        System.out.println(produto);
        System.out.println(produto1);
        System.out.println("atualize o estoque de: "+ produto.nome);
produto.atualizarEstoque(scanner.nextInt());
produto.valorDoEstoque();
    }
}
