package com.bootcoding.java.oops.Exerise1;

public class App {
    public static void main(String[]args){
        Customer Bhawar = new Customer();
        Bhawar.name ="Bhawar";
        Bhawar.type = "Regular";

        Customer Sarthak = new Customer();
        Sarthak.name ="Sarthak";
        Sarthak.type = "NonRegular";

        Customer Rajat = new Customer();
        Rajat.name ="Rajat";
        Rajat.type = "Premium";

        Discount discount=new Discount();
        int BhawarDiscount = discount.getCustomerDiscount(Bhawar.type);
        int SarthakDiscount = discount.getCustomerDiscount(Sarthak.type);
        int RajatDiscount = discount.getCustomerDiscount(Rajat.type);

        System.out.println("Bhawar is a"+Bhawar.type+"Customer"+"and got discount"+BhawarDiscount+"%");
        System.out.println("Sarthak is a"+Sarthak.type+"Customer"+"and got discount"+SarthakDiscount+"%");
        System.out.println("Rajat is a"+Rajat.type+"Customer"+"and got discount"+RajatDiscount+"%");
    }
}
