package com.senai.objetos.carro;

public class Concessionaria {
    public static void main(String[] args) {
        Carro carro1 = new Carro(2007,"Honda","city","HERACLES", "v8","grena",10000.00);

        carro1.verificarInformacoes();
        carro1.ligarCarro();
        carro1.testarSom();
        carro1.consultarPlaca();
        carro1.consultarPreco(2024);
        System.out.println("-----------------------");
        Carro carro2 = new Carro(1992,"chevrolet","omega","NEO","4.1","preto",55000.00);

        carro2.verificarInformacoes();
        carro2.ligarCarro();
        carro2.testarSom();
        carro2.consultarPlaca();
        carro2.consultarPreco(2024);
        System.out.println("-----------------------");
Carro carro3 = new Carro(2003,"fiat","Marea","pegaso","1.0","amarelo",80000.00);

        carro3.verificarInformacoes();
        carro3.ligarCarro();
        carro3.testarSom();
        carro3.consultarPlaca();
        carro3.consultarPreco(2024);
        System.out.println(carro1);
        System.out.println(carro2);
        System.out.println(carro3);
    }
}
