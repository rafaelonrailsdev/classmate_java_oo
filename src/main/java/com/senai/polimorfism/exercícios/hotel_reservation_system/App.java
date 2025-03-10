package com.senai.polimorfism.exercícios.hotel_reservation_system;

public class App {
    public static void main(String[] args) {
        ReserveBase reserveSimple = new ReserveSimple(1000,0.05);
       ReserveVip reserveVip = new ReserveVip(1000,0.08);

       reserveSimple.totalCost();
       reserveVip.totalCost();


    }
}
