package com.rahatbek.javacore.chapter1.introductionclass;

public class Box {
    double width;
    double height;
    double depth;

    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    Box() {
        System.out.println("Конструирование объекта Box");
        width = 10;
        height = 10;
        depth = 10;
    }

    void volume() {
        System.out.print("Объем равен ");
        System.out.println(width * height * depth);
    }

    double volumeD() {
        return width * height * depth;
    }

    void setDim (double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}

class BoxDemo {
    public static void main(String[] args) {
        Box mybox = new Box();

        double vol;

        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;

        vol = mybox.width * mybox.height * mybox.depth;
        System.out.println("Объем равен " + vol);
    }
}

class BoxDemo2 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        vol = mybox1.width * mybox1.height * mybox1.depth;
        System.out.println("Объем равен " + vol);

        vol = mybox2.width * mybox2.height * mybox2.depth;
        System.out.println("Объем равен " + vol);
    }
}

class BoxDemo3 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();

        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        mybox1.volume();

        mybox2.volume();
    }
}

class BoxDemo4 {
        public static void main(String[] args) {
            Box mybox1 = new Box();
            Box mybox2 = new Box();
            double vol;

            mybox1.width = 10;
            mybox1.height = 20;
            mybox1.depth = 15;

            mybox2.width = 3;
            mybox2.height = 6;
            mybox2.depth = 9;

            vol = mybox1.volumeD();
            System.out.println("Объем равен " + vol);

            vol = mybox2.volumeD();
            System.out.println("Объем равен " + vol);
        }
}

class BoxDemo5 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        mybox1.setDim(10, 20, 15);
        mybox2.setDim(3, 6, 9);

        vol = mybox1.volumeD();
        System.out.println("Объем равен " + vol);

        vol = mybox2.volumeD();
        System.out.println("Объем равен " + vol);
    }
}

class BoxDemo6 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        vol = mybox1.volumeD();
        System.out.println("Объем равен " + vol);

        vol = mybox2.volumeD();
        System.out.println("Объем равен " + vol);
    }
}

class BoxDemo7 {
    public static void main(String[] args) {
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box(3, 6, 9);

        double vol;

        vol = mybox1.volumeD();
        System.out.println("Объем равен " + vol);

        vol = mybox2.volumeD();
        System.out.println("Объем равен " + vol);
    }
}