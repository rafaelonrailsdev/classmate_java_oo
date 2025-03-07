package com.senai.polimorfism.example2;

public class Freelancer extends Pagamentos{
    private double valueProject;
    public Freelancer(String nome, double valorProjeto){
        super(nome);
        this.valueProject = valorProjeto;
    }

    @Override
    double calcularPagamento() {
        return valueProject;
    }
}
