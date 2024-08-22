package com.program.practices;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String year = scanner.nextLine();

//        if (year%4 == 0){
//            System.out.println("leap year..");
//        }
//        else {
//            System.out.println("not a leap year..");
//        }

        // Parses the first date
        LocalDate dt1 = LocalDate.parse(year);

        // Checks
        System.out.println(dt1.isLeapYear());
        System.out.println(LocalDateTime.now());
    }
}
