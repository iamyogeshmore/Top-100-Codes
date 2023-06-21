package org.Top100Codes;

import java.util.Scanner;

//Problem statement : Find the Sum of the Numbers in a Given Range in Java.
public class SumOfNumBetweenRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number : ");
        int num2 = scanner.nextInt();
        int sum = 0;
        for (int i = num1; i <= num2; i++) {
            sum += i;
        }
        System.out.println("Sum is " + sum);
    }
}
