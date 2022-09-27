package com.dileep.RecursionStriver;

public class CountGoodNumbers {
    public static long MOD = 1000000007;
    public static void main(String[] args) {
        System.out.println(countGoodNumbers(50));
//        long MOD = 1000000007;
    }


    // by me
    static public long pow(long x, long y) {
        if(y == 0) return 1;
        long ans = pow(x, y/2);
        if(y%2 == 0) {
            return (ans * ans)%MOD;
        } else {
            return (x * pow(x, y-1))%MOD;
        }
    }
    static public long modPow(long x, long y)
    {
        if (y == 0)
            return 1;
        long p = modPow(x, y / 2);
        return p * p * (y % 2 > 0 ? x : 1) % 1000000007;
    }

    public static int countGoodNumbers(long n) {

        long ans = 0;
        long even =0;
        long odd = 0;

        if(n%2 == 0) {
            even = n/2;
            odd = n/2;
        } else {
            even = (n/2)+1;
            odd = n/2;
        }

        System.out.println(even + " " + odd);
//        System.out.println(Math.pow(5,  even));
        ans =   pow(5, even)%1000000007 * pow(4, odd)%1000000007;
        return (int)ans;


    }

}
