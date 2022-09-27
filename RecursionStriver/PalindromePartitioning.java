package com.dileep.RecursionStriver;

import java.awt.peer.ListPeer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PalindromePartitioning {
    public static void main(String[] args) {

        System.out.println(partition("aabb"));

    }

    public static List<List<String>> partition(String s) {

        List<List<String>> res = new ArrayList<>();
        List<String> sub = new ArrayList<>();

        helper(s, 0, sub, res);

        return res;
    }

    public static void helper(String s, int index, List<String> sub, List<List<String>> res) {
        if(index == s.length()) {
            res.add(new ArrayList<>(sub));
            return;
        }

        for(int i=index; i<s.length(); i++) {
            if(isPal(s.substring(index, i+1))) {
                sub.add(s.substring(index, i+1));
                helper(s, i+1, sub, res);
                sub.remove(sub.size()-1);
            }
        }

    }

    static public boolean isPal(String str) {
        if(str.length() <= 1) {
            return true;
        }

        int l = 0;
        int r = str.length()-1;

        while (l <= r) {
            if(str.charAt(l) != str.charAt(r)) {
                return false;
            }
            l++; r--;
        }

        return true;

    }

}
