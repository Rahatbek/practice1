package com.rahatbek.javacore.chapter2library.regex30;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateTimeFormatDemo {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf;
        sdf = new SimpleDateFormat("hh:mm:ss");
        System.out.println(sdf.format(date));
        sdf = new SimpleDateFormat("dd MMM yyyy hh:mm:ss zzz");
        System.out.println(sdf.format(date));
        sdf = new SimpleDateFormat("E MMM dd yyyy");
        System.out.println(sdf.format(date));
    }
}
