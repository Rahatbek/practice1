package com.rahatbek.javacore.chapter2library.utilcollectionframeworke2;

import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {

        Date date = new Date();

        System.out.println(date);

        long mSec = date.getTime();
        System.out.println("Количестов миллисекунд, прошедших с 1 января 1970 г. по Гринвичу = " + mSec);
    }
}
