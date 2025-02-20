package com.senai.objetos.aluno_academia_bjj;

import java.util.Scanner;

/**
 * @Autor Rafael Moreira Lopes
 * Data: 24/11/24
 * Explorando a programação orientada a objeto
 */
public class Aluno {
    String nome; ;
    int idade;
    double peso;
    double altura;
    String graduacaoJiuJitsu;
    public static void main(String[] args) {
        Aluno dados = new Aluno();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nome: ");
        dados.nome = scanner.nextLine();
        System.out.println("Idade: ");
        dados.idade = scanner.nextByte();
        System.out.println("Peso: ");
        dados.peso = scanner.nextDouble();
        System.out.println("altura: ");
        dados.altura = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Faixa: ");
        dados.graduacaoJiuJitsu = scanner.nextLine();

        dados.exibicao();
        dados.IMC();
    }
    void exibicao(){



        System.out.println("nome "+nome);
        System.out.println("idade "+idade);
        System.out.println("peso "+peso+"Kg");
        System.out.println("altura "+altura+"M");
        System.out.println("Faixa "+graduacaoJiuJitsu);
    }

    void IMC(){
        double imc = peso/(altura*altura);
        if (imc<=18.5){
            System.out.println("abaixo do peso "+ imc);
        } else if (imc>18.5&&imc<24.9) {
            System.out.println("Peso Normal "+imc);
        } else if (imc>25&&imc<=29.9) {
            System.out.println("Sobrepeso "+ imc);
        } else if (imc>30) {
            System.out.println("Obesidade "+ imc);
        }
    }
}
