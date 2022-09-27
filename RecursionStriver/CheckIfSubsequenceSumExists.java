package com.dileep.RecursionStriver;

public class CheckIfSubsequenceSumExists {
    public static void main(String[] args) {
        System.out.println(check(new int[]{2, 3, 5, 6, 8, 10}, 6, 0, 45));

    }

    static public boolean check(int[] arr, int n, int index, int sum) {
        if (sum == 0) {
            return true;
        }
        if (index >= n || sum < 0) {
            return false;
        }

        if (check(arr, n, index + 1, sum - arr[index])) {
            return true;
        }
        if (check(arr, n, index + 1, sum)) {
            return true;
        }

        return false;

    }
}
