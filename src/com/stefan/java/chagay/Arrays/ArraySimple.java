package com.stefan.java.chagay.Arrays;


public class ArraySimple {

    int[] iNumbers;


    public void iArray() {

        iNumbers = new int[10];
        int i;
        for (i = 0; i < 10; i++) {
            iNumbers[i] = i;
        }

        System.out.print("iNumbers: [" +
                iNumbers[0]);

        for (i = 1; i < iNumbers.length; i++) {
            System.out.print(", " + iNumbers[i]);
        }
        System.out.print("]");
    }
}
