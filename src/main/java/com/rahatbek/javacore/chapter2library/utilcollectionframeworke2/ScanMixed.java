package com.rahatbek.javacore.chapter2library.utilcollectionframeworke2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ScanMixed {
    public static void main(String[] args) throws IOException {
        int i;
        double d;
        boolean b;
        String str;

        FileWriter fOut = new FileWriter("Text.txt");
        fOut.write("Тестирование Scanner 10 12.2 один true два false");
        fOut.close();

        FileReader fin = new FileReader("Text.txt");

        Scanner src = new Scanner(fin);

        while (src.hasNext()) {
            if (src.hasNextInt()) {
                i = src.nextInt();
                System.out.println("int: " + i);
            } else if (src.hasNextDouble()) {
                d = src.nextDouble();
                System.out.println("double: " + d);
            } else if (src.hasNextBoolean()) {
                b = src.nextBoolean();
                System.out.println("boolean: " + b);
            } else if (src.hasNextBoolean()) {
                b = src.nextBoolean();
                System.out.println("boolean: " + b);
            } else {
                str = src.next();
                System.out.println("String: " + str);
            }
        }
        src.close();
    }
}
