package com.interviewQues.problems;

public class SwapTwoVariables {

    public static void main(String[] args) {

        int x = 50;
        int y = 30;
        swap_int_value_without_using_third_variable(x, y);

        char ch1 = 'A';
        char ch2 = 'B';
        swap_Char_value_without_using_third_variable(ch1, ch2);

        String str1 = "hello";
        String str2 = "worldjava";
        swap_string_value_without_using_third_variable(str1, str2);

    }

    private static void swap_int_value_without_using_third_variable(int x, int y) {
        System.out.println("After swapping x: "+ x + " y: "+ y);
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After swapping x: "+ x + " y: "+ y);
    }

    private static void swap_Char_value_without_using_third_variable(char x, char y) {
        System.out.println("After swapping x: "+ x + " y: "+ y);
        x = (char) (x + y);
        y = (char) (x - y);
        x = (char) (x - y);
        System.out.println("After swapping x: "+ x + " y: "+ y);
    }

    private static void swap_string_value_without_using_third_variable(String str1, String str2) {

//        String s = "I am from Chennai";
//        System.out.println(s.length());
//        System.out.println(s.substring(14, 17));  //exclude 17th index

        System.out.println("After swapping str1: "+ str1 + " str2: "+ str2);
        str1 = str1 + str2;
        str2 = str1.substring(0,str1.length() - str2.length());
        str1 = str1.substring(str2.length());
        System.out.println("After swapping str1: "+ str1 + " str2: "+ str2);
    }
}
