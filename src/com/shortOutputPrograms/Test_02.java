package com.shortOutputPrograms;

public class Test_02 {

    public static void main(String[] args) {
        int i = 0;
        int j = i;
        j = i++ +j;

        System.out.println(i + "-" + j);    //  i value has been incremented

        /**
         * explanation
         * 1-o is the write answer because i value is increase after i and j get add  so that j=i++ +j  the j=0 and i become1.
         */
    }
}
