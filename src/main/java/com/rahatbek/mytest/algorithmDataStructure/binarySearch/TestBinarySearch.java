package com.rahatbek.mytest.algorithmDataStructure.binarySearch;

public class TestBinarySearch {

    // Простая реализация
    int binarySearch(int[] sortedArray, int element) {
        // в начале левая и правая границы равны первому и последнему элементу массива
        var left = 0;
        var right = sortedArray.length - 1;
        // пока левая и правая границы поиска не пересеклись
        while (left <= right) {
            // индекс текущего элемента находится посередине
            var middle = (left + right) / 2;
            var current = sortedArray[middle];

            if (current == element) {
                // нашли элемент - возвращаем его индекс
                return middle;
            } else if (current < element) {
                // текущий элемент меньше искомого - сдвигаем левую границу
                left = middle + 1;
            } else {
                // иначе сдвигаем правую границу
                right = middle - 1;
            }
        }
        // проверили весь массив, но не нашли элемент
        return -1;
    }
}
