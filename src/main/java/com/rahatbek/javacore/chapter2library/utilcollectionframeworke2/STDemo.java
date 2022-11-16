package com.rahatbek.javacore.chapter2library.utilcollectionframeworke2;

import java.util.StringTokenizer;

public class STDemo {
    static String in = "Название=Java. Полное руководство;" +
            "Автор=Шилдт;" +
            "Издательство=McGraw-Hill;" +
            "Аторсое право=2014";

    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer(in,"=;");
        while (st.hasMoreTokens()) {
            String key = st.nextToken();
            String val = st.nextToken();
            System.out.println(key + "\t" + val);
        }
    }
}
