package com.shortOutputPrograms;

public class Test_12 {

    public static void main(String[] a) {

       int x = 0, y = 10;
       do {
           y--;
           x++;
       } while (x < 5);
       System.out.println(x+", "+y);

        /**
         * explanation
         * Answer is: 5, 5
         * Because initially x=0 and y=10
         * In do statement y--  and ++x then check condition check
         * 1st step - in do y= 9 , x=1
         *       Check condition (1<5) ist true
         *       Ans- 1,9
         * 2nd step- x= 1, y=9....in do y=8, x= 2
         *     Check condition in while(2<5) true
         *     Ans- 2, 8
         * 3rd step- x=2, y=8...in do y=7, x=3
         *     Check condition in while (3<5) true
         *      Ans- 3, 7
         * 4rth step- x=3, y=7...in do y=6, x= 4
         *      Check condition in while (4<5)
         *      Ans- 4, 6
         * 5th step - x=4, y=6...in do y=5, x=5
         *    Check condition in while (5<5) false
         *    It's come out and print statement
         *   Ans- 5,5
         */

    }
}
