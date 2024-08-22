package com.shortOutputPrograms;

public class Test_07 {

    public static void main(String[] a) {

        for (int i = 0; i < 10; i++) {
            System.out.println("Helo");
            i = i * i;
        }

        /**
         * explanation
         * First loop I=0 prints hello I=0×0=0
         * Second loop I=1 prints hello I=1×1=1
         * Third loop I=2 prints hello I=2×2=4
         * Fourth loop I=5 prints hello I=5×5=25 which stops loop so 4 times.
         */

    }
}
