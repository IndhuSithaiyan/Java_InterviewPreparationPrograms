package com.shortOutputPrograms;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class Test_14 {

    public static void main(String[] a) {

       String str = "TrUE";
       Boolean flag = Boolean.valueOf(str);
       System.out.println(flag);

       /**
         * explanation
         * String is true
         */

        String str1 = "Truee";
        Boolean flag1 = Boolean.valueOf(str1);
        System.out.println(flag1);

        /**
         * explanation
         * It is false. Other than true any string compiler treats as false.
         */





    }
}
