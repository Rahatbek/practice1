package com.rahatbek.mytest.multithreads.alekseivladykin.objectClassPacket.subinheritance;

public class Main {

    public static void main(String[] args) {
        Shape s = new Circle();

        s.draw();

        if (s instanceof  Circle) {
            System.out.println("Circle");
        }
        if (s instanceof  Shape) {
            System.out.println("Shape");
        }

        System.out.println(s instanceof Circle);
        System.out.println(s instanceof CharSequence);
    }
}
/* Liskov Substitution Principle
* Если S является подтипом T, тогда объекты типа T в программе могут быть замещены
* бъектами типа S без каких-либо изменений желательных свойств этой программы
*
* Поведение наследуемых классов не должно противоречить поведению, заданному
* базовым классом, то есть поведение наследуемых классов должно быть ожидаемым для
* кода, использующего переменную базового типа.*/