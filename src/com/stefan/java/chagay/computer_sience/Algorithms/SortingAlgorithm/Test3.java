package com.stefan.java.chagay.computer_sience.Algorithms.SortingAlgorithm;


public class Test3 {

    public static int[] bubbleSrt(int[] array) {
        boolean stoped = true;

        while (stoped) {
            stoped = false;
            int temp = 0;
            for (int x = 0; x < array.length - 1; x++) {
                if (array[x] < array[x + 1]) {
                    temp = array[x];
                    array[x] = array[x + 1];
                    array[x + 1] = temp;
                    stoped = true;
                }
            }

        }

        return array;
    }

    public static void main(String[] args) {
        int[] array = new int[]{3, 23, 1};

        for (int i : bubbleSrt(array)) {
            System.out.println(i);
        }
    }

}
