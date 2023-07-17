package com.bootcoding.java.Oops;

public class Watch{
    String color;
    double price;
    String shape;
    String type;
    String brand;

    public void isWorking() {
        System.out.println("No. Cell lekar aaoo!");
    }

    public void changeTime() {
        System.out.println("Changed Time of Watch!...");
    }


    // ClassName object-name = new ClassName();
    public static void main(String[] args) {
        Watch w1 = new Watch();
        Watch w2 = new Watch();
        // Object holds values of properties;
        // w - object
        // color - property
        // . operator (dot)
        // object.property
        // w.color
        w1.color = "Black";
        w1.brand = "Titan";
        w1.price = 12000.00;
        w1.shape = "Circle";
        w1.type = "Wrist";

        w2.color = "Brown";
        w2.brand = "Quartz";
        w2.price = 1200.00;
        w2.shape = "Square";
        w2.type = "Wall";

        System.out.println(" w2.color  = " + w2.color);
        System.out.println(" w1.color  = " + w1.color);
        System.out.println(" w1.brand  = " + w1.brand);
        System.out.println(" w1.price  = " + w1.price);
        System.out.println(" w1.shape  = " + w1.shape);
        System.out.println(" w1.type  = " + w1.type);

        w2.changeTime();
        w2.isWorking();
    }
}
