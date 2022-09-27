package com.dileep.RecursionStriver;

import java.util.ArrayList;
import java.util.List;

public class LetterCombOfPhoneNumbers {
    public static void main(String[] args) {

        System.out.println(letterCombinations(""));


    }

    public static List<String> letterCombinations(String digits) {

        List<String> res = new ArrayList<>();
        if(digits.length() == 0) {
            return new ArrayList<>();
        }
        int num = Integer.parseInt(digits);
        String sub = "";
        String[] strs = new String[] {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        helper(num, sub, res, strs);
        return res;
    }
    public static void helper(int num, String sub, List<String> res, String[] strs) {
        if(num == 0) {
            res.add(sub);
            return;
        }
        int k = num%10;
        String s = strs[k];
        for(int i=0; i<s.length(); i++) {
            helper(num/10, s.charAt(i)+sub, res, strs);
        }

    }

}
