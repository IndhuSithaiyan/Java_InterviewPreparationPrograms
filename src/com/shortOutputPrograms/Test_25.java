package com.shortOutputPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test_25 {

    // Declaring the list with the final keyword?

    public static void main(String[] a) {

        final List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        System.out.println(list);

//        list = new ArrayList<>();

        // if you want to
        List<String> list1 = Collections.unmodifiableList(list);
        System.out.println(list1);


       /**
         * explanation
         *
         */

    }
}
