package com.PackageAndPrivate.Bank;

public class BankAccount {
    String accountName;
    private double balance;

    public double getBalance() {
        return balance;
    }

//    public void setBalance(double balance) {
//        this.balance = balance;
//    }

    public void withdraw(int amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance");
        } else if (amount <= 0) {
            System.out.println("Invalid Action");
        } else {
            balance -= amount;
        }
    }

}
