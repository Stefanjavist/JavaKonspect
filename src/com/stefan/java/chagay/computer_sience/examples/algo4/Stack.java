package com.stefan.java.chagay.computer_sience.examples.algo4;


public class Stack<T> {

    
	private final int MAX_SIZE = 100;
	private final int MIN_SIZE = 0;
    private int[] arr =  new int[MAX_SIZE];
    private int counter = 0;
    
    
    public int put(int item) {
    	if(arr.length == MAX_SIZE) {
    		return -1;
    	}
    	
    	arr[counter++] = item;
    	return 0;
    }
    
    public void push() {
    	if(arr.length == MIN_SIZE) {
    		System.out.println("lol");
    	}
    	arr[counter] = arr[--counter];
    }
    
    public void peek() {
    	System.out.println("Peek boy: "+ arr[arr.length - 1]);
    }
}

