package com.senai.aula01_classe_atributo_metodos.Exercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Aluno aluno = new Aluno("Rafael",17,5);
        System.out.println(aluno);
        aluno.atualizaNota(scanner.nextFloat());

    }
}
