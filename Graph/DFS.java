package com.dileep.Graph;

import java.util.ArrayList;

public class DFS {
    public static void main(String[] args) {

    }

    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {

        // result array
        ArrayList<Integer> res = new ArrayList<>();
        boolean[] vis = new boolean[V+1];
        vis[0] = true;
        dfs(0, adj, res, vis);
        return res;

    }

    static  public  void  dfs(int node, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> res, boolean[] vis) {
        vis[node] = true;
        res.add(node);

        for(int it : adj.get(node)) {
            if(!vis[it]) {
                dfs(it, adj, res, vis);
            }
        }
    }

}
