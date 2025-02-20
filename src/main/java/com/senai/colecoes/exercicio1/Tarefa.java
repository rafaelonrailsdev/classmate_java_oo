package com.senai.colecoes.exercicio1;

public class Tarefa {
 String nomeDaTarefa;
 boolean statusDeConclusao;

    public Tarefa(String nomeDaTarefa, boolean statusDeConclusao) {
        this.nomeDaTarefa = nomeDaTarefa;
        this.statusDeConclusao = statusDeConclusao;
    }

    @Override
    public String toString() {
        return String.format("%s - [%s]", nomeDaTarefa,statusDeConclusao?"concluida":"pendente");
    }
}
