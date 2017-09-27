package com.stefan.java.chagay.computer_sience.examples.algo4;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Out;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * тут только то что не входит в упражнение
 */
public class InAndOutString{

    public static void main(String[] args) {

        /**
        String st = args[0];
        int a = st.indexOf(".");
        String prefDot = st.substring(0, a);
        String exstention = st.substring(a+1, st.length());
        */


//        String query = args[0];
//        while(!StdIn.isEmpty()){
//            String s = StdIn.readLine();
//            if(s.contains(query)) StdOut.println(s);
//        }

//        String input = StdIn.readString();
//        String[] words = input.split("\\s+");
//        for (int i =0; i < words.length;i++){
//            System.out.println(words[i]);
//        }

//------------------------------
        //копирование входных данных в out(последний агрумент)
        Out out = new Out(args[args.length - 1]);
        for (int i = 0; i < args.length - 1; i++) {
            In in = new In(args[i]);
            String s = in.readAll();
            out.println(s);
            in.close();
        }
        out.close();
    }

        private static boolean isSorted(String [] a){
            for(int i = 0; i < a.length; i++){
                if(a[i-1].compareTo(a[i]) > 0)
                return false;
            }
            return true;
        }

    private static boolean isPolindrom(String st){
        int n = st.length();
        for(int i = 0; i< n/2; i++)
            if(st.charAt(i) != st.charAt(n - 1 - i))
                return false;
        return true;
    }
}
