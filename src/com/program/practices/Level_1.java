package com.program.practices;

public class Level_1 {

    public static void main(String[] args) {

        /*
        * Length and breadth of a rectangle are 5 and 7 respectively.
        * Write a program to calculate the area and perimeter of the rectangle.
        * */

        int r_length = 5;
        int r_breadth = 7;

        System.out.println("Area of Rectangle = "+ r_length * r_breadth);
        System.out.println("Perimeter of Rectangle = "+ 2*(r_length * r_breadth));

        System.out.println("------------------------------------------");

        /*
        * Write a program to calculate the perimeter of a triangle having sides of length 2,3 and 5 units.
        * */

        System.out.println("Perimeter of a triangle = "+ (2+3+5));

        System.out.println("------------------------------------------");

        /*
        * Write a program to add 8 to the number 2345 and then divide it by 3.
        * Now, the modulus of the quotient is taken with 5 and then multiply the resultant value by 5.
        * Display the final result.
        * */

        System.out.println("final result = "+ (((8+2345)/3)%5)*5);

        System.out.println("------------------------------------------");

        /*
        * Write a program to check if the two numbers 23 and 45 are equal.
        * */

        if (23 == 45){
            System.out.println("the given numbers are equal");
        }
        else System.out.println("both numbers are not equal");

        System.out.println("------------------------------------------");

        /*
        * Write a program to print the power of 7 raised to 5.
        * */
        System.out.println((int) Math.pow(5,7));

        System.out.println("------------------------------------------");


        /*
        * Assign values of variables 'a' and 'b' as 55 and 70 respectively
        * and then check if both the conditions 'a < 50' and 'a < b' are true.
        * */

        int a = 55;
        int b = 70;
        System.out.println((a < 50) && (a < b));

        System.out.println("------------------------------------------");

        /*
        * If the marks of Robert in three subjects are 78,45 and 62 respectively (each out of 100 ),
        * write a program to calculate his total marks and percentage marks
         * */
        int totalMark = 78+45+62;
        System.out.println("total marks = " + totalMark);

        System.out.println("percentage marks = " + (float) (15/100));
        System.out.println("percentage marks = " + (float) ((15/100)*100));

        System.out.println("------------------------------------------");

        /*
        * Write a program to convert Fahrenheit into Celsius.
        * */

//        formula  -  T(oC)   =  ((T(oF)  -  32  ) ×  5)/9
        float fahreheit, celsius;
        fahreheit = 58f;
        celsius = (((fahreheit - 32) * 5)/9);
        System.out.println("Temperature in celsius is: "+celsius);


        /*
        * Write a program to calculate the sum of the first and the second last digit of a 5 digit.
            E.g.- NUMBER : 12345        OUTPUT : 1+4=5
        * */
        int number, first, second, third, forth, fifth, sum;
        number = 85431;
        /*Now we will take out each digit of this number and then finally add the first and the second last digits*/
        first = number/10000;     //first digit
        number = number%10000;

        second = number/1000;     //second digit
        number = number%1000;

        third = number/100;       //third digit
        number = number%100;

        forth = number/10;        //forth digit
        fifth = number%10;        //fifth digit

        sum = first + forth;
        System.out.println("sum : "+sum);


    }
}
