package com.wei.www.OOP.demon06;

//把Math类和里面的方法导入
import static java.lang.Math.random;//静态导入包,通过这个可以不需要Math
import static java.lang.Math.PI;
public class Test {
    public static void main(String[] args) {
        System.out.println(Math.random());//Math.random()随机数
        System.out.println(random());//通过这个可以不需要Math
        System.out.println(PI);
    }
}
