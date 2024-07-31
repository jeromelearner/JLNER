package com.PackageAndPrivate.Cars;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.brand = "Honda";
        car.color = "Blue";
        car.setPrice(300_000);
        System.out.println(car.getPrice());
    }
}
