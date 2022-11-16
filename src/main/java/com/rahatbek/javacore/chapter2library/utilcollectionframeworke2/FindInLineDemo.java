package com.rahatbek.javacore.chapter2library.utilcollectionframeworke2;

import java.util.Scanner;

public class FindInLineDemo {
    public static void main(String[] args) {
        String inStr = "Имя: Том Возраст: 28 ID: 77";
        Scanner conIn = new Scanner(inStr);

        conIn.findInLine("Возраст:");
        if (conIn.hasNext())
            System.out.println(conIn.next());
        else
            System.out.println("Ошибка!");
        conIn.close();
    }
}
