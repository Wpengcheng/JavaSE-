package com.work;

public class Demon01 {
    public static void main(String[] args) {
        int  a = 1;
        System.out.println(a);
        Demon01.change(a);
        System.out.println(a);

    }
    public static void change(int a){
         a = 10;
    }

}


