package com.rahatbek.javacore.chapter1.inheritance;

public class ColorBox extends Box {
    int color;

    ColorBox(double w, double h, double d, int c) {
        super(w, h, d);
        color = c;
    }
}
