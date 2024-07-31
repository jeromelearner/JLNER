package com.Constructor.Vehicle;

public class Vehicle {
    private int speed = 0;
    private int size = 10;

    {
        System.out.println("Vehicle constructor");
    }

    public Vehicle(int speed) {
        this.speed = speed;
    }

    public Vehicle(int speed, int size) {
        this.speed = speed;
        this.size = size;
    }

    public int getSpeed() {
        return speed;
    }

    public int getSize() {
        return size;
    }

    public void speedUp(int speed) {
        if (speed > 0 && this.speed + speed > 140) {
            this.speed = this.speed + speed;
        } else {
            System.out.println("Wrong speed");
        }
    }

    public void speedDown(int speed) {
        if (this.speed - speed >= 0) {
            this.speed = this.speed - speed;
        } else {
            System.out.println("Wrong speed");
        }
    }
}
