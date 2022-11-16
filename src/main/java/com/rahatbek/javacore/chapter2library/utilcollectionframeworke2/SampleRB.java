package com.rahatbek.javacore.chapter2library.utilcollectionframeworke2;

import java.util.ListResourceBundle;
import java.util.Locale;
import java.util.ResourceBundle;

// TODO: this code don't work, why?
public class SampleRB extends ListResourceBundle {
    protected Object[][] getContents() {
        Object[][] resources = new Object[3][2];

        resources[0][0] = "title";
        resources[0][1] = "My Program";

        resources[1][0] = "StopText";
        resources[1][1] = "Stop";

        resources[2][0] = "StartText";
        resources[2][1] = "Start";

        return resources;
    }
}

class SampleRB_de extends ListResourceBundle {
    protected Object[][] getContents() {
        Object[][] resources = new Object[3][2];

        resources[0][0] = "title";
        resources[0][1] = "Mein Programm";

        resources[1][0] = "StopText";
        resources[1][1] = "Anschlag";

        resources[2][0] = "StartText";
        resources[2][1] = "Anfang";

        return resources;
    }
}

class LRBDemo {
    public static void main(String[] args) {
        ResourceBundle rd = ResourceBundle.getBundle("SampleRB");

        System.out.println("Английская версия программы: ");
        System.out.println("Строка по ключу Title: " + rd.getString("title"));
        System.out.println("Строка по ключу StopText: " + rd.getString("StopText: "));
        System.out.println("Строка по ключу StartText: " + rd.getString("StartText"));

        rd = ResourceBundle.getBundle("SampleRB", Locale.GERMAN);

        System.out.println("\nНемецкая версия программы: ");
        System.out.println("Строка по ключу Title: " + rd.getString("title"));
        System.out.println("Строка по ключу StopText: " + rd.getString("StopText: "));
        System.out.println("Строка по ключу StartText: " + rd.getString("StartText"));
    }
}