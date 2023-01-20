package com.rahatbek.mytest.multithreads.alekseivladykin.objectClassPacket.subinheritance;

import java.awt.*;

public class Circle extends Shape{

    public Circle() {
        this(Color.BLACK);
    }

    public Circle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("circle");
    }
}
