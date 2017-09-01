package com.stefan.java.chagay.computer_sience.AlgorithmsAndDataStructure.SortingAlgorithm.selectionSrt;

public class SelectionSort {


    public static void main(String[] args) {
        int[] array = new int[]{
                5,6,1,3
        };

        for (int i : selectionSrt1(array)) {
            System.out.println(i);
        }
    }

    
    private static int [] selectionSrt1( int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
            
        }
        return arr;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}
