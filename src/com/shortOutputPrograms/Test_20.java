package com.shortOutputPrograms;

public class Test_20 {

    public static int getNumber(int x){
        try{
            return 100/x;
        }
        finally {
            return 100;
        }

    }
    public static void main(String[] a) {
        System.out.println(getNumber(0));

       /**
         * explanation
         * becoz a function can return only one return statement. finally must run whatever the program o/p is that's why ans is 100
         * This program would return value 100 since the value returned by try has been overridden by finally.
         */

    }
}
