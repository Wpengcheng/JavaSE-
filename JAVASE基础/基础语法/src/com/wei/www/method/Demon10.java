package com.wei.www.method;
       //值传递
public class Demon10 {
    public static void main(String[] args) {
        int a = 1;
        System.out.println(a);
        Demon10.change(a);
        System.out.println(a);

    }
     public static void change(int a){
        a=10;
     }





}
