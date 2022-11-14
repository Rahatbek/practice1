package com.rahatbek.javacore.chapter1.enums.annotationb.usingdefaultvalues;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
    String str() default "Тестирование";
    int val() default 9000;
}

class Meta3 {

    @MyAnno()
    public static void myMeth() {
        Meta3 ob = new Meta3();

        try {
            Class<?> c = ob.getClass();

            Method m = c.getMethod("myMeth");

            MyAnno anno = m.getAnnotation(MyAnno.class);

            System.out.println(anno.str() + " " + anno.val());
        } catch (NoSuchMethodException exc) {
            System.out.println("Метод не найден");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
