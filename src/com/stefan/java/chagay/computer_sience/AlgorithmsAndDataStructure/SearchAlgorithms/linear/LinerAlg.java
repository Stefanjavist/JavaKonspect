package com.stefan.java.chagay.computer_sience.AlgorithmsAndDataStructure.SearchAlgorithms.linear;

/**
 * O(n), Главное его преимущество заключается в том, что он работает со связными и
 * несортированными списками.
 *
 * and which them realization mr
 */
public class LinerAlg {

    /*
    если мы находим чисоло в массиве возвращаем его порядковый номер
    иначе возвращаем -1
     */
        private static int linerSearch(int[] arr, int target) {
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] > target) {
                    return -1;
                }

                if(arr[i] == target ) {
                    return i;
                }

            }
            return -1;
        }

    public static void main(String[] args) {
        int[] arr = new int[]{
                1,4,5,67,77,88,656,200
        };

        System.out.println(LinerAlg.linerSearch(arr, 4));

    }

}
