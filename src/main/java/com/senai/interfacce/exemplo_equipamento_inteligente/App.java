package com.senai.interfacce.exemplo_equipamento_inteligente;

public class App {
    public static void main(String[] args) {
        testarAparelhos(new LampadaInteligente());
        testarAparelhos(new TVSmart());
    }
    public static void testarAparelhos(AparelhoInteligente aparelhoInteligente){
        aparelhoInteligente.ligar();
        if (aparelhoInteligente instanceof LampadaInteligente lampadaInteligente){
            for (int i = 0; i <2; i++) {
                lampadaInteligente.aumentarBrilho();
            }
            for (int i = 0; i < 3; i++) {
                lampadaInteligente.diminuirBrilho();
            }
        } else if (aparelhoInteligente instanceof  TVSmart tvSmart) {
            for (int i = 0; i < 2; i++) {
                tvSmart.aumentarVolume();
            }
            for (int i = 0; i < 3; i++) {
                tvSmart.diminuirVolume();
            }
        }
        }
    }


