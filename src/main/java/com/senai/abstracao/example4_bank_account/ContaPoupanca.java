package com.senai.abstracao.example4_bank_account;

public class ContaPoupanca extends ContaBancaria{
    public ContaPoupanca(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    void aplicarTaxaMensal() {
        System.out.println("+1%");
    }
}
