package com.senai.abstracao.example4_bank_account;

public abstract class ContaBancaria {
    String titular;
    double saldo;

    public ContaBancaria(String titular, double saldo){
        this.saldo = saldo;
    this.titular = titular;
    }
    abstract void aplicarTaxaMensal();
     void consultarSaldo(){
         System.out.println("Titular: "+titular+" Saldo "+ saldo);
     };


}
