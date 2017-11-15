package com.stefan.java.chagay.philosophyJava.inharitance.finalPrivate;

/**
 * Created by Stefan on 10/18/2017.
 */
public class FinalOverridingIllusion {
    public static void main(String[] args) {
        OverridingPrivate2 op2 = new OverridingPrivate2();
        op2.f();
        op2.g();
        //it is possible to carry out an ascending
        OverridingPrivate op = op2;
//        op.f();
//        op.g();
        //it's the same here
        WithFinals wf = op2;
//        wf.f();
//        wf.g();
    }
}
