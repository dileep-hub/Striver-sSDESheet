package com.dileep.RecursionStriver;

import java.util.Stack;

public class SortAStack {
    public static void main(String[] args) {

        Stack<Integer> st=  new Stack<>();
        st.add(11);
        st.add(2);
        st.add(32);
        st.add(3);
        st.add(41);

        System.out.println(st);

        System.out.println(sort(st));

    }

    public static Stack<Integer> sort(Stack<Integer> s)
    {
        Stack<Integer> check = new Stack<>();
        Stack<Integer> ans = new Stack<>();
        while(!s.isEmpty()) {
            if(ans.isEmpty()) ans.add(s.pop());
            else {
                if(ans.peek() < s.peek()) {
                    ans.add(s.pop());
                } else {
                    while(!ans.isEmpty() && ans.peek() > s.peek()) {
                        check.add(ans.pop());
                    } ans.add(s.pop());
                    while(!check.isEmpty()) {
                        ans.add(check.pop());
                    }
                }
            }
        }
        System.out.println(ans);
        System.out.println(s);
        return ans;
    }

}
