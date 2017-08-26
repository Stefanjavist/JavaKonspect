package com.stefan.java.chagay.computer_sience.AlgorithmsAndDataStructure.SortingAlgorithm.bubbleSrt;


public class Test7 {

    public static void main(String[] args) {
        int[] arr = new int[]{
                213, 2, 344, 233, 2134, 44
        };
        for (int i : bubbleSrt(arr)) {
            System.out.println(i);
        }
    }

    private static int[] bubbleSrt(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j + 1] = tmp;
                }
            }
        }
        return arr;
    }

}
