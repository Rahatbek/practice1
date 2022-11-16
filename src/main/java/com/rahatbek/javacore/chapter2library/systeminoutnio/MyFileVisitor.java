package com.rahatbek.javacore.chapter2library.systeminoutnio;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

// TODO: LEARN and REMEMBER this code
public class MyFileVisitor extends SimpleFileVisitor<Path> {
    public FileVisitResult visitFile(Path path, BasicFileAttributes attribs) throws IOException {
        System.out.println(path);
        return FileVisitResult.CONTINUE;
    }
}

class TreeList {
    public static void main(String[] args) {
        String dirname = "../lesson1";

        System.out.println("Дерево каталогов, начиная с каталога " + dirname + ":\n");
        
        try {
            Files.walkFileTree(Paths.get(dirname), new MyFileVisitor());
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода");
        }
    }
}