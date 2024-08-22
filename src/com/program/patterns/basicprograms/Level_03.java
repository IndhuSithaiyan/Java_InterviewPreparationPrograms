package com.program.patterns.basicprograms;

public class Level_03 {

    /**
     * 'ASCII Value of Character'
     * Write a program to print the ASCII value of a character.
     * Input Format:
     * First line contains single character c
     * Output Format:
     * Print ASCII value of character.
     * Sample Input:
     * A
     * Sample Output:
     * 65
     */

//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the character:");
//        char x = scanner.next().charAt(0);
//
//        if (Character.isLetter(x)){
//            System.out.println((int) x);
//        }
//        else {
//            System.out.println("please enter valid character...!");
//        }
//    }

    /**
     * Equivalent ASCII Character
     * Write a program to print the equivalent ASCII character.
     * Input Format:
     * First line contains single integer n
     * Output Format:
     * Print equivalent ASCII character.
     * Sample Input:
     * 98
     * Sample Output:
     * b
     */

//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        int x = scanner.nextInt();
//
//        if (!Character.isLetter(x)){
//            System.out.println("please enter the number <255 ...!");
//        }
//        else {
//            System.out.println((char) x);
//        }
//    }

    /**
     * 'Lowercase ASCII value or not'
     * Check if a given number is the ASCII value of lowercase alphabet or not.
     * Input Format:
     * First line contains a single integer n.
     * Output Format:
     * Print Yes if number is ASCII value of lowercase else No
     * Sample Input:
     * 100
     * Sample Output:
     * Yes
     */

//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        int x = scanner.nextInt();
//
//        if ((x>=97) && (x<=122)){
//            System.out.println((char) x);
//        }
//        else {
//            System.out.println("please enter ASCII value of lowercase alphabet only!");
//        }
//    }

    /**
     * Uppercase ASCII value or not
     * Check if a given number is the ASCII value of uppercase alphabet or not.
     * Input Format:
     * First line contains a single integer n.
     * Output Format:
     * Print Yes if number is ASCII value of uppercase else No
     * Sample Input:
     * 78
     * Sample Output:
     * Yes
     */

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int x = scanner.nextInt();
//
//        if ((x>=65) && (x<=90)){
//            System.out.println((char) x);
//        }
//        else {
//            System.out.println("please enter ASCII value of uppercase alphabet only!");
//        }
//
////        char x = scanner.next().charAt(0);
////        if ((x>='A') && (x<='Z')){
////            System.out.println("ASCII value of "+x+" is "+ (int) x);
////        }
////        else {
////            System.out.println("please enter ASCII value of uppercase alphabet only!");
////        }
//
////        int x = scanner.nextInt();
////        if (Character.isUpperCase(x)){
////            System.out.println((char) x);
////        }
////        else {
////            System.out.println("please enter ASCII value of uppercase alphabet only!");
////        }
//}


        /**
         * Number ASCII value or not
         * Check if a given number is the ASCII value of the numeric character or not.
         * Input Format:
         * First line contains a single integer n.
         * Output Format:
         * Print Yes if number is ASCII value of number else No
         * Sample Input:
         * 50
         * Sample Output:
         * Yes
         */

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int x = scanner.nextInt();
//
//        if ((x >= 48) && (x <= 57)) {
//            System.out.println("yes");
//        } else {
//            System.out.println("Number is not a ASCII value of numeric character!");
//        }
//    }

    /**
     * Game of multiplication and addition
     * Write a program to check the given 2 integer input is even if yes then find
    product of 2 numbers else find the sum of 2 numbers.
     * Input Format:
     * First line contains the first integer n.
     * Second line contains a second integer m.
     * Output Format:
     * Print product of 2 numbers if both numbers are even else sum
     * Sample Input:
     * 10
     * 20
     * Sample Output:
     * 200
     *
     * Sample Input:
     * 10
     * 15
     * Sample Output:
     * 25
     */

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the first number:");
//        int x = scanner.nextInt();
//
//        System.out.println("Enter the second number:");
//        int y = scanner.nextInt();//reads the input
//
//        if ((x%2 == 0) && (y%2 == 0)) {
//            System.out.println("x & y are even numbers");
//            System.out.println(x * y);
//        } else {
//            System.out.println("x & y are not even numbers");
//            System.out.println(x + y);
//        }
//    }

    /**
     * 'Positive or Negative Number'
     * Check if a given number is greater than 0, if yes then print positive or if the given number is lesser than 0, then print negative. If the given number
     is exactly equal to 0, then print zero.
     * Input Format:
     * First line contains a single integer n.
     * Output Format:
     * Print positive if n>0, else negative if n<0, else zero if n = 0.
     * Sample Input:
     * 30
     * Sample Output:
     * Positive
     * Sample Input:
     * -25
     * Sample Output:
     * Negative
     * Sample Input:
     * 0
     * Sample Output:
     * Zero
     */

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the number:");
//        int x = scanner.nextInt();
//
//        if (x > 0) {
//            System.out.println("Positive Number");
//        } else if (x < 0){
//            System.out.println("Negative Number");
//        } else if (x == 0){
//            System.out.println("Zero");
//        }
//    }

    /**
     * Absolute value
     * Write a program to find the absolute value of a given integer.
     * Input Format:
     * First line contains a single integer n.
     * Output Format:
     * Print absolute value of integer.
     * Sample Input:
     * -5
     * Sample Output:
     * 5
     * Sample Input:
     * 12
     * Sample Output:
     * 12
     */

    static void absoluteVal(int number){
        if (number < 0){
            number = (-1) * number;
        }
        System.out.println(number);
//        System.out.printf("%d", number);
    }

    static int absoluteValWithMath(int number){
        return Math.abs(number);
    }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the number:");
//        int x = scanner.nextInt();
//        absoluteVal(x);
//        System.out.println(absoluteValWithMath(x));
//    }

    /**
     * Largest Number
     * Write a program to print the largest number among 2 integer numbers
     * Input Format:
     * First line contains the first integer n.
     * Second line contains a second integer m.
     * Output Format:
     * Print largest number of 2 numbers
     * Sample Input:
     * 10
     * 30
     * Sample Output:
     * 30
     */

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the first number:");
//        int x = scanner.nextInt();
//
//        System.out.println("Enter the second number:");
//        int y = scanner.nextInt();//reads the input
//
//        if (x > y) {
//            System.out.println(x);
//        } else {
//            System.out.println(y);
//        }
//    }

    /**
     * Smallest Number
     * Write a program to find the smallest number among 2 integer numbers
     * Input Format:
     * First line contains the first integer n.
     * Second line contains a second integer m.
     * Output Format:
     * Print smallest number of 2 numbers
     * Sample Input:
     * 10
     * 30
     * Sample Output:
     * 10
     */

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the first number:");
//        int x = scanner.nextInt();
//
//        System.out.println("Enter the second number:");
//        int y = scanner.nextInt();//reads the input
//
//        if (x < y) {
//            System.out.println(x);
//        } else {
//            System.out.println(y);
//        }
//    }

    /**
     * Largest Number
     * Write a program to find the largest number among 3 integer numbers
     * Input Format:
     * First line contains space separated three integer input n,m,l.
     * Output Format:
     * Print largest number of 3 numbers
     * Sample Input:
     * 10 25 30
     * Sample Output:
     * 25
     */

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the three integers:");
//        int x = scanner.nextInt();
//        int y = scanner.nextInt();
//        int z = scanner.nextInt();
//
//        if ((x > y) && (x > z)) {
//            System.out.println(x);
//        } else if ((y > x) && (y > z)){
//            System.out.println(y);
//        } else {
//            System.out.println(z);
//        }
//    }

    /**
     * Smallest Number
     * Write a program to find the smallest number among 3 integer numbers
     * Input Format:
     * First line contains space separated three integer input n,m,l.
     * Output Format:
     * Print smallest number of 3 numbers
     * Sample Input:
     * 10 25 5
     * Sample Output:
     * 5
     */

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the three integers:");
//        int x = scanner.nextInt();
//        int y = scanner.nextInt();
//        int z = scanner.nextInt();
//
////        if ((x < y) && (x < z)) {
////            System.out.println(x);
////        } else if ((y < x) && (y < z)){
////            System.out.println(y);
////        } else {
////            System.out.println(z);
////        }
//
//        int temp;
//        int smallest;
//        //comparing a and b and storing the smallest number in a temp variable
//        temp=x<y?x:y;
//        //comparing the temp variable with c and storing the result in the variable names smallest
//        smallest=z<temp?z:temp;
//        System.out.println("The smallest number is: "+smallest);
//    }
}
