package com.shortOutputPrograms;

public class Test_28 {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Indhu");
        StringBuffer sb1 = new StringBuffer("Indhu");

        String s = new String("indhu");
        String s0 = "indhu";
        String s1 = new String("indhu");

        String s2 = s.intern();
        String s3 = s0.intern();

        System.out.println(s == s1);

        System.out.println(s0.equals(s3));
        System.out.println(s0==s3);

        System.out.println(s.equals(s1));
        System.out.println(s == s1.intern());

        System.out.println(sb.equals(sb1));
        System.out.println(sb == sb1);

        String str = null;
        System.out.println(str.valueOf(10));

    }
}
