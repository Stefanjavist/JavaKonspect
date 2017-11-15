package com.stefan.java.chagay.computer_sience.AlgorithmsAndDataStructure.analizeAlgorithms;


import edu.princeton.cs.algs4.BinarySearch;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

import javax.swing.*;
import java.util.Arrays;


public class AnalizeAlg {

    private Timer timer;
    private static int countThreeSum(int[] arr) {
        int n = arr.length;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if ((arr[i] + arr[j] + arr[k]) == 0)
                        cnt++;
                }

            }

        }
        return cnt;
    }


    static class Stopwatch{
        long start;
       Stopwatch(){
           start = System.currentTimeMillis();
       }

       private long elapsedTime() {
           long now = System.currentTimeMillis() - start;
           return now;
       }
    }



    public static void main(String[] args) {
//        In in = new In(args[0]);
//        int[]a = in.readAllInts();
//
//        System.out.println(countThreeSum(a));


//            System.out.println("Fast search by sum");
//            System.out.println("fast two sum = " + countFastTwo(a));
//            System.out.println("fast two three = " + countFastThreeSum(a));

//            Stopwatch stw = new Stopwatch();
//            int count = countThreeSum(a);
//            System.out.printf("elapsed time = %d, %ncount = %d%n", stw.elapsedTime(), count);
//
//        double prev = doubleTest(125);
//        for (int N = 250; true; N+=N) {
//
//        double time = timeTrial(N);
//            System.out.printf("%6d %7.1f", N, time);
//            System.out.printf("%5.1f%n", time/prev);
//            prev = time;

        /**
         * todo log(T(N))
         * срочно подтянуть АТД это вопрос смерти и жизни
         */


            StdDraw.setYscale(0, 100000);
            StdDraw.setXscale(0, 10000);
            StdDraw.setPenRadius(0.01);

            double prevT =0;
            double prevN =0;

        for (int n = 250; true; n+=n) {
            double time = doubleTest(n);

            System.out.printf("time = %.1f; N = %d%n",time,n);
            StdDraw.point(n, time);
            StdDraw.line(prevN, prevT, n, time);

            prevT = time;
            prevN = n;

        }
    }


    //проектирование быстрых алгоритмов стр 180

    private static int countFastTwo(int[] a){
        Arrays.sort(a);
        int cnt = 0;
        for (int i = 0; i < a.length; i++) {
            if(BinarySearch.indexOf(a, -a[i]) > i){
                cnt++;
            }
        }
        return cnt;
    }

    private static int countFastThreeSum(int[] a) {
        Arrays.sort(a);
        int cnt = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(BinarySearch.indexOf(a, -a[i]-a[j]) > j) {
                    cnt++;
                }
            }

        }
        return cnt;
    }


    //эксперименты с удвоением

    /**
     ■Develop an input generator that produces inputs that model the inputs expected
     in practice (such as the random integers in timeTrial() in DoublingTest.
     ■  Run the program DoublingRatio given below, a modiﬁcation of DoublingTest
     that calculates the ratio of each running time with the previous.
     ■  Run until the ratios approach a limit 2 b .
     */
       public static double doubleTest(int N){
           int Max = 100000;
            int[] a = new int[N];
            for (int i = 0; i < N; i++)
                a[i] = StdRandom.uniform(-Max, Max);

            Stopwatch timer = new Stopwatch();
            int cnt = countThreeSum(a);
            timer.elapsedTime();
            return cnt;
        }
//        output
    /*
    250     1,0Infinity
   500     5,0  5,0
  1000    50,0 10,0
  2000   491,0  9,8
  4000  4084,0  8,3
  8000 32022,0  7,8
 16000 254274,0  7,9
 32000 2023602,0  8,0
 64000 16200126,0  8,0
     */




}
