package com.senai.interfacce.exemplo_smartwatch;

public class App {
    public static void main(String[] args) {
        SmartWatchAvancado smartWatchAvancado = new SmartWatchAvancado();
        smartWatchAvancado.contarPassos();
        smartWatchAvancado.medirQualidadeSono();
        smartWatchAvancado.medirFrequenciaCaediaca();
    }
}
