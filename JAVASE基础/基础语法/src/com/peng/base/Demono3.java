package com.peng.base;

public class Demono3 {
    public static void main(String[] args) {
        int i = 128;
        byte b = (byte)i;
        System.out.println(i);
        System.out.println(b);//内存溢出
        System.out.println("==================================");
        int a = 128;
        double c = (double)a;
        System.out.println(a);
        System.out.println(c);
        System.out.println("==================================");
        System.out.println(23);
        System.out.println(-37);
        System.out.println("==================================");
        char f = 101;
        int g = f + 1;
        System.out.println(g);
        System.out.println((char)g);
    }
}


