package com.rahatbek.mytest.algorithmDataStructure;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        String[] names = {"Mike", "Bob", "Sally", "Jill", "Jan"};
        int[] numbers = {154, 245, 568, 324, 654, 324};
        insertionSort(numbers, numbers.length);
    }

    // TODO: work not correctly
    public static void insertionSort(int[] array, int n) {
        System.out.println("before sort: " + Arrays.toString(array));
        int i, j, t = 0;
        for (i = 1; i < n; i++) {
            j = i;
            while ((j > 0) && (array[j] < array[j - 1])) {
                t = array[j];
                array[j] = array[j - 1];
                array[j -1] = t;

                j = j - i;
            }
        }
        System.out.println("after sort: " + Arrays.toString(array));
    }
}
