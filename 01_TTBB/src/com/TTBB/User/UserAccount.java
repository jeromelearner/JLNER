package com.TTBB.User;

import java.util.Scanner;
import com.TTBB.Handler.*;

public class UserAccount {
    public String username;
    public int userId = 0;
    public int gameTimes = 0;
    public int userWallet = 0;
    public int userBaseWallet = 0;

    public static void CreateUserAccount(UserAccount newuserAccount) {
        Scanner sc = new Scanner(System.in);
        String firstName;
        String lastName;

        while (true) {
            System.out.println("\nWhat's your first name?");
            firstName = sc.nextLine();
            firstName = stringHandler.removeAllWhitespace(firstName);
            if (firstName != null) {
                if (stringHandler.containsNonAlphabeticCharacters(firstName)) {
                    System.out.println("Sorry, illegal characters are not allowed! \nOnly Alphabetic characters are allowed, please try again.");
                } else {
                    firstName = stringHandler.capitalizeFirstLetter(firstName);
                    break;
                }
            } else {
                System.out.println("Sorry, please enter your first name.");
            }
        }

        while (true) {
            System.out.println("\nWhat's your last name?");
            lastName = sc.nextLine();
            lastName = stringHandler.removeAllWhitespace(lastName);
            if (lastName != null) {
                if (stringHandler.containsNonAlphabeticCharacters(lastName)) {
                    System.out.println("Sorry, illegal characters are not allowed! \nOnly Alphabetic characters are allowed, please try again.");
                } else {
                    lastName = stringHandler.capitalizeFirstLetter(lastName);
                    break;
                }
            } else {
                System.out.println("Sorry, please enter your last name.");
            }
        }
        newuserAccount.username = firstName + " " + lastName;

        System.out.print("How much for topping up: \n>");
        newuserAccount.userBaseWallet = intHandler.safeInt();
        newuserAccount.userWallet = newuserAccount.userBaseWallet;
    }

    public void callUserInfo() {
        System.out.printf("User Name: %s\n", this.username);
        System.out.printf("Played Rounds: %d\n", this.gameTimes);
        System.out.printf("Wallet: $%d\n", this.userWallet);
        System.out.printf((this.userWallet - this.userBaseWallet) >= 0 ? "Won Dollers: %d\n" : "Lost Dollers: %d\n", this.userWallet - this.userBaseWallet, this.userBaseWallet - this.userWallet);
    }

    public void ManageAccount() {
        System.out.println("Please choose what service you want: \n1. Current User Account Information \n2. Top Up for current User");
        int userOption = intHandler.safeInt();
        switch (userOption) {
            case 1:
                this.callUserInfo();
                break;
            case 2:
                this.ManageAccount_TopUp();
                System.out.println();
                break;
        }
    }

    public void ManageAccount_TopUp() {
        System.out.print("How much for topping up: \n>");
        int topup_Money = intHandler.safeInt();
        if (topup_Money >= 10_000_000) {
            System.out.println("Warning: Please top up in the counter. The machine only accepts bills less than $10,000,000");
        } else {
            userWallet += topup_Money;
            userBaseWallet += topup_Money;
        }

    }


}
