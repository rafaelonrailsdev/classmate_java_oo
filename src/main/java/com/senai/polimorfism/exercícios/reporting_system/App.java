package com.senai.polimorfism.exercícios.reporting_system;

public class App {

    public static void main(String[] args) {
        Report archive00 = new CSV();
        Report archive01 = new JSON();
        Report archive02 = new PDF();
        System.out.println(archive00.generate());
        System.out.println(archive01.generate());
        System.out.println(archive02.generate());


    }
}
