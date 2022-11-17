package com.rahatbek.javacore.chapter2library.utilsconcurrency;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class SqrtTransform extends RecursiveAction {

    // В данном примере пороговое значение произвольно устана влива е т с я
    // равным 1000 . В р е аль ном коде е г о оптималь ное значение может
    // быт ь определено в ре зуль тате профилиров ания исполняющей системы
    // или экспериментально
    final int seqThreshold = 1000;

    // обраба тываемый массив
    double[] data;

    // определить часть обрабатываемых данных
    int start, end;

    SqrtTransform(double[] vals, int s, int e) {
        data = vals;
        start = s;
        end = e;
    }
    // этот метод выполняет параллельное вычисление
    protected void compute() {

        // Если количество элементов ме ньше порогового значения ,
        // выполнит ь дальнейшую обработку последов ательно
        if ((end - start) < seqThreshold) {
            //пре образовать значе ние каждого элемента массива
            // в его квадратный корень
            for (int i = start; i < end; i++) {
                data[i] = Math.sqrt(data[i]);
            }
        } else {
            //в противном случае продолжить разделение данных на
            // меньшие части.
            // найти середину
            int middle = (start - end) / 2;

            // запустить новые подзадачи на выполнение , исполь зуя
            // разделенные на части данные
            invokeAll(new SqrtTransform(data, start, middle), new SqrtTransform(data, middle, end));
        }
    }
}

class ForkJoinDemo {
    public static void main(String[] args) {
        // создать пул задач
        ForkJoinPool fjp = new ForkJoinPool();

        double[] nums = new double[100000];

        // присвоить некоторые значения
        for (int i = 0; i < nums.length; i++)
            nums[i] = (double) i;

        System.out.println("Часть исходной последовательности:");
        for (int i = 0; i < 10; i++)
            System.out.print(nums[i] + " ");
        System.out.println("\n");

        SqrtTransform task = new SqrtTransform(nums, 0, nums.length);

        // запустить главную задачу типа ForkJoinTask на выполнение
        fjp.invoke(task);

        System.out.println("Часть преобразованной последовательности " +
                " (с точностью до четырех знаков после десятичной точки):");

        for (int i = 0; i < 10; i++)
            System.out.format("%.4f ", nums[i]);
        System.out.println();
    }
}