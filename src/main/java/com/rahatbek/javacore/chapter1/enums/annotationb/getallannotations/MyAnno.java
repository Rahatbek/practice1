package com.rahatbek.javacore.chapter1.enums.annotationb.getallannotations;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
    String str();
    int val();
}

@Retention(RetentionPolicy.RUNTIME)
@interface What {
    String description();
}

@What(description = "Аннотация тестового класса")
@MyAnno(str = "Meta2", val = 99)
class Meta2 {
    @What(description = "Аннотация тесового класса")
    @MyAnno(str = "Testing", val = 100)
    public static void myMeth() {
        Meta2 ob = new Meta2();

        try {
            Annotation annos[] = ob.getClass().getAnnotations();

            System.out.println("Все аннотации для метода Meta2:");
            for (Annotation a : annos)
                System.out.println(a);

            System.out.println();

            Method m = ob.getClass().getMethod("myMeth");
            annos = m.getAnnotations();

            System.out.println("Все аннотаци для метода myMeth():");
            for (Annotation a : annos)
                System.out.println(a);
        } catch (NoSuchMethodException exc) {
            System.out.println("Метод не найден.");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}