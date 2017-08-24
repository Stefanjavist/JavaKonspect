package com.stefan.java.chagay.JavaLessons101.Model8lesson3;

/**
 * видемость переменных в не статичных методах анонмным классом
 */
public class Starter3 {

    public void start() {
        final String text = "hello3";//должна, быть effective final
        final IPrinter printer = new IPrinter(){
            @Override
            public void print() {
                System.out.print(text);//видит только effective final
            }
        };
    }
}
