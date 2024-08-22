package com.program.Strings;

import java.util.HashMap;

public class FindSecondNonRepeatingCharacter {

    public static int findSecondNonRepeatingCharacter(String str){

        HashMap<Character, Integer> charCount = new HashMap<>();
        String s = str.toLowerCase();
        char[] ch = s.toCharArray();

        // Count occurrences of each character
        for (char c: ch) {
            charCount.put(c, charCount.getOrDefault(c,0)+1);
        }

        System.out.println("charCount--> "+charCount);

        // find the index of the second non-repeating character
        int firstNonRepeatingIndex = -1;
        int secondNonRepeatingIndex = -1;
        for (int i=0; i < s.length(); i++){
            char c = s.charAt(i);
            if(charCount.get(c)==1){
//                if(firstNonRepeatingIndex != -1){
//                    System.out.println("second non-repeating character: "+ c);
//                    return i;
//                }else {
//                    firstNonRepeatingIndex = i;
//                }
                //to get third non repeating char
                if (firstNonRepeatingIndex == -1){
                    firstNonRepeatingIndex = i;
                } else if(secondNonRepeatingIndex == -1){
                    secondNonRepeatingIndex = i;
                } else
                    return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String input = "Alphabet";
        int index = findSecondNonRepeatingCharacter(input);
        if (index != -1){
            System.out.println("index of the second non-repeating character: "+ index);
        } else {
            System.out.println("second non-repeating character doesn't exist");
        }
        reverseAString(input);
    }


    public static void reverseAString(String str){

//        char[] ch = str.toCharArray();
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            System.out.print(ch);
        }
    }

}
