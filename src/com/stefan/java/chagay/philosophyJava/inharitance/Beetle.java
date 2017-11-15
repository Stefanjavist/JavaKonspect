package com.stefan.java.chagay.philosophyJava.inharitance;

class Beetle extends Insect {

    private int k = printInit("grid k initialize");
    public Beetle() {
        super();
        System.out.println("k = "+k);
        System.out.println("g = "+g);
    }

    private static int x2 = printInit("grid static Beetle x2");

    public static void main(String[] args) {
        System.out.println("Constructor");
        Beetle b = new Beetle();
    }

}
