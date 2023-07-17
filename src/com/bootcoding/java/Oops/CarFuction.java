package com.bootcoding.java.Oops;

import javax.management.modelmbean.ModelMBean;

public class CarFuction {
    private static CarFuction cf;
    String color;
    int ModelNumber;
    String brandName;
    double Price;
    String purchaseDate;
    String FuelTpye;

    public static void main(String[] args) {
        cf = new CarFuction();

        cf.color="Blue";
        cf.ModelNumber=123456;
        cf.brandName="BMW";
        cf.Price=1000000.00;
        cf.purchaseDate="18.04.2023";
        cf.FuelTpye="petrol";

        System.out.println("cf.color="+cf.color);
        System.out.println("cf.ModelNumber="+ cf.ModelNumber);
        System.out.println("cf.brandName="+cf.brandName);
        System.out.println("cf.Price="+cf.Price);
        System.out.println("cf.purchaseDate="+cf.purchaseDate);
        System.out.println("cf.FuelType"+cf.FuelTpye);


    }
}
