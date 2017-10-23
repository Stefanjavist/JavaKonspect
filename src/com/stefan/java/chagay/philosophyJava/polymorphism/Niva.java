package com.stefan.java.chagay.philosophyJava.polymorphism;


import com.stefan.java.chagay.philosophyJava.polymorphism.Car;

public class Niva extends Car {

    @Override
    protected void move(String s){
        System.out.println("Niva on the right: "+s);
    }

    @Override
    protected void speed(int i) {
        System.out.println("speed niva:"+i);
    }

}
