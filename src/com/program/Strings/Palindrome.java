package com.program.Strings;

public class Palindrome {

    // approach - 1
    public static boolean isPalindrome(String str){

        String s = str.toLowerCase();
        int left = 0;
        int right = s.length()-1;

        while (left < right){
            if (s.charAt(left) != s.charAt(right)){
                return false;
            }
            right--;
            left++;
        }
        return true;
    }

    // approach - 2
    public static void isPalindrome1(String str){

        String reverse = "";
        for (int i = str.length()-1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        if (reverse.equals(str)){
            System.out.println("given string is palindrome");
        } else
            System.out.println("given string is not a palindrome");
    }

    public static void main(String[] args) {
        String s = "level";

        Boolean isPalindrome = isPalindrome(s);
        if (isPalindrome)
            System.out.println("given string is palindrome :"+ isPalindrome);
        else
            System.out.println("given string is not a palindrome ");

        isPalindrome1(s);
//        System.out.println(1/0);
        System.out.println(-2.0/0);

        try{
            int num = 9/0;
            System.out.println(num);
        }
        catch(ArithmeticException e){
            System.out.println("arithmetic exception caught");
        }
        catch(Exception e){
            System.out.println("exception");
        }

    }
}
