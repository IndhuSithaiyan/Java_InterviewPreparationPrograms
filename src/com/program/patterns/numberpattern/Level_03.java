package com.program.patterns.numberpattern;

import java.util.Scanner;

public class Level_03 {
    public static void main(String[] args) {
        /*
                        1
                        1 2
                        1 2 3
                        1 2 3 4
                        1 2 3 4 5
                        1 2 3 4 5 6
                        1 2 3 4 5 6 7
                        1 2 3 4 5 6
                        1 2 3 4 5
                        1 2 3 4
                        1 2 3
                        1 2
                        1
        */
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
//        for (int i = 1; i <= size; i++) {
//            for (int k = 1; k <= size - i ; k++) {
//                System.out.print(k + " ");
//            }
//            System.out.println();
//        }

        for (int i = size-1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }


        System.out.println("----------------------------------------------");

        /*
                1 2 3 4 5 6 7
                1 2 3 4 5 6
                1 2 3 4 5
                1 2 3 4
                1 2 3
                1 2
                1
                1 2
                1 2 3
                1 2 3 4
                1 2 3 4 5
                1 2 3 4 5 6
                1 2 3 4 5 6 7
        */

        for (int i = 0; i < size; i++) {
            for (int j = 1; j <= size - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for (int i = 2; i <= size ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
