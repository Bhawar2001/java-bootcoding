package com.bootcoding.java.oops;

public class Mug {
    int height ;
    double circle;
    int lenght;
    String brand;

    public void print(){
        System.out.println(height);
        System.out.println(circle);
        System.out.println(lenght);
        System.out.println(brand);
    }

    public static void main(String[] args) {
        Mug m1=new Mug();

        m1.height= 10;
        m1.circle= 3.14;
        m1.lenght= 5;
        m1.brand= "Coffee Mug";
        m1.print();
    }

}
