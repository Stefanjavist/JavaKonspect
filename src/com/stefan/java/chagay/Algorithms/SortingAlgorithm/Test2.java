package com.stefan.java.chagay.Algorithms.SortingAlgorithm;


public class Test2 {

    private static int[] bubbleSrt(int[] array) {
        int k, h, temp;

        for (k = 0; k < array.length; k++) {
            for (h = 0; h < array.length - 1; h++) {
                if (array[h] > array[h + 1]) {
                    temp = array[h];
                    array[h] = array[h + 1];
                    array[h + 1] = temp;
                }
            }

        }

        return array;
    }

    public static void main(String[] args) {
        int[] array = new int[]{3, 43, 12, 322, 2343, 31,
                                12, 3133, 3, 3, 3, 313, 212,};

        for (int i : bubbleSrt(array)) {
            System.out.println(i);
        }

    }

}
