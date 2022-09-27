package com.dileep.RecursionStriver;

import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();
        s.push(3);
        s.push(2);
        s.push(1);
        s.push(7);
        s.push(6);
        System.out.println(s);
        reverse(s);
        System.out.println(s);

    }

    public static void reverse(Stack<Integer> s)
    {
        if(s.isEmpty()) return;
        int temp = s.pop();
        reverse(s);
        insertBottom(temp, s);
    }

    public static void insertBottom(int temp, Stack<Integer> s) {
        if(s.isEmpty()) {
            s.push(temp);
            return;
        }

        int temp2 = s.pop();
        insertBottom(temp, s);
        s.push(temp2);


    }

}
