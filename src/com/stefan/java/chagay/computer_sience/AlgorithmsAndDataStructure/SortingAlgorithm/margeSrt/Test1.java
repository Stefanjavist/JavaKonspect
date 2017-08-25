package com.stefan.java.chagay.computer_sience.AlgorithmsAndDataStructure.SortingAlgorithm.margeSrt;


public class Test1 {

    int [] numbers;
    int [] helper;

    int number;

    public Test1(int[] values) {
        this.numbers = values;
        number = values.length;
        this.helper = new int[number];
        margeSort(0, number - 1);
     }

     private void margeSort(int low, int high) {

     }
}
