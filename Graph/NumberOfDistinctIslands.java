package com.dileep.Graph;

import java.util.ArrayList;
import java.util.HashSet;

public class NumberOfDistinctIslands {
    public static void main(String[] args) {

    }

    public  void dfs(int row, int col, int[][] vis, int[][] grid, ArrayList<Pair6> arrl, int row0, int col0) {
        vis[row][col] = 1;
        arrl.add(new Pair6(row-row0, col-col0));
        int n = grid.length;
        int m = grid[0].length;
        int[] drow  = {-1, 0, 1, 0};
        int[] dcol = {0, 1, 0, -1};

        for(int i=0; i<4; i++) {
            int nrow = row+drow[i];
            int ncol = col+dcol[i];
            if(nrow >= 0 && nrow < n && ncol >=0 && ncol <m) {
                if(vis[nrow][ncol] == 0 && grid[nrow][ncol] == 1) {
                    dfs(nrow, ncol, vis, grid, arrl, row0, col0);
                }
            }
        }
    }

    // lets do it using DFS
    int countDistinctIslands(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;
        int[][] vis = new int[n][m];
        HashSet<ArrayList<Pair6>> hs = new HashSet<>();

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(vis[i][j] == 0 && grid[i][j] == 1) {
                    ArrayList<Pair6> arrl = new ArrayList<>();
                    dfs(i, j, vis, grid, arrl, i, j);
                    hs.add(arrl);
                }
            }
        }
        return hs.size();
    }

}

class Pair6 {
    int col;
    int row;
    Pair6(int row, int col) {
        this.row = row;
        this.col = col;
    }
}
