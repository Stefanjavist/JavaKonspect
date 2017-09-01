package com.stefan.java.chagay.computer_sience.AlgorithmsAndDataStructure.SearchAlgorithms.BinarySearch;

import static java.lang.Math.abs;
import static java.lang.Math.pow;

public class BinarySearch {

    private static void binSearch(int[] arr, int number) {

        int low = 0;
        int high = arr.length;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (number == arr[mid]) {
                System.out.println(mid);
                return;
            } else if (number > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("wrong size low > high");
    }

    private static void squareBruteForce(double a){
        double epicilon = 0.01;//погрешность искомого корня
        int numGuesses = 0;//счётчик
        double ans = 0.0;//нахождение самого корня

        while (abs(pow(ans, 2) - a) >= epicilon){
            ans += 0.00001;
            numGuesses += 1;
        }

        if(abs(pow(ans, 2) - a) >=epicilon){
            System.out.println("Failed  " + numGuesses);
        }else{
            System.out.println(ans + " close to square root of " + a + " with " + numGuesses+" number guesses");
        }
    }

    private static void squareBsearch(double a) {
        double epicilon = 0.01;
        double low = 0.0;
        double high = a;
        int guesses = 0;
        double guess = (high + low) / 2.0;

        while(abs(pow(guess, 2) - a) >= epicilon) {
            if(pow(guess, 2) < a){
                low = guess;
            } else {
                high = guess;
            }
            guess = (high + low) / 2.0;
            guesses += 1;
        }
        System.out.println(guess+" is close enough to square root of " + a + ".Guesses " + guesses);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{
                1,2,3,4,5
        };

        binSearch(arr, 4);


    }

}

