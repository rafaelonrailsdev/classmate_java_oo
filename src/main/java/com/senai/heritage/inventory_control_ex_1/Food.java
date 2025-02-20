package com.senai.heritage.inventory_control_ex_1;

public class Food extends Product {

    private String expirationDate;
    Food(String name, Double price, int amount, String expirationDate){

        super(name,price,amount);
        this.expirationDate = expirationDate;

    }
}
