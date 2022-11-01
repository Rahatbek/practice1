package com.rahatbek.javacore.chapter1.detailedconsiderationofclasses;

//public class OverloadDemo {
//    void test() {
//        System.out.println("Параметры отсутствуют");
//    }
//
//    void test(int a) {
//        System.out.println("a: " + a);
//    }
//
//    void test(int a, int b) {
//        System.out.println("a и b: " + a + " " + b);
//    }
//
//    double test(double a) {
//        System.out.println("double a: " + a);
//        return a * a;
//    }
//}
//
//class OverLoad {
//    public static void main(String[] args) {
//        OverloadDemo ob = new OverloadDemo();
//        double result;
//
//        ob.test();
//        ob.test(10);
//        ob.test(10, 20);
//        result = ob.test(123.25);
//        System.out.println("Результат вызова ob.test(123.25): " + result);
//    }
//}
public class OverloadDemo {
    void test() {
        System.out.println("Параметры отсутствуют");
    }

    void test(int a, int b) {
        System.out.println("a и b: " + a + " " + b);
    }

    void test(double a) {
        System.out.println("Внутренне преобразование при вызове test(double) a: " + a);
    }
}

class OverLoad {
    public static void main(String[] args) {
        OverloadDemo ob = new OverloadDemo();
        int i = 88;

        ob.test();
        ob.test(10, 20);

        ob.test(i);
        ob.test(123.2);
    }
}