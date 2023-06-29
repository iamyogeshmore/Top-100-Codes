package org.Top100Codes;

import java.util.Arrays;

//Problem statement : Java Code for finding the Smallest Element in an Array.
public class SmallestNumInArray {
    public static void main(String[] args) {
        int[] array = {7, 12, 6, 19, 5, 25, 29, 18, 9, 13, 14};
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("Given array:" + Arrays.toString(array));
        System.out.println("Smallest element of the array: " + min);
    }
}
