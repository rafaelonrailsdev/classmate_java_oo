package com.senai.polimorfism.exercícios.administrate_sensor;
public class SensorTemperature extends Sensor {
    public SensorTemperature(String action){super(action);}
    @Override
     void sensorAction(){System.out.println(getAction());}
}
