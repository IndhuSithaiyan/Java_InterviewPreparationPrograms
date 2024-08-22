package com.shortOutputPrograms;

public class Test_03 {

    private static String s = "Welcome";

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb.equals(s));   // false

        /**
         * explanation
         * StringBuilder class doesn't override the equals method.
         */
    }
}
