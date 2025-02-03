package com.senai.classmate03_encapsulation.exercice.register_simple_product;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Product {
    static ArrayList<Product> productsList = new ArrayList<>();


    private String name;
    private Double price;

    public Product(String name, Double price) {
        setName(name);

        setPrice(price);
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        if (price < 0) {
//            throw new IllegalArgumentException("the price cannot be less than 0");
            System.out.println("the price cannot be less than 0");
        } else {
            this.price = price;
        }
    }

    public static void newProduct() {

        Scanner scan = new Scanner(System.in);
        String name;
        double price;

        System.out.println("How many products do you want to add to the system?");
        int size = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < size; i++) {
            System.out.printf("Name:");
            name = scan.nextLine();

            System.out.println("price");
            price = scan.nextDouble();


            while (price <= 0.0) {
                System.out.println("the price cannot be less than 0\n try again input the price of that product:");
            }
            productsList.add(new Product(name,price));
        }
    }

    public static void showProduct() {
        for (Product product : productsList) {
            System.out.println(product);
        }
    }

    @Override
    public String toString() {
        return "Product:" +
                "name='" + name + '\'' +
                ", price=" + price;

    }
}

