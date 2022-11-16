package com.rahatbek.javacore.chapter2library.javaio;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("src/main/java/com/rahatbek/javacore/chapter2library/javaio/FileReaderDemo.java")) {
            int c;

            while ((c = fr.read()) != -1)
                System.out.print((char) c);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
