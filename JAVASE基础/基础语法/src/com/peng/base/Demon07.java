package com.peng.base;

public class Demon07 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(c * d);
        System.out.println((double)c / (double)d);
        System.out.println("========================================");
        long e = 123123123L;
        int f = 123123;
        short g = 1231;
        byte h = 12;
        System.out.println(e + g + f + h);//不同变量相加时，凡是含有long变量，输出的结果都为默认值long类型
       System.out.println(f + g + h);//否则为int类型
        System.out.println(g + h);
        System.out.println("========================================");
        int a1 = 10;
        int a2 = 20;
        System.out.println(a1 > a2);
        System.out.println(a1 < a2);
        System.out.println(a1 == a2);
        System.out.println(a1 != a2);
        System.out.println("========================================");
        int b1 = 11;
        int b2 = 5;
        System.out.println(b1 % b2);//模运算
    }
}


