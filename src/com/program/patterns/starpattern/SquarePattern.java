package com.program.patterns.starpattern;

import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {
        /*
         *****
         *****
         *****
         *****
         *****
        This pattern makes a shape of a square or rectangle.
        */

        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        System.out.println("Entered number is : "+size);

//        if size is 5, then i values are 0,1,2,3,4
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
