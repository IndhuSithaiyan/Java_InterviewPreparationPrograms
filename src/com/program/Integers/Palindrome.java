package com.program.Integers;

public class Palindrome {

    // approach - 1
    public static boolean isPalindrome(int num){

//        String numString = String.valueOf(num);
        String numString = Integer.toString(num);

        int left = 0;
        int right = numString.length()-1;

        while (left < right){
            if (numString.charAt(left) != numString.charAt(right)){
                return false;
            }
            right--;
            left++;
        }
        return true;
    }

    public static void main(String[] args) {
        int num = 1234321;

//        String name = new String("indu");
//        name = new String("ram");
//        String name1 = new String("indu");
//        String name2 = "indu";
//
//        System.out.println(name.hashCode());
//        System.out.println(name1.hashCode());
//        System.out.println(name2.hashCode());
//
//        System.out.println(name == name1);
//        System.out.println(name.equals(name1));

        Boolean isPalindrome = isPalindrome(num);
        if (isPalindrome)
            System.out.println(num+" is palindrome ");
        else
            System.out.println(num+" is not a palindrome ");

    }
}
