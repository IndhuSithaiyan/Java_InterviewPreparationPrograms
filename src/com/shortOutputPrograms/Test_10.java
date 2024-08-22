package com.shortOutputPrograms;

public class Test_10 {

    public static void main(String[] a) {
        double i = 10;
        i=i/0;
        System.out.println(i);  //Infinity

        double num = 9/0;   // ArithmeticException - direct assign
        System.out.println(num);
        /**
         * explanation
         * Positive Infinity
         */

    }
}
