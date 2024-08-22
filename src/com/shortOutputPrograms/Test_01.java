package com.shortOutputPrograms;

public class Test_01 {

    public static void main(String[] args) {
        Integer a = 128, b = 128;
        System.out.println(a==b);   //false -

        Integer c = 100, d = 100;
        System.out.println(c==d);   //true

        /**
 false - the function valueOf() in Integer, the range is -128(IntegerCache.low) to 127(IntegerCache.high) so
number outside this range will not give expected result, Therefore the objects will value 100 equates to be equal.
         */
    }
}
