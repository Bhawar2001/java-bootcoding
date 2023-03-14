package com.bootcoding.java.oops;

public class Phone {
    double Display;
    String Camera;
    String price;
    String Brand;

    public void print(){
        System.out.println(Display);
        System.out.println(Camera);
        System.out.println(price);
        System.out.println(Brand);
    }

    public static void main(String[] args) {
        Phone p1=new Phone();
        p1.Display= 6.7;
        p1.Camera="48 MP";
        p1.price="127000 Rs";
        p1.Brand="Apple iphone 14 pro Max";
        p1.print();
    }
}
