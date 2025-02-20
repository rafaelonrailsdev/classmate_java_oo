package com.senai.heritage.inventory_control_ex_1;

public class Eletronic extends  Product{
    private int voltage;
    public Eletronic(String name, Double price, int amount, int voltage){

        super(name,price,amount);
        this.voltage = voltage;
    }
}
