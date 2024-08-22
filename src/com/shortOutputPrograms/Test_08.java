package com.shortOutputPrograms;

public class Test_08 {

    public static void main(String[] a) {
        int i = 0;
        i = i++ + 10;
        System.out.println(i);

        /**
         * explanation
         * i = i++ + 10;
         * i++ = 0 (bcoz of post increment)
         * Now i = 0+10 = 10
         * And i will be NOT post incremented bcoz the result of entire expression (i++ + 10) is already assigned to the value of i,
         * so the original value of i is 10 and in the next statement, we have to print it.
         */

    }
}
