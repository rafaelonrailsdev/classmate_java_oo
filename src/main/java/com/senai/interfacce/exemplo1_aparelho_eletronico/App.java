package com.senai.interfacce.exemplo1_aparelho_eletronico;

public class App {
    public static void main(String[] args) {

        ligarAparelho(new Computador());
        ligarAparelho(new Televisao());
    }
    public static void ligarAparelho(AparelhoEletronico aparelhoEletronico){
        aparelhoEletronico.ligar();
        aparelhoEletronico.desligar();
    }
}
