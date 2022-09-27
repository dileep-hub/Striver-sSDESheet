package com.dileep.RecursionStriver;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {

        System.out.println(combinationSum(new int[] {2,3,6,7}, 7));

    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {


        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();

        helper(candidates, target, 0, ds, res);

        return res;


    }

    public static void helper(int[] cand, int tar, int index, List<Integer> ds, List<List<Integer>> res) {
        if(tar == 0) {
            res.add(new ArrayList<>(ds));
            return;
        }
        if(index >= cand.length || tar < 0) {
            return;
        }

        ds.add(cand[index]);
        helper(cand, tar-cand[index], index, ds, res);
        ds.remove(ds.size()-1);
        helper(cand, tar, index+1, ds, res);

    }

}
