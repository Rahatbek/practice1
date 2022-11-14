package com.rahatbek.javacore.chapter1.enums;

public enum Apple {
    Jonathan, GoldenDel, RedDel, Winesap, Cortland;

    private int price;

    Apple(int p) {
        price = p;
    }

    Apple() {
        price = -1;
    }
    int getPrice () {
        return price;
    }
}
class EnumDemo {
    public static void main(String[] args) {
        Apple ap;

        ap = Apple.RedDel;

        System.out.println("Значениче ap: " + ap);
        System.out.println();

        ap = Apple.GoldenDel;

        if (ap == Apple.GoldenDel) {
            System.out.println("Переменная ap содержит GoldenDel.\n");
        }

        switch (ap) {
            case Jonathan:
                System.out.println("Сорт Jonathan красный");
                break;
            case GoldenDel:
                System.out.println("Сорт GoldenDel желтый");
                break;
            case RedDel:
                System.out.println("Сорт RedDel красный");
                break;
            case Winesap:
                System.out.println("Сорт Winesap красный");
                break;
            case Cortland:
                System.out.println("Сорт Cortland красный");
                break;
        }
    }
}

class EnumDemo2 {
    public static void main(String[] args) {
        Apple ap;

        System.out.println("Константы перечислимого типа Apple:");

        Apple allApples[] = Apple.values();
        for (Apple a : allApples)
            System.out.println(a);

        System.out.println();

        ap = Apple.valueOf("Winesap");
        System.out.println("Переменная ap содержит " + ap);
    }
}

class EnumDemo3 {
    public static void main(String[] args) {
        Apple ap;

        System.out.println("Яблоко сорта Winesap стоит " + Apple.Winesap.getPrice() + " центов.\n");

        System.out.println("Цены на все сорта яблок:");
        for (Apple a : Apple.values())
            System.out.println(a + " стоит " + a.getPrice() + " центов.");
    }
}

class EnumDemo4 {
    public static void main(String[] args) {
        Apple ap, ap2, ap3;

        System.out.println("Все контсанты сортов яблок и их порядковые значения: ");
        for (Apple a : Apple.values())
            System.out.println(a + " " + a.ordinal());

        ap = Apple.RedDel;
        ap2 = Apple.GoldenDel;
        ap3 = Apple.RedDel;

        System.out.println();

        if (ap.compareTo(ap2) < 0)
            System.out.println(ap + " предшествует " + ap2);

        if (ap.compareTo(ap2) > 0)
            System.out.println(ap2 + " предшествует " + ap);

        if (ap.compareTo(ap3) == 0)
            System.out.println(ap + " равно " + ap3);

        System.out.println();

        if (ap.equals(ap2))
            System.out.println("Ошибка!");

        if (ap.equals(ap3))
            System.out.println(ap + " равно " + ap3);

        if (ap == ap3)
            System.out.println(ap + " == " + ap3);
    }

}