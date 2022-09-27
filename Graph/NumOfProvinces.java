package com.dileep.Graph;

import java.util.ArrayList;

public class NumOfProvinces {
    public static void main(String[] args) {

    }

    public int findCircleNum(int[][] isConnected) {

        // firstly create a adjList
        ArrayList<ArrayList<Integer>> adjLS = new ArrayList<>();
        int n = isConnected.length;

        // adding the rows in the adjLS
        for(int i=0; i<n; i++) {
            adjLS.add(new ArrayList<Integer>());
        }

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(isConnected[i]==isConnected[j] && i !=j ) {
                    adjLS.get(i).add(j);
                    adjLS.get(j).add(i);
                }
            }
        }

        int vis[] = new int[n];
        int count = 0;
        for(int i=0; i<n; i++) {
            if(vis[i] == 0) {
                count++;
                dfs(i, adjLS, vis);
            }
        }

        return count;
    }

    public static void dfs(int i, ArrayList<ArrayList<Integer>> adjLS, int[] vis) {
        vis[i] = 1;
        for(int it : adjLS.get(i)) {
            if(vis[it] == 0) {
                dfs(it, adjLS, vis);
            }
        }
    }

}
