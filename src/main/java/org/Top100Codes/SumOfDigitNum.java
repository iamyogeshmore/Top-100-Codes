package org.Top100Codes;

import java.util.Scanner;

/*Problem statement : Find the Sum of the Digits of a Number in Java. Example =>
Input : 1234
Output : 1 + 2 + 3 + 4 = 10 */
public class SumOfDigitNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scanner.nextInt();
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num = num / 10;
        }
        System.out.println("Sum of digits : " + sum);
    }
}
