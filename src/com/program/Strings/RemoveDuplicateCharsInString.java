package com.program.Strings;

import java.util.HashSet;

public class RemoveDuplicateCharsInString {

    public static String removeDuplicate(String s){
        HashSet<Character> hashSet = new HashSet<>();
        StringBuffer stringBuffer = new StringBuffer();
        char chars[] = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            Character c = s.charAt(i);
            if (!hashSet.contains(c)){
                hashSet.add(c);
                stringBuffer.append(c);
            }
        }
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        String s = "java";
        System.out.println(removeDuplicate(s));

    }
}
