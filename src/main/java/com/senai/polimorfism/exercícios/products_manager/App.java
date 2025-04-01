package com.senai.polimorfism.exercícios.products_manager;

public class App {
    public static void main(String[] args) {
        polimorphMethod(new ProductDigital(100,0.6));
        polimorphMethod(new ProductDigital(200,0.3));
        polimorphMethod(new ProductDigital(300,0.5));

    }
    public static void polimorphMethod(Product product){
        product.totalFees(product.price,product.fees);
    }
}
