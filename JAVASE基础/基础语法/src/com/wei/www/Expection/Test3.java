package com.wei.www.Expection;

public class Test3 {
    //写一个存在异常的方法
    static void test(int a) throws MyException {//抛出
        System.out.println("传递的参数为："+a);
        if (a>10){
            throw new MyException(a);
        }
        System.out.println("ok");
    }
    public static void main(String[] args) {
        try {
            test(19);
        } catch (MyException e) {
           //增加一些处理异常的代码块
            System.out.println("MyException=>"+e);
        }
    }
}
