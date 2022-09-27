package com.dileep.RecursionStriver;

public class CountALLSubsequenceSumOfK {
    public static void main(String[] args) {

        System.out.println(perfectSum(new int[] {2,3,5,6,8,10}, 6, 10, 0));

    }

    public static int perfectSum(int arr[],int n, int sum, int ind)
    {

        if(sum == 0) {
            return 1;
        }
        if(ind >= n || sum < 0) {
            return 0;
        }

        int l = perfectSum(arr, n, sum-arr[ind], ind+1);
        int r = perfectSum(arr, n, sum, ind+1);

        return r+l;


    }

}
