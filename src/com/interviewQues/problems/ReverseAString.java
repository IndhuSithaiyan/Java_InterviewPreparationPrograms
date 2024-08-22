package com.interviewQues.problems;

import java.util.*;
import java.util.stream.Collectors;

public class ReverseAString {

    public static void main(String[] args) {

        String str1 = "hello world";
        reverseString_java_without_collection_java8(str1);
        reverseString_list(str1);
        reverseString_map(str1);
        reverseString_java8_feature(str1);

        String str2 = "Hi hello I love Java programming!!";
        reverseAStringWord(str2);

    }

    private static void reverseAStringWord(String str) {
        List<String> reversedWords = Arrays.asList(str.split(" ")).stream().map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.toList());
        System.out.println(reversedWords);

        List<String> reversedList = new ArrayList<>();
        for (int i = reversedWords.size() - 1; i >= 0; i--) {
            reversedList.add(reversedWords.get(i));
        }
        System.out.println(reversedList);
    }

    public static void reverseString_java_without_collection_java8(String str){
        String s = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            s = s + str.charAt(i);
        }
        System.out.println(s);
    }

    public static void reverseString_list(String str){
        List<Character> charList = new LinkedList<>();
        for (Character s: str.toCharArray()) {
            charList.add(s);
        }
        StringBuilder reversed = new StringBuilder(str.length());
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(charList.get(i));
        }
        System.out.println(reversed.toString());
    }

    public static void reverseString_map(String str){
        Map<Integer, Character> charMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            charMap.put(i, str.charAt(i));
        }
        StringBuilder reversed = new StringBuilder(str.length());
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(charMap.get(i));
        }
        System.out.println(reversed.toString());
    }

    public static void reverseString_java8_feature(String str){
        String s = str.chars()
                .mapToObj(ch -> String.valueOf((char) ch)).reduce((s1, s2) -> s2 + s1).get();
        System.out.println(s);
    }
}
