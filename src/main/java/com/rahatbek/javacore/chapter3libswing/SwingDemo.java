package com.rahatbek.javacore.chapter3libswing;

import javax.swing.*;

// TODO: Swing page 1128 to 1210
public class SwingDemo {
    SwingDemo() {
        JFrame jfrm = new JFrame("A Simple Swing Application");

        jfrm.setSize(275, 100);

        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel jlab = new JLabel("Swing means powerful GUIs.");

        jfrm.add(jlab);

        jfrm.setVisible(true);
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingDemo();
            }
        });
    }
}
