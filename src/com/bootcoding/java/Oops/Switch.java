package com.bootcoding.java.Oops;

public class Switch {
    String color;
    String material;
    String brand;
    int Buttons;
    double price;
    boolean powerSocket;
    String type;

    public void Start() {
        System.out.println("Switch is ON");
    }
    public void checkStatus() {
        System.out.println("Switch is OFF");
    }
    public void stop(){
        System.out.println("Switch is OFF");
    }

    public static void main(String[] args) {
        Switch sw=new Switch();

        sw.color="White";
        sw.material="Placstic";
        sw.brand="Anchor";
        sw.Buttons=4;
        sw.type="Normal switch box";
        sw.price=174.00;
        sw.powerSocket=false;

        System.out.println("sw.color="+sw.color);
        System.out.println("sw.material="+sw.material);
        System.out.println("sw.brand="+sw.brand);
        System.out.println("sw.Buttons="+sw.Buttons);
        System.out.println("sw.type="+sw.type);
        System.out.println("sw.price="+sw.price);
        System.out.println("sw.powerSocket="+sw.powerSocket);


sw.stop();
sw.Start();
sw.checkStatus();


    }
}
