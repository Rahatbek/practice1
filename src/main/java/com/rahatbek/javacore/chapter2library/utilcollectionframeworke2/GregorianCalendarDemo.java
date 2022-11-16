package com.rahatbek.javacore.chapter2library.utilcollectionframeworke2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GregorianCalendarDemo {
    public static void main(String[] args) {
        String months[] = {
                "Jan", "Feb", "Mar", "Apr",
                "May", "Jun", "Jul", "Aug",
                "Sep", "Oct", "Nov", "Dec"};
        int year;

        GregorianCalendar gCalendar = new GregorianCalendar();

        System.out.print("Дата: ");
        System.out.print(months[gCalendar.get(Calendar.MONTH)]);
        System.out.print(" " + gCalendar.get(Calendar.DATE) + " ");
        System.out.println(year = gCalendar.get(Calendar.YEAR));

        System.out.print("Время: ");
        System.out.print(gCalendar.get(Calendar.HOUR) + ":");
        System.out.print(gCalendar.get(Calendar.MINUTE) + ":");
        System.out.println(gCalendar.get(Calendar.SECOND));

        if (gCalendar.isLeapYear(year))
            System.out.println("Текущий год високосный");
        else
            System.out.println("Текущий год не високосный");
    }
}
