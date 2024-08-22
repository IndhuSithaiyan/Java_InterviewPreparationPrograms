package com.program.problemsolving;

public class  Problem_01 {

    public static void main(String[] args) {
        new Problem_01();
        new Problem_01(count);
        System.out.println(count);

        divide(5,0);
    }

    /**
     * How many Objects will create
     */

    static int count = 0;
    public Problem_01() {
        System.out.println(count);
        while (count < 10)
            new Problem_01(++count);
    }

    Problem_01(int x){
    }


    /**
     * What happens if you put the return statement in the 'try' or 'catch' block? will the 'finally' block execute?
     */

    public static int divide(int a, int b){
        try{
            System.out.println("a/b: " + a/b);
            return a/b;
        } catch (Exception e){
            System.out.println("Exception Caught: " + e.getMessage());
            return -1;  //this will be execute before the finally block
        } finally {
            System.out.println("finally block is executed");
        }
    }


}
