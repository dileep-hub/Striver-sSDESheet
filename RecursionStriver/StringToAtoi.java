package com.dileep.RecursionStriver;

public class StringToAtoi {
    public static void main(String[] args) {

        System.out.println(myAtoi("353"));

//        String ss = "  ";
//        System.out.println(ss.length());
    }

    public static int myAtoi(String str) {

        str = str.trim();
        String finans = "";

        int MAX = Integer.MAX_VALUE;
        int MIN = Integer.MIN_VALUE;

//        System.out.println(MAX);

        boolean isPos = true;

        for(int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            if(finans.length() != 0 && !Character.isDigit(c)) {
                break;
            }


            if(Character.isDigit(c)) {
                if(finans.length() == 0 && i!=0) {
                    if(str.charAt(i-1) == '-') {
                        isPos=false;
                        String add = "" + str.charAt(i);
                        finans = finans + add;
                    };
                }  else {
                    String add = "" + str.charAt(i);
                    finans = finans + add;
                }
            }
        }

//        System.out.println(finans);

        if(finans.length() == 0) return 0;

        long lans = Long.parseLong(finans);
        if(isPos && lans > MAX) return MAX;
        if(!isPos && -1*lans < MIN) return MIN;



//        if(Integer.parseInt())

        int fans = Integer.parseInt(finans);
        if(isPos) {
            return fans;
        } else return -fans;
//    return -1;


    }

}
