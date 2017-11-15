package com.stefan.java.chagay.philosophyJava.inharitance;


class Insect {
    private int i = 9;
    protected int g;

    public Insect() {
        System.out.println("i = " +i+ ", g = "+ g);
        g = 39;
    }

    private static int x1 = printInit("поле static insect x1");

    static int printInit(String s) {
        System.out.println(s);
        return 32;
    }
}
