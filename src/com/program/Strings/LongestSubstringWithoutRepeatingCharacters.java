package com.program.Strings;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {

/*
* Write a Java program to find the length of the longest substring without repeating characters
*/

    // using Map
    public static void longestSubstring_approach_01(String str){
        String longestSubstring = null;
        int longestSubstringLength = 0;

        Map<Character, Integer> map = new LinkedHashMap<>();       //linkedHashMap is maintain the insertion order

//        char ch[] = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!map.containsKey(c)){
                map.put(c, i);
            } else {
                i = map.get(c);
                map.clear();
            }

        if (map.size() > longestSubstringLength){
            longestSubstringLength = map.size();
            longestSubstring = map.keySet().toString();
        }
        }

        System.out.println("The Longest substring : "+ longestSubstring);
        System.out.println("The Longest substring length: "+ longestSubstringLength);
    }

    // using Set
    public static String longestSubstring_approach_02(String str){
        HashSet<Character> set = new HashSet<>();
        String longestOverall = "";
        String longestTillNow = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(set.contains(c)){
                longestTillNow = "";
                set.clear();
            }
            set.add(c);
            longestTillNow += c;

            if (longestTillNow.length() > longestOverall.length()){
                longestOverall = longestTillNow;
            }
        }
        System.out.println(longestOverall);
        return longestOverall;
    }

    public static void main(String[] args) {

        String str = "abcabcab";
        longestSubstring_approach_01(str);
        longestSubstring_approach_02(str);
    }
}
