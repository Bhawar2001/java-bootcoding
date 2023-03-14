package com.bootcoding.java.oops;

import javax.imageio.stream.ImageInputStream;

public class Bus {
    int seat;
    String type;
    String brand;
    public void print(){
        System.out.println(seat);

        System.out.println(type);
        System.out.println(brand);

    }

    public static void main(String[] args) {
        Bus s1=new Bus();
        s1.seat = 40;
        s1.brand = "TATA";
        s1.type ="Steel Bus";
       s1.print();


    }
}
