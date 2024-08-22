package com.shortOutputPrograms;

public class Test_19 {

    public static void main(String[] a) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = sb1;
        sb1.append("Hello");
        sb1.append(" World");
        System.out.println(sb1 == sb2);

       /**
         * explanation
         * True
         * both sb1 and sb2 are pointing to the same object
         * sb1 and sb2 have the same reference. The  == operator will compare the reference not the value. So the correct answer is true.
         */

    }
}
