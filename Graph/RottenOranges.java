package com.dileep.Graph;

import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges {
    public static void main(String[] args) {

    }

    public int orangesRotting(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;
        int[][] vis = new int[n][m];

        Queue<Pair1> q = new LinkedList<>();
        int rotcount = 0;
        int frcount = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(grid[i][j] == 2) {
                    vis[i][j] = 2;
                    q.add(new Pair1(i, j, 0));
                    rotcount++;
                } else {
                    vis[i][j] = 0;
                }
                if(grid[i][j] == 1) frcount++;
            }
        }

        int count = 0;
        int tm = 0;
        int[] drow = {-1, 0, 1, 0};
        int[] dcol = {0, 1, 0, -1};

        while ((!q.isEmpty())) {
            int r = q.peek().row;
            int c = q.peek().col;
            int t = q.peek().time;
            tm = Math.max(tm, t);
            q.remove();
            for(int i=0; i<4; i++)  {
                int nrow = r+drow[i];
                int ncol = c+dcol[i];
                if(nrow>=0 && nrow < n && ncol >=0 && ncol < m) {
                    if(vis[nrow][ncol] == 0 && grid[nrow][ncol] == 1) {
                        q.add(new Pair1(nrow, ncol, t+1));
                        vis[nrow][ncol] = 2;
                        count++;
                    }
                }
            }
        }

        if(count != frcount) return -1;
        return tm;

    }


}
class Pair1 {
    int row;
    int col;
    int time;
    Pair1(int row, int col, int time) {
        this.row = row;
        this.col = col;
        this.time = time;
    }
}
