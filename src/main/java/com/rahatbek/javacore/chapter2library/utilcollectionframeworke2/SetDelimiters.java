package com.rahatbek.javacore.chapter2library.utilcollectionframeworke2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SetDelimiters {
    public static void main(String[] args) throws IOException {
        int count = 0;
        double sum = 0.0;

        FileWriter fOut = new FileWriter("Test.txt");

        fOut.write("2, 3.4, 5,6, 7.4, 9.1,10.5, готово");
        fOut.close();

        FileReader fin = new FileReader("Test.txt");
        Scanner src = new Scanner(fin);

        src.useDelimiter(", *");

        while (src.hasNext()) {
            if (src.hasNextDouble()) {
                sum += src.nextDouble();
                count++;
            } else {
                String str = src.next();
                if (str.equals("готово"))
                    break;
                else {
                    System.out.println("Ошибка формата файла.");
                    return;
                }
            }
        }
        src.close();
        System.out.println("Среднее равно " + sum / count);
    }
}
