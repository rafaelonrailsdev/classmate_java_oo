package com.senai.polimorfism.example2;

public abstract class Pagamentos {
    private String nome;
    public Pagamentos(String nome){
        this.nome = nome;
    }
    abstract double calcularPagamento();
    public String getNome(){
        return nome;
    }

}
