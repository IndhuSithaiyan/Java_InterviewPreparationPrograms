package com.shortOutputPrograms;

public class Test_04 {

    public static void main(String[] args) {

        double amount = 10.6;
        System.out.println(Math.floor(amount));
        System.out.println(Math.ceil(amount));


        /**
         * explanation
         * In Java, Math.ceil() and Math.floor() are essential tools for rounding floating-point numbers to the nearest integer, each with its unique behavior.
         * Math.ceil() rounds up to the next highest integer, while Math.floor() rounds down to the next lowest integer.
         * Math.round() performs what is known as “round half up” or “round half to even” rounding.

         example-

         double number = 4.6;
         long rounded = Math.round(number);  //5

         double number = 4.4;
         long rounded = Math.round(number);  //4
         */

    }
}
