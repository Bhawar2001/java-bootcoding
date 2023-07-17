package com.bootcoding.java.Oops;

public class Switch1 {
    String color;
    String material;
    String brand;
    int Buttons;

    String type;
    public Switch1(){
        System.out.println("Switch is created");
    }

    public static void main(String[] args) {
        Switch1 sw=new Switch1();
        sw.color="White";
        sw.material="Placstic";
        sw.brand="Anchor";
        sw.Buttons=4;
    }

}
