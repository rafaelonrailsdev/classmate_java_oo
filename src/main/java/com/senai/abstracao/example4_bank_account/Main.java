package com.senai.abstracao.example4_bank_account;

public class Main {

    public static void main(String[] args) {
    ContaBancaria contaCorrente = new ContaCorrente("Rafael", 1000);
    ContaBancaria contaPoupanca = new ContaPoupanca("Gislene", 10000);

        System.out.println("Teste Conta Corrente");
        infoContas(new ContaCorrente("Rafael", 1000));
        System.out.println();
        System.out.println("Teste Conta Poupança");
        infoContas(new ContaPoupanca("Gislene", 10000));
    }
    public static void infoContas(ContaBancaria contaBancaria){
        System.out.println("antes");
        contaBancaria.consultarSaldo();
        contaBancaria.aplicarTaxaMensal();
        System.out.println("depois");
        contaBancaria.consultarSaldo();
    }
}
