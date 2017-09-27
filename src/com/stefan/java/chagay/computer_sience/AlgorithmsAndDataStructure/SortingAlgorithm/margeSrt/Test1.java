package com.stefan.java.chagay.computer_sience.AlgorithmsAndDataStructure.SortingAlgorithm.margeSrt;



public class Test1 {

    private int [] arr;
    private int [] helper;

    private int count;

    public Test1(int[] arr) {
        count = arr.length;
        this.arr = arr;
        this.helper = new int[count];
        merge(0, count - 1);
    }

    private void merge(int lo, int hi) {
        if(lo < hi){
            int mid = lo + (hi - lo) / 2;
            merge(lo, mid);
            merge(mid+1, hi);
        logicMerge(lo, mid, hi);

        }
    }

    private int[] logicMerge(int lo, int mid, int hi) {
        for (int i = lo; i < hi; i++) {
            helper[i] = arr[i];
        }

        int lo1 = lo;
        int lo2 = lo;
        int mid1 = mid+1;

        while(lo1 <= mid && mid1 <= hi) {
            if(helper[lo1] >= helper[mid1]) {
                arr[lo2] = helper[mid1];
            lo1++;
            }else {
                arr[lo2] = helper[lo1];
                mid1++;
            }
            lo2++;
        }

        while(lo1 <= mid) {
            arr[lo2] = helper[lo1];
            lo1++;
            lo2++;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{
                21, 33, 23, 4
        };

        Test1 test1 = new Test1(arr);
        for (int i: test1.arr
             ) {
            System.out.println(i);
        }

    }





















}
