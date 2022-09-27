package com.dileep.RecursionStriver;

import com.sun.org.apache.bcel.internal.generic.ARETURN;

public class Powxn {
    public static void main(String[] args) {

        System.out.println(myPow(2.1000, 3));

    }

    public static double myPow(double x, int n) {

        double ans = 1.0;
        int m = n;
        if(n < 0) {
            m = m*-1;
        }

        while(m != 0) {
            if(m%2 == 0) {
                m = m/2;
                x = x*x;
            } else{
                ans = ans*x;
                m = m-1;
            }
        }

        if(n < 0) {
            return 1/ans;
        } else  return ans;

    }

}

