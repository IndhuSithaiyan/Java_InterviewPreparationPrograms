package com.shortOutputPrograms;

import java.util.Arrays;

public class Test_24 {

    public static void main(String[] a) {

        System.out.println(100+100+"abc");  //200abc
        System.out.println("def"+100+100);  //def100100

        /**
         * explanation
         * concatenation - after string
         */

        // convert this string into array
        String str = "India, USA, Australia";
//        String[] s = str.split(", ");
        String[] s = str.split(",//s");
        System.out.println(Arrays.toString(s));


    }
}
