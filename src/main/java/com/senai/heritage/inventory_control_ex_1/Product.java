package com.senai.heritage.inventory_control_ex_1;

import java.util.ArrayList;

public abstract class Product {
    private String name;
    private double price;
    private int amount;
    static ArrayList<Product> products = new ArrayList<>();
    public Product(String name, Double price, int amount){
        this.name = name;
        this.price = price;
        this.amount = amount;
    }
}
