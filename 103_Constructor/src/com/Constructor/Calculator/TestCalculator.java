package com.Constructor.Calculator;

public class TestCalculator {
    public static void main(String[] args) {
        Calculator cal1 = new Calculator(148, 255);
        System.out.println(cal1.add());
        System.out.println(cal1.sub());
        System.out.println(cal1.mul());
        System.out.println(cal1.div());
    }
}
