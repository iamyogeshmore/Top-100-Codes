package org.Top100Codes;

import java.util.Scanner;

// Problem statement : Check Whether or Not the Number is a Perfect Number in Java Language.
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = input.nextInt();
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0)
                sum = sum + i;
        }
        if (sum == num)
            System.out.println(num + " is a perfect number");
        else
            System.out.println(num + " is not a perfect number");
    }
}