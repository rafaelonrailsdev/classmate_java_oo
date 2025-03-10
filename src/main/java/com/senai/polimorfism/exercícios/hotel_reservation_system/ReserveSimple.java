package com.senai.polimorfism.exercícios.hotel_reservation_system;

public class ReserveSimple extends ReserveBase{
    ReserveSimple(double cost, double fees){
        super(cost, fees);
    }

    @Override
    void totalCost() {
        double finalCost = cost+=cost*fees;
        System.out.println("custo total da reserva simples com juros: "+finalCost+"R$");
    }
}
