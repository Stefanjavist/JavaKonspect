package com.stefan.java.chagay.computer_sience.examples.algo4;

import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

import java.util.Random;

public class VisualAccumulator {

    /**
     * visual accumulator API
     */
    private double total;
    private double N;

    public VisualAccumulator(int trials, double max) {
        StdDraw.setXscale(0, trials);
        StdDraw.setYscale(0, max);
        StdDraw.setPenRadius(0.005);
    }

    public void addDataValue(double val) {
        N++;
        total += val;
        StdDraw.setPenColor(StdDraw.DARK_GRAY);
        StdDraw.point(N, val);
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.point(N, total / N);
    }

    //the same in the Accumulator
    public double mean() {
        return total / N;
    }

    @Override
    public String toString() {
        return "Mid (" + N + " mean): "
                + String.format("%7.5f", mean());
    }


    public static void main(String[] args) {
        int T = Integer.parseInt(args[0]);
        VisualAccumulator a = new VisualAccumulator(T, 1.0);
        for (int i = 0; i < T; i++)
            a.addDataValue(StdRandom.uniform());
        StdOut.println(a);
//        StdDraw.setXscale(0, 10);
//        StdDraw.setYscale(0, 10);
//        StdDraw.setPenRadius(0.06);
//        StdDraw.setPenColor(StdDraw.RED);
//        StdDraw.point(3, 4);
    }
}



