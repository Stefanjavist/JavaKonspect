package com.stefan.java.chagay.philosophyJava.polymorphism;

import java.util.Random;

public class Main {
    public static Car next() {
    Random random = new Random();
        switch (random.nextInt(2)){
            default:
            case 0: return new Nissan();
            case 1: return new Niva();
        }
    }

    public static void main(String[] args) {
        Car car = new Nissan();
        car.move("right");
        Car[] s = new Car[9];
        for (int i = 0; i < s.length; i++) {
            s[i] = next();
        }
        for (Car c : s) {
            c.move("right");
        }
    }
}
