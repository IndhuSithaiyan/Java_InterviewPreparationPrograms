package com.shortOutputPrograms;

public class Test_15 {

    public static void main(String[] a) {

        String s1 = "helo";
        String s2 = new String(s1);
        System.out.println(s1 == s2);

        boolean res = (s1 == s2.intern());
        System.out.println(res);

       /**
         * explanation
         * The method intern() creates an exact copy of a String object in the heap memory and stores it in the String constant pool.
         * Note that, if another String with the same contents exists in the String constant pool,
         * then a new object won't be created and the new reference will point to the other String.
         */

    }
}
