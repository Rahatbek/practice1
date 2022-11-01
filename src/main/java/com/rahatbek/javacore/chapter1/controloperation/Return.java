package com.rahatbek.javacore.chapter1.controloperation;

public class Return {
    public static void main(String[] args) {
        boolean t = true;

        System.out.println("До возврата.");

        if (t)
            return;
        System.out.println("Этот оператор выполняться не будет");
    }
}
