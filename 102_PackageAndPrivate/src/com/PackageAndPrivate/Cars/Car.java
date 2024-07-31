package com.PackageAndPrivate.Cars;

public class Car {
    String brand;
    String color;
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price >= 200_000 && price <= 500_000) {
            this.price = price;
        } else {
            System.out.println("Invalid price");
        }
    }
}
