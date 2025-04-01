package com.senai.interfacce.exemplo_equipamento_inteligente;

public class LampadaInteligente implements AparelhoInteligente{
   private int brilho;
   public LampadaInteligente(){
       this.brilho = 0;
   }
    @Override
    public void ligar() {
        System.out.println("Ligado");

    }

    @Override
    public void desligar() {
        System.out.println("Desligado");

    }

    public void aumentarBrilho(){
        System.out.println("Brilho "+(brilho = ajustarNivel(brilho,1)));
    }
    public void diminuirBrilho(){
        System.out.println("Brilho "+(brilho = ajustarNivel(brilho,-1)));
    }
    }
