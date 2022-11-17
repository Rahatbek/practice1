package com.rahatbek.javacore.chapter2library.eventhandling;

import java.applet.Applet;
import java.awt.event.MouseAdapter;

public class MousePressedDemo extends Applet {
    public void init() {
        addMouseListener(new MouseAdapter() {
        });
    }
}
