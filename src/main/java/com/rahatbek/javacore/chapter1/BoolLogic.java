package com.rahatbek.javacore.chapter1;

public class BoolLogic {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = a | b;
        boolean d = a & b;
        boolean e = a ^ b;
        boolean f = (!a & b) | (a & !b);
        boolean g = !a;

        System.out.println("        a = " + a);
        System.out.println("        b = " + b);
        System.out.println("        c = " + c);
        System.out.println("        d = " + d);
        System.out.println("        e = " + e);
        System.out.println("!a&b|a&!b = " + f);
        System.out.println("       !a = " + g);
    }
}
