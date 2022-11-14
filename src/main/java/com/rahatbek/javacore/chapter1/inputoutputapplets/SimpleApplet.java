package com.rahatbek.javacore.chapter1.inputoutputapplets;

import java.applet.Applet;
import java.awt.*;
/*
<applet code= "Simple Applet " width=200 height= бO>
</applet>
*/

public class SimpleApplet extends Applet {
    public void paint(Graphics g) {
        g.drawString("Простейший аплет", 20, 20);
    }
}
