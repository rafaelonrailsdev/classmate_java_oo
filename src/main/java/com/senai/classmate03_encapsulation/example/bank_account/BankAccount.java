package com.senai.classmate03_encapsulation.example.bank_account;

public class BankAccount {
    private  User user;
    private int accountNUmber;
    private double balance;
    private String bankingInstution;
    public User getUser(){
        return this.user;
    }
    public void User(User user){
        this.user = user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getAccountNUmber() {
        return accountNUmber;
    }

    public void setAccountNUmber(int accountNUmber) {
        this.accountNUmber = accountNUmber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getBankingInstution() {
        return bankingInstution;
    }

    public void setBankingInstution(String bankingInstution) {
        this.bankingInstution = bankingInstution;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "user=" + user +
                ", accountNUmber=" + accountNUmber +
                ", balance=" + balance +
                ", bankingInstution='" + bankingInstution + '\'' +
                '}';
    }
}
