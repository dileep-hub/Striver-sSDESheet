package com.dileep.Graph;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class DetectCycleInUG {
    public static void main(String[] args) {

    }

    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] vis = new boolean[V];
        Arrays.fill(vis, false);

        for(int i=0; i<V; i++) {
            if(!vis[i]) {
                if(checkCycle(i, vis, adj, V) == true) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean checkCycle(int src, boolean[] vis, ArrayList<ArrayList<Integer>> adj, int V) {
        vis[src] = true;
        Queue<Pair2> q = new LinkedList<>();
        q.add(new Pair2(src, -1));

        while (!q.isEmpty()) {
            int node = q.peek().first;
            int parent = q.peek().second;
            q.remove();

            for(int it : adj.get(node)) {
                if(vis[it] == false) {
                    q.add(new Pair2(it, node));
                    vis[it] = true;
                } else if(parent != it) {
                    return true;
                }
            }
        }
        return false;


    }

}

class Pair2 {
    int first;
    int second;
    public Pair2(int first, int second) {
        this.first = first;
        this.second = second;
    }
}
