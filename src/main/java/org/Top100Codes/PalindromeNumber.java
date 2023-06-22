package org.Top100Codes;

import java.util.Scanner;

/* Problem statement : Check Whether or Not the Number is a Palindrome in Java. Example =>
Input : 121
Output : Palindrome */
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scanner.nextInt();
        int reverse = 0, rem, temp;
        temp = num;
        while (temp != 0) {
            rem = temp % 10;
            reverse = reverse * 10 + rem;
            temp /= 10;
        };
        if (num == reverse)
            System.out.println(num + " number is palindrome.");
        else System.out.println(num + " number is not palindrome.");
    }
}
