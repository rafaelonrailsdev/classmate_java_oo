package com.senai.interfacce.exemplo1_aparelho_eletronico;

public class Computador implements AparelhoEletronico{
    @Override
    public void ligar() {
        System.out.println("computador ligado");
    }

    @Override
    public void desligar() {
        System.out.println("computador desligado");
    }
}
