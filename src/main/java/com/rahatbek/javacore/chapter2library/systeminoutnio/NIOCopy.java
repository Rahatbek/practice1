package com.rahatbek.javacore.chapter2library.systeminoutnio;

import java.io.IOException;
import java.nio.file.*;

public class NIOCopy {
    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Применение: откуда и куда копировать");
//            return;
        }

        try {
            Path source = Paths.get("test.txt");
            Path target = Paths.get("copy.txt");

            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
        } catch (InvalidPathException e) {
            System.out.println("Ошибка указания пути " + e);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода " + e);
        }
    }
}
