package org.Top100Codes;

import java.util.Arrays;

//Problem statement : Java Program for finding the largest element of the array.
public class LargestNumInArray {
    public static void main(String[] args) {
        int[] array = {10, 15, 20, 14, 9, 29, 13, 17};
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("Given array:" + Arrays.toString(array));
        System.out.println("Largest element of the array: " + max);
    }
}
