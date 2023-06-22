package org.Top100Codes;

import java.util.Scanner;

//Problem statement : Find the Reverse of a Number in Java
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = input.nextInt();
        int reverse = 0, rem;
        while (num != 0) {
            rem = num % 10;
            reverse = reverse * 10 + rem;
            num /= 10;
        }
        System.out.print("Reverse number is : " + reverse);
    }
}