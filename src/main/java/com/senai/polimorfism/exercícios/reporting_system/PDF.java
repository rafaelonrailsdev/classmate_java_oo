package com.senai.polimorfism.exercícios.reporting_system;

public class PDF extends Report{
    @Override
    String generate() {
        return "Create PDF archive";
    }
}
