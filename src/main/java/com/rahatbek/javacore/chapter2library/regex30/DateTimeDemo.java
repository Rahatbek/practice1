package com.rahatbek.javacore.chapter2library.regex30;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeDemo {
    public static void main(String[] args) {

        LocalDate curDate = LocalDate.now();
        System.out.println(curDate);

        LocalTime curTime = LocalTime.now();
        System.out.println(curTime);

        LocalDateTime curDateTime = LocalDateTime.now();
        System.out.println(curDateTime);
    }
}
