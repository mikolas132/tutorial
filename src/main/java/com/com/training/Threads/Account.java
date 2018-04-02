package com.com.training.Threads;

public class Account {
    private int balance = 50;

    public int getBalance() {
        return balance;
    }

    public void raise(int value) {
        balance = balance - value;
    }
}
