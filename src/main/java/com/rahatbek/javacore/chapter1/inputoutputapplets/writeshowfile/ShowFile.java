package com.rahatbek.javacore.chapter1.inputoutputapplets.writeshowfile;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;

        if (args.length != 1) {
            System.out.println("Использование: ShowFile имя_файла");
            return;
        }

        try {
            fin = new FileInputStream(args[0]);

            do {
                i = fin.read();
                if (i != -1)
                    System.out.println((char) i);
            } while (i != -1);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Произошла ошибка ввода-вывода");
        } finally {
            try {
                if (fin != null)
                    fin.close();
            } catch (IOException e) {
                System.out.println("Ошибка закрытия файла");
            }
        }

        try {
            do {
                i = fin.read();
                if (i != -1)
                    System.out.println((char) i);
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("Ошибка чтения из файла");
        }

        try {
            fin.close();
        } catch (IOException e) {
            System.out.println("Ошибка закрытия файла");
        }
    }
}

