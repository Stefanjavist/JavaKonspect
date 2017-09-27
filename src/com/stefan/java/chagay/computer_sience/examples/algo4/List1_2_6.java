package com.stefan.java.chagay.computer_sience.examples.algo4;

import java.util.List;

/**
 * пререопределение методов toString and equals
 */
public class List1_2_6 {

    public static void main(String[] args) {
//        List1_2_6 a = List1_2_6(12,12,12);
        List1_2_6[] a = new List1_2_6[1];
        for (int i = 0; i < a.length; i++) {
            a[i] = new List1_2_6(1,2,1);
        }
//        System.out.println(a[0].count());
        System.out.println(a[0].toString());
    }


    private static int i;
    private final int month;
    private final int day;
    private final int year;

    public String count() {
        return ""+(i+=1);
    }

    public List1_2_6(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

//    @Override
//    public String toString(){
//        return getDay() + "/"+getMonth() +"/"+ getYear();
//    }

    @Override
    public boolean equals(Object s) {

        if(this == s) return true;
        if(s == null) return false;
        if(this.getClass() == s.getClass()) return true;

        List1_2_6 obj = (List1_2_6) s;
        if(obj.getDay() != this.getDay()) return false;
        if(obj.getMonth() != this.getMonth()) return false;
        if(obj.getYear() != this.getYear()) return false;
        return true;
    }
}
