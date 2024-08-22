package com.shortOutputPrograms;

public class Test_06 {

    public static void main(String[] a) {

//        for (int i = 0;  ; i++) {
//            System.out.println(i);
//        }

        /**
         * explanation
         * Infinite loop bcoz we don't know how many iterations are there in the program,
         * so the loop will be executing continuously upto infinity
         */

        for (int i = 0; i<10; ) {
            System.out.println(i);
        }

        /**
         * explanation
         * Infinity zeros bcoz increment operator is not present in the program and i value will never update,
         * so the condition will always be true and the loop never ends
         */

        for ( ; ; ) {
            System.out.println("Hello");
        }

        /**
         * explanation
         * Infinity because not declared any values so it keep on going
         */

    }
}
