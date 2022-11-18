package com.rahatbek.javacore.chapter5usejava.componentjavabeans;

import java.beans.*;

public class ColorsBeanInfo extends SimpleBeanInfo {
    public PropertyDescriptor[] getPropertyDescriptors() {
        try {
            PropertyDescriptor rectangular = new PropertyDescriptor("rectangular", Colors.class);
            PropertyDescriptor pd[] = {rectangular};
            return pd;
        } catch (Exception e) {
            System.out.println("Перехвачено событе. " + e);
        }
        return null;
    }
}
