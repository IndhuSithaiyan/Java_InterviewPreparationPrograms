package com.program.Strings;

import java.util.*;

public class CountVowelsAndConsonantsInAString {

    // using Streams
    public static void byUsingStreams(String str){
        str = str.toLowerCase();
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');

        long vowelsCount = str.chars()
                .filter(c -> vowels.contains((char) c))
                .count();

        long consonantsCount = str.chars()
                .filter(c -> Character.isLetter(c) && !vowels.contains((char) c))
                .count();

        System.out.println("Number of vowels: "+vowelsCount);
        System.out.println("Number of consonants: "+consonantsCount);
    }

    // using Set
    public static void byUsingSet(String str){
        str = str.toLowerCase();
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        int vowelsCount = 0;
        int consonantCount = 0;

        for (char ch: str.toCharArray()) {
            if (Character.isLetter(ch)){
                if (vowels.contains(ch)){
                    vowelsCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        System.out.println("Number of vowels: "+vowelsCount);
        System.out.println("Number of consonants: "+consonantCount);

    }

    // without using collection or java 8 feature
    public static void countOfVowelsConsonants(String str){
        str = str.toLowerCase();

        String vowels = "aeiou";

        int vowelsCount = 0;
        int consonantCount = 0;

        for (char ch: str.toCharArray()) {
            if (Character.isLetter(ch)){
                if (vowels.indexOf(ch) != -1){
                    vowelsCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        System.out.println("Number of vowels: "+vowelsCount);
        System.out.println("Number of consonants: "+consonantCount);

    }

    public static void main(String[] args) {
        String s = "Hello World";
        byUsingStreams(s);
        System.out.println("------------------");
        byUsingSet(s);
        System.out.println("------------------");
        countOfVowelsConsonants(s);
    }

}
