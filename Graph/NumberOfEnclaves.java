package com.dileep.Graph;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfEnclaves {
    public static void main(String[] args) {

    }

    public int numEnclaves(int[][] grid) {

        // Lets do it using BFS
        int n = grid.length;
        int m = grid[0].length;

        int[][] vis = new int[n][m];
        Queue<Pair5> q = new LinkedList<>();

        for(int i=0; i<m; i++) {
            if(grid[0][i] == 1) {
                q.add(new Pair5(0, i));
                vis[0][i] = 1;
            }
            if(grid[n-1][i] == 1) {
                q.add(new Pair5(n-1, i));
                vis[n-1][i] = 1;
            }
        }

        for(int i=0; i<n; i++) {
            if(grid[i][0] == 1) {
                q.add(new Pair5(i, 0));
                vis[i][0] = 1;
            }
            if(grid[i][m-1] == 1) {
                q.add(new Pair5(i, m-1));
                vis[i][m-1] = 1;
            }
        }
        int[] drow  = {-1, 0, 1, 0};
        int[] dcol = {0, 1, 0, -1};

        while (!q.isEmpty()) {
            int r = q.peek().row;
            int c = q.peek().col;
            q.remove();
            for(int i=0; i<4; i++) {
                int nrow = r+drow[i];
                int ncol = c+dcol[i];
                if(nrow >= 0 && nrow < n && ncol >=0 && ncol <m) {
                    if(vis[nrow][ncol] == 0 && grid[nrow][ncol] == 1) {
                        q.add(new Pair5(nrow, ncol));
                        vis[nrow][ncol] = 1;
                    }
                }
            }
        }

        int count = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(vis[i][j] == 0 && grid[i][j] == 1) count++;
            }
        }
        return count;
    }
}
class Pair5 {
    int row;
    int col;
    Pair5(int row, int col) {
        this.row = row;
        this.col = col;
    }
}
