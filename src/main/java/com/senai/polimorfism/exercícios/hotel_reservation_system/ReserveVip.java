package com.senai.polimorfism.exercícios.hotel_reservation_system;

public class ReserveVip extends  ReserveBase{
private final double vipFees = 0.02;

    public ReserveVip(double cost, double fees) {
        super(cost, fees);
    }

    @Override
    void totalCost() {
        double finalCost = cost+=cost*fees+vipFees;
        System.out.println("custo total da reserva vip com juros: "+finalCost+"R$ \n custo sem juros:"+cost+"R$" );
    }
}
