package com.rahatbek.javacore.chapter5usejava.componentjavabeans;

import java.awt.*;
import java.beans.*;

public class IntrospectorDemo {
    public static void main(String[] args) {
        System.out.println();
        try {
            Class<?> c = Class.forName("Colors");
            BeanInfo beanInfo = Introspector.getBeanInfo(c);

            System.out.println("Свойства:");
            PropertyDescriptor propertyDescriptor[] = beanInfo.getPropertyDescriptors();
            for (int i = 0; i < propertyDescriptor.length; i++) {
                System.out.println("\t" + propertyDescriptor[i].getName());
            }

            System.out.println("События:");
            EventSetDescriptor eventSetDescriptor[] = beanInfo.getEventSetDescriptors();
            for (int i = 0; i < eventSetDescriptor.length; i++) {
                System.out.println("\t" + eventSetDescriptor[i].getName());
            }
        } catch (Exception e) {
            System.out.println("Перехвачено событие. " + e);
        }
    }
}
