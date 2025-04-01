package com.senai.polimorfism.exercícios.products_manager;

public abstract class Product {
    double price;
    double fees;
    public Product(double price, double fees){this.price = price;this.fees = fees;}
    abstract void totalFees(double price, double fees);
    public double getPrice() {return price;}
    public double getFees() {return fees;}
}
