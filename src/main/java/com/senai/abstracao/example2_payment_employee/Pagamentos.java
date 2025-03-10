package com.senai.abstracao.example2_payment_employee;

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
