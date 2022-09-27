package com.dileep.RecursionStriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationsII {
    public static void main(String[] args) {

        System.out.println(combinationSum2(new int[] {10,1,2,7,6,1,5}, 8));

    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {

        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        List<Integer> ds = new ArrayList<>();
        helper(0, candidates, target, res, ds);
        return res;

    }

    static void helper(int ind, int[] arr, int target, List < List < Integer >> ans, List < Integer > ds) {
        if (target == 0) {
            ans.add(new ArrayList < > (ds));
            return;
        }

        for (int i = ind; i < arr.length; i++) {
            if (i > ind && arr[i] == arr[i - 1]) continue;
            if (arr[i] > target) break;

            ds.add(arr[i]);
            helper(i + 1, arr, target - arr[i], ans, ds);
            ds.remove(ds.size() - 1);
        }
    }

}
