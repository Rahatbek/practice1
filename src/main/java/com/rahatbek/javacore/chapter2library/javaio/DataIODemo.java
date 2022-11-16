package com.rahatbek.javacore.chapter2library.javaio;

import java.io.*;

public class DataIODemo {
    public static void main(String[] args) {

        try (DataOutputStream dOut = new DataOutputStream(new FileOutputStream("Test.dat"))) {
            dOut.writeDouble(98.6);
            dOut.writeInt(1000);
            dOut.writeBoolean(true);
        } catch (FileNotFoundException e) {
            System.out.println("Нельзя открыть файл вывода");
            return;
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }

        try (DataInputStream din = new DataInputStream(new FileInputStream("Test.dat"))) {
            double d = din.readDouble();
            int i = din.readInt();
            boolean b = din.readBoolean();

            System.out.println("Получаемые значения: " + d + " " + i + " " + b);
        } catch (FileNotFoundException e) {
            System.out.println("Нельзя открыть файл ввода ");
            return;
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
