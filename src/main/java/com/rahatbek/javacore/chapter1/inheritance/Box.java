package com.rahatbek.javacore.chapter1.inheritance;

public class Box {
    private double width;
    private double height;
    private double depth;

    Box(Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    public Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box(double length) {
        width = height = depth = length;
    }

    double volume() {
        return width * height * depth;
    }
}

class BoxWeight extends Box {
    double weight;

    BoxWeight(BoxWeight ob) {
        super(ob);
        weight = ob.weight;
    }

    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }

    BoxWeight() {
        super();
        weight = -1;
    }

    BoxWeight(double len, double m) {
        super(len);
        weight = m;
    }
}

class DemoBoxWeight{
    public static void main(String[] args) {
        BoxWeight myBox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight myBox2 = new BoxWeight(2, 3, 4, 0.076);
        double vol;

        vol = myBox1.volume();
        System.out.println("Объем myBox1 равен " + vol);
        System.out.println("Вес myBox1 равен " + myBox1.weight);
        System.out.println();

        vol = myBox2.volume();
        System.out.println("Объем myBox2 равен " + vol);
        System.out.println("Вес myBox1 равен " + myBox2.weight);
    }
}

class DemoSuper {
    public static void main(String[] args) {
        BoxWeight myBox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight myBox2 = new BoxWeight(2, 3, 4, 0.076);
        BoxWeight myBox3 = new BoxWeight();
        BoxWeight myCube = new BoxWeight(3, 2);
        BoxWeight myClone = new BoxWeight(myBox1);
        double vol;

        vol = myBox1.volume();
        System.out.println("Объем myBox1 равен " + vol);
        System.out.println("Вес myBox1 равен " + myBox1.weight);
        System.out.println("");

        vol = myBox2.volume();
        System.out.println("Объем myBox1 равен " + vol);
        System.out.println("Вес myBox1 равен " + myBox2.weight);
        System.out.println("");

        vol = myBox3.volume();
        System.out.println("Объем myBox1 равен " + vol);
        System.out.println("Вес myBox1 равен " + myBox3.weight);
        System.out.println("");

        vol = myClone.volume();
        System.out.println("Объем myBox1 равен " + vol);
        System.out.println("Вес myBox1 равен " + myClone.weight);
        System.out.println("");

        vol = myCube.volume();
        System.out.println("Объем myBox1 равен " + vol);
        System.out.println("Вес myBox1 равен " + myCube.weight);
        System.out.println("");
    }
}

class Shipment extends BoxWeight {
    double cost;

    Shipment(Shipment ob) {
        super(ob);
        cost = ob.cost;
    }

    Shipment(double w, double h, double d, double m, double c) {
        super(w,h,d,m);
        cost = c;
    }

    Shipment() {
        super();
        cost = -1;
    }

    Shipment(double len, double m, double c) {
        super(len, m);
        cost = c;
    }
}

class DemoShipment {
    public static void main(String[] args) {
        Shipment shipment1 = new Shipment(10, 20, 15, 10, 3.41);
        Shipment shipment2 = new Shipment(2, 3, 4, 0.76, 1.28);
        double vol;

        vol = shipment1.volume();
        System.out.println("Объем shipment1 равен " + vol);
        System.out.println("Вес shipment1 равен " + shipment1.weight);
        System.out.println("Стоимотсь доставки: $" + shipment1.cost);
        System.out.println();
        vol = shipment2.volume();
        System.out.println("Объем shipment2 равен " + vol);
        System.out.println("Вес shipment2 равен " + shipment2.weight);
        System.out.println("Стоимотсь доставки: $" + shipment2.cost);
    }
}