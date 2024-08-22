package com.shortOutputPrograms;

public class Test_11 {

    public static void main(String[] a) {

        int i = 010;
        System.out.println(i);

        /**
         * explanation
         * Ans is 8 because i store octal number 10 that is prefixed with 0,
         * but jvm provide value in decimal form that's why answer is 8.
         */

        int j = 0X10;
        System.out.println(j);

        /**
         * explanation
         * For Hexadecimal, the 0x or 0X is to be placed in the beginning of a number.
         *         0X10 means 10 of hexadecimal its value is 16.
         */

        int k = 0B10;
        System.out.println(k);

        /**
         * explanation
         * Any number starting with the 0B compiler treats it as a binary number. The binary value of 10 is 2.
         */

        int l = 0xDEAD;
        System.out.println(l);

        /**
         * explanation
         * ans: yes, code compile without any compilation error because l store the hexadecimal literal that is prefixed 0x,
         * in hexadecimal the allowed digit 0 to 9, a to f or (A to F). programmer having the choice to specify value either in decimal, octal and hexadecimal form but JVM always provide the value in only decimal form
         * that's why answer is 57005
         */


    }
}
