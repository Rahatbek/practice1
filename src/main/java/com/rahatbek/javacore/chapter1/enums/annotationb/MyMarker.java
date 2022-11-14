package com.rahatbek.javacore.chapter1.enums.annotationb;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MyMarker {
}

class Marker {

    @MyMarker
    public static void myMeth() {
        Marker ob = new Marker();

        try {
            Method m = ob.getClass().getMethod("myMeth");

            if (m.isAnnotationPresent(MyMarker.class))
                System.out.println("Аннотация-маркер MyMarker присутствует.");
        } catch (NoSuchMethodException exc) {
            System.out.println("Метод не найден.");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
