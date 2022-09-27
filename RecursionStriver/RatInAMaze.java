package com.dileep.RecursionStriver;

import java.util.ArrayList;
import java.util.Arrays;

public class RatInAMaze {
    public static void main(String[] args) {

        int[][] m = {
                {1,0,0,0},
                {1,1,0,1},
                {1,1,0,0},
                {0,1,1,1}
        };
        System.out.println(findPath(m, 4));

    }

    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        ArrayList<String> ans = new ArrayList<>();
        helper(0, 0, "", m, n, ans);
        return ans;
    }

    public static void helper(int row, int col, String str, int[][] m, int n, ArrayList<String> ans) {


        if(row == n-1 && col == n-1) {
            ans.add(new String(str));
            return;
        }
        if(row <= -1 || col <= -1 || row >= n || col >= n) return;

        if(m[row][col] == 1) {
            m[row][col] = 0;
            helper(row + 1, col, str + "D", m, n, ans);
            helper(row, col - 1, str + "L", m, n, ans);
            helper(row, col + 1, str + "R", m, n, ans);
            helper(row - 1, col, str + "U", m, n, ans);
            m[row][col] = 1;
        }

    }


}
