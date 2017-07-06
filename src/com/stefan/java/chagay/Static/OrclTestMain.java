package com.stefan.java.chagay.Static;

/**
 * Created by Stefan on 29.06.2017.
 */
public class OrclTestMain {

    public static void main(String[] args) {
        OraclTestStatic m = new OraclTestStatic();
        OraclTestStatic m2 = new OraclTestStatic();

        m.a = 1;
        m.b = 2;
        m2.a = 3;
        //m2 перезаписывается снова в m1
        m2.b = 36;
        m.showA();
        m.showB();

 }
}
