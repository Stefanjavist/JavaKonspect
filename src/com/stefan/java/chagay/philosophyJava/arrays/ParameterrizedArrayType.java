package com.stefan.java.chagay.philosophyJava.arrays;


public class ParameterrizedArrayType {
    public static void main(String[] args) {
        Integer[] ints = {1,2,3,4,5};
        Double[] doubles = {1.1,2.1,3.1,4.1,5.1};
        Integer[] ints2 = new ParameterType<Integer>().f(ints);
        Double[] doubles2 = new ParameterType<Double>().f(doubles);
        ints2 = MethodParameter.f(ints);
        doubles2 = MethodParameter.f(doubles);
    }

}
