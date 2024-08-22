package com.program.patterns.starpattern;

import java.util.Scanner;

public class TrianglePattern {

    public static void main(String[] args) {
        /*  Left triangle star pattern in Java
The left triangle has a shape of a triangle with its perpendicular line at the left side.

                *
                **
                ***
                ****
                *****
        */

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        System.out.println("Entered number is : "+size);

        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("-----------------------------------");

        /* Right triangle pattern program in Java
The right triangle star pattern is also the same as the left triangle star pattern
but it has a shape of a triangle with its perpendicular line at the right side.
                        *
                       **
                      ***
                     ****
                    *****
        */

        for (int i = 0; i < size; i++) {
            // print spaces
            for (int j = 1; j < size - i; j++) {
                System.out.print(" ");
            }
            // print stars
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("-----------------------------------");

        /*  Left Down Triangle
You can see Left down triangle below.
                *****
                ****
                ***
                **
                *
        */

        for (int i = 0; i < size; i++) {
            for (int j = 1; j <= size-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

//        for (int i = size; i >= 1; i--) {
//            for (int j = i; j >= 1; j--) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//        for (int row = 1; row <= size ; row++) {
//            for (int col = size; col >= row; col--) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


        System.out.println("-----------------------------------");

        /* Right Down Triangle
You can see Right down triangle below.
                *****
                 ****
                  ***
                   **
                    *
        */

        for (int i = 0; i < size; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < size-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

//        for (int i = 0; i < size; i++) {
//            for (int j = 0; j < i ; j++) {
//                System.out.print(" ");
//            }
//            for (int j = size - i; j > 0; j--) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
    }
}
