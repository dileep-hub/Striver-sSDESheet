package com.dileep.RecursionStriver;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {


        System.out.println(subsets(new int[] {1,2,3}));
    }

    // using recursion

    public static List<List<Integer>> subsets(int[] nums) {



        List<List<Integer>> res = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();
        helper(nums, sub, res, 0);
        return res;

    }

    public static void helper(int[] nums, List<Integer> sub, List<List<Integer>> res, int index) {

        if(index == nums.length) {
            res.add(new ArrayList<>(sub));
            return;
        }

        helper(nums, sub, res, index+1);
        sub.add(nums[index]);
        helper(nums, sub, res, index+1);
        sub.remove(sub.size()-1);

    }

    // using iteration
    public static List<List<Integer>> subsets2(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();

        for(int i=0; i<(2^nums.length)-1; i++) {
            List<Integer> sub = new ArrayList<>();
            for(int j=0; j<nums.length; j++)  {
                if((i & (1<<j)) != 0) {
                    sub.add(nums[j]);
                }
            }
            res.add(sub);
        }

        return res;


    }



}
