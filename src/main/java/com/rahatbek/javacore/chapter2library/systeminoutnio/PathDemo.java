package com.rahatbek.javacore.chapter2library.systeminoutnio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class PathDemo {
    public static void main(String[] args) {
        Path filepath = Paths.get("./test.txt");

        System.out.println("Имя файла: " + filepath.getName(1));
        System.out.println("Путь к файлу: " + filepath);
        System.out.println("Абсолютный путь к файлу: " + filepath.toAbsolutePath());
        System.out.println("Родительский каталог: " + filepath.getParent());

        if (Files.exists(filepath))
            System.out.println("файл существует");
        else
            System.out.println("файл не существует");

        try {
            if (Files.isHidden(filepath))
                System.out.println("Файл не скрыт");
            else
                System.out.println("Файл не скрыт");
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода " + e);
        }

        Files.isWritable(filepath);
        System.out.println("Файл доступен для записи");

        Files.isReadable(filepath);
        System.out.println("Файл доступен для чтения");

        try {
            BasicFileAttributes attribs = Files.readAttributes(filepath, BasicFileAttributes.class);

            if (attribs.isDirectory())
                System.out.println("Это каталог");
            else
                System.out.println("Это не каталог");

            if (attribs.isRegularFile())
                System.out.println("Это обычный файл");
            else
                System.out.println("Это не обычный файл");

            if (attribs.isSymbolicLink())
                System.out.println("Это символическая ссылка");
            else
                System.out.println("Это не символическая ссылка");

            System.out.println("Время последней модификации файла: " + attribs.lastModifiedTime());
            System.out.println("Рзмер файла: " + attribs.size() + " байтов");
        } catch (IOException e) {
            System.out.println("Ошибка чтения атрибутов: " + e);
        }
    }
}
