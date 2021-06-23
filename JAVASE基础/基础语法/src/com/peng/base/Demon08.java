package com.peng.base;

public class Demon08 {
    public static void main(String[] args) {
        //一元运算符   ++自增   ——自减
        int a = 3;
        int b = a++;//执行完这行代码后，先给b赋值，再自增
        int c = ++a;//执行完这行代码后，先自增，后给b赋值
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println("================================");
        //幂运算
        double pow = Math.pow(2, 3); //2的3次方运算
        System.out.println(pow);
        System.out.println("============================");
        //逻辑运算符   与&&    或|  非！
        boolean a1 = true;
        boolean a2 = false;
        System.out.println("a1 && a2:" + (a1 && a2));
        System.out.println("a1 || a2:" + (a1 || a2));
        System.out.println(" !(a1&&a2) :" + (!a1 || !a2));
        //短路运算
        int b1 = 5;
        boolean b2 = (b1 < 4) && (b1++ < 4);//在前面语句为错时，将不会执行后面的语句
        System.out.println(b1);
        System.out.println(b2);
        System.out.println("============================");
        System.out.println(16);
    }
}


