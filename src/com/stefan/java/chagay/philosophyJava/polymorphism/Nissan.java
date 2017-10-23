package com.stefan.java.chagay.philosophyJava.polymorphism;

public class Nissan extends Car {

    @Override
    protected void move(String s){
        System.out.println("Nissan on the: "+s);
    }

    @Override
    protected void speed(int i) {
        System.out.println("speed nissan:"+i);
    }

}
