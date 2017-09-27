package com.stefan.java.chagay.computer_sience.examples.excercises;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Page65 {

    public static void main(String[] args) {
//        while (!StdIn.isEmpty()) {
//            String st = StdIn.readLine();
//            String[] splitText = st.split(" ");//divide текст между заданным символом(" ")
//
//            test1_1_21(splitText[0], splitText[1], splitText[2]);
//        }
        System.out.println(mathInduction(14 , 6));
    }

    //easy test1
    private static boolean test1_1_3(int a, int b, int c) {
        if((a == b) && (a == c)) {
            return true;
        }
            return false;
    }

    //easy test2
    private static boolean test1_1_5(double x, double y) {
        //sorry for this hardcode
        if((x < 1.0 && x > 0.0)&&(y < 1.0 && y > 0.0)){
            return true;
        }
        return false;
    }

//Фиббоначи
    private static void test1_1_6() {
        int f = 0;
        int g = 1;
        for (int i = 0; i <= 15; i++) {
            f = f + g;
            System.out.println(f);
            g = f - g;
        }
    }

    //basic format
    private static void test1_1_7a() {
        double t = 9.0;
        while(Math.abs(t - 9.0/t) > .001)
            t = (9.0/t +t) / 2.0;
        System.out.printf("%.5f\n", t);
    }

    //fact across cycles
    private static void test1_1_7b() {
        long sum = 1;
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                if(j == i){
                     sum = sum * j;
                }
            }
        }
            System.out.println(sum);
    }

        //fact across while
    private static void FactAcrossWhile() {
        long sum =1;
        int up = 1;
        long st, en, time = 0;
        st = System.currentTimeMillis();
        while (up <= 20) {

            sum *= up;
            up++;

        }
        en = System.currentTimeMillis();
        time = en - st;
        System.out.println(sum+" time algorithm - " + time + " millis");
    }

    //performance char symbol
    private static void test1_1_8(){
        System.out.println('a'+ 'b');//number))
        System.out.println('b');//b
        System.out.println((char)('a'+ 'a'));//e
    }

    //1%2 = 1!!!!!!!!!!!! binary transformation
    private static void test1_1_9(int N){
//        System.out.println(Integer.toBinaryString(N)+"\n");

        String str = "";

        for (int i = N; i > 0; i /= 2) {
            str = (i % 2) + str;
        }
        System.out.println(str);
        System.out.println(1%2);
    }

    //joke with arrays
        private static int[] test1_1_12() {
        int [] arr = new int [10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 9 - i;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[arr[i]];
        }
        return arr;
    }

 // matrix
    private static int [][] test1_1_13(int[][] arr){
        int i, j = 0;
        int[][] arrHelp = new int [arr.length][arr.length];
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr.length; j++) {
                arrHelp[j][i] = arr[i][j];
            }
        }
        return arrHelp;
    }

    //factrorial
    private static int test1_1_14(int N) {
        int x = 0;
        while(N > x){
            N = N / 2;
            x++;
        }
        return x+(N/2);
    }
        //recursive
    private static int test1_1_18(int a, int b) {
        if(b == 0) {
            return 1;
        } else if(b%2 == 0) {
            return test1_1_18(a*a, b/2);//2. (16 6) 3.(256 3)
        }return test1_1_18(a*a, b/2) * a;//1.(4 12)*2 4.(65536 1)*256 5.( 0)*65536
    }

    //Fibonacci
    private static long F(int N) {
        if(N == 0){
            return 0;
        }
        if(N == 1) {
            return 1;
        }
        return F(N-1) + F(N-2);
    }

    //ln(N!)
    private static double test1_1_20(int sum, int count, int limiter) {
        if(count == limiter) {
            return ln(sum * count);
        }else {
            return test1_1_20(sum * count, count+1, limiter);
        }
    }

    //ln(N)
    private static int ln(double a) {
        int stract = 0;
        while(a > stract) {
        a = a/2.72;
            stract ++;

        }return stract;
    }

    //rating of students

    /**
     * use split method String!!!!!!
     * String s = "stefan 5 7";
     *String[] st = s.split(" ");
     *System.out.println(st[1] + st[2]);
     * @param st
     * @param num1
     * @param num2
     */
    private static void test1_1_21(String st, String num1, String num2) {
        double a = Double.parseDouble(num1);
        double b = Double.parseDouble(num2);
        double result = a / b;
        System.out.printf("%s - name, %.3f / %.3f = %5.3f\n",st, a, b, result);
    }


    private static int test1_1_22Rank(int key, int[] a) {
        String deep = "";
        return rank(key, a, 0, a.length - 1, deep);
    }

    private static int rank(int key, int[] arr, int lo, int hi, String deep) {
        char cha = '+';
        if(lo > hi) return -1;

        int mid = lo+(hi-lo)/2;
        String step = deep+cha;
        StdOut.printf("|%s| lo - %d, hi - %d \n", step, lo, hi);
        if(arr[mid] == key) {
            return mid;
        }else if(arr[mid] > key){
            return rank(key, arr, lo, mid-1, step);}
            else  {
            return rank(key, arr, mid+1, hi, step);
        }
    }

    private static int test1_1_24(int p, int q) {
        if(q==0) return p;
        int r = p % q;
        System.out.println(p + " " + q);
        return test1_1_24(q, r);
    }


    private static String mathInduction(int a, int b) {
        int r = test1_1_25(a, b);
        int aos = a%r;
        int ash = a/r;
        int bos = b%r;
        int bsh = b/r;
        int checkb = r * bsh + bos;
        int checka = r * ash + aos;
        if(checka+checkb == a+b) return "Ok";
        return "Error";

    }

    private static int test1_1_25(int a, int b) {
        if(b==0) return a;
        int r = a % b;
        return test1_1_25(b, r);
    }
}
