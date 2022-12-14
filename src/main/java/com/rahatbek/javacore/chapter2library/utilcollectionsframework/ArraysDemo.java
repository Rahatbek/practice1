package com.rahatbek.javacore.chapter2library.utilcollectionsframework;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {

        int array[] = new int[10];
        for (int i = 0; i < array.length; i++)
            array[i] = -3 * i;

        System.out.print("Исходный массив: ");
        display(array);
        Arrays.sort(array);
        System.out.print("Отсортированный массив: ");
        display(array);

        Arrays.fill(array, 2, 6, -1);
        System.out.print("Массив после вызова метода fill(): ");
        display(array);

        Arrays.sort(array);
        System.out.print("Массив после повторной сортировки: ");
        display(array);

        System.out.print("Значение -9 аходится на позиции ");
        int index = Arrays.binarySearch(array, -9);
        System.out.println(index);
    }

    static void display(int array[]) {
        for (int i : array)
            System.out.print(i + " ");
        System.out.println();
    }
}
