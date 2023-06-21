package org.Top100Codes;

import java.util.Scanner;

//Problem statement : Find the Greatest of the Three Numbers in Java.
public class GreatestOfThreeNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = scan.nextInt();
        System.out.print("Enter second number : ");
        int num2 = scan.nextInt();
        System.out.print("Enter third number: ");
        int num3 = scan.nextInt();
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is greater.");
        } else if (num1 < num2 && num2 > num3) {
            System.out.println(num2 + " is grater.");

        } else if (num1 < num3 && num2 < num3) {
            System.out.println(num3 + " is grater.");
        } else {
            System.out.println("Numbers are eqal.");
        }
    }
}
