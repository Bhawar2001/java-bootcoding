package com.bootcoding.java.Oops;

import java.sql.SQLOutput;

public class PrintPepar {
    String color;
    int size;
    String type;
    String brand;
    double price;

    public void tearPaper(int pieces){
        System.out.println("I have tore paper into " + pieces + " pieces");
    }

    public void throwPaper(){
        System.out.println("Paper fekla ka.... Arrr!");
    }

    public static void main(String[] args) {
        PrintPepar pp=new PrintPepar();

        pp.color="yellow";
        pp.type="A4 pepar";
        pp.brand="Aerial bond";
        pp.price=150.00;

        System.out.println("pp.color="+pp.color);
        System.out.println("pp.type="+pp.type);
        System.out.println("pp.brand="+pp.brand);
        System.out.println("pp.price="+pp.price);

        pp.tearPaper(4);
        pp.throwPaper();

    }
}
