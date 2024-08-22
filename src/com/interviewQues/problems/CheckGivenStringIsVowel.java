package com.interviewQues.problems;

public class CheckGivenStringIsVowel {

    public static void main(String[] args) {

        String s = "Hello world";
        givenStringIsVowel(s);

    }

    public static void givenStringIsVowel(String str){
        String vowels = "aeiou";
        String vowelLetters = "";
        int vowelCount = 0;

        for (char ch: str.toLowerCase().toCharArray()) {
            if (Character.isLetter(ch)){
                if (vowels.indexOf(ch) != -1){
                    vowelLetters = vowelLetters + ch;
                    vowelCount++;
                }
            }
        }
        System.out.println("vowel letter :"+ vowelLetters + " count : "+ vowelCount);

    }
}
