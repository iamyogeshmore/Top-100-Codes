package org.Top100Codes;

import java.util.Scanner;

//Problem statement : Write a program to check if a given number is prime or not in java.
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();
        checkPrime(num);
    }

    private static void checkPrime(int num) {
        int count = 0;
        if (num < 2)
            System.out.println(num + " is not prime.");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0)
                count += 1;
        }
        if (count > 2)
            System.out.println(num + " is not prime.");
        else
            System.out.println(num + " is prime.");
    }
}
