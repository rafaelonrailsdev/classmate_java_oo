package com.senai.aula01_classe_atributo_metodos.aula02_colecoes.exercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Tarefa> listaDeTarefas = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int option = 0;
try {
    do {
        System.out.printf("""
                    --- Gerenciador de Tarefas ---
                    1. Adicionar Tarefa
                    2. Listar Tarefas
                    3. Marcar Tarefa como conlcluída 
                    4. Remover Tarefa
                    5. Sair
                    Escolha uma opção: \t
                    """);

        option = scanner.nextInt();
        scanner.nextLine();

        switch (option) {
            case 1:
                todo();
                break;
            case 2:
                listarTarefa();
                break;
            case 3:
                done();
                break;
            case 4:
                listarTarefa();
                deletar();
                break;
            case 5:
                System.out.println("fim do programa.");
                break;
        }
    } while (option != 5);

} catch (Exception e) {
    throw new RuntimeException(e);

}

    }

    static void todo() {
        System.out.println("Digite o nome da tarefa: ");
        String nomeTarefa = scanner.nextLine();

        listaDeTarefas.add(new Tarefa(nomeTarefa, false));
        System.out.println("Tarefa adicionada com sucesso!");

    }

    static void listarTarefa() {
        for (Tarefa tarefa : listaDeTarefas) {
            System.out.print(listaDeTarefas.indexOf(tarefa)+" | "+tarefa+"\n");
        }
    }
    static void done(){

        for (Tarefa tarefa: listaDeTarefas){
            System.out.println((listaDeTarefas.indexOf(tarefa)+1)+" | "+tarefa);

        }
        System.out.println("escolha uma tarefa como concluída: ");
        int idTarefa = scanner.nextInt();
        listaDeTarefas.get(idTarefa-1).statusDeConclusao = true;
        System.out.println("Tarefa "+listaDeTarefas.get(idTarefa-1).nomeDaTarefa+" concluída com sucesso");
    }
    static void deletar(){
        System.out.println("Escolha o id da tarefa para excluí-la:");
        listaDeTarefas.remove(scanner.nextInt()-1);
        scanner.nextLine();

    }
}
