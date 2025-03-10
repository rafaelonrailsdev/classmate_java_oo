package com.senai.polimorfism.exercícios.hotel_reservation_system;

public abstract class ReserveBase {
    double cost;
    double fees;
    ReserveBase(double cost,double fees){
        this.cost = cost;
        this.fees = fees;
    }
    abstract void totalCost();
}
