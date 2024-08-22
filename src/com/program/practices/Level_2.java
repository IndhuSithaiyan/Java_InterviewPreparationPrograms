package com.program.practices;

public class Level_2 {

    public static void main(String[] args) {
        //***** EXERCISE 1 ***/
        String input = "I will be a Java developer soon!";
        // Use input String to determine the number of 'a'
        // ============= SAMPLE RUN ================
        // Program Starts:
        // Output:
        // Number of a's: 3

        if (input.contains("a")) {
            for (int i = 0; i < input.length(); i++) {
                char inputChar = input.charAt(i);

                System.out.println(input.charAt(i));
            }
        }
    }
}
