package com.TTBB.User;

import java.util.Scanner;

public class UserAccount {
    public String username;
    public int userId = 0;
    public int gameTimes = 0;
    public int userWallet = 0;
    public int userBaseWallet = 0;

    public void callUserInfo() {
        System.out.printf("Welcome %s!\n", this.username);
        System.out.printf("You have played %d rounds!\n", this.gameTimes);
        System.out.printf("Wallet: $%d\n", this.userWallet);
    }

    public static void CreateUserAccount(UserAccount newuserAccount) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to TTBB!");

        System.out.println("What's your first name?");
        String firstName = sc.next();
        System.out.println("What's your last name?");
        String lastName = sc.next();
        newuserAccount.username = firstName + " " + lastName;

        System.out.println("How much money do you want to top up?");
        newuserAccount.userBaseWallet = sc.nextInt();
        newuserAccount.userWallet = newuserAccount.userBaseWallet;
    }
}
