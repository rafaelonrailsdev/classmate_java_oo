package com.senai.polimorfism.exercícios.reporting_system;

public class App {

    public static void main(String[] args) {
        generateReport(new PDF());
        generateReport(new CSV());
        generateReport(new JSON());
    }
    public static void generateReport(Report archive){
        System.out.println(archive.generate());
    }
}
