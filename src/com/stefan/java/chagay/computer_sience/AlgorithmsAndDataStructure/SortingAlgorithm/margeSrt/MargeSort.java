package com.stefan.java.chagay.computer_sience.AlgorithmsAndDataStructure.SortingAlgorithm.margeSrt;

public class MargeSort {

    private int[] numbers;
    private int[] helper;

    private int number;

    public MargeSort(int[] values) {
        this.numbers = values;
        number = values.length;
        this.helper = new int[number];
        mergesort(0, number - 1);
    }

    private void mergesort(int low, int high) {
// check if low is smaller than high, if not then the array is sorted
        if (low < high) {
            // Get the index of the element which is in the middle
            int middle = low + (high - low) / 2;//1
            // Sort the left side of the array
            mergesort(low, middle);//low = 0, middle = 1
            // Sort the right side of the array
            mergesort(middle + 1, high);
            // Combine them both
            merge(low, middle, high);
        }
    }

    private int[] merge(int low, int middle, int high) {
        // Copy both parts into the helper array
        for (int i = low; i <= high; i++) {
            helper[i] = numbers[i];
        }

        int low1 = low;
        int middle1 = middle + 1;
        int low2 = low;
        // Copy the smallest values from either the left or the right side back        }

        // to the original array
        while (low1 <= middle && middle1 <= high) {
            if(helper[low1] <= helper[middle1]) {
            numbers[low2] = helper[low1];
            low1++;//3
            } else {
                numbers[low2] = helper[middle1];
                middle1++;//2
            }
            low2++;//3
        }
        // Copy the rest of the left side of the array into the target array
        while (low1 <= middle) {
            numbers[low2] = helper[low1];
            low2++;//3
            low1++;//
        }

        return numbers;
        // Since we are sorting in-place any leftover elements from the right side
        // are already at the right position.
    }


    public static void main(String[] args) {
        int [] arr = new int[]{
                12, 5, 4, 16
        };

        MargeSort margeSort = new MargeSort(arr);
        }

}


