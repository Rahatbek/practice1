package com.rahatbek.javacore.chapter2library.basenetwork;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HttpUrlDemo {
    public static void main(String[] args) throws IOException {
        URL hp = new URL("https://www.google.com");
        HttpURLConnection hpCOn = (HttpURLConnection) hp.openConnection();

        System.out.println("Метод запроса: " + hpCOn.getRequestMethod());

//        System.out.println("Код ответа: " + hpCOn.getResponseCode());

//        System.out.println("Ответное сообщение: " + hpCOn.getResponseMessage());

        Map<String, List<String>> hdrMap = hpCOn.getHeaderFields();
        Set<String> hdrField = hdrMap.keySet();
        System.out.println("\nДалее следует заголов:ок");
        for (String k : hdrField) {
            System.out.println("Ключ: " + k + " Значение: " + hdrMap.get(k));
        }
    }
}
