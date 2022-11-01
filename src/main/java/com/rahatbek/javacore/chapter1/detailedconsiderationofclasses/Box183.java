package com.rahatbek.javacore.chapter1.detailedconsiderationofclasses;

public class Box183 {
    double width;
    double height;
    double depth;

    Box183(Box183 ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box183(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box183() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box183(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}
class OverloadCons2 {
    public static void main(String[] args) {
        Box183 mybox1 = new Box183(10, 20, 15);
        Box183 mybox2 = new Box183();
        Box183 mycub = new Box183(7);

        Box183 myclone = new Box183(mybox1);

        double vol;

        vol = mybox1.volume();
        System.out.println("Объем mybox1 равен " + vol);

        vol = mybox2.volume();
        System.out.println("Объем mybox2 равен " + vol);

        vol = mycub.volume();
        System.out.println("Объем куба равен " + vol);

        vol = myclone.volume();
        System.out.println("Объем клона равен " + vol);
    }
}
