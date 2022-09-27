package com.dileep.Graph;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public static void main(String[] args) {

    }

    // n = no of nodes | adj = neighbours of each node
    public ArrayList<Integer> bfs(int n, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> res = new ArrayList<>();
        boolean[] visited = new boolean[n+1];
        Queue<Integer> q = new LinkedList<>();

        q.add(0);
        visited[0] = true;

        while (!q.isEmpty()) {
            Integer node = q.poll();
            res.add(node);

            for(int i : adj.get(node)) {
                if(visited[i] == false) {
                    visited[i] = true;
                    q.add(i);
                }
            }

        }

        return res;

    }



}
