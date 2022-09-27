package com.dileep.Graph;

public class FloodFill {
    public static void main(String[] args) {

    }

    public static void dfs(int sr, int sc, int[][] ans, int newcolor, int inicolor, int[] delR, int[] delC, int[][] image) {
        ans[sr][sc] = newcolor;
        int n = ans.length;
        int m = ans[0].length;

        for(int i=0; i<4; i++) {
            int nrow = sr+delR[i];
            int ncol = sc+delC[i];
            if(nrow > -1 && ncol > -1 && nrow < n && ncol < m) {
                if(image[nrow][ncol] == inicolor && ans[nrow][ncol] != newcolor ) {
                    dfs(nrow, ncol, ans, newcolor, inicolor, delR, delC, image);
                }
            }
        }


    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int inicolor = image[sr][sc];
        int[][] imgarr = image;
        int[] delRow = {-1, 0, 1, 0};
        int[] delCol = {0,1,0,-1};
        dfs(sr, sc, imgarr, color, inicolor, delRow, delCol, image);
        return imgarr;

    }

}
