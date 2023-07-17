package com.bootcoding.java.recursion;

public class EvenNumber {
    public static void main(String[] args) {
        Even(10);

    }
    public static void Even(int n) {

        if (n == 0) {
            return;
        }
        if (n % 2 == 0) {

            System.out.println(n);
        }
        Even ( n -1 );
        if ( n % 2 != 0 ){
            System.out.println(n);
        }
    }

}
