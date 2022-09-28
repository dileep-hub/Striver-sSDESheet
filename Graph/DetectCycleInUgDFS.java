package com.dileep.Graph;

import java.util.ArrayList;
import java.util.Arrays;

public class DetectCycleInUgDFS {
    public static void main(String[] args) {

    }

    public static boolean dfs(int src, int parent, int V, ArrayList<ArrayList<Integer>> adj, boolean[] vis) {
        vis[src] = true;
        for(int it : adj.get(src)) {
            if(!vis[it]) {
                if(dfs(it, src, V, adj, vis) == true) return true;
            } else if(parent != it) return true;
        }
        return false;
    }

    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {

        boolean[] vis = new boolean[V];
        Arrays.fill(vis, false);

        for(int i=0; i<V; i++) {
            if(!vis[i]) {
                if(dfs(i, -1, V, adj, vis)) return true;
            }
        }

        return false;

    }

}

class Pair3 {
    int first;
    int second;
    public Pair3(int first, int second) {
        this.first = first;
        this.second = second;
    }
}
