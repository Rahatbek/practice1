package com.rahatbek.javacore.chapter2library.utilcollectionframeworke2;

import java.util.Scanner;

public class AgvNums {
    public static void main(String[] args) {
        Scanner conIn = new Scanner(System.in);

        int count = 0;
        double sum = 0.0;

        System.out.println("Введите числа для подсчета среднего.");

        while (conIn.hasNext()) {
            if (conIn.hasNextDouble()) {
                sum += conIn.nextDouble();
                count++;
            } else {
                String str = conIn.next();
                if (str.equals("готово"))
                    break;
                else {
                    System.out.println("Ошибка формата данных.");
                    return;
                }
            }
        }
        conIn.close();
        System.out.println("Среднее равно " + sum / count);
    }
}
