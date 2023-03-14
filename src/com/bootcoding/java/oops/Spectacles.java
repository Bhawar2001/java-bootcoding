package com.bootcoding.java.oops;

import java.sql.SQLOutput;

public class Spectacles {
    String type ;
    int number;
    String frame;
    String brand;
    public void print(){
        System.out.println(type);
        System.out.println(number);
        System.out.println(frame);
        System.out.println(brand);
    }

    public static void main(String[] args) {
        Spectacles f1=new Spectacles();
        f1.type = "Fiber";
        f1.number = -20;
        f1.brand = "Peter Jones";
        f1.print();
    }
    }





