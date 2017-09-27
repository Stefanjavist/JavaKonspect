package com.stefan.java.chagay.computer_sience.examples;


import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

import java.util.Arrays;


public class UseLibraryStdDraw {

    public static void main(String[] args) {

    //значение функции
//    int N = 1000;
//    StdDraw.setXscale(0, N);
//    StdDraw.setYscale(0, N*N);
//    StdDraw.setPenColor(StdDraw.CYAN);
//    StdDraw.setPenRadius(.01);
//        for (int i = 0; i <= N ; i++) {
//            StdDraw.point(i, i);
//            StdDraw.point(i,i*i);
//            StdDraw.point(i,i*Math.log(i));
//        }

        //массив случайных чисел
//        int N = 50;
//        double[] a = new double[N];
//        for (int i = 0; i < N; i++)
//                  a[i] = StdRandom.uniform();
//            for (int j = 0; j < N; j++) {
//                double x = 1.0*j/N;
//                double y = a[j]/2.0;
//                double rw = 0.5/N;
//                double rh = a[j]/2.0;
//                StdDraw.filledRectangle(x, y, rw, rh);
//
//        }

        // упорядоченный массив случайных значений
        int N = 50;
        double[] a = new double[N];
        for (int i = 0; i < N; i++)
                a[i] = StdRandom.uniform();
            Arrays.sort(a);
            for (int j = 0; j < N; j++) {
                double x = 1.0*j/N;
                double y = a[j]/2.0;
                double rw = 0.5/N;
                double rh = a[j] / 2.0;
                StdDraw.filledRectangle(x, y, rw, rh);
            }

    }

}
