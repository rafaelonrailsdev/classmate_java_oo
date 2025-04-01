package com.senai.polimorfism.exercícios.products_manager;

public class ProductService extends Product{
    public ProductService(double price, double fees) {
        super(price, fees);
    }

    @Override
    void totalFees(double price, double fees) {
        System.out.printf("price with no fees %.2f price with fees %.2f \n",price, price+(price*fees));

    }
}
