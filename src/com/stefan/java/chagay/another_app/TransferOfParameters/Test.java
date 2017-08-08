package com.stefan.java.chagay.another_app.TransferOfParameters;


public class Test {



    public void math (int a, int b) {
        a *= 2;
        b /= 2;

    }

    int chislo =2 ;
    public int proizvedenie(int a){
        int old_value = chislo;
        chislo = chislo + a;//это поле не участвует
        return old_value;// а тут у нас значение chislo = 2;
    }


    public static void main(String[] args) {
        Test test = new Test();
        int a = 10;//эти переменные не повлияют на метод math
        int b = 8;//эти переменные не повлияют на метод math

        System.out.println("до " + a + " " + b);
        test.math(a, b);
        System.out.println("после " + a + " " + b);

        System.out.println("old value - "+test.proizvedenie(4));

    }
}
