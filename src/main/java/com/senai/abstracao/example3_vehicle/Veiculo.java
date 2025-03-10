package com.senai.abstracao.example3_vehicle;

abstract class Veiculo {
    int velocidade;

    Veiculo(){
        this.velocidade = 0;
    }

    abstract void ligar();

    void acelerar(int incremento){
        velocidade += incremento;
        System.out.println("Acelerando para a velocidade "+ velocidade+"Km/h");
    }
}
