package com.rahatbek.mytest.arraylist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class RemoveFromCollection {
    // позиция, с которой удаляем
    private static int m = 0;

    // количество удаляемых элементов
    private static int n = 0;

    // количество элементов в списке
    private static final int size = 1_000_000;

    // основной список (для удаления вызовом remove() и его копия для удаления путем перезаписи)
    private static ArrayList<Integer> initList, copyList;

    public static void main(String[] args) {

        initList = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            initList.add(i);
        }
        System.out.println("Список из 1.000.000 элементов заполнен");

        copyList = new ArrayList<>(initList);
        System.out.println("Создана копия списка\n");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("С какой позиции удаляем? > ");
            m = Integer.parseInt(br.readLine());
            System.out.print("Сколько удаляем? > ");
            n = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("\nВыполняем удаление вызовом remove()...");
        long start = System.currentTimeMillis();

        for (int i = m - 1; i < m + n - 1; i++) {
            initList.remove(i);
        }

        long finish = System.currentTimeMillis() - start;
        System.out.println("Время удаления с помощью вызова remove(): " + finish);
        System.out.println("Размер исходного списка после удаления: " + initList.size());

        System.out.println("\nВыполняем удаление путем перезаписи...\n");
        start = System.currentTimeMillis();

        removeEfficiently();

        finish = System.currentTimeMillis() - start;
        System.out.println("Время удаления путем смещения: " + finish);
        System.out.println("Размер копии списка: " + copyList.size());

        System.out.println("\nВыполняем удаление через саблист...\n");
        start = System.currentTimeMillis();

        initList.subList(m - 1, m + n).clear();
        finish = System.currentTimeMillis() - start;
        System.out.println("Время удаления через саблист: " + finish);
        System.out.println("Размер копии списка: " + copyList.size());
    }

    private static void removeEfficiently() {
        /* если необходимо удалить все элементы, начиная с указанного,
         * то удаляем элементы с конца до m
         */
        if (m + n >= size) {
            int i = size -1;
            while (i != m - 1) {
                copyList.remove(i);
                i--;
            }
        } else {
            //переменная k необходима для отсчёта сдвига начиная от места вставка m
            for (int i = m + n, k = 0; i < size; i++, k++) {
                copyList.set(m + k, copyList.get(i));
            }

            /* удаляем ненужные элементы в конце списка
             * удаляется всегда последний элемент, так как время этого действия
             * фиксировано и не зависит от размера списка
             */
            int i = size - 1;
            while (i != size - n - 1) {
                copyList.remove(i);
                i--;
            }
            //сокращаем длину списка путём удаления пустых ячеек
            copyList.trimToSize();
        }

    }
}
