package com.stefan.java.chagay.JavaLessons101.inheritance;


public class Box {
    private int height;
    private int width;
    private int depth;

    public Box(int height, int width, int depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public Box() {
        this.height = -1;
        this.width = -1;
        this.depth = -1;
    }

    int volume() {
        return height* width *depth;
    }
}
