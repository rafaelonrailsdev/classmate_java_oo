package com.senai.aula01_classe_atributo_metodos.Exercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
Aluno []alunoArray = new Aluno[3];
        ArrayList listaDeAlunos = new ArrayList();
    alunoArray[0] = new Aluno("Rafael",
            17,
            5);
    alunoArray[1] =  new Aluno("Tarek",
            17,
            10);
    alunoArray[2] = new Aluno("Marcos",
            51,
            9);


        for (int i = 0; i < 3; i++) {
            System.out.println(alunoArray[i].exibirInformacoes());
            System.out.println("deseja atualizar a nota do aluno?"+alunoArray[i].nome+" Y- yes N- no");
            String choice = scanner.next();
            switch (choice) {
                case "Y":
                    alunoArray[i].atualizaNota(scanner.nextFloat());
                    break;
                case "N":
                    System.out.println("-----------------------------------------------");
                    break;
            }
            System.out.println(alunoArray[i].exibirInformacoes());

            if (!alunoArray[i].equals()){
                System.out.println("Aluno "+alunoArray[i].nome+" Resultado: reprovado");
            } else {
                System.out.println("Aluno "+alunoArray[i].nome+" Resultado: aprovado");
            }
            System.out.println("-----------------------------------------------");

        }
    }
}
