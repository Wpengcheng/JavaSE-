package com.peng.base;

public class Demon09 {
    public static void main(String[] args) {
        //扩展赋值运算符
        int a = 10;
        int b = 20;
        a+=b;   //a=a+b
        a-=b;   //a=a-b
        System.out.println(a);
        System.out.println("===================================");
        //字符连接串符
        System.out.println(a + b);
        System.out.println("" + a + b);//把两个字符连接起来
        System.out.println(a + b + "");//如果字符串在后面，将会执行运算，不会连接
        System.out.println("===================================");
        //条件运算符  三元运算符   格式  x  ?  y  :  z
        //如果x==true,  则结果为y, 否则为z
        int score = 50;
        String type = score < 60 ? "不及格" : "及格";
        System.out.println(type);
    }
}
