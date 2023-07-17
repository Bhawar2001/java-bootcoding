package com.bootcoding.java.recursion;

public class OddNumber {
    public static void main(String[] args) {
      Odd(10);
    }
    public static void Odd( int n ){
        if( n == 0){
            return ;
        }
        if ( n % 2 == 1){
            System.out.println(n);
        }
        Odd(n-1);

            System.out.println(n);
        }

    }

