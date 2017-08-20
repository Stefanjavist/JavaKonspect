package com.stefan.java.chagay.computer_sience.AlgorithmsAndDataStructure.SortingAlgorithm.selectionSrt;

/**
 * Created by Stefan on 20.08.2017.
 */
public class Test1 {

    public static void main(String[] args) {
        int [] arr = new int[]{
                12,32,34,2,1
        };

            int [] a = selecSrt(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(a[i]);
        }
    }

    /**
     * Unsustainable implementation
     * @param arr
     * @return
     */

    private static int[] selecSrt(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int nextMin = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[i]) {
                    nextMin = j;


                        int temp = arr[nextMin];
                        arr[nextMin] = arr[i];
                        arr[i] = temp;

                }
            }

        }
        return arr;
        }

}
