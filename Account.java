package org.example;

import java.util.ArrayList;
import java.util.Date;

public class Account {
    private String owner;
    private double balance;
    private ArrayList<String> transactions;

    public Account(String owner){
        this.owner = owner;
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
    }

    public void deposit(double amount){
        if(amount > 0){
            this.balance += amount;
            transactions.add("deposited " + amount + " on " + new Date() );
            System.out.println("deposit successful " + amount);
        }else{
            System.out.println("invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > this.balance) {
            System.out.println("insufficient balance");
        } else if (amount <= 0) {
            System.out.println("invalid withdrawal amount");
        } else {
            this.balance -= amount;
            transactions.add("withdrew " + amount + " on " + new Date());
            System.out.println("withdrawal successful, now you have " + this.balance);
        }
    }

    public double getBalance() {
        return this.balance;
    }

    public void getTransactionHistory() {
        System.out.println("\n--- Transaction History ---");
        for (String t : transactions) {
            System.out.println(t);
        }
        System.out.println("---------------------------\n");
    }
}
