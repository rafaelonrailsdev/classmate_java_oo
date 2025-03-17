package com.senai.interfacce.exemplo1_aparelho_eletronico;

public class Televisao implements AparelhoEletronico {
    @Override
    public void ligar() {
        System.out.println("tv ligada");
    }

    @Override
    public void desligar() {
        System.out.println("tv desligada");
    }
}
