package com.dileep.day16;

import java.util.HashMap;
import java.util.Locale;
import java.util.Stack;

public class test {
    public static void main(String[] args) {

        int[] arr = {4, 8, 5, 2, 25};

        Stack<Integer> st = new Stack<>();

        HashMap<Integer , Integer> map = new HashMap<>();

        st.add(arr[0]);

        for(int i=1; i<arr.length; i++) {
            while(!st.isEmpty() && st.peek() > arr[i] ) {
                map.put(st.pop(), arr[i]);
            }
            st.add(arr[i]);
        }

        while(!st.isEmpty()) {
            map.put(st.pop(), -1);
        }

        for(int ele : arr) {
            System.out.println(ele + " -->" + map.get(ele));
        }

    }
}
