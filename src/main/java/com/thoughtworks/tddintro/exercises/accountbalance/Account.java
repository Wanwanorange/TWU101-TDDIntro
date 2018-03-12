package com.thoughtworks.tddintro.exercises.accountbalance;

public class Account {
    private double balance;

    public Account() {
        balance = 0;
    }

    public Account(double n) {
        balance = n;
    }

    public double getBalance() {
        return balance;
    }

    public double depositMoney(double i) {
        balance += i;
        return balance;
    }
}
