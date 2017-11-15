package com.stefan.java.chagay.computer_sience.examples.excercises;

import edu.princeton.cs.algs4.*;

/**
 * ATD
 */
public class Page118 {

    public static void main(String[] args) {
//        int N = Integer.parseInt(args[0]);

        /**
         * test1.2.4
         */
//        String string1 = "Hello";
//        String string2= string1;
//        string1 = "world";
//        System.out.println(string1);//world
//        System.out.println(string2);//hello
/**
 * test1.2.1
 */
//    int N = Integer.parseInt(args[0]);
//        StdDraw.setXscale(0, 1.0);
//        StdDraw.setYscale(0, 1.0);
//
//        StdDraw.setPenRadius(.01);
//        StdDraw.setPenColor(Color.RED);

//        Point2D a = new Point2D(1,1);
//        Point2D b = new Point2D(1, 3);
//        double k = a.distanceTo(b);
//        Double kd = new Double(k);
        //while(dis > newDis)
        // {
        //
        //}
        // return dis;


            /**
             * test 1.2.5
             */
//        String s = "Hello World";
//        s.toUpperCase();
//        s.substring(6, 11);
//        System.out.println(s);
        /*
        строка неизменяется т. к. String - это объект и он в данном примере прото вызывает свой метод,
          но нкак не именяет текст!(лучше ознакомиться с ATD) java 7 the compulete reference 8th page 151
         */

//        int points = Integer.parseInt(args[0]);
//        Point2D pCurr = new Point2D(0, 0);
//        Point2D pNext = new Point2D(0, 0);
//        recurse(pCurr, pNext, 0, points);

        /**
         * 1.2.2
         */
//        Interval1D interval1D;
//        Interval1D interval1D1;
//        int i = Integer.valueOf(args[0]);
//        for (int j = 0; j < i; j++) {
//            double min = StdIn.readDouble();
//            double max = StdIn.readDouble();
//            interval1D = new Interval1D(min, max);
//
//                double min1 = StdIn.readDouble();
//                double max1 = StdIn.readDouble();
//                interval1D1 = new Interval1D(min1, max1);
//            if(interval1D.intersects(interval1D1)){
//                System.out.format("coordinates of intersecting intervals: %s; %s %n", interval1D.toString(), interval1D1);
//                }
//
//        }

        /**
         * 1.2.6
         */
        String t = "TGACGAC";
        String s = "ACTGACG";


    }

    interface INextInterval {
        Interval1D next(Interval1D interval1D);
    }

    //на вход инициализ объекты pCurr and pNext
    private static void recurse(Point2D pCurr, Point2D pNext, double disBetweenPoints, int points) {
        double checkDis = pCurr.distanceTo(pNext);
        if((points == 0) ||(checkDis <= disBetweenPoints) ) {
            double x = StdRandom.uniform();
            double y = StdRandom.uniform();
            double x1 = StdRandom.uniform();
            double y1 = StdRandom.uniform();

            pCurr = new Point2D(x, y);
            pNext = new Point2D(x1, y1);
            double distance = pCurr.distanceTo(pNext);
            recurse(pNext, pCurr, distance, points - 1);
        }
        StdOut.printf("min distance = %.2f, " +
                        "coordin first point(%.2f,%.2f), " +
                        "coordin second point(%.2f,%.2f)",checkDis,pCurr.x(),pCurr.y(), pNext.x(), pNext.y());

    }



}
