package com.stefan.java.chagay.computer_sience.examples.excercises_page65;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.ST;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

        static String a = "XxxooO";
        static String b = "a";
    public static void main(String[] args) {
//        int N = 12;
//        long []arr = new long[N];
//        for (int j= 0; j < N; j++) {
//        arr[j]=F(j);
//
////            StdOut.println(N + " " + F(N));
//        }
//            for (int i = 0; i < N; i++) {
//                System.out.println(i+" "+arr[i]);
//            }
//        test1_1_21("lol", 3, 4);
//        String str = StdIn.readLine();
//        while (!str.isEmpty()) {
//            str = StdIn.readString();
//        }
//
//        int n = str.length();
//        char[] charStr = new char[n];
//        for (int i = 0; i <str.length() ; i++) {
//            charStr[i] = str.charAt(i);
//            }

//        C:\Program Files\Java\jre1.8.0_131\bin;C:\Windows\system32;C:\Windows;C:\Windows\System32\Wbem;C:\Windows\System32\WindowsPowerShell\v1.0\;C:\Program Files\Intel\WiFi\bin\;C:\Program Files\Common Files\Intel\WirelessCommon\;C:\Program Files (x86)\Git\cmd;C:\Program Files (x86)\NVIDIA Corporation\PhysX\Common
//        C:\Program Files\Intel\WiFi\bin\;C:\Program Files\Common Files\Intel\WirelessCommon\
    }


        //    Базовые конструкции.
//            %s → String или toString().
//
//    printf("Hello %s!", "World"); //  "Hello World!"
//      %n → Перенос строки.
//
//    Byte, Short, Int, Long.
//      %d → В десятеричном.
//            %x → В шестнадцатеричном.
//
//            %7d → В десятеричном. Минимальная ширина строки 7 знаков.
//
//            printf("%7d", 1); //  "      1"
//      %07d → Минимальная ширина строки 7 знаков. Начало забить нулями.
//
//            printf("%07d", 1); //  "0000001"
//    Float, Double.
//      %f → Десятичное  число с точкой.
//            %e → Десятичное  число с точкой и экспонентой.
//
//            %.10f → С точностью 10 знаков после запятой.
//
//            printf("%.10f", Math.PI); //  "3,1415926536"
//    Date, Calendar.
//      %tF → Дата в формате "год-месяц-день".
//
//    printf("%tF", new Date()); //  "2011-01-27"
//      %tT → Время в формате "час:минута:секунда".
//
//    printf("%tT", new Date()); //  "22:42:37"
//-------------------------
//    public static boolean getXO (String str) {
////        str = str.toLowerCase();
////        return str.replace("o", "").length() == str.replace("x","").length();
////      my decision is below))))
//        char x = 'x';
//        char x1 = 'X';
//        char o = 'o';
//        char o1 = 'O';
//        int xIn = 0;
//        int oIn = 0;
//
//        for (int i = 0; i < str.length(); i++) {
//            char tmp = str.charAt(i);
//            if(x == tmp || x1 == tmp) {
//                xIn++;
//            } else if(o == tmp || o1 == tmp) {
//                oIn++;
//            }
//        }
//        return xIn == oIn;
//
//    }


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
    private static void test1_1_21(String st, int num1, int num2) {
        int result = num1 / num2;
        System.out.printf("%s", st);
    }

    private static int test1_1_22Rank(int fNum, int[] a) {
        String deep = "";
        return rank(fNum, a, 0, a.length - 1, deep);
    }

    private static int rank(int key, int[] arr, int lo, int hi, String deep) {
        char cha = ' ';
        if(lo > hi) return -1;

        int mid = lo+(hi-lo)/2;
        String step = deep+cha;
        StdOut.printf("deep-%s, lo - %d, hi - %d \n", step, lo, hi);
        if(arr[mid] > key) return rank(key, arr, lo, mid-1, step);
        if(arr[mid] < key) return rank(key, arr, mid+1, hi, step);
        else return mid;
    }

    private static int test1_1_24(int p, int q) {
        if(q==0) return p;
        int r = p % q;
        System.out.println(p + " " + q);
        return test1_1_24(q, r);
    }
}
