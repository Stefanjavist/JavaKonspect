package com.stefan.java.chagay.philosophyJava.inharitance.finalPrivate;

public class OverridingPrivate extends WithFinals {
    private final void f() {
        System.out.println("OverridingPrivate.f()");
    }

    private void g() {
        System.out.println("OverridingPrivate.f()");
    }
}
