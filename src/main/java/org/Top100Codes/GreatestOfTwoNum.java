package org.Top100Codes;

import java.util.Scanner;

//Problem statement : Find the Greatest of the Two Numbers in Java.
public class GreatestOfTwoNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number : ");
        int num2 = scanner.nextInt();
        if (num1 > num2) {
            System.out.println(num1 + " is greater.");
        } else if (num1 < num2) {
            System.out.println(num2 + " is greater");
        } else {
            System.out.println("Number are equal.");
        }
    }
}
