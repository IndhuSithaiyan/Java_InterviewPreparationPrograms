package com.program.Strings;

import java.util.Arrays;
import java.util.Comparator;

public class ReverseWordInString {

    public static void main(String[] args) {
        String s = "welcome to Java world";

//        String name =null;
//        if (name.equals("null")){
//            System.out.println("true");
//        }

        String[] sp = s.split(" ");

        for (int i = sp.length - 1; i >= 0; i--) {
            System.out.println(sp[i]);
        }

        String str = "welcome to Java world";

        String[] strArr = Arrays.stream(str.split(" ")).sorted(Comparator.reverseOrder()).toArray(String[]::new);
        System.out.println(Arrays.toString(strArr));
    }
}
