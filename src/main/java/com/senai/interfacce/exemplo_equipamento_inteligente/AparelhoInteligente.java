package com.senai.interfacce.exemplo_equipamento_inteligente;

public interface AparelhoInteligente {
    int NIVEL_MAXIMO = 100;

    void ligar();
    void desligar();

    default int ajustarNivel(int nivelAtual, int ajuste){
        if (validarNivel(nivelAtual,ajuste)){
            return nivelAtual+ajuste;
        }
        else return nivelAtual;
    }

    private boolean validarNivel(int nivel, int ajuste){
        return  (nivel>= 0) &&
                (nivel<=NIVEL_MAXIMO) &&
                (nivel+ajuste!=-1) &&
                (nivel+ajuste != 100+ajuste);
    }

    static void mensageBemVindo(){
        System.out.println("Bem-vindo ao controle remoto inteligente ");
    }
}
