package org.Top100Codes;

import java.util.Scanner;

//Problem statement : Find the Sum of First N Natural Numbers in Java.
public class SumOfNaturalNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println("Sum of number is : " + sum);
    }
}
