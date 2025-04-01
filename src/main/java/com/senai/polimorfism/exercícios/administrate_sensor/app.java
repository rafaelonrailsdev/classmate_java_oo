package com.senai.polimorfism.exercícios.administrate_sensor;

public class app {
    public static void main(String[] args) {
        sensorGenerate(new SensorTemperature("sensor de temperatura"));
        sensorGenerate(new SensorUminity("sensor de umidade"));
    }
    public static void sensorGenerate(Sensor sensor){
        sensor.sensorAction();
    }
}
