package com.stefan.java.chagay.JavaLessons101.inheritance;

public class BoxWeight extends Box{

    int weight;

    public BoxWeight(int width, int height, int weight, int depth) {
        super(height, weight, depth);
        width = width;
        height = height;
        depth = depth;
        this.weight = weight;
    }
}
