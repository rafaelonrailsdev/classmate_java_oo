package com.senai.encapsulation.exercice.bank_account;

public class Main {
    public static void main(String[] args) {
        AccountUser accountUser = new AccountUser("Rafael",100.00);

        System.out.println(accountUser.getBalance());

        accountUser.deposit(200.00);
        System.out.println(accountUser.getBalance());

        accountUser.withdraw(1500.00);
        System.out.println(accountUser.getBalance());
        System.out.println("-------------");
        AccountUser accountUser1 = new AccountUser("Pedro", -1.00);
        System.out.println(accountUser1.getBalance());

        accountUser1.deposit(10);
        System.out.println(accountUser1.getBalance());
    }
}
