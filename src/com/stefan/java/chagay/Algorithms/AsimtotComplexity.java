package com.stefan.java.chagay.Algorithms;


public class AsimtotComplexity {

    public static void main(String[] args) {
        int[] art = {23, 324, 34343, 3, 35, 1212, 124};

        System.out.println(findLargest(art));

    }

    //произыодитеьность этого алгоритма составляет O(N)
    public static int findLargest(int[] art) {
        int largest = art[0];
        for (int i = 1; i < 7; i++)
            if (art[i] > largest) {
                largest = art[i];
            }

        return largest;
    }


}
