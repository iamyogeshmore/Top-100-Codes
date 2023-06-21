package org.Top100Codes;

import java.util.Scanner;

//problem statement : Check if a Number is Positive or Negative in Java.
public class PositiveNegativeNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scan.nextInt();
        if (num > 0) {
            System.out.println("Number is positive.");
        } else if (num < 0) {
            System.out.println("Number is negative.");
        } else {
            System.out.println("Number is Zero.");
        }
    }
}
