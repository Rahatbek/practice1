package com.rahatbek.javacore.chapter2library.utilcollectionsframework;

import java.util.Properties;
import java.util.Set;

public class PropDemo {
    public static void main(String[] args) {
        Properties capitals = new Properties();
        capitals.put("Иллинойс", "Спрингфилд");
        capitals.put("Миссури", "Джефферсон-Сити");
        capitals.put("Вашингтон", "Олимпия");
        capitals.put("Калифорния", "Сакраменто");
        capitals.put("Идиана", "Индианаполис");

        Set<?> states = capitals.keySet();

        for (Object name : states)
            System.out.println("Столица штата " + name + " - " + capitals.getProperty((String) name) + ".");
        System.out.println();

        String str = capitals.getProperty("Флорида", "не найдена");
        System.out.println("Стилица штата Флорида " + str + ".");
    }
}
