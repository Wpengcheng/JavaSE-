package com.peng.demon01;


import javax.swing.*;

//创建线程方式一：继承Threaf类，重写run方法，调用start开启线程
public class TestThread01 extends Thread{
    @Override
    public void run() {
        //线程体
        for (int i = 0; i < 100; i++) {
            System.out.println("打王者荣耀"+i);
        }
    }
    public static void main(String[] args) {//main()线程，主线程

        //开启另外一个线程
        //创建一个线程对象
        TestThread01 testThread01 = new TestThread01();

        //调用start开启线程
        testThread01.start();//start()方法的作用：1，启动当前线程  2，调用当前线程的run()方法

        for (int i = 0; i < 1000; i++) {
            System.out.println("不要打英雄联盟"+i);
        }
    }
}
