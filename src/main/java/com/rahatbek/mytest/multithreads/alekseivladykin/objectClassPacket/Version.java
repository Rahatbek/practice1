package com.rahatbek.mytest.multithreads.alekseivladykin.objectClassPacket;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Version {

    String value();

    String date() default "";
    /*primitive, String, class, enum can be*/
}
