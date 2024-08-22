package com.program.patterns.starpattern;

import java.util.Scanner;

public class DiamondPattern {

    public static void main(String[] args) {

        /*  Diamond star pattern in Java
It is made up of the pyramid and the reverse pyramid pattern.
                                    *
                                   ***
                                  *****
                                 *******
                                *********
                                 *******
                                  *****
                                   ***
                                    *
        */

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        System.out.println("Entered number is : "+size);
        // upside pyramid
        for (int i = 0; i < size; i++) {
            // printing spaces
            for (int j = 0; j < size - i - 1; j++) {
                System.out.print(" ");
            }
            // printing star
            for (int k = 0; k < 2 * i + 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        // downside pyramid
        for (int i = 1; i <= size - 1; i++) {
            // printing spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // printing star
            for (int k = (size - i) * 2 - 1; k > 0; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
