package com.program.patterns.basicprograms;

import java.util.Scanner;

public class Level_01 {

    /**
     *  'Adding Two Numbers'
     *  Write a program to add two integer numbers
     *  Input Format:
     *  First Line contain single integer m
     *  Second line contain single integer n
     *  Output Format:
     *  Print sum of both the integers m and n
     *  Sample Input:
     *  5
     *  10
     *  Sample Output:
     *  15
     */

//    public static int sum(int a, int b){
//        return a+b;
//    }
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the first number:");
//        int x = scanner.nextInt();//reads the input
//
//        System.out.println("Enter the second number:");
//        int y = scanner.nextInt();//reads the input
//
//        int sum = sum(x,y);
//        System.out.println("Sum is " + sum);
//    }

    /**
     * Adding Three Numbers
     * Write a program to add three integer numbers
     * Input Format:
     * First Line contain single integer m
     * Second line contain single integer n
     * Third line contain single integer k
     * Output Format:
     * Print sum of both the integers m, n and k
     * Sample Input:
     * 5
     * 10
     * 5
     * Sample Output:
     * 20
     */

//    public static int sum(int m, int n, int k){
//        return m+n+k;
//    }
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the first number:");
//        int m = scanner.nextInt();//reads the input
//
//        System.out.println("Enter the second number:");
//        int n = scanner.nextInt();//reads the input
//
//        System.out.println("Enter the third number:");
//        int k = scanner.nextInt();//reads the input
//
//        int sum = sum(m,n,k);
//        System.out.println("Sum is " + sum);
//    }

    /**
     * 'Sum of combination of three numbers'
     * Write a program to print all sum combination of three numbers by taking
     * two numbers at a time
     * Input Format:
     * First Line contain single integer m
     * Second line contain single integer n
     * Third line contain single integer k
     * Output Format:
     * Print all sum combination of three numbers
     * Sample Input:
     * 2
     * 4
     * 6
     * Sample Output:
     * 6
     * 8
     * 10
     * Explanation:
     * 2 + 4 = 6
     * 2 + 6 = 8
     * 4 + 6 = 1
     */

//    public static void main(String[] args) {
//
//    }

    /**
     * 'Celcius to Farenheit'
     * Write a program to convert celsius to fahrenheit
     * Formula : fahrenheit= ((celsius*9)/5)+32
     * Input Format:
     * First Line contain single integer m
     * Output Format:
     * Print the value after converting celsius to fahrenheit
     * Sample Input:
     * 12
     * Sample Output:
     * 53.6
     */

//    public static float converter(float celsius){
//        return ((celsius*9)/5)+32;
//    }
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the celsius value:");
//        float m = scanner.nextInt();//reads the input
//
//        System.out.println("fahrenheit :"+converter(m));
//    }

    /**
     * 5. 'Farenheit to Celcius'
     * Write a program to convert fahrenheit to celsius
     * Formula : Celsius = ((Fahrenheit-32)*5)/9;
     * Input Format:
     * First Line contain single integer m
     * Output Format:
     * Print the value after converting fahrenheit to celsius, the result should restrict to 4 decimal places
     * Sample Input:
     * 56
     * Sample Output:
     * 13.0000
     */

//    public static float converter(float fahrenheit){
//        return ((fahrenheit-32)*5)/9;
//    }
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the fahrenheit value:");
//        float m = scanner.nextInt();//reads the input
//
//        System.out.format("celsius : %.4f", converter(m));
//    }

    /**
     * 'Perimeter Of a Square'
     * write a program to find the perimeter of the square
     * Formula: Perimeter = 4 * side
     * Input Format:
     * First line contains an Integer, side of a square
     * Output Format:
     * Gives perimeter of the square
     * Sample Input:
     * 6
     * Sample Output:
     * 24
     */

//    public static int perimeterCalculation(int side){
//        return 4 * side;
//    }
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the number:");
//        int m = scanner.nextInt();//reads the input
//
//        System.out.println("perimeter of square: "+perimeterCalculation(m));
//    }

    /**
     * Circle Area
     * Write a program to find the area of the circle.
     * Formula: area = pi*r*r
     * Consider pi = 3.142
     * Input Format:
     * First line contains an Integer, radius of a circle
     * Output Format:
     * Give the area of the circle.
     * The area of the circle should have four decimal places only.
     * Sample Input:
     * 18
     * Sample Output:
     * 1018.0080
     */

//    public static double areaCalculation(double r){
//        return 3.142*r*r;
//    }
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Radius of a circle:");
//        double m = scanner.nextInt();//reads the input
//
//        System.out.format("area of the circle: %.4f", areaCalculation(m));
//    }

    /**
     * Total Surface Area Of Cylinder
     * Write a program to calculate total surface area of a cylinder
     * Formula: 2 * pi* r*(r+h)
     * Input Format:
     * First line contains an Integer, radius of a cylinder
     * Second line contains an Integer, height of a cylinder
     * Output Format:
     * Give the area of the cylinder.The area of the cylinder should have four decimal places only.
     * Sample Input:
     * 7
     * 13
     * Sample Output:
     * 879.7600
     */

//    public static double areaCalculation(double r, double h){
//        return 2 * 3.142 * r*(r+h);
//    }
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Radius of a cylinder:");
//        double m = scanner.nextInt();//reads the input
//
//        System.out.println("Height of a cylinder:");
//        double n = scanner.nextInt();//reads the input
//
//        System.out.format("total surface area of a cylinder: %.4f", areaCalculation(m,n));
//    }

    /**
     * 'Perimeter Of a Rectangle'
     * write a program to find the perimeter of the rectangle
     * Formula: area = length *width
     * Input Format:
     * First line contains an Integer, length of a rectangle
     * Second line contains an Integer, represents width of a rectangle
     * Output Format:
     * Gives perimeter of the rectangle
     * Sample Input:
     * 2
     * 4
     * Sample Output:
     * 12
     */

//    public static int perimeterCalculation(int length, int width){
//        return length * width;
//    }
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("length of a rectangle:");
//        int m = scanner.nextInt();//reads the input
//
//        System.out.println("represents width of a rectangle:");
//        int n = scanner.nextInt();//reads the input
//
//        System.out.println("perimeter of the rectangle: "+ perimeterCalculation(m,n));
//    }

    /**
     * Convert Dollars to Rupees
     * Write a program to convert Dollars to rupees
     * Input Format:
     * First line contains single integer representing dollar
     * Output Format:
     * Print result after converting dollar to rupees
     * Sample Input:
     * 1000
     * Sample Output:
     * 61060.0
     */

    // 1 dollar = 83.135 rupees

    public static double converter(double dollar){
        return 83.135 * dollar;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter dollar:");
        int m = scanner.nextInt();//reads the input

        System.out.println(m + " dollar = "+ converter(m) + " rupees");
    }

}
