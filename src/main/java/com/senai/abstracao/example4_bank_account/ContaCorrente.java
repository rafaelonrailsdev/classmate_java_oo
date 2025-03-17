package com.senai.abstracao.example4_bank_account;

public class ContaCorrente extends  ContaBancaria {

    public ContaCorrente(String titular, double saldo){
        super(titular,saldo);

    }

    @Override
    void aplicarTaxaMensal() {
        System.out.println("taxa 5%");
    }

}
