package org.Top100Codes;

import java.util.Scanner;

/* Problem Statement : Check whether or Not the Number is an Armstrong Number in Java.
Example =>  Input : 371
Output : It's an Armstrong Number.
Explanation: 371 = 3^3 + 7^3 + 1^3
Therefore it's an Armstrong number. */
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scanner.nextInt();
        int len;
        len = order(num); // function to get order(length)
        if (armstrong(num, len))// check if Armstrong
            System.out.println(num + " is an Armstrong Number.");
        else
            System.out.println(num + " is not an Armstrong Number.");
    }
    static int order(int x) {
        int len = 0;
        while (x != 0) {
            len++;
            x = x / 10;
        }
        return len;
    }
    static boolean armstrong(int num, int len) {
        int sum = 0, temp, digit;
        temp = num;
        while (temp != 0) {// loop to extract digit, find power & add to sum
            digit = temp % 10; // extract digit
            sum = sum + (int) Math.pow(digit, len);// add power to sum
            temp /= 10;
        };
        return num == sum;
    }
}
