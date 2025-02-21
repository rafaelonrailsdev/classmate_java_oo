package com.senai.heritage.inventory_control_ex_1;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class Product {
    private  String name;
    private double price;
    private int amount;
    static ArrayList<Product> listProduct = new ArrayList<>();
    static ArrayList<Food> listFood = new ArrayList<>();
    static ArrayList<Eletronic> listEletronic = new ArrayList<>();

    public Product(String name, Double price, int amount){
        this.name = name;
        this.price = price;
        this.amount = amount;
    }
    public static void showStock(){
            System.out.println(listProduct.toString().replaceAll(",",""));
    }

    public String getName() {return name;}
    public double getPrice() {return price;}
    public int getAmount() {return amount;}

}
