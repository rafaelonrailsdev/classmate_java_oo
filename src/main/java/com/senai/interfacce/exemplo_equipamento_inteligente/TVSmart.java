package com.senai.interfacce.exemplo_equipamento_inteligente;

public class TVSmart implements AparelhoInteligente {

    private int volume;

    @Override
    public void ligar() {
        System.out.println("Ligado");
    }

    @Override
    public void desligar() {
        System.out.println("Desligado");
    }


    public TVSmart() {
        this.volume = 0;
    }
    public void aumentarVolume(){
        System.out.println("Volume "+(volume = ajustarNivel(volume,1)));
    }
    public void diminuirVolume(){
        System.out.println("Brilho "+(volume = ajustarNivel(volume,-1)));
    }

}
