package org.Top100Codes;

import java.util.Scanner;

// Problem statement : Find the Armstrong Numbers in a given Range using Java.
public class ArmstrongNumbersBetweenRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter lower range : ");
        int low = scanner.nextInt();
        System.out.print("Enter upper range : ");
        int high = scanner.nextInt();
        System.out.print("Armstrong numbers between " + low + " and " + high + " are : ");
        for (int num = low; num <= high; num++) {   // loop for finding and printing all armstrong numbers between given range
            int sum = 0, temp, digit, len;
            len = getOrder(num);
            temp = num;
            while (temp != 0) {   // loop to extract digit, find ordered power of digits & add to sum
                digit = temp % 10;   // extract digit
                sum = sum + (int) Math.pow(digit, len);   // add power to sum
                temp /= 10;
            };
            if (sum == num)
                System.out.print(num + " ");
        }
    }

    private static int getOrder(int num) {
        int len = 0;
        while (num != 0) {
            len++;
            num = num / 10;
        }
        return len;
    }
}