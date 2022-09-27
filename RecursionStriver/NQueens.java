package com.dileep.RecursionStriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class NQueens {
    public static void main(String[] args) {

        System.out.println(solveNQueens(4));


    }

    public static List<List<String>> solveNQueens(int n) {

        List<List<String>> res =  new ArrayList<List<String>>();

        char[][] board = new char[n][n];

//        for(char[] c : board)  {
//            Arrays.fill(c, '.');
//        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                board[i][j] = '.';
        }



        // to check left boxes to full Q or not
        int[] leftCheck = new int[n];
        // to check upper diagnol
        int[] upperDiag = new int[2*n-1];
        // to check lower diagnol
        int[] lowerDiag = new int[2*n-1];

        helper(0, n, leftCheck, upperDiag, lowerDiag, board, res);

        return res;

    }

    static public List < String > construct(char[][] board) {
        List < String > res = new LinkedList< String >();
        for (int i = 0; i < board.length; i++) {
            String s = new String(board[i]);
            res.add(s);
        }
        return res;
    }

    public static void helper(int col, int n, int[] leftCheck, int[] upperDiag, int[] lowerDiag, char[][] board, List<List<String>> res) {

        if(col == n) {
            res.add(construct(board));
            return;
        }

        for(int i=0; i< n; i++) {

            if(leftCheck[i]  == 0 && upperDiag[n-1+col-i] == 0 && lowerDiag[i+col] == 0) {
                board[i][col] = 'Q';
                leftCheck[i] = 1;
                upperDiag[n-1+col-i] = 1;
                lowerDiag[i+col] = 1;
                helper(col+1, n, leftCheck, upperDiag, lowerDiag, board, res);
                board[i][col] = '.';
                leftCheck[i] = 0;
                upperDiag[n-1+col-i] = 0;
                lowerDiag[i+col] = 0;

            }

        }

    }



}
