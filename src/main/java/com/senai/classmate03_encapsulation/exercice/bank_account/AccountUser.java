package com.senai.classmate03_encapsulation.exercice.bank_account;

import java.util.ArrayList;

public class AccountUser {
    private String holder;
    private double balance = 0;


    public AccountUser(String holder, double balance){
        setHolder(holder);
        setBalance(balance);
    }
    public String getHolder() {return holder;}
    public double getBalance() {return balance;}
    private void setHolder(String holder) {this.holder = holder;}
    private void setBalance(double balance) {
        if (balance<0){
            System.out.println("cannot set number be less than zero");

        }else{
            this.balance = balance;
        }
    }

    public double deposit(double amount){
        if (amount<0){
            System.out.println("enter a number greater than 0");
        }
        return balance+=amount;
    }

    public double withdraw(double amount){
        if (amount>getBalance()){
             System.out.println("You cannot withdraw an amount greater than that in your account");
             return balance;
        }
        return   balance-=amount;
    }
}
