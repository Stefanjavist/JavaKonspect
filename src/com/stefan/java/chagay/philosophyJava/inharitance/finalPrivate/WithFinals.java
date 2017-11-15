package com.stefan.java.chagay.philosophyJava.inharitance.finalPrivate;

public class WithFinals {
    //the same private
    private final void f() {
        System.out.println("WithFinals.f()");
    }

    //automatically is a final
    private void g() {
        System.out.println("WithFinals.g()");
    }

}
