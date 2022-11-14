package com.rahatbek.javacore.chapter1.inputoutputapplets;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Hypot {
    public static void main(String[] args) {
        double side1, side2;
        double hypot;
        side1 = 3.0;
        side2 = 4.0;

        hypot = sqrt(pow(side2, 2) + pow(side2, 2));

        System.out.println("При заданной длине сторон " + side1 + " и " + side2 + " гипотенуза " + hypot);
    }
}
