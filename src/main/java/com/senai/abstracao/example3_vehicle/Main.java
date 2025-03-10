package com.senai.abstracao.example3_vehicle;

public class Main {
    public static void main(String[] args) {

        ligarVeiculo(new Carro(),10);
        ligarVeiculo(new Moto(),20);
    }
    public static void ligarVeiculo(Veiculo veiculo,int incremento){
        veiculo.ligar();
        veiculo.acelerar(incremento);
    }
}
