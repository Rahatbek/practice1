package com.rahatbek.mytest.multithreads.alekseivladykin.objectClassPacket.subinheritance;

import java.awt.*;

public abstract class Shape {

    private Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public abstract void draw();
}
