package com.rahatbek.javacore.chapter2library.packagejavalang;

public class PBDemo {
    public static void main(String[] args) {
        try {
            ProcessBuilder proc = new ProcessBuilder("notepad.exe", "testFile");
            proc.start();
        } catch (Exception e) {
            System.out.println("Ошибка запуска Notepad.");
        }
    }
}
