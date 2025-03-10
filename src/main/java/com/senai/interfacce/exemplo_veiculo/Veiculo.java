package com.senai.interfacce.exemplo_veiculo;

public interface Veiculo {
   default void buzinar(){System.out.println("buzinando");}
    void acelerar(int plus, int acelerate);
}
