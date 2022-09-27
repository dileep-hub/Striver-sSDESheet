package com.dileep.RecursionStriver;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII {
    public static void main(String[] args) {

        System.out.println(combinationSum3(3, 7));

    }

    public static void helper(int[] cand, int tar, int index, List<Integer> ds, List<List<Integer>> res, int len) {

        if(ds.size() > len) return;
        if(tar == 0) {
            if(ds.size() == len) {
                res.add(new ArrayList<>(ds));
                return;
            }

        }
        if(index >= cand.length || tar < 0) {
            return;
        }

        ds.add(cand[index]);
        helper(cand, tar-cand[index], index+1, ds, res, len);
        ds.remove(ds.size()-1);
        helper(cand, tar, index+1, ds, res, len);

    }

    public static List<List<Integer>> combinationSum3(int k, int n) {

        int[] arr = new int[] {1,2,3,4,5,6,7,8,9};
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();

        helper(arr, n, 0, ds, res, k);
        return res;

    }

}
