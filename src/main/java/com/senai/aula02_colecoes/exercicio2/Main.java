package com.senai.aula02_colecoes.exercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Estoque> estoque = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    static int option = 0;
    public static void main(String[] args) {
        do {
            System.out.printf("""
                    --- Controle de Estoque ---
                    1. Cadastrar Produto
                    2. Listar Produtos
                    3. Atualizar Quantidade
                    4. Remover Produto
                    5. Buscar Produto
                    6. Sair
                    Escolha uma opção: 
                    """);

            option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1:
                    System.out.println("Digite o nome do produto: ");
                    String produto = scanner.nextLine();

                    System.out.println("Digite a quantidade: ");
                    int quantidade = scanner.nextInt();
                    estoque.add(new Estoque(produto,quantidade));
                    System.out.println("Produto cadastrado com sucesso!");

                    break;
                case 2:
                    System.out.println("Lista de Produtos: ");
                    for (Estoque estoque1 : estoque) {

                        System.out.println(estoque1);
                    }

                    break;
                case 3:
                    for (Estoque estoque1: estoque){
                        System.out.println((estoque.indexOf(estoque1)+1)+" - "+estoque1);

                    }
                    System.out.println("Digite o nome do produto para atualizar: ");
                    String pAtt = scanner.nextLine();
                    for (int i = 0; i < estoque.size(); i++) {
                        if (estoque.get(i).nomeProduto.equals(pAtt)){
                            System.out.println("Digite a nova quantidade: ");
                            int nQtdAtt = scanner.nextInt();
                            estoque.get(i).qtdEstoque = nQtdAtt;
                            System.out.println("quantidade atualizada com sucesso!");
                            break;
                        }else System.out.println("produto não encontrado.");
                    }

                    break;
                case 4:
                {
                    System.out.println("Escolha o  nome do produto para remover:");
                    System.out.println(estoque.toString());
                    String nProduto =scanner.nextLine();
                    for (int i = 0; i < estoque.size(); i++) {
                        if (estoque.get(i).nomeProduto.equals(nProduto)){
                            System.out.println("produto "+estoque.get(i).nomeProduto+" removido com sucesso");
                            estoque.remove(i);
                            System.out.println(estoque.getLast());
                            break;
                        }

                    }




                }
                    break;
                case 5:
                    System.out.println("Digite o nome do produto para buscar:");
                    String buscaProduto = scanner.nextLine();
                    for (int i =0; i< estoque.size();i++){
                        if (buscaProduto.equals(estoque.get(i).nomeProduto)){
                            System.out.println("Produto encontrado:");
                            System.out.println(estoque.get(i).toString());
                        }
                    }
                    break;
                case 6:
                    break;
            }

        } while (option != 6);

    }
}
