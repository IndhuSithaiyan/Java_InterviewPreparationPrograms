package com.program.patterns.numberpattern;

import java.util.Scanner;

public class Level_01 {
    public static void main(String[] args) {
        /*
                1
                1 2
                1 2 3
                1 2 3 4
                1 2 3 4 5
                1 2 3 4 5 6
                1 2 3 4 5 6 7
        */

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        System.out.println("Enter the number: "+size);

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        System.out.println("-------------------------");

        /*
                1 2 3 4 5 6 7
                1 2 3 4 5 6
                1 2 3 4 5
                1 2 3 4
                1 2 3
                1 2
                1
        */


        for (int i = 0; i < size; i++) {
            for (int j = 1; j <= size - i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        System.out.println("-----------Other way to achieve--------------");

        for (int i = size; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        System.out.println("----------------------------------");

        /*
                1
                2 2
                3 3 3
                4 4 4 4
                5 5 5 5 5
                6 6 6 6 6 6
                7 7 7 7 7 7 7
        */

        for (int i = 1; i <= size; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }

        System.out.println("--------------------------------------");

        /*
                    7 7 7 7 7 7 7
                    6 6 6 6 6 6
                    5 5 5 5 5
                    4 4 4 4
                    3 3 3
                    2 2
                    1
        */
        for (int i = size; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
