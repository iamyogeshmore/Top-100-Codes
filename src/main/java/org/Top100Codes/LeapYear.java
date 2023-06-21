package org.Top100Codes;

import java.util.Scanner;

// Problem statement : Check Whether or Not the Year is a Leap Year in Java.
public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year : ");
        int year = scanner.nextInt();
        if ((year % 400 == 0) || year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " year is leap year.");
        } else {
            System.out.println(year + " year is not leap year.");
        }
    }
}
