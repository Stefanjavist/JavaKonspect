package com.stefan.java.chagay.computer_sience.AlgorithmsAndDataStructure.SortingAlgorithm.bubbleSrt;

public class Test6 {


    private static int[] bubbleSrt(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }

        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{
                213, 2, 344, 233, 2134, 44
        };
        for (int i : bubbleSrt(arr)) {
            System.out.println(i);
        }
    }
}
