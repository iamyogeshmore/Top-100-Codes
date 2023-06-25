package org.Top100Codes;

import java.util.Scanner;

// Problem statement : Find the Power of a Number in Java Language.
public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base number : ");
        double base = input.nextDouble();
        System.out.print("Enter a power : ");
        double power = input.nextDouble();
        double res1 = Math.pow(base, power);
        System.out.println(base + " ^ " + power + " = " + res1);
    }
}