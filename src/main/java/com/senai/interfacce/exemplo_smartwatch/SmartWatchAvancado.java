package com.senai.interfacce.exemplo_smartwatch;

public class SmartWatchAvancado implements SensorCardiaco,SensorPassos, SensorSono{
    @Override
    public void medirFrequenciaCaediaca() {
        System.out.println("medição cardiaca: 80bpm");
    }

    @Override
    public void contarPassos() {
        System.out.println("passos hoje: 400 passos");
    }

    @Override
    public void medirQualidadeSono() {
        System.out.println("qualidade do sono: sono profundo");
    }
}
