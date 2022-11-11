package com.rahatbek.javacore.chapter1.inheritance.finals;

final class A {
    final void meth() {
        System.out.println("Это завершенный метод.");
    }
}
//class B extends A { // Ошибка! Класс A не может иметь подклассы
//    void meth() { // ОШИБКА ! Этот метод не может быть переопределен.
//        System.out.println("Недопустимо!");
//    }
//}
