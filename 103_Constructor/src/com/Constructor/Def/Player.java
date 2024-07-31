package com.Constructor.Def;

import java.util.Scanner;
import java.util.UUID;

public class Player {
    private UUID id;
    private String name;
    private int wallet;
    private int score;

    public Player() {
        Scanner sc = new Scanner(System.in);
        id = java.util.UUID.randomUUID();
        System.out.println("What's your name");
        name = sc.nextLine();
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getWallet() {
        return wallet;
    }

    public int getScore() {
        return score;
    }
}
