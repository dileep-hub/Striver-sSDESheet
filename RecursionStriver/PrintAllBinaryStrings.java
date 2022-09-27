package com.dileep.RecursionStriver;

import java.util.Arrays;

public class PrintAllBinaryStrings {
    public static void main(String[] args) {
        int n = 2;
        int[] arr = new int[n];
        print(n,0, arr);


    }

    static public void print(int n, int k, int[] arr) {
        if(k==n) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        arr[k]=0;
        print(n, k+1, arr);
        arr[k]=1;
        print(n, k+1, arr);

    }

}
