package com.program.Strings;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseAString {

    public static void main(String[] args) {

        String s = "hello";
        char[] chars = s.toCharArray();

        // method 1
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]);
        }

        System.out.println();

        // method 2
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }

        System.out.println();

        // method 3
        StringBuffer str1 = new StringBuffer("hello");
        str1.reverse();
        System.out.println(str1);

        // method 4
        StringBuffer str2 = new StringBuffer("hello");
        str2.reverse();
        System.out.println(str2);

        // method 5
        String rString = reverseString("hello world");
        System.out.println(rString);

        revereAChar();

    }
    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public static void revereAChar() {
        char[] str1 = {'I', 'N', 'D', 'H', 'U'};
        int i = 0;
        int j = str1.length - 1;
        char temp = 0;
        while (j > i) {
            temp = str1[i];
            str1[i] = str1[j];
            str1[j] = temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(str1));
    }

}
