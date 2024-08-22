package com.program.patterns.starpattern;

import java.util.Scanner;

public class HollowPattern {

    public static void main(String[] args) {
        /*  Hollow Square pattern
The hollow square is the same as the above pattern but stars only at the borders.
Which makes it a hollow square.

                *****
                *   *
                *   *
                *   *
                *****
        */

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        System.out.println("Entered number is : "+size);

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                // print only star in first and last row
                if (i==0 || i==size-1){
                    System.out.print("*");
                } else {        // print star only at first and last position row
                    if (j == 0 || j==size-1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }

        System.out.println("------------------------------------------");
        
                /* Hollow triangle star pattern in Java
The hollow triangle star pattern is a simple triangle pattern with stars only at its boundary making it hollow.
                    *
                    **
                    * *
                    *  *
                    *   *
                    ******
                */

        for (int i = 1; i <= size; i++) {
            for (int j = 0; j < i; j++) {
                // not last row
                if (i!=size) {
                    if (j == 0 || j == i - 1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                else {      // last row
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        System.out.println("------------------------------------------");

        /*  Hollow pyramid pattern program in Java
The hollow pyramid is a hollow pyramid with stars only at corners.
                        *
                       * *
                      *   *
                     *     *
                    *********
        */

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++){            //BODMADS
                if (i == 0 || i == size - 1) {
                    System.out.print("*");
                }
                else {
                    if (k == 0 || k == 2 * i) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
