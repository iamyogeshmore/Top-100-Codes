package org.Top100Codes;

//Problem statement : Java program for finding the second-smallest element in an array.
public class SecondSmallestElementInArray {
    static int secSmallest(int[] arr, int n) {
        int smallest = arr[0];                // assigning first element as smallest temporarily
        for (int i = 0; i < n; i++) {         // we find the smallest element here
            if (arr[i] < smallest)
                smallest = arr[i];
        }

        int sec_smallest = Integer.MAX_VALUE; // temporarily assigning the largest max value

        for (int i = 0; i < n; i++) {          // finding second smallest here
            if (arr[i] != smallest && arr[i] < sec_smallest)
                sec_smallest = arr[i];
        }
        return sec_smallest;
    }

    public static void main(String[] args) {
        int[] arr = {12, 13, 1, 10, 34, 10};
        int n = arr.length;
        System.out.print("Second Smallest Element In Array is ");
        System.out.print(secSmallest(arr, n));
    }
}