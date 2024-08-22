package com.program.patterns.numberpattern;

import java.util.Scanner;

public class Level_08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        for (int row = 1; row <= size; row++) {

            for (int space = 0; space < size-row; space++) {
                System.out.print("  ");
            }

            for (int col = row; col >= 1; col--) {
                System.out.print(col+ " ");
            }

            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }

            System.out.println();
            
        }
    }
}
