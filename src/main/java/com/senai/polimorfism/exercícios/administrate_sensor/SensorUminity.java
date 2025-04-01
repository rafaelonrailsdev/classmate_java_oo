package com.senai.polimorfism.exercícios.administrate_sensor;

public class SensorUminity extends Sensor {
    public SensorUminity(String action){
        super(action);
    }
    @Override
    void sensorAction(){
        System.out.println(getAction());
    }

}
