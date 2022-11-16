package com.rahatbek.javacore.chapter2library.basenetwork;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

public class UCDemo {
    public static void main(String[] args) throws IOException {
        int c;
        URL hp = new URL("http://www.internic.com");
        URLConnection hpCon = hp.openConnection();

        long d = hpCon.getDate();
        if (d == 0)
            System.out.println("Сведения о дате отсутствуют.");
        else
            System.out.println("Дата: " + new Date(d));

        System.out.println("Тип содержимого: " + hpCon.getContentType());

        d = hpCon.getExpiration();
        if (d == 0)
            System.out.println("Сведенияо о сроке действия отсутствуют.");
        else
            System.out.println("Срок действий истекает: " + new Date(d));

        d = hpCon.getLastModified();
        if (d == 0)
            System.out.println("Сведения о дате последней модификации.");
        else
            System.out.println("Дата последней модификации: " + new Date(d));

        long len = hpCon.getContentLengthLong();
        if (len == -1)
            System.out.println("Длина содержимого недоступна.");
        else
            System.out.println("Длина содержимого: " + len);

        if (len != 0) {
            System.out.println("=== Содержимое ===");
            InputStream input = hpCon.getInputStream();
            while ((c = input.read()) != -1) {
                System.out.print((char) c);
            }
            input.close();
        } else {
            System.out.println("Содержимое недоступно.");
        }
    }
}
