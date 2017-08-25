package com.stefan.java.chagay.computer_sience.AlgorithmsAndDataStructure.SortingAlgorithm.insertSrt;

public class Test2 {

    public static void main(String[] args) {
        int [] arr = new int []{
                2323,1,3,433,5,2
        };

        for (int i:inserSrt(arr)) {
            System.out.println(i);
        }
    }

    private static int [] inserSrt(int[] arr) {
        int i, j, key, tmp;
        for (i = 1; i < arr.length; i++) {
            key = arr[i];
            j = i - 1;

            while(j >= 0 && arr[j] < key) {
                tmp = arr[j];
                arr[j] = key;
                arr[j + 1] = tmp;
                j--;
            }
        }
        return arr;
    }

}
