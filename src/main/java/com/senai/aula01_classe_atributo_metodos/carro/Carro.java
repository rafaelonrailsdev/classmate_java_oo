package com.senai.aula01_classe_atributo_metodos.carro;

import java.util.Objects;

public class Carro {
    int anoFabricacao;
    String marca;
    String modelo;
    String placa;
    String motor;
    String cor;
    double precoBase;

    public Carro(int anoFabricacao, String marca, String modelo, String placa, String motor, String cor, double precoBase) {
        this.anoFabricacao = anoFabricacao;
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.motor = motor;
        this.cor = cor;
        this.precoBase = precoBase;
    }

    void verificarInformacoes(){
        System.out.println("\nmarca "+marca+"\n"+
                "modelo "+modelo+"\n"+
                        "marca "+marca+"\n"+
                        "placa "+placa+"\n"+
                        "motor "+motor+"\n"+
                        "cor "+cor+"\n"+
                        "preço "+precoBase+"\n"
                );
    }
    void ligarCarro(){
        System.out.println("carro ligado");
    }
    void testarSom(){
        System.out.println("som ligado");
    }
    void consultarPlaca(){
        System.out.println("A placa "+placa+" está sem restrições");
    }
    void consultarPreco(int anoAtual){
        int idadeDoCarro = anoAtual-anoFabricacao;
        double precoAtual = precoBase;
        if (idadeDoCarro>0){
            for (int i = 0; i < idadeDoCarro; i++) {
                precoAtual-=precoAtual*0.05;
            }
        }
        System.out.printf("O valor atual do carro %s %s é: %.2f \n",modelo, marca,precoAtual);
    }

    @Override
    public String toString() {
        return "Carro{" +
                "anoFabricacao=" + anoFabricacao +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", placa='" + placa + '\'' +
                ", motor='" + motor + '\'' +
                ", cor='" + cor + '\'' +
                ", precoBase=" + precoBase +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carro carro = (Carro) o;
        return anoFabricacao == carro.anoFabricacao && Double.compare(precoBase, carro.precoBase) == 0 && Objects.equals(marca, carro.marca) && Objects.equals(modelo, carro.modelo) && Objects.equals(placa, carro.placa) && Objects.equals(motor, carro.motor) && Objects.equals(cor, carro.cor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(anoFabricacao, marca, modelo, placa, motor, cor, precoBase);
    }
}
