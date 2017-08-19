package com.stefan.java.chagay.computer_sience.AlgorithmsAndDataStructure.SortingAlgorithm.bubbleSrt;

public class Test5 {

    public static void main(String[] args) {
        int [] lol = new int[]{23,24,4};

        for (int i : bobleSrt(lol)) {
            System.out.println(i);
        }
    }

    private static int[] bobleSrt(int[] arr) {

      int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if(arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        return arr;
    }
}
