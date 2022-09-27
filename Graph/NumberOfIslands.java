package com.dileep.Graph;


import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIslands {


    public static void main(String[] args) {

        char[][] grid = {
                {'1', '1', '1', '0', '0'},
                {'1', '0', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
};
        System.out.println(numIslands(grid));

    }

    public static int numIslands(char[][] grid) {

        int row = grid.length;
        int col = grid[0].length;

        int[][] vis = new int[row][col];
        int count = 0;

        for(int i=0; i<row; i++) {
            for (int j = 0; j < col; j++) {
                // this means the land which is not visited
                if (grid[i][j] == '1' && vis[i][j] == 0) {
                    System.out.println(i + " " + j);
                    count++;
                    bfs(i, j, vis, grid);

                }
            }
        }
        return count;
    }

    public static void bfs(int row, int col, int[][] vis, char[][] grid) {

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(row, col));
        vis[row][col] = 1;
        int n = grid.length;
        int m = grid[0].length;

        while (!q.isEmpty()) {
            int r = q.peek().first;
            int c = q.peek().second;
            q.remove();



            if(r-1 > -1 && c > -1 && r-1 < n && c <m   && grid[r-1][c] == '1' && vis[r-1][c] == 0) {
                vis[r-1][c] = 1;
                q.add(new Pair(r-1, c));
            }
            if(r+1 > -1 && c > -1 && r+1 < n && c <m  && grid[r+1][c] == '1' && vis[r+1][c] == 0) {
                vis[r+1][c] = 1;
                q.add(new Pair(r+1, c));
            }
            if(r>-1 && c+1>-1 && r < n && c+1 <m  && grid[r][c+1] == '1' && vis[r][c+1] == 0) {
                vis[r][c+1] = 1;
                q.add(new Pair(r, c+1));
            }
            if(r>-1 && c-1>-1 && r < n && c-1 <m  && grid[r][c-1] == '1' && vis[r][c-1] == 0) {
                vis[r][c-1] = 1;
                q.add(new Pair(r, c-1));
            }

        }
    }

}
class Pair {
    int first;
    int second;
    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}
