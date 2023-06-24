package org.Top100Codes;

import java.util.Scanner;

//Problem statement : Factorial of a Number in Java.
public class FactorialOfNumber {   // Method to find factorial of the given number
    static int factorial(int n) {
        int res = 1;
        for (int i = 2; i <= n; i++)
            res *= i;
        return res;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scanner.nextInt();
        System.out.println("Factorial of " + num + " is " + factorial(num));
    }
}
