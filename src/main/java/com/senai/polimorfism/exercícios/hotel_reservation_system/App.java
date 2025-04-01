package com.senai.polimorfism.exercícios.hotel_reservation_system;

public class App {
    public static void main(String[] args) {

            reserveReturn(new ReserveSimple(1000,0.05));
            reserveReturn(new ReserveVip(1000,0.08));

    }
    public static void reserveReturn(ReserveBase reserve){
        System.out.println("custo total: "+reserve.cost+" juros: "+reserve.fees);
        reserve.totalCost();
    }
}
