package com.senai.polimorfism.exercícios.administrate_sensor;

public abstract class Sensor {
    private String action;
    public Sensor(String action){
        this.action = action;
    }
    public String getAction() {
        return action;
    }
    abstract void sensorAction();
}
