package org.Top100Codes;

import java.util.Scanner;

//Problem statement : Find all the Prime Numbers in a Given Interval in Java.
public class PrimeNumBetweenRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter lower number : ");
        int lower = scanner.nextInt();
        System.out.print("Enter upper number : ");
        int upper = scanner.nextInt();
        for (int i = lower; i <= upper; i++)
            if (isPrime(i))
                System.out.print(i + " ");
    }

    private static boolean isPrime(int n) {
        int count = 0;
        if (n < 2)
            return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
