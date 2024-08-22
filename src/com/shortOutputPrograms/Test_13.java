package com.shortOutputPrograms;

public class Test_13 {

    public static void main(String[] a) {

        // why Hello is printing only one time?

        for (int i = 0; i < 10; i++); {
            System.out.println("Hello");
        }
        /**
         * explanation
         * after for() semicolon is there. Like for();
         */

        boolean flag = false;
        if (flag);{
            System.out.println("Hello");
        }
        /**
         * explanation
         * The semicolon is terminating the if statement and System.out.println code is written in another block.
         */

        boolean flag1 = true;
        boolean flag2 = false;

        if (flag1 ^ flag2){     //XOR operator
            System.out.println("In If");
        } else {
            System.out.println("In else");
        }

        /**
         * explanation
         * System.out.println(true ^ true); // false
         * System.out.println(true ^ false); // true
         * System.out.println(false ^ false); // false
         * System.out.println(false ^ true); // true
         */

    }
}
