package org.Top100Codes;

import java.util.Scanner;

// Problem statement : Find the Factors of a Number in Java Language.
public class FactorOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scanner.nextInt();
        System.out.print("Factors of " + num + " are : ");
        for (int i = 1; i <= num; i++)
            if (num % i == 0)
                System.out.print(i + " ");
    }
}
