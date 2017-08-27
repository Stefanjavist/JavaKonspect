package com.stefan.java.chagay.computer_sience.AlgorithmsAndDataStructure.SortingAlgorithm.margeSrt;


public class Test1 {

    private int[] numbers;
    private int[] helper;
    private int number;
    private int low = 0;

    public Test1(int[] values) {
        number = values.length;
        this.numbers = values;
        this.helper = new int[number];
        margeSort(low, number - 1);
    }

    private void margeSort(int low, int high) {

        if(low < high) {
            int middle = low + (high - low) / 2;
            margeSort(low, middle);
            margeSort(middle + 1, high);
            marge(low, middle, high);
        }
    }

    private int[] marge(int low, int middle, int high) {

        for (int i = low; i <= high; i++) {
            helper[i] = numbers[i];
        }

        int low1 = low;
        int low2 = low;
        int middle1 = middle + 1;

        while(low1 <= middle && middle1 <= high) {
            if(helper[low1] <= helper[middle1]) {
                numbers[low2] = helper[low1];
                low1++;
            } else{
                numbers[low2] = helper[middle1];
                middle1++;
            }
            low2++;
        }

        while(low1 <= middle) {
            numbers[low2] = helper[low1];
            low1++;
            low2++;
        }

        return numbers;
    }


    public static void main(String[] args) {
        int[] arr = new int[]{23,323,2};
        Test1 test1 = new Test1(arr);


    }
}
