package com.bootcoding.java.oops.Exerise1;

public class Discount {
    public int getCustomerDiscount(String customerType){
        if (customerType.equals("Regular")){
            return 40;
        }else if (customerType.equals("Premium")){
            return 50;
        }else if (customerType.equals("NonRegular")){
            return 10;
        }
        return 0;
    }
}
