package com.senai.aula01_classe_atributo_metodos.Exercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Aluno aluno = new Aluno("Rafael",17,5);
        Aluno aluno1 = new Aluno("Tarek",17,10);
        Aluno aluno2 = new Aluno("Marcos", 51,9);
        
        System.out.println(aluno.exibirInformacoes());

        System.out.println("deseja atualizar a nota do aluno?"+aluno+" Y- yes N- no");
        String choice = scanner.next();
        for (int i = 0; i < 3; i++) {
//            preciso mostrar cada objeto aluno
        }
        switch (choice) {
            case "Y":
                aluno.atualizaNota(scanner.nextFloat());
                break;
        }
        if (aluno.nota<6){
            System.out.println("reprovado");
        }else{
            System.out.println("aprovado");
        }
    }
}
