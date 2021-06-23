package com.wei.www.Expection;
//自定义的异常类
public class MyException extends Exception{
    //传递数字>10,则抛出异常
    private int detail;

    //toString 打印异常的信息
    @Override
    public String toString() {
        return "MyException{" +detail + '}';
    }
    public MyException(int a) {
        this.detail = a;



    }
}
