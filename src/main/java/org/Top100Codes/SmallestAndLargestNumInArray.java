package org.Top100Codes;

import java.util.Arrays;

//Problem statement : Java Program for Finding the Smallest and largest element in an array.
public class SmallestAndLargestNumInArray {
    public static void main(String[] args) {
        int[] array = {7, 10, 51, 25, 62, 42, 15, 20, 4, 32, 8, 55};
        int largestNum = array[0], smallestNum = array[0];
        for (int i = 0; i < array.length; i++) {
            if (smallestNum > array[i])
                smallestNum = array[i];
            if (largestNum < array[i])
                largestNum = array[i];
        }
        System.out.println("Given array:" + Arrays.toString(array));
        System.out.println("Largest element of the array: " + largestNum);
        System.out.println("Smallest element of the array: " + smallestNum);
    }
}
