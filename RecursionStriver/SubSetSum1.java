package com.dileep.RecursionStriver;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Collections;

public class SubSetSum1 {
    public static void main(String[] args) {

        ArrayList<Integer> res = new ArrayList<>();
//        res.add(5);
        res.add(2);
        res.add(3);
//        System.out.println(res);
        System.out.println(subsetSums(res ,2));

    }

    static ArrayList < Integer > subsetSums(ArrayList < Integer > arr, int N) {

        ArrayList < Integer > sumSubset = new ArrayList < > ();
        subsetSumsHelper(0, 0, arr, N, sumSubset);
        Collections.sort(sumSubset);
        return sumSubset;
    }

    static void subsetSumsHelper(int ind, int sum, ArrayList<Integer> arr, int n, ArrayList<Integer> res) {

            if(ind == n) {
                res.add(sum);
                return;
            }

            subsetSumsHelper(ind+1, sum+arr.get(ind), arr, n, res);
            subsetSumsHelper(ind+1, sum, arr,n, res);




    }

}
