package com.dileep.Graph;

import java.util.LinkedList;
import java.util.Queue;

public class Matrix01 {
    public static void main(String[] args) {

    }

    public int[][] updateMatrix(int[][] mat) {

        int n = mat.length;
        int m = mat[0].length;
        int[][] vis = new int[n][m];
        int[][] dist = new int[n][m];

        Queue<Pair4> q = new LinkedList<>();
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(mat[i][j] == 0) {
                    q.add(new Pair4(i, j, 0));
                    vis[i][j] = 1;
                    dist[i][j] = 0;
                }
            }
        }

        int[] drow  = {-1, 0, 1, 0};
        int[] dcol = {0, 1, 0, -1};

        while (!q.isEmpty()) {
            int r = q.peek().row;
            int c = q.peek().col;
            int d = q.peek().dis;
            q.remove();
            for(int i=0; i<4; i++) {
                int nr = r+drow[i];
                int nc = c+dcol[i];
                if(nr >=0 && nr < n && nc >= 0 && nc < m) {
                    if(vis[nr][nc] == 0) {
                        if(mat[nr][nc] != 0) {
                            q.add(new Pair4(nr, nc, d+1));
                            vis[nr][nc] = 1;
                            dist[nr][nc] = d+1;
                        }
                    }
                }
            }
        }

        return dist;

    }

}


class Pair4 {
    int row;
    int col;
    int dis;
    Pair4(int row, int col, int dis) {
        this.row = row;
        this.col = col;
        this.dis = dis;
    }
}