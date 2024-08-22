package com.shortOutputPrograms;

public class Test_21 {

    public static void method(Object x){
        System.out.println("Object method");
    }

    public static void method(String x){
        System.out.println("String method");
    }

    public static void main(String[] a) {
        method(null);

       /**
         * explanation
         * answer is "String method".
         * Null is not an object in Java. Java compiler prefer the method which has more specific parameters.
         * String is object of the class java.lang.String. Hence, String is more specific than Object class.
         * Therefore, null is matched as a string object.
         */

    }
}
