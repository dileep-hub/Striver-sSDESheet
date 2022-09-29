package com.dileep.Graph;

import java.util.Arrays;

public class SurroundedRegionsXO {
    public static void main(String[] args) {


        char[][] carr = {
                {'X', 'X', 'X', 'X'},
                {'X','O','O','X'},
                {'X', 'X', 'O', 'X'},
                {'X', 'O', 'X','X'}
        };


        solve(carr);
        System.out.println(Arrays.toString(carr));
    }

    public static void dfs(int row, int col, int[] drow, int[] dcol, char[][] board, int[][] vis, int[][] check) {
        vis[row][col] = 1;
        check[row][col] = 1;
        int n = board.length;
        int m = board[0].length;
        for(int i=0; i<4; i++) {
            int nrow = row+drow[i];
            int ncol = col + dcol[i];
            if(nrow >= 0 && nrow < n && ncol >=0 && ncol <m) {
                if(vis[nrow][ncol] == 0 && board[nrow][ncol] == 'O') {
                    dfs(nrow, ncol, drow, dcol, board, vis, check);
                }
            }
        }
    }

    public static void solve(char[][] board) {

        int n = board.length;
        int m = board[0].length;
        int[][] vis = new int[n][m];
        // to represent which X should be changed
        int[][] check = new int[n][m];

        int[] drow  = {-1, 0, 1, 0};
        int[] dcol = {0, 1, 0, -1};

        // check top row
        for(int i=0; i<m; i++) {
            if(board[0][i] == 'O') {
                dfs(0, i, drow, dcol, board, vis, check);
            }
        }

        // check left most col
        for(int i=0; i<n; i++) {
            if(board[i][0] == 'O') {
                dfs(i, 0, drow, dcol, board, vis, check);
            }
        }

        // check right most col
        for(int i=0; i<n; i++) {
            if(board[i][m-1] == 'O') {
                dfs(i, m-1, drow, dcol, board, vis, check);
            }
        }

        // check bottom row
        for(int i=0; i<m; i++) {
            if(board[n-1][i] == 'O') {
                dfs(n-1, i, drow, dcol, board, vis, check);
            }
        }

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(vis[i][j] == 0 && board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
            }
        }

    }

}
